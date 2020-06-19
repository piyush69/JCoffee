
import java.io.UncheckedIOException;


class c21062468 {

    protected final Properties getResourceProperties(Long id, String baseURL) {
        try {
            URL url =(URL)(Object) getClass().getResource(baseURL + id + ".properties");
            if (url == null) {
                url = new URL(baseURL + id + ".properties");
            }
            Properties props = new Properties();
            InputStream is =(InputStream)(Object) url.openStream();
            props.load(is);
            is.close();
            return props;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
