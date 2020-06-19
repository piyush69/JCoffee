import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7606314 {
public MyHelperClass con;

    public synchronized void deleteDocument(final String file) throws IOException {
        SQLException ex = null;
        try {
            MyHelperClass con = new MyHelperClass();
            PreparedStatement findFileStmt =(PreparedStatement)(Object) con.prepareStatement("SELECT ID AS \"ID\" FROM File_ WHERE Name = ?");
            findFileStmt.setString(1, file);
            ResultSet rs =(ResultSet)(Object) findFileStmt.executeQuery();
            if (null != rs && (boolean)(Object)rs.next()) {
                int fileId =(int)(Object) rs.getInt("ID");
                rs.close();
                rs = null;
//                MyHelperClass con = new MyHelperClass();
                PreparedStatement deleteTokensStmt =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM Token_ WHERE FieldID IN ( SELECT ID FROM Field_ WHERE FileID = ? )");
                deleteTokensStmt.setInt(1, fileId);
                deleteTokensStmt.executeUpdate();
//                MyHelperClass con = new MyHelperClass();
                PreparedStatement deleteFieldsStmt =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM Field_ WHERE FileID = ?");
                deleteFieldsStmt.setInt(1, fileId);
                deleteFieldsStmt.executeUpdate();
//                MyHelperClass con = new MyHelperClass();
                PreparedStatement deleteFileStmt =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM File_ WHERE ID = ?");
                deleteFileStmt.setInt(1, fileId);
                deleteFileStmt.executeUpdate();
                deleteFileStmt.close();
                deleteFileStmt = null;
                deleteFieldsStmt.close();
                deleteFieldsStmt = null;
                deleteTokensStmt.close();
                deleteTokensStmt = null;
            }
            findFileStmt.close();
            findFileStmt = null;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            ex =(SQLException)(Object) e;
            try {
                this.con.rollback();
            } catch (UncheckedIOException e2) {
            }
        } finally {
            try {
                this.con.setAutoCommit(true);
            } catch (UncheckedIOException e2) {
            }
        }
        if (null != ex) throw new IOException(ex.getMessage());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }}
