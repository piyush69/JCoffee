
import java.io.UncheckedIOException;


class c14954350 {

    public void transaction() {
        String delPets = "delete from PETS where PERSON_ID = 1";
        String delPersons = "delete from PERSONS where PERSON_ID = 1";
        if (true) {
            System.out.println(delPets);
            System.out.println(delPersons);
        }
        Connection conn = null;
        Statement stmt = null;
        try {
            MyHelperClass ConnHelper = new MyHelperClass();
            conn =(Connection)(Object) ConnHelper.getConnectionByDriverManager();
            conn.setAutoCommit(false);
            stmt =(Statement)(Object) conn.createStatement();
            int affectedRows =(int)(Object) stmt.executeUpdate(delPets);
            System.out.println("affectedRows = " + affectedRows);
            if (true) {
                throw new SQLException("fasfdsaf");
            }
            affectedRows =(int)(Object) stmt.executeUpdate(delPersons);
            System.out.println("affectedRows = " + affectedRows);
            conn.commit();
            conn.setAutoCommit(true);
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (UncheckedIOException e1) {
                e.printStackTrace(System.out);
            }
            e.printStackTrace(System.out);
        } finally {
            MyHelperClass ConnHelper = new MyHelperClass();
            ConnHelper.close(conn, stmt, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnectionByDriverManager(){ return null; }
	public MyHelperClass close(Connection o0, Statement o1, Object o2){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
