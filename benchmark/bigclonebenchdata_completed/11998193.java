
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11998193 {

    private static void executeSQLScript() {
        File f = new File(System.getProperty("user.dir") + "/resources/umc.sql");
        if ((boolean)(Object)f.exists()) {
            Connection con = null;
            PreparedStatement pre_stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                MyHelperClass DriverManager = new MyHelperClass();
                con =(Connection)(Object) DriverManager.getConnection("jdbc:sqlite:database/umc.db", "", "");
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line = "";
                con.setAutoCommit(false);
                while ((line =(String)(Object) br.readLine()) != null) {
                    if (!line.equals("") && !line.startsWith("--") && !line.contains("--")) {
                        MyHelperClass log = new MyHelperClass();
                        log.debug(line);
                        pre_stmt =(PreparedStatement)(Object) con.prepareStatement(line);
                        pre_stmt.executeUpdate();
                    }
                }
                con.commit();
                File dest = new File(f.getAbsolutePath() + ".executed");
                if ((boolean)(Object)dest.exists()) dest.delete();
                f.renameTo(dest);
                f.delete();
            } catch (Throwable exc) {
                MyHelperClass log = new MyHelperClass();
                log.error("Fehler bei Ausführung der SQL Datei", exc);
                try {
                    con.rollback();
                } catch (UncheckedIOException exc1) {
                }
            } finally {
                try {
                    if (pre_stmt != null) pre_stmt.close();
                    if (con != null) con.close();
                } catch (UncheckedIOException exc2) {
                    MyHelperClass log = new MyHelperClass();
                    log.error("Fehler bei Ausführung von SQL Datei", exc2);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
