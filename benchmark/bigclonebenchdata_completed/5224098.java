
import java.io.UncheckedIOException;


class c5224098 {

    private static Properties load(URL url) {
        Properties props = new Properties();
        try {
            InputStream is = null;
            try {
                is =(InputStream)(Object) url.openStream();
                props.load(is);
            } finally {
                is.close();
            }
        } catch (UncheckedIOException e) {
        }
        return props;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
