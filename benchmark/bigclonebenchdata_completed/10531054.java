import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10531054 {
public MyHelperClass source;
	public MyHelperClass output;
	public MyHelperClass reader;
	public MyHelperClass writer;
	public MyHelperClass input;
	public MyHelperClass getUrlInfo(boolean o0, boolean o1){ return null; }
	public MyHelperClass isDirectory(){ return null; }

    public boolean open(String mode)  throws Throwable {
        MyHelperClass source = new MyHelperClass();
        if ((String)(Object)source instanceof String) return false; else if (mode == null) mode = ""; else mode = mode.toLowerCase();
        boolean toread = false, towrite = false;
        if (mode.indexOf("r") >= 0) toread = true;
        if (mode.indexOf("w") >= 0) towrite = true;
        if (!toread && !towrite) toread = towrite = true;
        try {
            MyHelperClass input = new MyHelperClass();
            if (toread && input == null) {
                if ((boolean)(Object)isDirectory()) return true; else if (reader != null) return true; else if ((File)(Object)source instanceof File) input =(MyHelperClass)(Object) new FileInputStream((File)(File)(Object) source); else if ((Socket)(Object)source instanceof Socket) input =(MyHelperClass)(Object) ((Socket)(Socket)(Object) source).getInputStream(); else if ((URL)(Object)source instanceof URL) return(boolean)(Object) getUrlInfo(toread, towrite); else return false;
            }
            if (towrite && output == null) {
                if ((boolean)(Object)isDirectory()) return false; else if (writer != null) return true; else if ((File)(Object)source instanceof File) output =(MyHelperClass)(Object) new FileOutputStream((File)(File)(Object) source); else if ((Socket)(Object)source instanceof Socket) output =(MyHelperClass)(Object) ((Socket)(Socket)(Object) source).getOutputStream(); else if ((URL)(Object)source instanceof URL) return(boolean)(Object) getUrlInfo(toread, towrite); else return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
