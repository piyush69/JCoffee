import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21456136 {
public MyHelperClass assertNull(MyHelperClass o0){ return null; }
	public MyHelperClass assertNotNull(String o0, MyHelperClass o1){ return null; }
public MyHelperClass fail(String o0){ return null; }

//    @TestTargetNew(level = TestLevel.COMPLETE, notes = "", method = "getLocalPrincipal", args = {  })
    public final void test_getLocalPrincipal()  throws Throwable {
        try {
            URL url = new URL("https://localhost:55555");
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            try {
                connection.getLocalPrincipal();
                fail("IllegalStateException wasn't thrown");
            } catch (IllegalStateException ise) {
            }
        } catch (Exception e) {
            fail("Unexpected exception " + e + " for exception case");
        }
        try {
            HttpsURLConnection con =(HttpsURLConnection)(Object) new MyHttpsURLConnection(new URL("https://www.fortify.net/"), "X.508");
            assertNull(con.getLocalPrincipal());
            con =(HttpsURLConnection)(Object) new MyHttpsURLConnection(new URL("https://www.fortify.net/"), "X.509");
            assertNotNull("Local principal is null", con.getLocalPrincipal());
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

public MyHelperClass getLocalPrincipal(){ return null; }}

class MyHttpsURLConnection {

MyHttpsURLConnection(URL o0, String o1){}
	MyHttpsURLConnection(){}}
