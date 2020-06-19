
import java.io.UncheckedIOException;


class c7142336 {
public MyHelperClass setHttpInfo(HttpURLConnection o0, String o1, String o2, String o3){ return null; }
public MyHelperClass Type;
public MyHelperClass log;
	public MyHelperClass isStringNull(String o0){ return null; }

    public int getHttpStatus(ProxyInfo proxyInfo, String sUrl, String cookie, String host) {
        HttpURLConnection connection = null;
        try {
            if (proxyInfo == null) {
                URL url = new URL(sUrl);
                connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            } else {
                InetSocketAddress addr = new InetSocketAddress(proxyInfo.getPxIp(), proxyInfo.getPxPort());
                Proxy proxy = new Proxy(Type.HTTP, addr);
                URL url = new URL(sUrl);
                connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection(proxy);
            }
            if (!(Boolean)(Object)isStringNull(host)) setHttpInfo(connection, cookie, host, "");
            connection.setConnectTimeout(90 * 1000);
            connection.setReadTimeout(90 * 1000);
            connection.connect();
            connection.getInputStream();
            return(int)(Object) connection.getResponseCode();
        } catch (UncheckedIOException e) {
            log.info(proxyInfo + " getHTTPConent Error ");
            return 0;
        } catch (Exception e) {
            log.info(proxyInfo + " getHTTPConent Error ");
            return 0;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP;
public MyHelperClass info(String o0){ return null; }}

class ProxyInfo {

public MyHelperClass getPxIp(){ return null; }
	public MyHelperClass getPxPort(){ return null; }}

class HttpURLConnection {

public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class InetSocketAddress {

InetSocketAddress(MyHelperClass o0, MyHelperClass o1){}
	InetSocketAddress(){}}

class Proxy {

Proxy(MyHelperClass o0, InetSocketAddress o1){}
	Proxy(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
