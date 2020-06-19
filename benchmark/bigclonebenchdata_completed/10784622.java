
import java.io.UncheckedIOException;


class c10784622 {

    public static InputStream getPropertyFileInputStream(String propertyFileURLStr) {
        InputStream in = null;
        String errmsg = "Fatal error: Unable to open specified properties file: " + propertyFileURLStr;
        try {
            URL url = new URL(propertyFileURLStr);
            in =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            throw new IllegalArgumentException(errmsg);
        }
        return (in);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
