
import java.io.UncheckedIOException;


class c14504556 {
public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
public MyHelperClass logger;
	public MyHelperClass createDBOperation(){ return null; }

    public void doNew(Vector userId, String shareFlag, String folderId) throws AddrException {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rset = null;
        MyHelperClass SHARE_TABLE = new MyHelperClass();
        String sql = "insert into " + SHARE_TABLE + " values(?,?,?)";
        try {
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            for (int i = 0; i < (int)(Object)userId.size(); i++) {
                String user = (String)(String)(Object) userId.elementAt(i);
                ps =(PreparedStatement)(Object) connection.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(folderId));
                ps.setInt(2, Integer.parseInt(user));
                ps.setString(3, shareFlag);
                int resultCount =(int)(Object) ps.executeUpdate();
                if (resultCount != 1) {
                    throw new Exception("error");
                }
            }
            connection.commit();
        } catch (Exception ex) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            logger.error("���������ļ�����Ϣʧ��, " + ex.getMessage());
            throw new AddrException("���������ļ�����Ϣʧ��,һ�������ļ���ֻ�ܹ����ͬһ�û�һ��!");
        } finally {
            close(rset, null, ps, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class Vector {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

class AddrException extends Exception{
	public AddrException(String errorMessage) { super(errorMessage); }
}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
