


class c1180878 {

    public static byte[] fetchURLData(String url, String proxyHost, int proxyPort) throws IOException {
        HttpURLConnection con = null;
        InputStream is = null;
        try {
            URL u = new URL(url);
            if (url.startsWith("file://")) {
                is =(InputStream)(Object) new BufferedInputStream(u.openStream());
            } else {
                Proxy proxy;
                if (proxyHost != null) {
                    MyHelperClass Type = new MyHelperClass();
                    proxy = new Proxy(Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
                } else {
                    MyHelperClass Proxy = new MyHelperClass();
                    proxy =(Proxy)(Object) Proxy.NO_PROXY;
                }
                con = (HttpURLConnection)(HttpURLConnection)(Object) u.openConnection(proxy);
                con.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1092.0 Safari/536.6");
                con.addRequestProperty("Accept-Charset", "UTF-8");
                con.addRequestProperty("Accept-Language", "en-US,en");
                con.addRequestProperty("Accept", "text/html,image/*");
                con.setDoInput(true);
                con.setDoOutput(false);
                con.connect();
                is =(InputStream)(Object) new BufferedInputStream(con.getInputStream());
            }
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, baos);
            return(byte[])(Object) baos.toByteArray();
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
            if (con != null) {
                con.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NO_PROXY;
	public MyHelperClass HTTP;
public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(Proxy o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class Proxy {

Proxy(MyHelperClass o0, InetSocketAddress o1){}
	Proxy(){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class InetSocketAddress {

InetSocketAddress(String o0, int o1){}
	InetSocketAddress(){}}
