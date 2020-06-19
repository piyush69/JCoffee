import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9794673 {
public MyHelperClass Tracer;
	public MyHelperClass componentIO;
	public MyHelperClass isSavable(URI o0){ return null; }

    public Component loadComponent(URI uri, URI origuri) throws Throwable, ComponentException {
        try {
            Component comp = null;
            InputStream is = null;
            java.net.URL url = null;
            try {
                url =(URL)(Object) uri.getJavaURL();
//             } catch (java.net.ArithmeticException e) {
                throw new ComponentException("Invalid URL " + uri + " for component " + origuri + ":\n " + e.getMessage());
            }
            try {
                MyHelperClass ftpHandler = new MyHelperClass();
                if (url.getProtocol().equals("ftp")) is =(InputStream)(Object) ftpHandler.getInputStream(url); else {
                    java.net.URLConnection conn = url.openConnection();
                    conn.connect();
                    is = conn.getInputStream();
                }
            } catch (IOException e) {
                if (is != null) is.close();
                throw new ComponentException("IO error loading URL " + url + " for component " + origuri + ":\n " + e.getMessage());
            }
            try {
                comp =(Component)(Object) componentIO.loadComponent(origuri, uri, is, isSavable(uri));
            } catch (ArrayIndexOutOfBoundsException e) {
                if (is != null) is.close();
                throw new ComponentException("Error loading component " + origuri + " from " + url + ":\n " + e.getMessage());
            }
            is.close();
            return comp;
        } catch (IOException ioe) {
            Tracer.debug("didn't manage to close inputstream....");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getInputStream(URL o0){ return null; }
	public MyHelperClass loadComponent(URI o0, URI o1, InputStream o2, MyHelperClass o3){ return null; }}

class Component {

}

class ComponentException extends Exception{
	public ComponentException(String errorMessage) { super(errorMessage); }
}

class URI {

public MyHelperClass getJavaURL(){ return null; }}
