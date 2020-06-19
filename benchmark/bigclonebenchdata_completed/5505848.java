
import java.io.UncheckedIOException;


class c5505848 {
public MyHelperClass assertEquals(char o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass server;
	public MyHelperClass fail(){ return null; }

    public void testResponseTimeout() throws Exception {
        MyHelperClass server = new MyHelperClass();
        server.enqueue(new MockResponse().setBody("ABC").clearHeaders().addHeader("Content-Length: 4"));
//        MyHelperClass server = new MyHelperClass();
        server.enqueue(new MockResponse().setBody("DEF"));
//        MyHelperClass server = new MyHelperClass();
        server.play();
//        MyHelperClass server = new MyHelperClass();
        URLConnection urlConnection =(URLConnection)(Object) server.getUrl("/").openConnection();
        urlConnection.setReadTimeout(1000);
        InputStream in =(InputStream)(Object) urlConnection.getInputStream();
        assertEquals('A', in.read());
        assertEquals('B', in.read());
        assertEquals('C', in.read());
        try {
            in.read();
            fail();
        } catch (UncheckedIOException expected) {
        }
        URLConnection urlConnection2 =(URLConnection)(Object) server.getUrl("/").openConnection();
        InputStream in2 =(InputStream)(Object) urlConnection2.getInputStream();
        assertEquals('D', in2.read());
        assertEquals('E', in2.read());
        assertEquals('F', in2.read());
        assertEquals(-1, in2.read());
        assertEquals(0, server.takeRequest().getSequenceNumber());
        assertEquals(0, server.takeRequest().getSequenceNumber());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addHeader(String o0){ return null; }
	public MyHelperClass getUrl(String o0){ return null; }
	public MyHelperClass play(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass takeRequest(){ return null; }
	public MyHelperClass clearHeaders(){ return null; }
	public MyHelperClass enqueue(MyHelperClass o0){ return null; }
	public MyHelperClass getSequenceNumber(){ return null; }}

class MockResponse {

public MyHelperClass setBody(String o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class SocketTimeoutException extends Exception{
	public SocketTimeoutException(String errorMessage) { super(errorMessage); }
}
