
import java.io.UncheckedIOException;


class c9033641 {
public MyHelperClass doInteraction(HttpsURLConnection o0, ServerSocket o1, MyHelperClass o2){ return null; }
public MyHelperClass HttpsURLConnection;
	public MyHelperClass NOT_FOUND_CODE;
	public MyHelperClass DO_LOG;
	public MyHelperClass tearDownStoreProperties(){ return null; }
	public MyHelperClass getContext(){ return null; }
	public MyHelperClass setUpStoreProperties(){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testHttpsConnection_Not_Found_Response() throws Throwable {
        setUpStoreProperties();
        try {
            SSLContext ctx =(SSLContext)(Object) getContext();
            ServerSocket ss =(ServerSocket)(Object) ctx.getServerSocketFactory().createServerSocket(0);
            TestHostnameVerifier hnv = new TestHostnameVerifier();
            HttpsURLConnection.setDefaultHostnameVerifier(hnv);
            URL url = new URL("https://localhost:" + ss.getLocalPort());
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            try {
                doInteraction(connection, ss, NOT_FOUND_CODE);
                fail("Expected exception was not thrown.");
            } catch (UncheckedIOException e) {
                if ((boolean)(Object)DO_LOG) {
                    System.out.println("Expected exception was thrown: " + e.getMessage());
                }
            }
            connection.connect();
        } finally {
            tearDownStoreProperties();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createServerSocket(int o0){ return null; }
	public MyHelperClass setDefaultHostnameVerifier(TestHostnameVerifier o0){ return null; }}

class SSLContext {

public MyHelperClass getServerSocketFactory(){ return null; }}

class ServerSocket {

public MyHelperClass getLocalPort(){ return null; }}

class TestHostnameVerifier {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass connect(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
