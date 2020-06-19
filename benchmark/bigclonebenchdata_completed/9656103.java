import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9656103 {
public MyHelperClass removeChildCollection(long o0, Connection o1){ return null; }

    private void removeCollection(long oid, Connection conn) throws Throwable, XMLDBException {
        try {
            String sql = "DELETE FROM X_DOCUMENT WHERE X_DOCUMENT.XDB_COLLECTION_OID = ?";
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setLong(1, oid);
            pstmt.executeUpdate();
            pstmt.close();
            sql = "DELETE FROM XDB_COLLECTION WHERE XDB_COLLECTION.XDB_COLLECTION_OID = ?";
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setLong(1, oid);
            pstmt.executeUpdate();
            pstmt.close();
            removeChildCollection(oid, conn);
//         } catch (java.sql.ArithmeticException se) {
            try {
                conn.rollback();
//             } catch (java.sql.ArrayIndexOutOfBoundsException se2) {
                se2.printStackTrace();
            }
            se.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class XMLDBException extends Exception{
	public XMLDBException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }}
