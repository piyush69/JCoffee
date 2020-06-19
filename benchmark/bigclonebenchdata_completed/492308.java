import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c492308 {
public MyHelperClass scanner;
	public MyHelperClass usLocale;
	public MyHelperClass charsetName;

    public  void In(String s)  throws Throwable {
        try {
            File file = new File(s);
            if (file.exists()) {
                scanner = new Scanner((Readable)(Object)(InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)file,(java.util.regex.Pattern)(Object)(Pattern)(Object) charsetName);
                scanner.useLocale(usLocale);
                return;
            }
            URL url = getClass().getResource(s);
            if (url == null) {
                url = new URL(s);
            }
            URLConnection site = url.openConnection();
            InputStream is = site.getInputStream();
            scanner = new Scanner((Readable)(Object)(InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)is,(java.util.regex.Pattern)(Object)(Pattern)(Object) charsetName);
            scanner.useLocale(usLocale);
        } catch (IOException ioe) {
            System.err.println("Could not open " + s);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass useLocale(MyHelperClass o0){ return null; }}

class Pattern {

}
