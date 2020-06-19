import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21456132 {
public MyHelperClass assertNull(MyHelperClass o0){ return null; }
public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass assertNotNull(Certificate[] o0){ return null; }

//    @TestTargetNew(level = TestLevel.COMPLETE, notes = "", method = "getLocalCertificates", args = {  })
    public final void test_getLocalCertificates()  throws Throwable {
        try {
            URL url = new URL("https://localhost:55555");
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            try {
                connection.getLocalCertificates();
                fail("IllegalStateException wasn't thrown");
            } catch (IllegalStateException ise) {
            }
        } catch (Exception e) {
            fail("Unexpected exception " + e + " for exception case");
        }
        try {
            HttpsURLConnection con =(HttpsURLConnection)(Object) new MyHttpsURLConnection(new URL("https://www.fortify.net/"), "X.508");
            assertNull(con.getLocalCertificates());
            con =(HttpsURLConnection)(Object) new MyHttpsURLConnection(new URL("https://www.fortify.net/"), "X.509");
            Certificate[] cert =(Certificate[])(Object) con.getLocalCertificates();
            assertNotNull(cert);
            assertEquals(1, cert.length);
        } catch (Exception e) {
            fail("Unexpected exception " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class TestTargetNew {

}

class HttpsURLConnection {

public MyHelperClass getLocalCertificates(){ return null; }}

class MyHttpsURLConnection {

MyHttpsURLConnection(URL o0, String o1){}
	MyHttpsURLConnection(){}}
