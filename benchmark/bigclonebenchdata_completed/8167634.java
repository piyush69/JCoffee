import java.io.*;
import java.lang.*;
import java.util.*;



class c8167634 {
public MyHelperClass assertNull(String o0, InputStream o1){ return null; }
	public MyHelperClass assertContains(String o0, String o1, String o2){ return null; }
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

//    @Test
    public void testAuthorizedMirror() throws IOException {
        MyHelperClass testPort = new MyHelperClass();
        final URL url = new URL("http://127.0.0.1:" + testPort + "/mirror?version=5&direction=just+right");
        final HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setRequestProperty("Authorization", "Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==");
        con.setRequestProperty("WWW-Authenticate", "Basic realm=\"karatasi\"");
        con.setRequestProperty("testline1", "1234567890");
        MyHelperClass HttpURLConnection = new MyHelperClass();
        assertEquals("Expecting resource to exist.",(int)(Object) HttpURLConnection.HTTP_OK,(int)(Object) con.getResponseCode());
        assertEquals("mirror responds with Content-Type text/plain.",(int)(Object) "text/plain",(int)(Object) con.getContentType());
        assertNull("The server does not use any special encoding.",(InputStream)(Object) con.getContentEncoding());
        int bytesRemaining =(int)(Object) con.getContentLength();
        final InputStream err =(InputStream)(Object) con.getErrorStream();
        assertNull("Expecting no error stream.", err);
        final InputStream in =(InputStream)(Object) con.getInputStream();
        final byte[] buf = new byte[bytesRemaining];
        for (int bytesRead; bytesRemaining > 0 && (bytesRead = in.read(buf, buf.length - bytesRemaining, bytesRemaining)) != -1; bytesRemaining -= bytesRead) {
        }
        assertEquals("Expecting server to send not fewer bytes as indicated.", 0, bytesRemaining);
        final String testResult = new String(buf, "ASCII");
        assertContains("Response has to contain this line.", testResult, "url direction::just right\r\n");
        assertContains("Response has to contain this line.", testResult, "url version::5\r\n");
        assertContains("Response has to contain this line.", testResult, "body authorization::Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==\r\n");
        assertContains("Response has to contain this line.", testResult, "body www-authenticate::Basic realm=\"karatasi\"\r\n");
        assertContains("Response has to contain this line.", testResult, "body testline1::1234567890\r\n");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
}

class Test {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getContentLength(){ return null; }}
