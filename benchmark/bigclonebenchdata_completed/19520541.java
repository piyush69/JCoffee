import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19520541 {
public static MyHelperClass logger;
//public MyHelperClass logger;
public static MyHelperClass getDirectoryListing(URL o0, InputStream o1){ return null; }
//public MyHelperClass getDirectoryListing(URL o0, InputStream o1){ return null; }

    public static URL[] getDirectoryListing(URL url) throws Throwable, IOException, CancelledOperationException {
        MyHelperClass Level = new MyHelperClass();
        logger.log(Level.FINER, "listing {0}", url);
        String file = url.getFile();
        if (file.charAt(file.length() - 1) != '/') {
            url = new URL(url.toString() + '/');
        }
        MyHelperClass KeyChain = new MyHelperClass();
        String userInfo =(String)(Object) KeyChain.getDefault().getUserInfo(url);
        URLConnection urlConnection = url.openConnection();
        urlConnection.setAllowUserInteraction(false);
        urlConnection.setConnectTimeout(FileSystem.settings().getConnectTimeoutMs());
        if (userInfo != null) {
            String encode =(String)(Object) Base64.encodeBytes(userInfo.getBytes());
            urlConnection.setRequestProperty("Authorization", "Basic " + encode);
        }
        InputStream urlStream;
        urlStream = urlConnection.getInputStream();
        return(URL[])(Object) getDirectoryListing(url, urlStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINER;
public MyHelperClass getDefault(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, URL o2){ return null; }
	public MyHelperClass getUserInfo(URL o0){ return null; }}

class CancelledOperationException extends Exception{
	public CancelledOperationException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeBytes(byte[] o0){ return null; }}
