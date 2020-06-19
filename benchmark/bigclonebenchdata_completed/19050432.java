
import java.io.UncheckedIOException;


class c19050432 {

    private static InputStream openNamedResource(String name) throws java.io.IOException {
        InputStream in = null;
        boolean result = false;
        boolean httpURL = true;
        URL propsURL = null;
        try {
            propsURL = new URL(name);
        } catch (UncheckedIOException ex) {
            httpURL = false;
            propsURL = null;
        }
        if (propsURL == null) {
            propsURL =(URL)(Object) UserProperties.class.getResource(name);
        }
        if (propsURL != null) {
            URLConnection urlConn =(URLConnection)(Object) propsURL.openConnection();
            if (httpURL) {
                String hdrVal =(String)(Object) urlConn.getHeaderField(0);
                if (hdrVal != null) {
                    MyHelperClass HTTPUtilities = new MyHelperClass();
                    String code =(String)(Object) HTTPUtilities.getResultCode(hdrVal);
                    if (code != null) {
                        if (!code.equals("200")) {
                            throw new java.io.IOException("status code = " + code);
                        }
                    }
                }
            }
            in =(InputStream)(Object) urlConn.getInputStream();
        }
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResultCode(String o0){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class UserProperties {

}

class URLConnection {

public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
