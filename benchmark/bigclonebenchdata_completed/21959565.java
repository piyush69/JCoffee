import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21959565 {
public MyHelperClass parsePkStream(NybbleInputStream o0){ return null; }
public MyHelperClass name;

    public  void Font(String path, String fontName)  throws Throwable {
        this();
        StringTokenizer tok = new StringTokenizer(path, ";");
        NybbleInputStream str = null;
        while (str == null & tok.hasMoreTokens()) {
            try {
                URL url = new URL(tok.nextToken() + "/");
                url = new URL(url, fontName);
                System.out.println(url.toString());
                str = new NybbleInputStream(url.openStream());
                parsePkStream(str);
                str.close();
                name =(MyHelperClass)(Object) fontName;
            } catch (java.io.IOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class NybbleInputStream {

NybbleInputStream(InputStream o0){}
	NybbleInputStream(){}
	public MyHelperClass close(){ return null; }}
