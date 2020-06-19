
import java.io.UncheckedIOException;


class c3064787 {
public MyHelperClass CacheManager;
	public MyHelperClass cacheManager;

    public void CacheServiceFactoryImpl() {
        @SuppressWarnings("static-access") URL url =(URL)(Object) this.getClass().getClassLoader().getResource("mwt/xml/xdbforms/configuration/ehcache.xml");
        InputStream is;
        try {
            is =(InputStream)(Object) url.openStream();
            cacheManager = CacheManager.create(is);
        } catch (UncheckedIOException ex) {
            System.err.println("NOn riesco ad aprire il file di configurazione ehcache.xml");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass create(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
