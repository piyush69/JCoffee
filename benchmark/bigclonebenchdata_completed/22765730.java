
import java.io.UncheckedIOException;


class c22765730 {
public MyHelperClass factory;

    public void addUser(String name, String unit, String organizeName, int userId, int orgId, String email) {
        Connection connection = null;
        PreparedStatement ps = null;
        MyHelperClass POOL_NAME = new MyHelperClass();
        DBOperation dbo =(DBOperation)(Object) factory.createDBOperation(POOL_NAME);
        try {
            connection =(Connection)(Object) dbo.getConnection();
            MyHelperClass INSERT_USER = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(INSERT_USER);
            MyHelperClass AddrslistMainDao = new MyHelperClass();
            ps.setInt(1,(int)(Object) AddrslistMainDao.getNewID());
            ps.setInt(2, -100);
            ps.setString(3, name.substring(0, 1));
            ps.setString(4, name.substring(1));
            ps.setString(5, unit);
            ps.setString(6, organizeName);
            ps.setString(7, "");
            ps.setString(8, email);
            ps.setString(9, "");
            ps.setString(10, "");
            ps.setString(11, "");
            ps.setString(12, "");
            ps.setString(13, "");
            ps.setString(14, "");
            ps.setString(15, "");
            ps.setString(16, "");
            ps.setString(17, "");
            ps.setString(18, "");
            ps.setInt(19, userId);
            ps.setInt(20, orgId);
            ps.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (UncheckedIOException e1) {
            }
        } finally {
            try {
                ps.close();
                connection.close();
                dbo.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getNewID(){ return null; }
	public MyHelperClass createDBOperation(MyHelperClass o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DBOperation {

public MyHelperClass close(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
