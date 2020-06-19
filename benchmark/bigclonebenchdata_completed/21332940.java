import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21332940 {
public static MyHelperClass REFERENCE_PROTOCOL;
	public static MyHelperClass FILE_SCHEME;
	public static MyHelperClass searchFor(String o0, String o1){ return null; }
//public MyHelperClass REFERENCE_PROTOCOL;
//	public MyHelperClass FILE_SCHEME;
//	public MyHelperClass searchFor(String o0, String o1){ return null; }

    private static URL searchForBundle(String name, String parent) throws MalformedURLException {
        URL url = null;
        File fileLocation = null;
        boolean reference = false;
        try {
            URL child = new URL(name);
            url = new URL(new File(parent).toURL(), name);
        } catch (MalformedURLException e) {
            File child = new File(name);
            fileLocation = child.isAbsolute() ? child : new File(parent, name);
            MyHelperClass REFERENCE_PROTOCOL = new MyHelperClass();
            url = new URL((String)(Object)REFERENCE_PROTOCOL, null, fileLocation.toURL().toExternalForm());
            reference = true;
        }
        if (!reference) {
            URL baseURL = url;
            MyHelperClass REFERENCE_PROTOCOL = new MyHelperClass();
            if (url.getProtocol().equals(REFERENCE_PROTOCOL)) {
                reference = true;
                String baseSpec = url.getFile();
                MyHelperClass FILE_SCHEME = new MyHelperClass();
                if (baseSpec.startsWith((String)(Object)FILE_SCHEME)) {
                    File child = new File(baseSpec.substring(5));
                    baseURL = child.isAbsolute() ? child.toURL() : new File(parent, child.getPath()).toURL();
                } else baseURL = new URL(baseSpec);
            }
            fileLocation = new File(baseURL.getFile());
            if (!fileLocation.isAbsolute()) fileLocation = new File(parent, fileLocation.toString());
        }
        if (reference) {
            String result =(String)(Object) searchFor(fileLocation.getName(), new File(fileLocation.getParent()).getAbsolutePath());
            if (result != null) url = new URL((String)(Object)REFERENCE_PROTOCOL, null, FILE_SCHEME + result); else return null;
        }
        try {
            URLConnection result = url.openConnection();
            result.connect();
            return url;
        } catch (IOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
