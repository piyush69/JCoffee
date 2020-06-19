import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8943482 {

    public InputStream getImageAsStream(Photo photo, int size) throws Throwable, IOException, FlickrException {
        String urlStr = "";
        MyHelperClass Size = new MyHelperClass();
        if (size == (int)(Object)Size.SQUARE) {
            urlStr =(String)(Object) photo.getSmallSquareUrl();
//        MyHelperClass Size = new MyHelperClass();
        } else if (size == (int)(Object)Size.THUMB) {
            urlStr =(String)(Object) photo.getThumbnailUrl();
//        MyHelperClass Size = new MyHelperClass();
        } else if (size == (int)(Object)Size.SMALL) {
            urlStr =(String)(Object) photo.getSmallUrl();
//        MyHelperClass Size = new MyHelperClass();
        } else if (size == (int)(Object)Size.MEDIUM) {
            urlStr =(String)(Object) photo.getMediumUrl();
//        MyHelperClass Size = new MyHelperClass();
        } else if (size == (int)(Object)Size.LARGE) {
            urlStr =(String)(Object) photo.getLargeUrl();
//        MyHelperClass Size = new MyHelperClass();
        } else if (size == (int)(Object)Size.ORIGINAL) {
            urlStr =(String)(Object) photo.getOriginalUrl();
        } else {
            throw new FlickrException("0", "Unknown Photo-size");
        }
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        MyHelperClass transport = new MyHelperClass();
        if ((REST)(Object)transport instanceof REST) {
//            MyHelperClass transport = new MyHelperClass();
            if ((boolean)(Object)((REST)(REST)(Object) transport).isProxyAuth()) {
//                MyHelperClass transport = new MyHelperClass();
                conn.setRequestProperty("Proxy-Authorization", "Basic " + ((REST)(REST)(Object) transport).getProxyCredentials());
            }
        }
        conn.connect();
        return conn.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass THUMB;
	public MyHelperClass LARGE;
	public MyHelperClass ORIGINAL;
	public MyHelperClass MEDIUM;
	public MyHelperClass SQUARE;
	public MyHelperClass SMALL;
}

class Photo {

public MyHelperClass getSmallUrl(){ return null; }
	public MyHelperClass getSmallSquareUrl(){ return null; }
	public MyHelperClass getOriginalUrl(){ return null; }
	public MyHelperClass getLargeUrl(){ return null; }
	public MyHelperClass getMediumUrl(){ return null; }
	public MyHelperClass getThumbnailUrl(){ return null; }}

class FlickrException extends Exception{
	public FlickrException(String errorMessage) { super(errorMessage); }
	FlickrException(){}
	FlickrException(String o0, String o1){}
}

class REST {

public MyHelperClass getProxyCredentials(){ return null; }
	public MyHelperClass isProxyAuth(){ return null; }}
