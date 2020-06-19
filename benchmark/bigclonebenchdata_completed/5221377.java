import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5221377 {
public MyHelperClass handleBundleFile(BundleURLConnection o0){ return null; }
public MyHelperClass handleJarFile(JarURLConnection o0, String o1){ return null; }
	public MyHelperClass getURL(String o0){ return null; }
	public MyHelperClass handleClassicFile(String o0){ return null; }

    public File unpackResource(String resourceName) throws Throwable, IOException {
        File file = null;
        URL url =(URL)(Object) getURL("/" + resourceName);
        URLConnection urlConn = url.openConnection();
        if (urlConn instanceof JarURLConnection) {
            file =(File)(Object) handleJarFile((JarURLConnection) urlConn, resourceName);
        } else if ((BundleURLConnection)(Object)urlConn instanceof BundleURLConnection) {
            file =(File)(Object) handleBundleFile((BundleURLConnection)(BundleURLConnection)(Object) urlConn);
        } else {
            file =(File)(Object) handleClassicFile(resourceName);
        }
        return file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BundleURLConnection {

}
