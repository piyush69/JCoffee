import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5404510 {
public MyHelperClass Gservices;
public MyHelperClass mServerUrl;
	public MyHelperClass EntityUtils;
	public MyHelperClass getContext(){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

//    @MediumTest
    public void testUrlRewriteRules() throws Throwable, Exception {
        ContentResolver resolver =(ContentResolver)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getContext().getContentResolver();
        GoogleHttpClient client = new GoogleHttpClient(resolver, "Test", false);
        Gservices.putString(resolver, "url:test", "http://foo.bar/ rewrite " + mServerUrl + "new/");
        Gservices.putString(resolver, "digest", mServerUrl);
        try {
            HttpGet method = new HttpGet("http://foo.bar/path");
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(method);
            String body = EntityUtils.toString(response.getEntity());
            assertEquals("/new/path", body);
        } finally {
            client.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContentResolver(){ return null; }
	public MyHelperClass putString(ContentResolver o0, String o1, String o2){ return null; }
	public MyHelperClass putString(ContentResolver o0, String o1, MyHelperClass o2){ return null; }}

class MediumTest {

}

class ContentResolver {

}

class GoogleHttpClient {

GoogleHttpClient(ContentResolver o0, String o1, boolean o2){}
	GoogleHttpClient(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
