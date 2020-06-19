
import java.io.UncheckedIOException;


class c5280094 {

    public static URLConnection openRemoteDescriptionFile(String urlstr) throws MalformedURLException {
        URL url = new URL(urlstr);
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.connect();
            return conn;
        } catch (Exception e) {
            MyHelperClass Config = new MyHelperClass();
            Config conf =(Config)(Object) Config.getInstance();
            SimpleSocketAddress localServAddr =(SimpleSocketAddress)(Object) conf.getLocalProxyServerAddress();
            MyHelperClass Type = new MyHelperClass();
            Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(localServAddr.host, localServAddr.port));
            URLConnection conn;
            try {
                conn =(URLConnection)(Object) url.openConnection(proxy);
                conn.connect();
                return conn;
            } catch (UncheckedIOException e1) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Failed to retrive desc file:" + url,(IOException)(Object) e1);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class Config {

public MyHelperClass getLocalProxyServerAddress(){ return null; }}

class SimpleSocketAddress {
public MyHelperClass port;
	public MyHelperClass host;
}

class Proxy {

Proxy(MyHelperClass o0, InetSocketAddress o1){}
	Proxy(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InetSocketAddress {

InetSocketAddress(MyHelperClass o0, MyHelperClass o1){}
	InetSocketAddress(){}}
