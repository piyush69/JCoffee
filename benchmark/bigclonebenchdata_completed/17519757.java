
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17519757 {

    public static InputStream download(String endereco, ProxyConfig proxy) {
        if (proxy != null) {
            System.getProperties().put("proxySet", "true");
            System.getProperties().put("proxyPort", proxy.getPorta());
            System.getProperties().put("proxyHost", proxy.getHost());
            MyHelperClass Authenticator = new MyHelperClass();
            Authenticator.setDefault(new ProxyAuthenticator(proxy.getUsuario(), proxy.getSenha()));
        }
        try {
            URL url = new URL(endereco);
            ;
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            InputStream bis =(InputStream)(Object) new BufferedInputStream(connection.getInputStream());
            return bis;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefault(ProxyAuthenticator o0){ return null; }}

class ProxyConfig {

public MyHelperClass getSenha(){ return null; }
	public MyHelperClass getPorta(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getUsuario(){ return null; }}

class InputStream {

}

class ProxyAuthenticator {

ProxyAuthenticator(){}
	ProxyAuthenticator(MyHelperClass o0, MyHelperClass o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
