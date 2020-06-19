import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20586254 {
public MyHelperClass readDefaultTemplate(){ return null; }
	public MyHelperClass findTemplate(String o0){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }

    public String readCustomTemplate(String spaceKey) throws Throwable, LocalizedException {
        final URL url =(URL)(Object) this.findTemplate(spaceKey);
        if (url == null) {
            return spaceKey == null ? this.readDefaultTemplate() : this.readCustomTemplate(null);
        } else try {
            return(String)(Object) read(url.openStream());
        } catch (IOException exception) {
            throw new LocalizedException(this, "reading.custom", spaceKey, exception);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LocalizedException extends Exception{
	public LocalizedException(String errorMessage) { super(errorMessage); }
	LocalizedException(c20586254 o0, String o1, String o2, IOException o3){}
	LocalizedException(){}
}
