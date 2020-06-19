
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11237850 {
public static MyHelperClass currentSession(){ return null; }
public static MyHelperClass log(String o0){ return null; }
	public static MyHelperClass closeHibernateSession(){ return null; }
//	public MyHelperClass currentSession(){ return null; }
//public MyHelperClass log(String o0){ return null; }
//	public MyHelperClass closeHibernateSession(){ return null; }

    public static boolean doExecuteBatchSQL(List sql) {
        MyHelperClass session = new MyHelperClass();
        session = currentSession();
//        MyHelperClass session = new MyHelperClass();
        Connection conn =(Connection)(Object) session.connection();
        PreparedStatement ps = null;
        try {
            conn.setAutoCommit(false);
            Iterator iter =(Iterator)(Object) sql.iterator();
            while ((boolean)(Object)iter.hasNext()) {
                String sqlstr = (String)(String)(Object) iter.next();
                log("[SmsManager] doing sql:" + sqlstr);
                ps =(PreparedStatement)(Object) conn.prepareStatement(sqlstr);
                ps.executeUpdate();
            }
            conn.commit();
            conn.setAutoCommit(true);
            return true;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            return false;
        } finally {
            if (conn != null) try {
                conn.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            closeHibernateSession();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connection(){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
