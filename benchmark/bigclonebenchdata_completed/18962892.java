
import java.io.UncheckedIOException;


class c18962892 {
public MyHelperClass Concrete;
	public MyHelperClass connection;
	public MyHelperClass logger;
	public MyHelperClass MessageDigest;
	public MyHelperClass connect(){ return null; }
	public MyHelperClass disconnect(){ return null; }

    public String control(final String allOptions) throws SQLException {
        connect();
        final Statement stmt =(Statement)(Object) connection.createStatement();
        final ResultSet rst1 =(ResultSet)(Object) stmt.executeQuery("SELECT versionId FROM versions WHERE version='" + Concrete.version() + "'");
        final long versionId;
        if ((boolean)(Object)rst1.next()) {
            versionId =(long)(Object) rst1.getInt(1);
        } else {
            disconnect();
            return "";
        }
        rst1.close();
        final MessageDigest msgDigest;
        try {
            msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e1) {
            logger.throwing(SQLExecutionController.class.getSimpleName(), "control",(NoSuchAlgorithmException)(Object) e1);
            disconnect();
            return "";
        }
        msgDigest.update(allOptions.getBytes());
        final ResultSet rst2 =(ResultSet)(Object) stmt.executeQuery("SELECT configId FROM configs WHERE md5='" + Concrete.md5(msgDigest.digest()) + "'");
        final long configId;
        if ((boolean)(Object)rst2.next()) {
            configId =(long)(Object) rst2.getInt(1);
        } else {
            disconnect();
            return "";
        }
        rst2.close();
        final ResultSet rst4 =(ResultSet)(Object) stmt.executeQuery("SELECT problems.md5 FROM executions " + "LEFT JOIN problems ON executions.problemId = problems.problemId WHERE " + "configId=" + configId + " AND versionId=" + versionId);
        final StringBuilder stb = new StringBuilder();
        while ((boolean)(Object)rst4.next()) {
            stb.append(rst4.getString(1)).append('\n');
        }
        rst4.close();
        stmt.close();
        return stb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass version(){ return null; }
	public MyHelperClass md5(MyHelperClass o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass throwing(String o0, String o1, NoSuchAlgorithmException o2){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class SQLExecutionController {

}
