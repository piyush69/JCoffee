import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21930715 {
public MyHelperClass httpClient;
public MyHelperClass assertTrue(boolean o0){ return null; }

//    @Test
    public void testImageshackUpload() throws Throwable, Exception {
        MyHelperClass request = new MyHelperClass();
        request.setUrl("http://www.imageshack.us/index.php");
//        MyHelperClass request = new MyHelperClass();
        request.addParameter("xml", "yes");
        MyHelperClass file = new MyHelperClass();
        request.setFile("fileupload", file);
//        MyHelperClass request = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(request);
        assertTrue((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)response.is2xxSuccess());
        assertTrue((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)response.getResponseHeaders().size() > 0);
        MyHelperClass IOUtils = new MyHelperClass();
        String body = IOUtils.toString(response.getResponseBody());
        assertTrue(body.contains("<image_link>"));
        assertTrue(body.contains("<thumb_link>"));
        assertTrue(body.contains("<image_location>"));
        assertTrue(body.contains("<image_name>"));
        response.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass setUrl(String o0){ return null; }
	public MyHelperClass setFile(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass addParameter(String o0, String o1){ return null; }}

class Test {

}

class HttpResponse {

public MyHelperClass is2xxSuccess(){ return null; }
	public MyHelperClass getResponseBody(){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }
	public MyHelperClass close(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
