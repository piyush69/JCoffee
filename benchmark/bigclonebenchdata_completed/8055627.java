import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8055627 {
public MyHelperClass Ding3dI18N;
	public MyHelperClass inputStream;
public MyHelperClass url;
	public MyHelperClass dispatchMessage(){ return null; }

    void setURLObject(URL url, boolean forceLoad) {
        if (url != null) {
            MyHelperClass urlString = new MyHelperClass();
            if (urlString != null || inputStream != null) throw new IllegalArgumentException((String)(Object)Ding3dI18N.getString("MediaContainer5"));
            try {
                InputStream stream;
                stream = url.openStream();
                stream.close();
            } catch (Exception e) {
                throw new SoundException((String)(Object)Ding3dI18N.getString("MediaContainer0"));
            }
        }
        this.url =(MyHelperClass)(Object) url;
        if (forceLoad) dispatchMessage();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }}

class SoundException extends Exception{
	public SoundException(String errorMessage) { super(errorMessage); }
}
