import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4481712 {
public MyHelperClass deleteSql;

    public void deleteObject(String id) throws SQLException {
        boolean selfConnection = true;
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            MyHelperClass dbConnection = new MyHelperClass();
            if (dbConnection == null) {
                DatabaseConn dbConn = new DatabaseConn();
                conn =(Connection)(Object) dbConn.getConnection();
                conn.setAutoCommit(false);
            } else {
//                MyHelperClass dbConnection = new MyHelperClass();
                conn =(Connection)(Object) dbConnection;
                selfConnection = false;
            }
            stmt =(PreparedStatement)(Object) conn.prepareStatement(this.deleteSql);
            stmt.setString(1, id);
            stmt.executeUpdate();
            if (selfConnection) conn.commit();
        } catch (Exception e) {
            if (selfConnection && conn != null) conn.rollback();
            throw new SQLException(e.getMessage());
        } finally {
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
            if (selfConnection && conn != null) {
                conn.close();
                conn = null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DatabaseConn {

public MyHelperClass getConnection(){ return null; }}
