


class c15737836 {
public MyHelperClass getSelfDefinePath(MyHelperClass o0, String o1, Connection o2, PreparedStatement o3, ResultSet o4){ return null; }
public MyHelperClass selfDefineDelete(String[] o0, Connection o1, PreparedStatement o2){ return null; }
	public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
public MyHelperClass createDBOperation(){ return null; }

    public void delete(Site site) throws Exception {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String chkSql = "select id from t_ip_doc where channel_path=?";
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            String[] selfDefinePath =(String[])(Object) getSelfDefinePath(site.getPath(), "1", connection, preparedStatement, resultSet);
            selfDefineDelete(selfDefinePath, connection, preparedStatement);
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(chkSql);
            preparedStatement.setString(1, site.getPath());
            resultSet =(ResultSet)(Object) preparedStatement.executeQuery();
            if ((boolean)(Object)resultSet.next()) {
                throw new Exception("ɾ��ʧ�ܣ�" + site.getName() + "���Ѿ����ĵ����ڣ�");
            } else {
                String sqlStr = "delete from t_ip_site where site_path=?";
                dbo =(DBOperation)(Object) createDBOperation();
                connection =(Connection)(Object) dbo.getConnection();
                preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sqlStr);
                preparedStatement.setString(1, site.getPath());
                preparedStatement.executeUpdate();
            }
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            close(resultSet, null, preparedStatement, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Site {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
