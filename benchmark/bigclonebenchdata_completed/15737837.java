
import java.io.UncheckedIOException;


class c15737837 {
public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
	public MyHelperClass selfDefineDelete(String[] o0, Connection o1, PreparedStatement o2){ return null; }
	public MyHelperClass getSelfDefinePath(String o0, String o1, Connection o2, PreparedStatement o3, ResultSet o4){ return null; }
	public MyHelperClass selfDefineAdd(String[] o0, Site o1, Connection o2, PreparedStatement o3){ return null; }
public MyHelperClass log;
	public MyHelperClass Const;
	public MyHelperClass createDBOperation(){ return null; }

    public void update(Site site) throws Exception {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String exp =(String)(Object) site.getExtendParent();
        String path =(String)(Object) site.getPath();
        try {
            String sqlStr = "update t_ip_site set id=?,name=?,description=?,ascii_name=?,remark_number=?,increment_index=?,use_status=?,appserver_id=? where id=?";
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            String[] selfDefinePath =(String[])(Object) getSelfDefinePath(path, exp, connection, preparedStatement, resultSet);
            selfDefineDelete(selfDefinePath, connection, preparedStatement);
            selfDefineAdd(selfDefinePath, site, connection, preparedStatement);
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sqlStr);
            preparedStatement.setInt(1, site.getSiteID());
            preparedStatement.setString(2, site.getName());
            preparedStatement.setString(3, site.getDescription());
            preparedStatement.setString(4, site.getAsciiName());
            preparedStatement.setInt(5, site.getRemarkNumber());
            preparedStatement.setString(6, site.getIncrementIndex().trim());
            preparedStatement.setString(7, String.valueOf(site.getUseStatus()));
            preparedStatement.setString(8, String.valueOf(site.getAppserverID()));
            preparedStatement.setInt(9, site.getSiteID());
            preparedStatement.executeUpdate();
            connection.commit();
            int resID =(int)(Object) site.getSiteID() + (int)(Object)Const.SITE_TYPE_RES;
            StructResource sr = new StructResource();
            sr.setResourceID(Integer.toString(resID));
            sr.setOperateID(Integer.toString(1));
            sr.setOperateTypeID(Const.OPERATE_TYPE_ID);
            sr.setTypeID(Const.RES_TYPE_ID);
            StructAuth sa =(StructAuth)(Object) (new AuthorityManager().getExternalAuthority(sr));
            int authID =(int)(Object) sa.getAuthID();
            if (authID == 0) {
                String resName =(String)(Object) site.getName();
                int resTypeID =(int)(Object) Const.RES_TYPE_ID;
                int operateTypeID =(int)(Object) Const.OPERATE_TYPE_ID;
                String remark = "";
                AuthorityManager am = new AuthorityManager();
                am.createExtResource(Integer.toString(resID), resName, resTypeID, operateTypeID, remark);
            }
            site.wirteFile();
        } catch (UncheckedIOException ex) {
            connection.rollback();
            log.error("����վ������ʧ��!",(SQLException)(Object) ex);
            throw ex;
        } finally {
            close(resultSet, null, preparedStatement, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SITE_TYPE_RES;
	public MyHelperClass OPERATE_TYPE_ID;
	public MyHelperClass RES_TYPE_ID;
public MyHelperClass trim(){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }}

class Site {

public MyHelperClass getAsciiName(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getIncrementIndex(){ return null; }
	public MyHelperClass getAppserverID(){ return null; }
	public MyHelperClass getUseStatus(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass wirteFile(){ return null; }
	public MyHelperClass getSiteID(){ return null; }
	public MyHelperClass getRemarkNumber(){ return null; }
	public MyHelperClass getExtendParent(){ return null; }
	public MyHelperClass getName(){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

}

class StructResource {

public MyHelperClass setTypeID(MyHelperClass o0){ return null; }
	public MyHelperClass setResourceID(String o0){ return null; }
	public MyHelperClass setOperateTypeID(MyHelperClass o0){ return null; }
	public MyHelperClass setOperateID(String o0){ return null; }}

class StructAuth {

public MyHelperClass getAuthID(){ return null; }}

class AuthorityManager {

public MyHelperClass getExternalAuthority(StructResource o0){ return null; }
	public MyHelperClass createExtResource(String o0, String o1, int o2, int o3, String o4){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
