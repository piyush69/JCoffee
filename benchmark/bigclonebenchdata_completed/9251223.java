


class c9251223 {
public MyHelperClass Format;

    public boolean addSiteScore(ArrayList siteScores, InitScoreTable scoreTable, String filePath, String strTime) {
        boolean bResult = false;
        String strSql = "";
        Connection conn = null;
        Statement stm = null;
        try {
            MyHelperClass db = new MyHelperClass();
            conn =(Connection)(Object) db.getConnection();
            conn.setAutoCommit(false);
            stm =(Statement)(Object) conn.createStatement();
            strSql = "delete from t_siteScore  where strTaskId = '" + scoreTable.getStrSiteScoreTaskId() + "'";
            stm.executeUpdate(strSql);
            for (int i = 0; i < (int)(Object)siteScores.size(); i++) {
                InitScoreTable temp =(InitScoreTable)(Object) siteScores.get(i);
                String tempSql = "select * from t_tagConf where strTagName='" + temp.getStrSiteScoreTagName() + "' and strTagYear='" + temp.getStrSiteScoreYear() + "' ";
                System.out.println(tempSql);
                ResultSet rst =(ResultSet)(Object) stm.executeQuery(tempSql);
                if ((boolean)(Object)rst.next()) {
                    temp.setStrSiteScoreTagId(rst.getString("strId"));
                    temp.setStrSiteinfoScoreParentId(rst.getString("strParentId"));
                }
                rst = null;
            }
            Iterator it =(Iterator)(Object) siteScores.iterator();
            String strCreatedTime =(String)(Object) Format.getDateTime();
            String taskId = "";
            while ((boolean)(Object)it.hasNext()) {
                InitScoreTable thebean =(InitScoreTable)(Object) it.next();
                taskId =(String)(Object) thebean.getStrSiteScoreTaskId();
                MyHelperClass UID = new MyHelperClass();
                String strId =(String)(Object) UID.getID();
                MyHelperClass strTableName3 = new MyHelperClass();
                strSql = "INSERT INTO " + strTableName3 + "(strId,strTaskId,strTagId," + "strTagType,strTagName,strParentId,flaTagScore,strYear,datCreatedTime,strCreator) " + "VALUES('" + strId + "','" + taskId + "','" + thebean.getStrSiteScoreTagId() + "','" + thebean.getStrSiteScoreTagType() + "','" + thebean.getStrSiteScoreTagName() + "','" + thebean.getStrSiteinfoScoreParentId() + "','" + thebean.getFlaSiteScoreTagScore() + "','" + thebean.getStrSiteScoreYear() + "','" + strCreatedTime + "','" + thebean.getStrSiteScoreCreator() + "')";
                stm.executeUpdate(strSql);
            }
            strSql = "update t_siteTotalScore set strSiteState=1,flaSiteScore='" + scoreTable.getFlaSiteScore() + "',flaInfoDisclosureScore='" + scoreTable.getFlaInfoDisclosureScore() + "',flaOnlineServicesScore='" + scoreTable.getFlaOnlineServicesScore() + "',flaPublicParticipationSore='" + scoreTable.getFlaPublicParticipationSore() + "',flaWebDesignScore='" + scoreTable.getFlaWebDesignScore() + "',strSiteFeature='" + scoreTable.getStrTotalScoreSiteFeature() + "',strSiteAdvantage='" + scoreTable.getStrTotalScoreSiteAdvantage() + "',strSiteFailure='" + scoreTable.getStrTotalScoreSiteFailure() + "' where strTaskId='" + scoreTable.getStrSiteScoreTaskId() + "'";
            stm.executeUpdate(strSql);
            MyHelperClass strTableName1 = new MyHelperClass();
            strSql = "update " + strTableName1 + " set templateUrl='" + filePath + "',dTaskBeginTime='" + strTime + "',dTaskEndTime='" + strTime + "' where strid = '" + scoreTable.getStrSiteScoreTaskId() + "'";
            stm.executeUpdate(strSql);
            conn.commit();
            bResult = true;
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception eee) {
            }
            System.out.println("������վ���ֱ���Ϣʱ���?");
        } finally {
            try {
                conn.setAutoCommit(true);
                if (stm != null) {
                    stm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ee) {
            }
        }
        return bResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDateTime(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getID(){ return null; }}

class ArrayList {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class InitScoreTable {

public MyHelperClass getFlaSiteScoreTagScore(){ return null; }
	public MyHelperClass getStrSiteScoreTagId(){ return null; }
	public MyHelperClass getFlaSiteScore(){ return null; }
	public MyHelperClass getStrSiteScoreTagType(){ return null; }
	public MyHelperClass getFlaOnlineServicesScore(){ return null; }
	public MyHelperClass getStrSiteinfoScoreParentId(){ return null; }
	public MyHelperClass setStrSiteinfoScoreParentId(MyHelperClass o0){ return null; }
	public MyHelperClass getStrTotalScoreSiteFeature(){ return null; }
	public MyHelperClass setStrSiteScoreTagId(MyHelperClass o0){ return null; }
	public MyHelperClass getStrSiteScoreCreator(){ return null; }
	public MyHelperClass getStrTotalScoreSiteAdvantage(){ return null; }
	public MyHelperClass getStrSiteScoreTagName(){ return null; }
	public MyHelperClass getFlaPublicParticipationSore(){ return null; }
	public MyHelperClass getStrSiteScoreTaskId(){ return null; }
	public MyHelperClass getStrSiteScoreYear(){ return null; }
	public MyHelperClass getFlaWebDesignScore(){ return null; }
	public MyHelperClass getStrTotalScoreSiteFailure(){ return null; }
	public MyHelperClass getFlaInfoDisclosureScore(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
