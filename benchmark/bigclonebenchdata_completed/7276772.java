import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7276772 {
public MyHelperClass connection;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testBlobB()  throws Throwable {
        ResultSet rs;
        byte[] ba;
        byte[] baR1 = new byte[] { (byte) 0xF1, (byte) 0xF2, (byte) 0xF3, (byte) 0xF4, (byte) 0xF5, (byte) 0xF6, (byte) 0xF7, (byte) 0xF8, (byte) 0xF9, (byte) 0xFA, (byte) 0xFB };
        byte[] baR2 = new byte[] { (byte) 0xE1, (byte) 0xE2, (byte) 0xE3, (byte) 0xE4, (byte) 0xE5, (byte) 0xE6, (byte) 0xE7, (byte) 0xE8, (byte) 0xE9, (byte) 0xEA, (byte) 0xEB };
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
//            MyHelperClass connection = new MyHelperClass();
            Statement st =(Statement)(Object) connection.createStatement();
            st.executeUpdate("DROP TABLE blo IF EXISTS");
            st.executeUpdate("CREATE TABLE blo (id INTEGER, b blob( 100))");
//            MyHelperClass connection = new MyHelperClass();
            PreparedStatement ps =(PreparedStatement)(Object) connection.prepareStatement("INSERT INTO blo(id, b) values(2, ?)");
            ps.setBlob(1, new SerialBlob(baR1));
            ps.executeUpdate();
            rs =(ResultSet)(Object) st.executeQuery("SELECT b FROM blo WHERE id = 2");
            if (!(Boolean)(Object)rs.next()) {
                assertTrue("No row with id 2", false);
            }
            java.sql.Blob blob1 =(java.sql.Blob)(Object)(Blob)(Object) rs.getBlob("b");
            System.out.println("Size of retrieved blob: " + blob1.length());
            byte[] baOut = blob1.getBytes(1, (int) blob1.length());
            if (baOut.length != baR1.length) {
                assertTrue("Expected array len " + baR1.length + ", got len " + baOut.length, false);
            }
            for (int i = 0; i < baOut.length; i++) {
                if (baOut[i] != baR1[i]) {
                    assertTrue("Expected array len " + baR1.length + ", got len " + baOut.length, false);
                }
            }
            rs.close();
            rs =(ResultSet)(Object) st.executeQuery("SELECT b FROM blo WHERE id = 2");
            if (!(Boolean)(Object)rs.next()) {
                assertTrue("No row with id 2", false);
            }
            blob1 =(java.sql.Blob)(Object)(Blob)(Object) rs.getBlob("b");
            ba = blob1.getBytes(1, baR2.length);
            if (ba.length != baR2.length) {
                assertTrue("row2 byte length differs", false);
            }
            for (int i = 0; i < ba.length; i++) {
                if (ba[i] != baR1[i]) {
                    assertTrue("row2 byte " + i + " differs", false);
                }
            }
            rs.close();
            connection.rollback();
            ps.setBinaryStream(1, new HsqlByteArrayInputStream(baR1), baR1.length);
            ps.executeUpdate();
            rs =(ResultSet)(Object) st.executeQuery("SELECT b FROM blo WHERE id = 2");
            if (!(Boolean)(Object)rs.next()) {
                assertTrue("No row with id 2", false);
            }
            blob1 =(java.sql.Blob)(Object)(Blob)(Object) rs.getBlob("b");
            System.out.println("Size of retrieved blob: " + blob1.length());
            baOut = blob1.getBytes(1, (int) blob1.length());
            if (baOut.length != baR1.length) {
                assertTrue("Expected array len " + baR1.length + ", got len " + baOut.length, false);
            }
            for (int i = 0; i < baOut.length; i++) {
                if (baOut[i] != baR1[i]) {
                    assertTrue("Expected array len " + baR1.length + ", got len " + baOut.length, false);
                }
            }
            rs.close();
            connection.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            fail("test failure");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getBlob(String o0){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setBlob(int o0, SerialBlob o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBinaryStream(int o0, HsqlByteArrayInputStream o1, int o2){ return null; }}

class SerialBlob {

SerialBlob(byte[] o0){}
	SerialBlob(){}}

class HsqlByteArrayInputStream {

HsqlByteArrayInputStream(byte[] o0){}
	HsqlByteArrayInputStream(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Blob {

}
