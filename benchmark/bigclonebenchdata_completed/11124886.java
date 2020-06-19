
import java.io.UncheckedIOException;


class c11124886 {

    private URLConnection getURLConnection(String str) {
        try {
            MyHelperClass isHttps = new MyHelperClass();
            if ((boolean)(Object)isHttps) {
                System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
                MyHelperClass isProxy = new MyHelperClass();
                if ((boolean)(Object)isProxy) {
                    MyHelperClass proxyHost = new MyHelperClass();
                    System.setProperty("https.proxyHost",(String)(Object) proxyHost);
                    MyHelperClass proxyPort = new MyHelperClass();
                    System.setProperty("https.proxyPort",(String)(Object) proxyPort);
                }
            } else {
                MyHelperClass isProxy = new MyHelperClass();
                if ((boolean)(Object)isProxy) {
                    MyHelperClass proxyHost = new MyHelperClass();
                    System.setProperty("http.proxyHost",(String)(Object) proxyHost);
                    MyHelperClass proxyPort = new MyHelperClass();
                    System.setProperty("http.proxyPort",(String)(Object) proxyPort);
                }
            }
            URL url = new URL(str);
            return ((URLConnection)(Object)url.openConnection());
        } catch (UncheckedIOException me) {
            System.out.println("Malformed URL");
            me.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
