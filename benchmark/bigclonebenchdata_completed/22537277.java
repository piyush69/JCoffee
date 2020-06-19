
import java.io.UncheckedIOException;


class c22537277 {
public MyHelperClass DriverManager;
	public MyHelperClass log(String o0){ return null; }

//    @Test
    public void testSQLite() {
        log("trying SQLite..");
        for (int i = 0; i < 10; i++) {
            Connection c = null;
            try {
                Class.forName("SQLite.JDBCDriver");
                c =(Connection)(Object) DriverManager.getConnection("jdbc:sqlite:/C:/Source/SRFSurvey/app/src/org/speakright/srfsurvey/results.db", "", "");
                c.setAutoCommit(false);
                Statement st =(Statement)(Object) c.createStatement();
                int rc =(int)(Object) st.executeUpdate("INSERT INTO tblAnswers(fQID,fQNAME) VALUES('q1','zoo')");
                st.close();
                c.commit();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(1);
                try {
                    if (c != null && !(Boolean)(Object)c.isClosed()) {
                        c.rollback();
                        c.close();
                    }
                } catch (UncheckedIOException sql) {
                }
            }
        }
        log("end");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class Test {

}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
