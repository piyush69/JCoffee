import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17750515 {
public MyHelperClass logger;
	public MyHelperClass con;
	public MyHelperClass Level;

    public SukuData updatePerson(String usertext, SukuData req)  throws Throwable {
        String insPers;
        MyHelperClass Utils = new MyHelperClass();
        String userid =(String)(Object) Utils.toUsAscii(usertext);
        if (userid != null && userid.length() > 16) {
            userid = userid.substring(0, 16);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("insert into unit (pid,tag,privacy,groupid,sex,sourcetext,privatetext,userrefn");
        if (userid != null) {
            sb.append(",createdby");
        }
        sb.append(") values (?,?,?,?,?,?,?,? ");
        if (userid != null) {
            sb.append(",'" + userid + "'");
        }
        sb.append(")");
        insPers = sb.toString();
        String updPers;
        sb = new StringBuilder();
        sb.append("update unit set privacy=?,groupid=?,sex=?,sourcetext=?," + "privatetext=?,userrefn=?,Modified=now()");
        if (userid != null) {
            sb.append(",modifiedby = '" + userid + "' where pid = ?");
        } else {
            sb.append(" where pid = ?");
        }
        updPers = sb.toString();
        sb = new StringBuilder();
        String updSql;
        sb.append("update unitnotice set ");
        sb.append("surety=?,Privacy=?,NoticeType=?,Description=?,");
        sb.append("DatePrefix=?,FromDate=?,ToDate=?,Place=?,");
        sb.append("Village=?,Farm=?,Croft=?,Address=?,");
        sb.append("PostalCode=?,PostOffice=?,State=?,Country=?,Email=?,");
        sb.append("NoteText=?,MediaFilename=?,MediaTitle=?,Prefix=?,");
        sb.append("Surname=?,Givenname=?,Patronym=?,PostFix=?,");
        sb.append("SourceText=?,PrivateText=?,RefNames=?,RefPlaces=?,Modified=now()");
        if (userid != null) {
            sb.append(",modifiedby = '" + userid + "'");
        }
        sb.append(" where pnid = ?");
        updSql = sb.toString();
        sb = new StringBuilder();
        String insSql;
        sb.append("insert into unitnotice  (");
        sb.append("surety,Privacy,NoticeType,Description,");
        sb.append("DatePrefix,FromDate,ToDate,Place,");
        sb.append("Village,Farm,Croft,Address,");
        sb.append("PostalCode,PostOffice,State,Country,Email,");
        sb.append("NoteText,MediaFilename,MediaTitle,Prefix,");
        sb.append("Surname,Givenname,Patronym,PostFix,");
        sb.append("SourceText,PrivateText,RefNames,Refplaces,pnid,pid,tag");
        if (userid != null) {
            sb.append(",createdby");
        }
        sb.append(") values (");
        sb.append("?,?,?,?,?,?,?,?," + "?,?,?,?,?,?,?,?," + "?,?,?,?,?,?,?,?,");
        sb.append("?,?,?,?,?,?,?,?");
        if (userid != null) {
            sb.append(",'" + userid + "'");
        }
        sb.append(")");
        insSql = sb.toString();
        sb = new StringBuilder();
        String updLangSql;
        sb.append("update unitlanguage set ");
        sb.append("NoticeType=?,Description=?," + "Place=?,");
        sb.append("NoteText=?,MediaTitle=?,Modified=now() ");
        if (userid != null) {
            sb.append(",modifiedby = '" + userid + "'");
        }
        sb.append("where pnid=? and langCode = ?");
        updLangSql = sb.toString();
        sb = new StringBuilder();
        String insLangSql;
        sb.append("insert into unitlanguage (pnid,pid,tag,langcode,");
        sb.append("NoticeType,Description,Place,");
        sb.append("NoteText,MediaTitle");
        if (userid != null) {
            sb.append(",createdby");
        }
        sb.append(") values (?,?,?,?,?,?,?,?,?");
        if (userid != null) {
            sb.append(",'" + userid + "'");
        }
        sb.append(")");
        insLangSql = sb.toString();
        String delOneLangSql = "delete from unitlanguage where pnid = ? and langcode = ? ";
        String updRowSql = "update unitnotice set noticerow = ? where pnid = ? ";
        String delSql = "delete from unitnotice where pnid = ? ";
        String delAllLangSql = "delete from Unitlanguage where pnid = ? ";
        SukuData res = new SukuData();
        UnitNotice[] nn =(UnitNotice[])(Object) req.persLong.getNotices();
        if (nn != null) {
            String prevName = "";
            String prevOccu = "";
            for (int i = 0; i < nn.length; i++) {
                if (nn[i].getTag().equals("NAME")) {
//                    MyHelperClass Utils = new MyHelperClass();
                    String thisName = Utils.nv(nn[i].getGivenname()) + "/" + Utils.nv(nn[i].getPatronym()) + "/" + Utils.nv(nn[i].getPrefix()) + "/" + Utils.nv(nn[i].getSurname()) + "/" + Utils.nv(nn[i].getPostfix());
                    if (thisName.equals(prevName) && !prevName.equals("")) {
                        if ((boolean)(Object)nn[i].isToBeDeleted() == false) {
                            MyHelperClass Resurses = new MyHelperClass();
                            String e = Resurses.getString("IDENTICAL_NAMES_ERROR") + " [" + req.persLong.getPid() + "] idx [" + i + "] = " + thisName;
                            MyHelperClass logger = new MyHelperClass();
                            logger.warning(e);
                            if ((int)(Object)req.persLong.getPid() > 0) {
                                res.resu =(MyHelperClass)(Object) e;
                                return res;
                            }
                        }
                    }
                    prevName = thisName;
                } else if (nn[i].getTag().equals("OCCU")) {
//                    MyHelperClass Utils = new MyHelperClass();
                    String thisOccu =(String)(Object) Utils.nv(nn[i].getDescription());
                    if (thisOccu.equals(prevOccu) && !prevOccu.equals("")) {
                        if ((boolean)(Object)nn[i].isToBeDeleted() == false) {
                            MyHelperClass Resurses = new MyHelperClass();
                            String e = Resurses.getString("IDENTICAL_OCCU_ERROR") + " [" + req.persLong.getPid() + "] idx [" + i + "] = '" + thisOccu + "'";
                            MyHelperClass logger = new MyHelperClass();
                            logger.warning(e);
                            if ((int)(Object)req.persLong.getPid() > 0) {
                                res.resu =(MyHelperClass)(Object) e;
                                return res;
                            }
                        }
                    }
                    prevOccu = thisOccu;
                }
            }
        }
        int pid = 0;
        try {
            MyHelperClass con = new MyHelperClass();
            con.setAutoCommit(false);
            Statement stm;
            PreparedStatement pst;
            if ((int)(Object)req.persLong.getPid() > 0) {
                res.resultPid = req.persLong.getPid();
                pid =(int)(Object) req.persLong.getPid();
                if ((boolean)(Object)req.persLong.isMainModified()) {
                    if (req.persLong.getModified() == null) {
//                        MyHelperClass con = new MyHelperClass();
                        pst =(PreparedStatement)(Object) con.prepareStatement(updPers + " and modified is null ");
                    } else {
//                        MyHelperClass con = new MyHelperClass();
                        pst =(PreparedStatement)(Object) con.prepareStatement(updPers + " and modified = ?");
                    }
                    pst.setString(1,(String)(Object) req.persLong.getPrivacy());
                    pst.setString(2,(String)(Object) req.persLong.getGroupId());
                    pst.setString(3,(String)(Object) req.persLong.getSex());
                    pst.setString(4,(String)(Object) req.persLong.getSource());
                    pst.setString(5,(String)(Object) req.persLong.getPrivateText());
                    pst.setString(6,(String)(Object) req.persLong.getRefn());
                    pst.setInt(7,(int)(Object) req.persLong.getPid());
                    if (req.persLong.getModified() != null) {
                        pst.setTimestamp(8, req.persLong.getModified());
                    }
                    int lukuri =(int)(Object) pst.executeUpdate();
                    if (lukuri != 1) {
                        MyHelperClass logger = new MyHelperClass();
                        logger.warning("Person update for pid " + pid + " failed [" + lukuri + "] (Should be 1)");
                        throw new SQLException("TRANSACTION_ERROR_1");
                    }
                    String apara = null;
                    String bpara = null;
                    String cpara = null;
                    String dpara = null;
                    if (req.persLong.getSex().equals("M")) {
                        apara = "FATH";
                        bpara = "MOTH";
                        cpara = "HUSB";
                        dpara = "WIFE";
                    } else if (req.persLong.getSex().equals("F")) {
                        bpara = "FATH";
                        apara = "MOTH";
                        dpara = "HUSB";
                        cpara = "WIFE";
                    }
                    if (apara != null) {
                        String sqlParent = "update relation as b set tag=? " + "where b.rid in (select a.rid from relation as a " + "where a.pid = ? and a.pid <> b.rid and a.tag='CHIL')	" + "and tag=?";
//                        MyHelperClass con = new MyHelperClass();
                        PreparedStatement ppare =(PreparedStatement)(Object) con.prepareStatement(sqlParent);
                        ppare.setString(1, apara);
                        ppare.setInt(2,(int)(Object) req.persLong.getPid());
                        ppare.setString(3, bpara);
                        int resup =(int)(Object) ppare.executeUpdate();
                        MyHelperClass logger = new MyHelperClass();
                        logger.fine("updated count for person parent= " + resup);
                        String sqlSpouse = "update relation as b set tag=? " + "where b.rid in (select a.rid " + "from relation as a where a.pid = ? and a.pid <> b.pid " + "and a.tag in ('HUSB','WIFE')) and tag=?";
//                        MyHelperClass con = new MyHelperClass();
                        ppare =(PreparedStatement)(Object) con.prepareStatement(sqlSpouse);
                        ppare.setString(1, cpara);
                        ppare.setInt(2,(int)(Object) req.persLong.getPid());
                        ppare.setString(3, dpara);
                        resup =(int)(Object) ppare.executeUpdate();
//                        MyHelperClass logger = new MyHelperClass();
                        logger.fine("updated count for person spouse= " + resup);
                    }
                }
            } else {
//                MyHelperClass con = new MyHelperClass();
                stm =(Statement)(Object) con.createStatement();
                ResultSet rs =(ResultSet)(Object) stm.executeQuery("select nextval('unitseq')");
                if ((boolean)(Object)rs.next()) {
                    pid =(int)(Object) rs.getInt(1);
                    res.resultPid =(MyHelperClass)(Object) pid;
                } else {
                    throw new SQLException("Sequence unitseq error");
                }
                rs.close();
//                MyHelperClass con = new MyHelperClass();
                pst =(PreparedStatement)(Object) con.prepareStatement(insPers);
                pst.setInt(1, pid);
                pst.setString(2,(String)(Object) req.persLong.getTag());
                pst.setString(3,(String)(Object) req.persLong.getPrivacy());
                pst.setString(4,(String)(Object) req.persLong.getGroupId());
                pst.setString(5,(String)(Object) req.persLong.getSex());
                pst.setString(6,(String)(Object) req.persLong.getSource());
                pst.setString(7,(String)(Object) req.persLong.getPrivateText());
                pst.setString(8,(String)(Object) req.persLong.getRefn());
                int lukuri =(int)(Object) pst.executeUpdate();
                if (lukuri != 1) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.warning("Person created for pid " + pid + "  gave result " + lukuri);
                }
            }
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement pstDel =(PreparedStatement)(Object) con.prepareStatement(delSql);
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement pstDelLang =(PreparedStatement)(Object) con.prepareStatement(delAllLangSql);
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement pstUpdRow =(PreparedStatement)(Object) con.prepareStatement(updRowSql);
            if (nn != null) {
                for (int i = 0; i < nn.length; i++) {
                    UnitNotice n = nn[i];
                    int pnid = 0;
                    if ((boolean)(Object)n.isToBeDeleted()) {
                        pstDelLang.setInt(1,(int)(Object) n.getPnid());
                        int landelcnt =(int)(Object) pstDelLang.executeUpdate();
                        pstDel.setInt(1,(int)(Object) n.getPnid());
                        int delcnt =(int)(Object) pstDel.executeUpdate();
                        if (delcnt != 1) {
                            MyHelperClass logger = new MyHelperClass();
                            logger.warning("Person notice [" + n.getTag() + "]delete for pid " + pid + " failed [" + delcnt + "] (Should be 1)");
                            throw new SQLException("TRANSACTION_ERROR_2");
                        }
                        String text = "Poistettiin " + delcnt + " riviä [" + landelcnt + "] kieliversiota pid = " + n.getPid() + " tag=" + n.getTag();
                        MyHelperClass logger = new MyHelperClass();
                        logger.fine(text);
                    } else if ((int)(Object)n.getPnid() == 0 || (boolean)(Object)n.isToBeUpdated()) {
                        if ((int)(Object)n.getPnid() == 0) {
//                            MyHelperClass con = new MyHelperClass();
                            stm =(Statement)(Object) con.createStatement();
                            ResultSet rs =(ResultSet)(Object) stm.executeQuery("select nextval('unitnoticeseq')");
                            if ((boolean)(Object)rs.next()) {
                                pnid =(int)(Object) rs.getInt(1);
                            } else {
                                throw new SQLException("Sequence unitnoticeseq error");
                            }
                            rs.close();
//                            MyHelperClass con = new MyHelperClass();
                            pst =(PreparedStatement)(Object) con.prepareStatement(insSql);
                        } else {
                            if (n.getModified() == null) {
//                                MyHelperClass con = new MyHelperClass();
                                pst =(PreparedStatement)(Object) con.prepareStatement(updSql + " and modified is null ");
                            } else {
//                                MyHelperClass con = new MyHelperClass();
                                pst =(PreparedStatement)(Object) con.prepareStatement(updSql + " and modified = ?");
                            }
                            pnid =(int)(Object) n.getPnid();
                        }
                        if ((boolean)(Object)n.isToBeUpdated() ||(int)(Object) n.getPnid() == 0) {
                            pst.setInt(1,(int)(Object) n.getSurety());
                            pst.setString(2,(String)(Object) n.getPrivacy());
                            pst.setString(3,(String)(Object) n.getNoticeType());
                            pst.setString(4,(String)(Object) n.getDescription());
                            pst.setString(5,(String)(Object) n.getDatePrefix());
                            pst.setString(6,(String)(Object) n.getFromDate());
                            pst.setString(7,(String)(Object) n.getToDate());
                            pst.setString(8,(String)(Object) n.getPlace());
                            pst.setString(9,(String)(Object) n.getVillage());
                            pst.setString(10,(String)(Object) n.getFarm());
                            pst.setString(11,(String)(Object) n.getCroft());
                            pst.setString(12,(String)(Object) n.getAddress());
                            pst.setString(13,(String)(Object) n.getPostalCode());
                            pst.setString(14,(String)(Object) n.getPostOffice());
                            pst.setString(15,(String)(Object) n.getState());
                            pst.setString(16,(String)(Object) n.getCountry());
                            pst.setString(17,(String)(Object) n.getEmail());
                            pst.setString(18,(String)(Object) n.getNoteText());
                            pst.setString(19,(String)(Object) n.getMediaFilename());
                            pst.setString(20, n.getMediaTitle());
                            pst.setString(21,(String)(Object) n.getPrefix());
                            pst.setString(22,(String)(Object) n.getSurname());
                            pst.setString(23,(String)(Object) n.getGivenname());
                            pst.setString(24,(String)(Object) n.getPatronym());
                            pst.setString(25,(String)(Object) n.getPostfix());
                            pst.setString(26, n.getSource());
                            pst.setString(27, n.getPrivateText());
                            if (n.getRefNames() == null) {
                                MyHelperClass Types = new MyHelperClass();
                                pst.setNull(28, Types.ARRAY);
                            } else {
//                                MyHelperClass con = new MyHelperClass();
                                Array xx = con.createArrayOf("varchar", n.getRefNames());
                                pst.setArray(28, xx);
                            }
                            if (n.getRefPlaces() == null) {
                                MyHelperClass Types = new MyHelperClass();
                                pst.setNull(29, Types.ARRAY);
                            } else {
//                                MyHelperClass con = new MyHelperClass();
                                Array xx = con.createArrayOf("varchar", n.getRefPlaces());
                                pst.setArray(29, xx);
                            }
                        }
                        if ((int)(Object)n.getPnid() > 0) {
                            pst.setInt(30,(int)(Object) n.getPnid());
                            if (n.getModified() != null) {
                                pst.setTimestamp(31, n.getModified());
                            }
                            int luku =(int)(Object) pst.executeUpdate();
                            if (luku != 1) {
                                MyHelperClass logger = new MyHelperClass();
                                logger.warning("Person notice [" + n.getTag() + "] update for pid " + pid + " failed [" + luku + "] (Should be 1)");
                                throw new SQLException("TRANSACTION_ERROR_3");
                            }
                            MyHelperClass logger = new MyHelperClass();
                            logger.fine("Päivitettiin " + luku + " tietuetta pnid=[" + n.getPnid() + "]");
                        } else {
                            pst.setInt(30, pnid);
                            pst.setInt(31, pid);
                            pst.setString(32,(String)(Object) n.getTag());
                            int luku =(int)(Object) pst.executeUpdate();
                            MyHelperClass logger = new MyHelperClass();
                            logger.fine("Luotiin " + luku + " tietue pnid=[" + pnid + "]");
                        }
                        if (n.getMediaData() == null) {
                            String sql = "update unitnotice set mediadata = null where pnid = ?";
//                            MyHelperClass con = new MyHelperClass();
                            pst =(PreparedStatement)(Object) con.prepareStatement(sql);
                            pst.setInt(1, pnid);
                            int lukuri =(int)(Object) pst.executeUpdate();
                            if (lukuri != 1) {
                                MyHelperClass logger = new MyHelperClass();
                                logger.warning("media deleted for pnid " + n.getPnid() + " gave result " + lukuri);
                            }
                        } else {
                            String UPDATE_IMAGE_DATA = "update UnitNotice set MediaData = ?," + "mediaWidth = ?,mediaheight = ? where PNID = ? ";
                            PreparedStatement ps =(PreparedStatement)(Object) this.con.prepareStatement(UPDATE_IMAGE_DATA);
                            ps.setBytes(1, n.getMediaData());
                            Dimension d = n.getMediaSize();
                            ps.setInt(2, d.width);
                            ps.setInt(3, d.height);
                            ps.setInt(4, pnid);
                            ps.executeUpdate();
                        }
                    }
                    if (n.getLanguages() != null) {
                        for (int l = 0; l < n.getLanguages().length; l++) {
                            UnitLanguage ll = n.getLanguages()[l];
                            if (ll.isToBeDeleted()) {
                                if (ll.getPnid() > 0) {
                                    pst =(PreparedStatement)(Object) con.prepareStatement(delOneLangSql);
                                    pst.setInt(1, ll.getPnid());
                                    pst.setString(2, ll.getLangCode());
                                    int lukuri =(int)(Object) pst.executeUpdate();
                                    if (lukuri != 1) {
                                        logger.warning("language deleted for pnid " + n.getPnid() + " [" + ll.getLangCode() + "] gave result " + lukuri);
                                    }
                                }
                            }
                            if (ll.isToBeUpdated()) {
                                if (ll.getPnid() == 0) {
                                    pst =(PreparedStatement)(Object) con.prepareStatement(insLangSql);
                                    pst.setInt(1,(int)(Object) n.getPnid());
                                    pst.setInt(2, pid);
                                    pst.setString(3,(String)(Object) n.getTag());
                                    pst.setString(4, ll.getLangCode());
                                    pst.setString(5, ll.getNoticeType());
                                    pst.setString(6, ll.getDescription());
                                    pst.setString(7, ll.getPlace());
                                    pst.setString(8, ll.getNoteText());
                                    pst.setString(9, ll.getMediaTitle());
                                    int lukuri =(int)(Object) pst.executeUpdate();
                                    if (lukuri != 1) {
                                        logger.warning("language added for pnid " + n.getPnid() + " [" + ll.getLangCode() + "] gave result " + lukuri);
                                    }
                                } else {
                                    pst = con.prepareStatement(updLangSql);
                                    pst.setString(1, ll.getNoticeType());
                                    pst.setString(2, ll.getDescription());
                                    pst.setString(3, ll.getPlace());
                                    pst.setString(4, ll.getNoteText());
                                    pst.setString(5, ll.getMediaTitle());
                                    pst.setInt(6, ll.getPnid());
                                    pst.setString(7, ll.getLangCode());
                                    int lukuri = pst.executeUpdate();
                                    if (lukuri != 1) {
                                        logger.warning("language for pnid " + ll.getPnid() + " [" + ll.getLangCode() + "] gave result " + lukuri);
                                    }
                                    pst.close();
                                }
                            }
                        }
                    }
                    if (n.getPnid() > 0) {
                        pnid = n.getPnid();
                    }
                    pstUpdRow.setInt(1, i + 1);
                    pstUpdRow.setInt(2, pnid);
                    pstUpdRow.executeUpdate();
                }
            }
            if (req.relations != null) {
                if (req.persLong.getPid() == 0) {
                    req.persLong.setPid(pid);
                    for (int i = 0; i < req.relations.length; i++) {
                        Relation r = req.relations[i];
                        if (r.getPid() == 0) {
                            r.setPid(pid);
                        }
                    }
                }
                updateRelations(userid, req);
            }
            con.commit();
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                logger.log(Level.WARNING, "Person update rollback failed", e1);
            }
            logger.log(Level.WARNING, "person update rolled back for [" + pid + "]", e);
            res.resu = e.getMessage();
            return res;
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (SQLException e) {
                logger.log(Level.WARNING, "set autocommit failed", e);
            }
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ARRAY;
public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass getSex(){ return null; }
	public MyHelperClass getSource(){ return null; }
	public MyHelperClass getRefn(){ return null; }
	public MyHelperClass getPrivateText(){ return null; }
	public MyHelperClass getModified(){ return null; }
	public MyHelperClass getPid(){ return null; }
	public MyHelperClass toUsAscii(String o0){ return null; }
	public MyHelperClass getNotices(){ return null; }
	public MyHelperClass isMainModified(){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass getPrivacy(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getTag(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getGroupId(){ return null; }
	public MyHelperClass nv(MyHelperClass o0){ return null; }}

class SukuData {
public MyHelperClass resu;
	public MyHelperClass resultPid;
	public MyHelperClass persLong;
}

class UnitNotice {

public MyHelperClass getSurety(){ return null; }
	public MyHelperClass getAddress(){ return null; }
	public MyHelperClass getDatePrefix(){ return null; }
	public MyHelperClass getSource(){ return null; }
	public MyHelperClass getPlace(){ return null; }
	public MyHelperClass getToDate(){ return null; }
	public MyHelperClass getMediaTitle(){ return null; }
	public MyHelperClass getPrivateText(){ return null; }
	public MyHelperClass getModified(){ return null; }
	public MyHelperClass getPid(){ return null; }
	public MyHelperClass getFarm(){ return null; }
	public MyHelperClass getPostfix(){ return null; }
	public MyHelperClass getPnid(){ return null; }
	public MyHelperClass getRefPlaces(){ return null; }
	public MyHelperClass getMediaData(){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass getNoticeType(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getGivenname(){ return null; }
	public MyHelperClass getPatronym(){ return null; }
	public MyHelperClass getPrivacy(){ return null; }
	public MyHelperClass getCroft(){ return null; }
	public MyHelperClass isToBeUpdated(){ return null; }
	public MyHelperClass getNoteText(){ return null; }
	public MyHelperClass getSurname(){ return null; }
	public MyHelperClass getLanguages(){ return null; }
	public MyHelperClass getTag(){ return null; }
	public MyHelperClass getCountry(){ return null; }
	public MyHelperClass getRefNames(){ return null; }
	public MyHelperClass getFromDate(){ return null; }
	public MyHelperClass getPrefix(){ return null; }
	public MyHelperClass getVillage(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getPostOffice(){ return null; }
	public MyHelperClass getMediaSize(){ return null; }
	public MyHelperClass getMediaFilename(){ return null; }
	public MyHelperClass getPostalCode(){ return null; }
	public MyHelperClass isToBeDeleted(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setTimestamp(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setArray(int o0, Array o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Array {

}

class Dimension {
public MyHelperClass width;
	public MyHelperClass height;
}

class UnitLanguage {

public MyHelperClass getLangCode(){ return null; }
	public MyHelperClass getPnid(){ return null; }
	public MyHelperClass isToBeUpdated(){ return null; }
	public MyHelperClass getNoteText(){ return null; }
	public MyHelperClass getMediaTitle(){ return null; }
	public MyHelperClass getPlace(){ return null; }
	public MyHelperClass getNoticeType(){ return null; }
	public MyHelperClass isToBeDeleted(){ return null; }
	public MyHelperClass getDescription(){ return null; }}

class Relation {

}
