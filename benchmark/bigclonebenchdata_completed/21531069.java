
import java.io.UncheckedIOException;


class c21531069 {

    public int updateuser(User u) {
        int i = 0;
        Connection conn = null;
        PreparedStatement pm = null;
        try {
            MyHelperClass Pool = new MyHelperClass();
            conn =(Connection)(Object) Pool.getConnection();
            conn.setAutoCommit(false);
            pm =(PreparedStatement)(Object) conn.prepareStatement("update user set username=?,passwd=?,existstate=?,management=? where userid=?");
            pm.setString(1, u.getUsername());
            pm.setString(2, u.getPasswd());
            pm.setInt(3, u.getExiststate());
            pm.setInt(4, u.getManagement());
            pm.setString(5, u.getUserid());
            i =(int)(Object) pm.executeUpdate();
            conn.commit();
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(pm);
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            MyHelperClass Pool = new MyHelperClass();
            Pool.close(pm);
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(conn);
        } finally {
            MyHelperClass Pool = new MyHelperClass();
            Pool.close(pm);
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(conn);
        }
        return i;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(Connection o0){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class User {

public MyHelperClass getPasswd(){ return null; }
	public MyHelperClass getExiststate(){ return null; }
	public MyHelperClass getUserid(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getManagement(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
