import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8172652 {
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }

//    @Test
//    @JUnitHttpServer(port = 10342, https = false, webapps = { @Webapp(context = "/fmpm", path = "src/test/resources/test-webapp") })
    public void testTestServlet() throws Throwable, Exception {
        MyHelperClass TestServlet = new MyHelperClass();
        TestServlet.reset();
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass xml = new MyHelperClass();
        HttpEntity entity =(HttpEntity)(Object) new StringEntity(xml);
        HttpPost method = new HttpPost("http://localhost:10342/fmpm/restful/NotificationMessageRelay");
        method.setEntity(entity);
        HttpResponse response =(HttpResponse)(Object) client.execute(method);
        assertEquals((MyHelperClass)(Object)200, response.getStatusLine().getStatusCode());
//        MyHelperClass xml = new MyHelperClass();
        assertEquals(xml, TestServlet.getPosted());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPosted(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass reset(){ return null; }}

class Test {

}

class JUnitHttpServer {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpEntity {

}

class StringEntity {

StringEntity(MyHelperClass o0){}
	StringEntity(){}}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(HttpEntity o0){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
