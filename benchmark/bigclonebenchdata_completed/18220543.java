
import java.io.UncheckedIOException;


class c18220543 {

    private MapProperties readProperties(URL url) {
        @SuppressWarnings("unchecked") MapProperties properties = new MapProperties(new LinkedHashMap());
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
            properties.load(is);
        } catch (UncheckedIOException ex) {
            throw new RuntimeException(ex);
        } finally {
            MyHelperClass StreamUtils = new MyHelperClass();
            StreamUtils.close(is);
        }
        return properties;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class MapProperties {

MapProperties(){}
	MapProperties(LinkedHashMap o0){}
	public MyHelperClass load(InputStream o0){ return null; }}

class LinkedHashMap {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
