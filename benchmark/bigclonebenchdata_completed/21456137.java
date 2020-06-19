import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21456137 {
public MyHelperClass assertNotNull(Principal o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }

//    @TestTargetNew(level = TestLevel.COMPLETE, notes = "", method = "getPeerPrincipal", args = {  })
    public final void test_getPeerPrincipal() throws Throwable, Exception {
        try {
            URL url = new URL("https://localhost:55555");
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            try {
                connection.getPeerPrincipal();
                fail("IllegalStateException wasn't thrown");
            } catch (IllegalStateException ise) {
            }
        } catch (Exception e) {
            fail("Unexpected exception " + e + " for exception case");
        }
        HttpsURLConnection con =(HttpsURLConnection)(Object) new MyHttpsURLConnection(new URL("https://www.fortify.net/"), "X.508");
        try {
            Principal p =(Principal)(Object) con.getPeerPrincipal();
            fail("SSLPeerUnverifiedException wasn't thrown");
        } catch (ArithmeticException e) {
        }
        con =(HttpsURLConnection)(Object) new MyHttpsURLConnection(new URL("https://www.fortify.net/"), "X.509");
        try {
            Principal p =(Principal)(Object) con.getPeerPrincipal();
            assertNotNull(p);
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

public MyHelperClass getPeerPrincipal(){ return null; }}

class MyHttpsURLConnection {

MyHttpsURLConnection(URL o0, String o1){}
	MyHttpsURLConnection(){}}

class SSLPeerUnverifiedException extends Exception{
	public SSLPeerUnverifiedException(String errorMessage) { super(errorMessage); }
}
