
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2626874 {

    public static ResultSet execute(String commands) {
        ResultSet rs = null;
        BufferedReader reader = new BufferedReader(new StringReader(commands));
        String sqlCommand = null;
        MyHelperClass ConnPool = new MyHelperClass();
        Connection conn =(Connection)(Object) ConnPool.getConnection();
        try {
            Statement stmt =(Statement)(Object) conn.createStatement();
            while ((sqlCommand =(String)(Object) reader.readLine()) != null) {
                sqlCommand = sqlCommand.toLowerCase().trim();
                if (sqlCommand.equals("") || sqlCommand.startsWith("#")) {
                    continue;
                }
                MyHelperClass dmaLogger = new MyHelperClass();
                if ((boolean)(Object)dmaLogger.isInfoEnabled(SqlExecutor.class)) {
//                    MyHelperClass dmaLogger = new MyHelperClass();
                    dmaLogger.logInfo("Executing SQL: " + sqlCommand, SqlExecutor.class);
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (sqlCommand.startsWith("select")) {
                    rs =(ResultSet)(Object) stmt.executeQuery(sqlCommand);
                } else {
                    stmt.executeUpdate(sqlCommand);
                }
                MyHelperClass DateUtil = new MyHelperClass();
                dmaLogger.logInfo((String)(Object)DateUtil.getElapsedTime("SQL execution of " + sqlCommand + "  took: ", (System.currentTimeMillis() - currentTimeMillis)), SqlExecutor.class);
            }
            if (rs == null) {
                stmt.close();
            }
            return rs;
        } catch (UncheckedIOException e) {
            try {
                conn.rollback();
            } catch (UncheckedIOException se) {
            }
            throw new RuntimeException("Execution of " + sqlCommand + " failed:" + e.getMessage(), e);
        } catch (ArithmeticException e) {
            try {
                conn.rollback();
            } catch (UncheckedIOException se) {
            }
            throw new RuntimeException("Execution of " + sqlCommand + " failed:", e);
        } finally {
//            MyHelperClass ConnPool = new MyHelperClass();
            ConnPool.releaseConnection(conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass releaseConnection(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass isInfoEnabled(Class<SqlExecutor> o0){ return null; }
	public MyHelperClass getElapsedTime(String o0, long o1){ return null; }
	public MyHelperClass logInfo(String o0, Class<SqlExecutor> o1){ return null; }}

class ResultSet {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(StringReader o0){}
	public MyHelperClass readLine(){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class SqlExecutor {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
