
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8961871 {
public MyHelperClass DriverManager;
	public MyHelperClass DBUrl;

    public void Transaction() throws Exception {
        Connection Conn = null;
        Statement Stmt = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver").newInstance();
            Conn =(Connection)(Object) DriverManager.getConnection(DBUrl);
            Conn.setAutoCommit(true);
            Stmt =(Statement)(Object) Conn.createStatement();
            try {
                Stmt.executeUpdate("DROP TABLE trans_test");
            } catch (UncheckedIOException sqlEx) {
            }
            Stmt.executeUpdate("CREATE TABLE trans_test (id int not null primary key, decdata double) type=BDB");
            Conn.setAutoCommit(false);
            Stmt.executeUpdate("INSERT INTO trans_test (id, decdata) VALUES (1, 21.0)");
            Stmt.executeUpdate("INSERT INTO trans_test (id, decdata) VALUES (2, 23.485115)");
            Conn.rollback();
            System.out.println("Roll Ok");
            ResultSet RS =(ResultSet)(Object) Stmt.executeQuery("SELECT * from trans_test");
            if (!(Boolean)(Object)RS.next()) {
                System.out.println("Ok");
            } else {
                System.out.println("Rollback failed");
            }
            Stmt.executeUpdate("INSERT INTO trans_test (id, decdata) VALUES (2, 23.485115)");
            Stmt.executeUpdate("INSERT INTO trans_test (id, decdata) VALUES (1, 21.485115)");
            Conn.commit();
            RS =(ResultSet)(Object) Stmt.executeQuery("SELECT * from trans_test where id=2");
            if ((boolean)(Object)RS.next()) {
                System.out.println(RS.getDouble(2));
                System.out.println("Ok");
            } else {
                System.out.println("Rollback failed");
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (Stmt != null) {
                try {
                    Stmt.close();
                } catch (UncheckedIOException SQLEx) {
                }
            }
            if (Conn != null) {
                try {
                    Conn.close();
                } catch (UncheckedIOException SQLEx) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(MyHelperClass o0){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getDouble(int o0){ return null; }}
