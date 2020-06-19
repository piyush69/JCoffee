import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23407527 {
public MyHelperClass logTableName;
	public MyHelperClass Assert;
	public MyHelperClass database;

    protected void downgradeHistory(Collection<String> versions)  throws Throwable {
        MyHelperClass Assert = new MyHelperClass();
        Assert.notEmpty(versions);
        try {
            Connection connection = this.database.getDefaultConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE " + this.logTableName + " SET RESULT = 'DOWNGRADED' WHERE TYPE = 'B' AND TARGET = ? AND RESULT = 'COMPLETE'");
            boolean commit = false;
            try {
                for (String version : versions) {
                    statement.setString(1, version);
                    int modified = statement.executeUpdate();
                    Assert.isTrue(modified <= 1, "Expecting not more than 1 record to be updated, not " + modified);
                }
                commit = true;
            } finally {
                statement.close();
                if (commit) connection.commit(); else connection.rollback();
            }
        } catch (SQLException e) {
            throw new SystemException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isTrue(boolean o0, String o1){ return null; }
	public MyHelperClass getDefaultConnection(){ return null; }
	public MyHelperClass notEmpty(Collection<String o0){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class SystemException extends Exception{
	public SystemException(String errorMessage) { super(errorMessage); }
}
