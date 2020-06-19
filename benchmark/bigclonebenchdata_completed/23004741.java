import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23004741 {
public MyHelperClass entry;
	public MyHelperClass OkErrorEnum;
	public MyHelperClass getRequestCycle(){ return null; }
	public MyHelperClass info(String o0){ return null; }

    private boolean delete()  throws Throwable {
        boolean ret = false;
        try {
            Connection conn =(Connection)(Object) ((JdbcRequestCycle)(JdbcRequestCycle)(Object) getRequestCycle()).getConnection();
            if (conn == null) {
                throw new RestartResponseException((String)(Object)new OkErrorPage(OkErrorEnum.DATABASE));
            }
            String query = "delete from revisions where entry=?";
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(query);
            pstmt.setInt(1, entry);
            int revisionsRowsAffected =(int)(Object) pstmt.executeUpdate();
            query = "delete from entry where id=?";
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(query);
            pstmt.setInt(1, entry);
            int entryRowAffected =(int)(Object) pstmt.executeUpdate();
            if (entryRowAffected > 0) {
                ret = true;
            } else {
                conn.rollback();
            }
            info(entryRowAffected + " entry with " + revisionsRowsAffected + " revisions was deleted.");
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DATABASE;
}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class JdbcRequestCycle {

public MyHelperClass getConnection(){ return null; }}

class RestartResponseException extends Exception{
	public RestartResponseException(String errorMessage) { super(errorMessage); }
}

class OkErrorPage {

OkErrorPage(){}
	OkErrorPage(MyHelperClass o0){}}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
