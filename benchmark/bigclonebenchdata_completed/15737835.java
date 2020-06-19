
import java.io.UncheckedIOException;


class c15737835 {
public MyHelperClass selfDefineAdd(String[] o0, Site o1, Connection o2, PreparedStatement o3){ return null; }
	public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
public MyHelperClass Const;
	public MyHelperClass log;
	public MyHelperClass createDBOperation(){ return null; }

    public void add(Site site) throws Exception {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sqlStr = "insert into t_ip_site (id,name,description,ascii_name,site_path,remark_number,increment_index,use_status,appserver_id) VALUES(?,?,?,?,?,?,?,?,?)";
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sqlStr);
            preparedStatement.setInt(1, site.getSiteID());
            preparedStatement.setString(2, site.getName());
            preparedStatement.setString(3, site.getDescription());
            preparedStatement.setString(4, site.getAsciiName());
            preparedStatement.setString(5, site.getPath());
            preparedStatement.setInt(6, site.getRemarkNumber());
            preparedStatement.setString(7, site.getIncrementIndex().trim());
            preparedStatement.setString(8, String.valueOf(site.getUseStatus()));
            preparedStatement.setString(9, String.valueOf(site.getAppserverID()));
            preparedStatement.executeUpdate();
            String[] path = new String[1];
            path[0] =(String)(Object) site.getPath();
            selfDefineAdd(path, site, connection, preparedStatement);
            connection.commit();
            int resID =(int)(Object) site.getSiteID() + (int)(Object)Const.SITE_TYPE_RES;
            String resName =(String)(Object) site.getName();
            int resTypeID =(int)(Object) Const.RES_TYPE_ID;
            int operateTypeID =(int)(Object) Const.OPERATE_TYPE_ID;
            String remark = "";
            AuthorityManager am = new AuthorityManager();
            am.createExtResource(Integer.toString(resID), resName, resTypeID, operateTypeID, remark);
            site.wirteFile();
        } catch (UncheckedIOException ex) {
            connection.rollback();
            log.error("����վ��ʧ��!",(SQLException)(Object) ex);
            throw ex;
        } finally {
            close(resultSet, null, preparedStatement, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RES_TYPE_ID;
	public MyHelperClass SITE_TYPE_RES;
	public MyHelperClass OPERATE_TYPE_ID;
public MyHelperClass trim(){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }}

class Site {

public MyHelperClass getAppserverID(){ return null; }
	public MyHelperClass getSiteID(){ return null; }
	public MyHelperClass wirteFile(){ return null; }
	public MyHelperClass getIncrementIndex(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getRemarkNumber(){ return null; }
	public MyHelperClass getAsciiName(){ return null; }
	public MyHelperClass getUseStatus(){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

}

class AuthorityManager {

public MyHelperClass createExtResource(String o0, String o1, int o2, int o3, String o4){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
