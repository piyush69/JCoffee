
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22682349 {
public static MyHelperClass HTTP_PORT_DEFAULT;
	public static MyHelperClass HTTPS_PORT_DEFAULT;
	public static MyHelperClass getPropertyAsString(BundleContext o0, String o1, String o2){ return null; }
	public static MyHelperClass getPropertyAsBoolean(BundleContext o0, String o1, String o2){ return null; }
	public static MyHelperClass getPropertyAsInteger(BundleContext o0, String o1, int o2){ return null; }
//public MyHelperClass HTTP_PORT_DEFAULT;
//	public MyHelperClass HTTPS_PORT_DEFAULT;
//	public MyHelperClass getPropertyAsString(BundleContext o0, String o1, String o2){ return null; }
//	public MyHelperClass getPropertyAsInteger(BundleContext o0, String o1, int o2){ return null; }
//	public MyHelperClass getPropertyAsBoolean(BundleContext o0, String o1, String o2){ return null; }

    public static Dictionary getDefaultConfig(BundleContext bc) {
        final Dictionary config =(Dictionary)(Object) new Hashtable();
        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.HTTP_ENABLED_KEY, getPropertyAsBoolean(bc, "org.knopflerfish.http.enabled", "true"));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.HTTPS_ENABLED_KEY, getPropertyAsBoolean(bc, "org.knopflerfish.http.secure.enabled", "true"));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.HTTP_PORT_KEY, getPropertyAsInteger(bc, "org.osgi.service.http.port",(int)(Object) HTTP_PORT_DEFAULT));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.HTTPS_PORT_KEY, getPropertyAsInteger(bc, "org.osgi.service.http.secure.port",(int)(Object) HTTPS_PORT_DEFAULT));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.HOST_KEY, getPropertyAsString(bc, "org.osgi.service.http.hostname", ""));
        Properties mimeProps = new Properties();
        try {
            mimeProps.load((InputStream)(Object)HttpConfig.class.getResourceAsStream("/mime.default"));
            String propurl =(String)(Object) getPropertyAsString(bc, "org.knopflerfish.http.mime.props", "");
            if (propurl.length() > 0) {
                URL url = new URL(propurl);
                Properties userMimeProps = new Properties();
                userMimeProps.load((InputStream)(Object)url.openStream());
                Enumeration e =(Enumeration)(Object) userMimeProps.keys();
                while ((boolean)(Object)e.hasMoreElements()) {
                    String key = (String)(String)(Object) e.nextElement();
                    mimeProps.put(key, userMimeProps.getProperty(key));
                }
            }
        } catch (UncheckedIOException ignore) {
        } catch (ArithmeticException ignore) {
        }
        Vector mimeVector = new Vector(mimeProps.size());
        Enumeration e =(Enumeration)(Object) mimeProps.keys();
        while ((boolean)(Object)e.hasMoreElements()) {
            String key = (String)(String)(Object) e.nextElement();
            mimeVector.addElement(new String[] { key,(String)(Object) mimeProps.getProperty(key) });
        }
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.MIME_PROPS_KEY, mimeVector);
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.SESSION_TIMEOUT_KEY, getPropertyAsInteger(bc, "org.knopflerfish.http.session.timeout.default", 1200));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.CONNECTION_TIMEOUT_KEY, getPropertyAsInteger(bc, "org.knopflerfish.http.connection.timeout", 30));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.CONNECTION_MAX_KEY, getPropertyAsInteger(bc, "org.knopflerfish.http.connection.max", 50));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.DNS_LOOKUP_KEY, getPropertyAsBoolean(bc, "org.knopflerfish.http.dnslookup", "false"));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.RESPONSE_BUFFER_SIZE_DEFAULT_KEY, getPropertyAsInteger(bc, "org.knopflerfish.http.response.buffer.size.default", 16384));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.DEFAULT_CHAR_ENCODING_KEY, getPropertyAsString(bc,(String)(Object) HttpConfig.DEFAULT_CHAR_ENCODING_KEY, "ISO-8859-1"));
//        MyHelperClass HttpConfig = new MyHelperClass();
        config.put(HttpConfig.REQ_CLIENT_AUTH_KEY, getPropertyAsBoolean(bc, "org.knopflerfish.http.req.client.auth", "false"));
        return config;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_CHAR_ENCODING_KEY;
	public MyHelperClass REQ_CLIENT_AUTH_KEY;
	public MyHelperClass HTTP_PORT_KEY;
	public MyHelperClass SESSION_TIMEOUT_KEY;
	public MyHelperClass CONNECTION_TIMEOUT_KEY;
	public MyHelperClass DNS_LOOKUP_KEY;
	public MyHelperClass HTTPS_ENABLED_KEY;
	public MyHelperClass MIME_PROPS_KEY;
	public MyHelperClass HOST_KEY;
	public MyHelperClass CONNECTION_MAX_KEY;
	public MyHelperClass HTTPS_PORT_KEY;
	public MyHelperClass RESPONSE_BUFFER_SIZE_DEFAULT_KEY;
	public MyHelperClass HTTP_ENABLED_KEY;
}

class BundleContext {

}

class Dictionary {

public MyHelperClass put(MyHelperClass o0, Vector o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Hashtable {

}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass keys(){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }}

class HttpConfig {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Vector {

Vector(){}
	Vector(MyHelperClass o0){}
	public MyHelperClass addElement(String[] o0){ return null; }}

class InputStream {

}
