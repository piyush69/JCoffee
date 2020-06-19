
import java.io.UncheckedIOException;


class c1752722 {
public MyHelperClass INSTANCE;
public MyHelperClass getBaseURL(){ return null; }

//    @Override
    public Object getImage(String key) {
        if (key.indexOf("exhibition/") != -1) {
            InputStream inputStream = null;
            try {
                URL url = new URL(getBaseURL() + "icons/" + key + ".png");
                inputStream =(InputStream)(Object) url.openStream();
                return url;
            } catch (Exception e) {
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (UncheckedIOException e) {
                        INSTANCE.handleException((IOException)(Object)e);
                    }
                }
            }
        }
        return this.getImage(key);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass handleException(IOException o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
