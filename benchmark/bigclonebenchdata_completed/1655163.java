
import java.io.UncheckedIOException;


class c1655163 {

    public boolean delwuliao(String pid) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pm = null;
        try {
            MyHelperClass Pool = new MyHelperClass();
            conn =(Connection)(Object) Pool.getConnection();
            conn.setAutoCommit(false);
            pm =(PreparedStatement)(Object) conn.prepareStatement("delete from addwuliao where pid=?");
            pm.setString(1, pid);
            int x =(int)(Object) pm.executeUpdate();
            if (x == 0) {
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
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
