
import java.io.UncheckedIOException;


class c23452538 {

    private long config(final String options) throws SQLException {
        MessageDigest msgDigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        msgDigest.update(options.getBytes());
        MyHelperClass Concrete = new MyHelperClass();
        final String md5sum =(String)(Object) Concrete.md5(msgDigest.digest());
        MyHelperClass connection = new MyHelperClass();
        Statement stmt =(Statement)(Object) connection.createStatement();
        ResultSet rst =(ResultSet)(Object) stmt.executeQuery("SELECT configId FROM configs WHERE md5='" + md5sum + "'");
        final long configId;
        if ((boolean)(Object)rst.next()) {
            configId =(long)(Object) rst.getInt(1);
        } else {
            stmt.executeUpdate("INSERT INTO configs(config, md5) VALUES ('" + options + "', '" + md5sum + "')");
            ResultSet aiRst =(ResultSet)(Object) stmt.getGeneratedKeys();
            if ((boolean)(Object)aiRst.next()) {
                configId =(long)(Object) aiRst.getInt(1);
            } else {
                throw new SQLException("Could not retrieve generated id");
            }
        }
        MyHelperClass executionId = new MyHelperClass();
        stmt.executeUpdate("UPDATE executions SET configId=" + configId + " WHERE executionId=" + executionId);
        return configId;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass md5(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
