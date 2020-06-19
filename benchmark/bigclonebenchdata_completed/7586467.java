import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7586467 {
public MyHelperClass GIF;
	public MyHelperClass plainWidth;
	public MyHelperClass type;
	public MyHelperClass scaledHeight;
	public MyHelperClass scaledWidth;
	public MyHelperClass plainHeight;
	public MyHelperClass height(){ return null; }
	public MyHelperClass setTop(int o0){ return null; }
	public MyHelperClass skip(InputStream o0, int o1){ return null; }
	public MyHelperClass width(){ return null; }
	public MyHelperClass setRight(int o0){ return null; }

    public  c7586467(URL url) throws Throwable, BadElementException, IOException {
        super(url);
        type = GIF;
        InputStream is = null;
        try {
            is = url.openStream();
            if (is.read() != 'G' || is.read() != 'I' || is.read() != 'F') {
                throw new BadElementException(url.toString() + " is not a valid GIF-file.");
            }
            skip(is, 3);
            scaledWidth =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) is.read() + (is.read() << 8);
            setRight((int)(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) scaledWidth);
            scaledHeight =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) is.read() + (is.read() << 8);
            setTop((int)(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) scaledHeight);
        } finally {
            if (is != null) {
                is.close();
            }
            plainWidth = width();
            plainHeight = height();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BadElementException extends Exception{
	public BadElementException(String errorMessage) { super(errorMessage); }
}

class Object {

Object(URL o0){}
	Object(){}}
