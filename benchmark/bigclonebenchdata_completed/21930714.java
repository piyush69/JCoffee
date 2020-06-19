import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21930714 {
public MyHelperClass httpClient;
public MyHelperClass assertTrue(boolean o0){ return null; }

//    @Test
    public void testSpeedyShareUpload() throws Throwable, Exception {
        MyHelperClass request = new MyHelperClass();
        request.setUrl("http://www.speedyshare.com/upload.php");
        MyHelperClass file = new MyHelperClass();
        request.setFile("fileup0", file);
//        MyHelperClass request = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(request);
        assertTrue((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)response.is2xxSuccess());
        assertTrue((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)response.getResponseHeaders().size() > 0);
        MyHelperClass IOUtils = new MyHelperClass();
        String body = IOUtils.toString(response.getResponseBody());
        assertTrue(body.contains("Download link"));
        assertTrue(body.contains("Delete password"));
        response.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setUrl(String o0){ return null; }
	public MyHelperClass setFile(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Test {

}

class HttpResponse {

public MyHelperClass is2xxSuccess(){ return null; }
	public MyHelperClass getResponseBody(){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }
	public MyHelperClass close(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
