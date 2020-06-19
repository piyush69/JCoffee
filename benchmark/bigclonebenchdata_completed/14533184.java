import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14533184 {

    public boolean delete(int id)  throws Throwable {
        boolean deletionOk = false;
        Connection conn = null;
        try {
            MyHelperClass db = new MyHelperClass();
            conn =(Connection)(Object) db.getConnection();
            conn.setAutoCommit(false);
            String sql = "DELETE FROM keyphrases WHERE website_id=?";
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setInt(1, id);
            deletionOk =(int)(Object) ps.executeUpdate() == 1;
            ps.close();
            sql = "DELETE FROM websites WHERE id=?";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setInt(1, id);
            boolean success =(int)(Object) ps.executeUpdate() == 1;
            deletionOk = deletionOk && success;
            ps.close();
            conn.commit();
            conn.setAutoCommit(true);
        } catch (ArithmeticException sqle) {
            try {
                conn.rollback();
                conn.setAutoCommit(true);
            } catch (ArrayIndexOutOfBoundsException sex) {
                throw(Throwable)(Object) new OsseoFailure("SQL error: roll back failed. ",(SQLException)(Object) sex);
            }
            throw(Throwable)(Object) new OsseoFailure("SQL error: cannot remove website with id " + id + ".",(SQLException)(Object) sqle);
        } finally {
            MyHelperClass db = new MyHelperClass();
            db.putConnection(conn);
        }
        return deletionOk;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass putConnection(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class OsseoFailure {

OsseoFailure(){}
	OsseoFailure(String o0, SQLException o1){}}
