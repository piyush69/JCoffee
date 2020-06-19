import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c492307 {
public MyHelperClass scanner;
	public MyHelperClass usLocale;
	public MyHelperClass charsetName;

    public  void In(URL url)  throws Throwable {
        try {
            URLConnection site = url.openConnection();
            InputStream is = site.getInputStream();
            scanner = new Scanner((Readable)(Object)(InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)is,(java.util.regex.Pattern)(Object)(Pattern)(Object) charsetName);
            scanner.useLocale(usLocale);
        } catch (IOException ioe) {
            System.err.println("Could not open " + url);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass useLocale(MyHelperClass o0){ return null; }}

class Pattern {

}
