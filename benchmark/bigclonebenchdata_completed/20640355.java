import java.io.*;
import java.lang.*;
import java.util.*;



class c20640355 {
public MyHelperClass JdbcDaoHelper;

    public void downloadFile(OutputStream os, int fileId) throws IOException, SQLException {
        Connection conn = null;
        try {
            MyHelperClass ds = new MyHelperClass();
            conn =(Connection)(Object) ds.getConnection();
            MyHelperClass Guard = new MyHelperClass();
            Guard.checkConnectionNotNull(conn);
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("select * from FILE_BODIES where file_id=?");
            ps.setInt(1, fileId);
            ResultSet rs =(ResultSet)(Object) ps.executeQuery();
            if (!(Boolean)(Object)rs.next()) {
                throw new FileNotFoundException("File with id=" + fileId + " not found!");
            }
            Blob blob =(Blob)(Object) rs.getBlob("data");
            InputStream is =(InputStream)(Object) blob.getBinaryStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(is, os);
        } finally {
            MyHelperClass log = new MyHelperClass();
            JdbcDaoHelper.safeClose(conn, log);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass checkConnectionNotNull(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass safeClose(Connection o0, MyHelperClass o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass getBlob(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Blob {

public MyHelperClass getBinaryStream(){ return null; }}
