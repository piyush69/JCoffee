


class c9033639 {
public MyHelperClass checkConnectionStateParameters(HttpsURLConnection o0, SSLSocket o1){ return null; }
	public MyHelperClass doInteraction(HttpsURLConnection o0, ServerSocket o1){ return null; }
public MyHelperClass HttpsURLConnection;
	public MyHelperClass tearDownStoreProperties(){ return null; }
	public MyHelperClass setUpStoreProperties(){ return null; }
	public MyHelperClass getContext(){ return null; }

    public void testHttpsConnection() throws Throwable {
        setUpStoreProperties();
        try {
            SSLContext ctx =(SSLContext)(Object) getContext();
            ServerSocket ss =(ServerSocket)(Object) ctx.getServerSocketFactory().createServerSocket(0);
            TestHostnameVerifier hnv = new TestHostnameVerifier();
            HttpsURLConnection.setDefaultHostnameVerifier(hnv);
            URL url = new URL("https://localhost:" + ss.getLocalPort());
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            SSLSocket peerSocket = (SSLSocket)(SSLSocket)(Object) doInteraction(connection, ss);
            checkConnectionStateParameters(connection, peerSocket);
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

class SSLSocket {

}
