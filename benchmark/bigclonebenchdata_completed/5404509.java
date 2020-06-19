import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5404509 {
public MyHelperClass mServerUrl;
	public MyHelperClass EntityUtils;
	public MyHelperClass AndroidHttpClient;
	public MyHelperClass getContext(){ return null; }
	public MyHelperClass fail(String o0){ return null; }

//    @LargeTest
    public void testThreadCheck() throws Throwable, Exception {
        ContentResolver resolver =(ContentResolver)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getContext().getContentResolver();
        GoogleHttpClient client = new GoogleHttpClient(resolver, "Test", false);
        try {
            HttpGet method = new HttpGet(mServerUrl);
            AndroidHttpClient.setThreadBlocked(true);
            try {
                client.execute(method);
                fail("\"thread forbids HTTP requests\" exception expected");
            } catch (RuntimeException e) {
                if (!e.toString().contains("forbids HTTP requests")) throw e;
            } finally {
                AndroidHttpClient.setThreadBlocked(false);
            }
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(method);
            assertEquals("/", EntityUtils.toString(response.getEntity()));
        } finally {
            client.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setThreadBlocked(boolean o0){ return null; }
	public MyHelperClass getContentResolver(){ return null; }}

class LargeTest {

}

class ContentResolver {

}

class GoogleHttpClient {

GoogleHttpClient(ContentResolver o0, String o1, boolean o2){}
	GoogleHttpClient(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
