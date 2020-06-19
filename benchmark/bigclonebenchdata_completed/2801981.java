


class c2801981 {
public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
public MyHelperClass Types;
	public MyHelperClass createDBOperation(){ return null; }

    public void addBySiteChannelPath(String siteChannelPath, String[] docTypePaths, String[] showTemplateIds) throws Exception {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            String sql = "delete from t_ip_doctype_channel where chan_path='" + siteChannelPath + "'";
            connection.createStatement().executeUpdate(sql);
            sql = "insert into t_ip_doctype_channel(doctype_path,chan_path,show_template_id) values(?,'" + siteChannelPath + "',?)";
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sql);
            for (int i = 0; i < docTypePaths.length; i++) {
                preparedStatement.setString(1, docTypePaths[i]);
                String temp = showTemplateIds != null && i < showTemplateIds.length ? showTemplateIds[i] : "null";
                if (temp == null || temp.trim().equals("") || temp.trim().equalsIgnoreCase("null")) {
                    preparedStatement.setInt(2,(int)(Object) Types.NULL);
                } else {
                    preparedStatement.setInt(2, Integer.parseInt(temp));
                }
                preparedStatement.executeUpdate();
            }
            connection.commit();
        } catch (Exception ex) {
            connection.rollback();
            ex.printStackTrace();
            throw ex;
        } finally {
            connection.setAutoCommit(true);
            close(resultSet, null, preparedStatement, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NULL;
public MyHelperClass executeUpdate(String o0){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

}
