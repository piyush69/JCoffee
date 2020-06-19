import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1811750 {
public MyHelperClass server;
	public MyHelperClass EntityUtils;
	public MyHelperClass client;
	public MyHelperClass CoreProtocolPNames;
	public MyHelperClass assertEquals(byte o0, byte o1){ return null; }
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public void testHttpPostsWithExpectContinue() throws Throwable, Exception {
        int reqNo = 20;
        Random rnd = new Random();
        List testData = new ArrayList(reqNo);
        for (int i = 0; i < reqNo; i++) {
            int size = rnd.nextInt(5000);
            byte[] data = new byte[size];
            rnd.nextBytes(data);
            testData.add(data);
        }
        this.server.registerHandler("*", new HttpRequestHandler() {

            public void handle(final HttpRequest request, final HttpResponse response, final HttpContext context) throws HttpException, IOException {
                if ((HttpEntityEnclosingRequest)(Object)request instanceof HttpEntityEnclosingRequest) {
                    HttpEntity incoming =(HttpEntity)(Object) ((HttpEntityEnclosingRequest)(HttpEntityEnclosingRequest)(Object) request).getEntity();
                    byte[] data =(byte[])(Object) EntityUtils.toByteArray(incoming);
                    ByteArrayEntity outgoing = new ByteArrayEntity(data);
                    outgoing.setChunked(true);
                    response.setEntity(outgoing);
                } else {
                    StringEntity outgoing = new StringEntity("No content");
                    response.setEntity((ByteArrayEntity)(Object)outgoing);
                }
            }
        });
        this.server.start();
        this.client.getParams().setBooleanParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, true);
        DefaultHttpClientConnection conn = new DefaultHttpClientConnection();
        HttpHost host = new HttpHost("localhost", this.server.getPort());
        try {
            for (int r = 0; r < reqNo; r++) {
                if (!(Boolean)(Object)conn.isOpen()) {
                    Socket socket = new Socket((String)(Object)host.getHostName(),(int)(Object) host.getPort());
                    conn.bind(socket, this.client.getParams());
                }
                BasicHttpEntityEnclosingRequest post = new BasicHttpEntityEnclosingRequest("POST", "/");
                byte[] data = (byte[]) testData.get(r);
                ByteArrayEntity outgoing = new ByteArrayEntity(data);
                outgoing.setChunked(true);
                post.setEntity(outgoing);
                HttpResponse response =(HttpResponse)(Object) this.client.execute(post, host, conn);
                byte[] received =(byte[])(Object) EntityUtils.toByteArray(response.getEntity());
                byte[] expected = (byte[]) testData.get(r);
                assertEquals(expected.length, received.length);
                for (int i = 0; i < expected.length; i++) {
                    assertEquals(expected[i], received[i]);
                }
                if (!(Boolean)(Object)this.client.keepAlive(response)) {
                    conn.close();
                }
            }
            HttpConnectionMetrics cm =(HttpConnectionMetrics)(Object) conn.getMetrics();
            assertEquals((byte)(Object)reqNo,(byte)(Object) cm.getRequestCount());
            assertEquals((byte)(Object)reqNo,(byte)(Object) cm.getResponseCount());
        } finally {
            conn.close();
            this.server.shutdown();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass USE_EXPECT_CONTINUE;
public MyHelperClass toByteArray(HttpEntity o0){ return null; }
	public MyHelperClass toByteArray(MyHelperClass o0){ return null; }
	public MyHelperClass setBooleanParameter(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass execute(BasicHttpEntityEnclosingRequest o0, HttpHost o1, DefaultHttpClientConnection o2){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass registerHandler(String o0,  HttpRequestHandler o1){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass keepAlive(HttpResponse o0){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass registerHandler(String o0){ return null; }
	public MyHelperClass start(){ return null; }}

class HttpRequestHandler {

}

class DefaultHttpClientConnection {

public MyHelperClass bind(Socket o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass getMetrics(){ return null; }}

class HttpHost {

HttpHost(){}
	HttpHost(String o0, MyHelperClass o1){}
	public MyHelperClass getHostName(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class BasicHttpEntityEnclosingRequest {

BasicHttpEntityEnclosingRequest(){}
	BasicHttpEntityEnclosingRequest(String o0, String o1){}
	public MyHelperClass setEntity(ByteArrayEntity o0){ return null; }}

class ByteArrayEntity {

ByteArrayEntity(byte[] o0){}
	ByteArrayEntity(){}
	public MyHelperClass setChunked(boolean o0){ return null; }}

class HttpResponse {

public MyHelperClass setEntity(ByteArrayEntity o0){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpConnectionMetrics {

public MyHelperClass getRequestCount(){ return null; }
	public MyHelperClass getResponseCount(){ return null; }}

class HttpRequest {

}

class HttpContext {

}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class HttpEntityEnclosingRequest {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}
