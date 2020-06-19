
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11998194 {

    private static void executeDBPatchFile() throws Exception {
        Connection con = null;
        PreparedStatement pre_stmt = null;
        ResultSet rs = null;
        try {
            InputStream is = null;
            URL url = new URL("http://www.hdd-player.de/umc/UMC-DB-Update-Script.sql");
            is =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            Class.forName("org.sqlite.JDBC");
            MyHelperClass DriverManager = new MyHelperClass();
            con =(Connection)(Object) DriverManager.getConnection("jdbc:sqlite:database/umc.db", "", "");
            double dbVersion = -1;
            pre_stmt =(PreparedStatement)(Object) con.prepareStatement("SELECT * FROM DB_VERSION WHERE ID_MODUL = 0");
            rs =(ResultSet)(Object) pre_stmt.executeQuery();
            if ((boolean)(Object)rs.next()) {
                dbVersion =(double)(Object) rs.getDouble("VERSION");
            }
            String line = "";
            con.setAutoCommit(false);
            boolean collectSQL = false;
            ArrayList sqls = new ArrayList();
            double patchVersion = 0;
            while ((line =(String)(Object) br.readLine()) != null) {
                if (line.startsWith("[")) {
                    MyHelperClass Pattern = new MyHelperClass();
                    Pattern p =(Pattern)(Object) Pattern.compile("\\[.*\\]");
                    Matcher m =(Matcher)(Object) p.matcher(line);
                    m.find();
                    String value =(String)(Object) m.group();
                    value = value.substring(1, value.length() - 1);
                    patchVersion = Double.parseDouble(value);
                }
                if (patchVersion == dbVersion + 1) collectSQL = true;
                if (collectSQL) {
                    if (!line.equals("") && !line.startsWith("[") && !line.startsWith("--") && !line.contains("--")) {
                        if (line.endsWith(";")) line = line.substring(0, line.length() - 1);
                        sqls.add(line);
                    }
                }
            }
            if (pre_stmt != null) pre_stmt.close();
            if (rs != null) rs.close();
            for (String sql :(String[])(Object) (Object[])(Object)sqls) {
                MyHelperClass log = new MyHelperClass();
                log.debug("Führe SQL aus Patch Datei aus: " + sql);
                pre_stmt =(PreparedStatement)(Object) con.prepareStatement(sql);
                pre_stmt.execute();
            }
            if (patchVersion > 0) {
                MyHelperClass log = new MyHelperClass();
                log.debug("aktualisiere Versionsnummer in DB");
                if (pre_stmt != null) pre_stmt.close();
                if (rs != null) rs.close();
                pre_stmt =(PreparedStatement)(Object) con.prepareStatement("UPDATE DB_VERSION SET VERSION = ? WHERE ID_MODUL = 0");
                pre_stmt.setDouble(1, patchVersion);
                pre_stmt.execute();
            }
            con.commit();
        } catch (UncheckedIOException exc) {
            MyHelperClass log = new MyHelperClass();
            log.error(exc.toString());
            throw new Exception("SQL Patch Datei konnte nicht online gefunden werden", exc);
        } catch (ArithmeticException exc) {
            MyHelperClass log = new MyHelperClass();
            log.error(exc.toString());
            throw new Exception("SQL Patch Datei konnte nicht gelesen werden", exc);
        } catch (Throwable exc) {
            MyHelperClass log = new MyHelperClass();
            log.error("Fehler bei Ausführung der SQL Patch Datei", exc);
            try {
                con.rollback();
            } catch (UncheckedIOException exc1) {
            }
            throw new Exception("SQL Patch Datei konnte nicht ausgeführt werden", exc);
        } finally {
            try {
                if (pre_stmt != null) pre_stmt.close();
                if (con != null) con.close();
            } catch (UncheckedIOException exc2) {
                MyHelperClass log = new MyHelperClass();
                log.error("Fehler bei Ausführung von SQL Patch Datei", exc2);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setDouble(int o0, double o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass execute(){ return null; }}

class ResultSet {

public MyHelperClass getDouble(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
