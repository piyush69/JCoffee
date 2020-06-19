import java.io.*;
import java.lang.*;
import java.util.*;



class c4581365 {
public MyHelperClass DO;
	public MyHelperClass NULL;
	public MyHelperClass DEBUG;
	public MyHelperClass RESET;
	public MyHelperClass rs;
	public MyHelperClass logError(String o0, SQLException o1){ return null; }
	public MyHelperClass release(){ return null; }
public MyHelperClass DELETE;
	public MyHelperClass allocateConnection(MyHelperClass o0){ return null; }
public MyHelperClass UPDATE;
	public MyHelperClass tableName;
	public MyHelperClass DBUtil;
	public MyHelperClass INSERT;
	public MyHelperClass Types;

    public Vector downSync(Vector v) throws SQLException {
        Vector retVector = new Vector();
        try {
            MyHelperClass con = new MyHelperClass();
            con = allocateConnection(tableName);
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement update =(PreparedStatement)(Object) con.prepareStatement("update cont_Contact set owner=?,firstname=?," + "lastname=?,nickname=?,title=?,organization=?,orgunit=?," + "emailaddr=?,homeph=?,workph=?,cellph=?,im=?,imno=?," + "fax=?,homeaddr=?,homelocality=?,homeregion=?," + "homepcode=?,homecountry=?,workaddr=?,worklocality=?," + "workregion=?,workpcode=?,workcountry=?,website=?," + "wapsite=?,comments=?,birthday=?,syncstatus=?,dirtybits=? " + "where OId=? and syncstatus=?");
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement insert =(PreparedStatement)(Object) con.prepareStatement("insert into cont_Contact (owner,firstname,lastname," + "nickname,title,organization,orgunit,emailaddr,homeph," + "workph,cellph,im,imno,fax,homeaddr,homelocality," + "homeregion,homepcode,homecountry,workaddr,worklocality," + "workregion,workpcode,workcountry,website,wapsite," + "comments,birthday,syncstatus,dirtybits,quicklist) " + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," + "?,?,?,?,?,?,?,?)");
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement insert1 =(PreparedStatement)(Object) con.prepareStatement((String)(Object)DBUtil.getQueryCurrentOID(con, "cont_Contact", "newoid"));
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement delete1 =(PreparedStatement)(Object) con.prepareStatement("delete from  cont_Contact_Group_Rel where externalcontact=?");
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement delete2 =(PreparedStatement)(Object) con.prepareStatement("delete from  cont_Contact where OId=? " + "and (syncstatus=? or syncstatus=?)");
            for (int i = 0; i < v.size(); i++) {
                try {
                    ExternalContactDO DO =(ExternalContactDO)(Object) NULL; //new ExternalContactDO();
                    DO = (ExternalContactDO) v.elementAt(i);
//                    MyHelperClass DO = new MyHelperClass();
                    if (DO.getSyncstatus() == INSERT) {
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setBigDecimal(1, DO.getOwner());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(2, DO.getFirstname());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(3, DO.getLastname());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(4, DO.getNickname());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(5, DO.getTitle());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(6, DO.getOrganization());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(7, DO.getOrgunit());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(8, DO.getEmail());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(9, DO.getHomeph());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(10, DO.getWorkph());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(11, DO.getCellph());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(12, DO.getIm());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(13, DO.getImno());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(14, DO.getFax());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(15, DO.getHomeaddr());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(16, DO.getHomelocality());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(17, DO.getHomeregion());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(18, DO.getHomepcode());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(19, DO.getHomecountry());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(20, DO.getWorkaddr());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(21, DO.getWorklocality());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(22, DO.getWorkregion());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(23, DO.getWorkpcode());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(24, DO.getWorkcountry());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(25, DO.getWebsite());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(26, DO.getWapsite());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(27, DO.getComments());
//                        MyHelperClass DO = new MyHelperClass();
                        if (DO.getBirthday() != null) insert.setDate(28, DO.getBirthday()); else insert.setNull(28, Types.DATE);
                        MyHelperClass RESET = new MyHelperClass();
                        insert.setInt(29, RESET);
//                        MyHelperClass RESET = new MyHelperClass();
                        insert.setInt(30, RESET);
                        insert.setInt(31, 0);
//                        MyHelperClass con = new MyHelperClass();
                        con.executeUpdate(insert, null);
//                        MyHelperClass con = new MyHelperClass();
                        con.reset();
                        MyHelperClass rs = new MyHelperClass();
                        rs = con.executeQuery(insert1, null);
//                        MyHelperClass rs = new MyHelperClass();
                        if ((boolean)(Object)rs.next()) DO.setOId(rs.getBigDecimal("newoid"));
//                        MyHelperClass con = new MyHelperClass();
                        con.reset();
//                        MyHelperClass DO = new MyHelperClass();
                        retVector.add(DO);
//                    MyHelperClass DO = new MyHelperClass();
                    } else if (DO.getSyncstatus() == UPDATE) {
//                        MyHelperClass DO = new MyHelperClass();
                        update.setBigDecimal(1, DO.getOwner());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(2, DO.getFirstname());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(3, DO.getLastname());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(4, DO.getNickname());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(5, DO.getTitle());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(6, DO.getOrganization());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(7, DO.getOrgunit());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(8, DO.getEmail());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(9, DO.getHomeph());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(10, DO.getWorkph());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(11, DO.getCellph());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(12, DO.getIm());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(13, DO.getImno());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(14, DO.getFax());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(15, DO.getHomeaddr());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(16, DO.getHomelocality());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(17, DO.getHomeregion());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(18, DO.getHomepcode());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(19, DO.getHomecountry());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(20, DO.getWorkaddr());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(21, DO.getWorklocality());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(22, DO.getWorkregion());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(23, DO.getWorkpcode());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(24, DO.getWorkcountry());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(25, DO.getWebsite());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(26, DO.getWapsite());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(27, DO.getComments());
//                        MyHelperClass DO = new MyHelperClass();
                        if (DO.getBirthday() != null) update.setDate(28, DO.getBirthday()); else update.setNull(28, Types.DATE);
                        MyHelperClass RESET = new MyHelperClass();
                        update.setInt(29, RESET);
//                        MyHelperClass RESET = new MyHelperClass();
                        update.setInt(30, RESET);
//                        MyHelperClass DO = new MyHelperClass();
                        update.setBigDecimal(31, DO.getOId());
//                        MyHelperClass RESET = new MyHelperClass();
                        update.setInt(32, RESET);
//                        MyHelperClass con = new MyHelperClass();
                        if ((int)(Object)con.executeUpdate(update, null) < 1) retVector.add(DO);
//                        MyHelperClass con = new MyHelperClass();
                        con.reset();
//                    MyHelperClass DO = new MyHelperClass();
                    } else if (DO.getSyncstatus() == DELETE) {
                        try {
                            con.setAutoCommit(false);
                            delete1.setBigDecimal(1, DO.getOId());
                            con.executeUpdate(delete1, null);
                            delete2.setBigDecimal(1, DO.getOId());
                            delete2.setInt(2, RESET);
                            delete2.setInt(3, DELETE);
                            if ((int)(Object)con.executeUpdate(delete2, null) < 1) {
                                con.rollback();
                                retVector.add(DO);
                            } else {
                                con.commit();
                            }
                        } catch (Exception e) {
                            con.rollback();
                            retVector.add(DO);
                            throw e;
                        } finally {
                            con.reset();
                        }
                    }
                } catch (Exception e) {
                    if (DO != null) logError("Sync-ExternalContactDO.owner = " + DO.getOwner().toString() + " oid = " + (DO.getOId() != null ? DO.getOId().toString() : "NULL"),(SQLException)(Object) e);
                }
            }
            if (rs != null) {
                rs.close();
            }
        } catch (UncheckedIOException e) {
            if ((boolean)(Object)DEBUG) logError("",(SQLException)(Object) e);
            throw e;
        } finally {
            release();
        }
        return retVector;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DATE;
public MyHelperClass getWorkph(){ return null; }
	public MyHelperClass getIm(){ return null; }
	public MyHelperClass getWebsite(){ return null; }
	public MyHelperClass getWorklocality(){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass getHomelocality(){ return null; }
	public MyHelperClass getWapsite(){ return null; }
	public MyHelperClass getFirstname(){ return null; }
	public MyHelperClass getHomecountry(){ return null; }
	public MyHelperClass executeQuery(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getHomeregion(){ return null; }
	public MyHelperClass getCellph(){ return null; }
	public MyHelperClass getOId(){ return null; }
	public MyHelperClass getImno(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getHomeaddr(){ return null; }
	public MyHelperClass getOwner(){ return null; }
	public MyHelperClass getComments(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getBigDecimal(String o0){ return null; }
	public MyHelperClass getSyncstatus(){ return null; }
	public MyHelperClass getWorkpcode(){ return null; }
	public MyHelperClass executeUpdate(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass getOrgunit(){ return null; }
	public MyHelperClass getHomeph(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getWorkregion(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getQueryCurrentOID(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getNickname(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getWorkcountry(){ return null; }
	public MyHelperClass getLastname(){ return null; }
	public MyHelperClass getOrganization(){ return null; }
	public MyHelperClass getHomepcode(){ return null; }
	public MyHelperClass getWorkaddr(){ return null; }
	public MyHelperClass getBirthday(){ return null; }
	public MyHelperClass getFax(){ return null; }
	public MyHelperClass getTitle(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setBigDecimal(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDate(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class ExternalContactDO {

public MyHelperClass getWorkph(){ return null; }
	public MyHelperClass getIm(){ return null; }
	public MyHelperClass getWebsite(){ return null; }
	public MyHelperClass getWorklocality(){ return null; }
	public MyHelperClass getHomelocality(){ return null; }
	public MyHelperClass getWapsite(){ return null; }
	public MyHelperClass getFirstname(){ return null; }
	public MyHelperClass getHomecountry(){ return null; }
	public MyHelperClass getHomeregion(){ return null; }
	public MyHelperClass getCellph(){ return null; }
	public MyHelperClass getOId(){ return null; }
	public MyHelperClass getImno(){ return null; }
	public MyHelperClass setOId(MyHelperClass o0){ return null; }
	public MyHelperClass getHomeaddr(){ return null; }
	public MyHelperClass getOwner(){ return null; }
	public MyHelperClass getComments(){ return null; }
	public MyHelperClass getSyncstatus(){ return null; }
	public MyHelperClass getWorkpcode(){ return null; }
	public MyHelperClass getOrgunit(){ return null; }
	public MyHelperClass getHomeph(){ return null; }
	public MyHelperClass getWorkregion(){ return null; }
	public MyHelperClass getNickname(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getWorkcountry(){ return null; }
	public MyHelperClass getLastname(){ return null; }
	public MyHelperClass getOrganization(){ return null; }
	public MyHelperClass getHomepcode(){ return null; }
	public MyHelperClass getWorkaddr(){ return null; }
	public MyHelperClass getBirthday(){ return null; }
	public MyHelperClass getFax(){ return null; }
	public MyHelperClass getTitle(){ return null; }}
