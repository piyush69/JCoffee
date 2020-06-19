import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13854417 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass assertNotNull(HttpEntity o0){ return null; }
public MyHelperClass server;
	public MyHelperClass HttpStatus;
	public MyHelperClass EncodingUtils;
	public MyHelperClass client;
	public MyHelperClass CoreProtocolPNames;

//    @LargeTest
    public void testHttpPostsWithExpectationVerification() throws Throwable, Exception {
        int reqNo = 3;
        this.server.registerHandler("*", new HttpRequestHandler() {

            public void handle(final HttpRequest request, final HttpResponse response, final HttpContext context) throws HttpException, IOException {
                StringEntity outgoing = new StringEntity("No content");
                response.setEntity((ByteArrayEntity)(Object)outgoing);
            }
        });
        this.server.setExpectationVerifier(new HttpExpectationVerifier() {

            public void verify(final HttpRequest request, final HttpResponse response, final HttpContext context) throws HttpException {
                Header someheader = request.getFirstHeader("Secret");
                if (someheader != null) {
                    int secretNumber;
                    try {
                        secretNumber = Integer.parseInt(someheader.getValue());
                    } catch (NumberFormatException ex) {
                        response.setStatusCode(HttpStatus.SC_BAD_REQUEST);
                        return;
                    }
                    if (secretNumber < 2) {
                        response.setStatusCode(HttpStatus.SC_EXPECTATION_FAILED);
                        ByteArrayEntity outgoing = new ByteArrayEntity(EncodingUtils.getAsciiBytes("Wrong secret number"));
                        response.setEntity(outgoing);
                    }
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
                    Socket socket = new Socket((String)(Object)host.getHostName(), host.getPort());
                    conn.bind(socket, this.client.getParams());
                }
                BasicHttpEntityEnclosingRequest post = new BasicHttpEntityEnclosingRequest("POST", "/");
                post.addHeader("Secret", Integer.toString(r));
                ByteArrayEntity outgoing = new ByteArrayEntity(EncodingUtils.getAsciiBytes("No content"));
                post.setEntity(outgoing);
                HttpResponse response =(HttpResponse)(Object) this.client.execute(post, host, conn);
                HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                assertNotNull(entity);
                entity.consumeContent();
                if (r < 2) {
                    assertEquals(HttpStatus.SC_EXPECTATION_FAILED, response.getStatusLine().getStatusCode());
                } else {
                    assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
                }
                if (!(Boolean)(Object)this.client.keepAlive(response)) {
                    conn.close();
                }
            }
            HttpConnectionMetrics cm =(HttpConnectionMetrics)(Object) conn.getMetrics();
            assertEquals(reqNo, cm.getRequestCount());
            assertEquals(reqNo, cm.getResponseCount());
        } finally {
            conn.close();
            this.server.shutdown();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass USE_EXPECT_CONTINUE;
	public MyHelperClass SC_EXPECTATION_FAILED;
	public MyHelperClass SC_BAD_REQUEST;
public MyHelperClass keepAlive(HttpResponse o0){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass setBooleanParameter(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass registerHandler(String o0, <anonymous HttpRequestHandler> o1){ return null; }
	public MyHelperClass getAsciiBytes(String o0){ return null; }
	public MyHelperClass setExpectationVerifier(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass registerHandler(String o0){ return null; }
	public MyHelperClass execute(BasicHttpEntityEnclosingRequest o0, HttpHost o1, DefaultHttpClientConnection o2){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass setExpectationVerifier(<anonymous HttpExpectationVerifier> o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class LargeTest {

}

class HttpRequestHandler {

}

class HttpExpectationVerifier {

}

class DefaultHttpClientConnection {

public MyHelperClass getMetrics(){ return null; }
	public MyHelperClass bind(Socket o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }}

class HttpHost {

HttpHost(){}
	HttpHost(String o0, MyHelperClass o1){}
	public MyHelperClass getHostName(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class BasicHttpEntityEnclosingRequest {

BasicHttpEntityEnclosingRequest(String o0, String o1){}
	BasicHttpEntityEnclosingRequest(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(ByteArrayEntity o0){ return null; }}

class ByteArrayEntity {

ByteArrayEntity(MyHelperClass o0){}
	ByteArrayEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass setEntity(ByteArrayEntity o0){ return null; }
	public MyHelperClass setStatusCode(MyHelperClass o0){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }}

class HttpConnectionMetrics {

public MyHelperClass getResponseCount(){ return null; }
	public MyHelperClass getRequestCount(){ return null; }}

class HttpRequest {

public MyHelperClass getFirstHeader(String o0){ return null; }}

class HttpContext {

}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}

class Header {

public MyHelperClass getValue(){ return null; }}
