
import java.io.UncheckedIOException;


class c1655162 {

    public boolean updatenum(int num, String pid) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pm = null;
        try {
            MyHelperClass Pool = new MyHelperClass();
            conn =(Connection)(Object) Pool.getConnection();
            conn.setAutoCommit(false);
            pm =(PreparedStatement)(Object) conn.prepareStatement("update addwuliao set innum=? where pid=?");
            pm.setInt(1, num);
            pm.setString(2, pid);
            int a =(int)(Object) pm.executeUpdate();
            if (a == 0) {
                flag = false;
            } else {
                flag = true;
            }
            conn.commit();
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(pm);
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
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
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(Connection o0){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
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

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
