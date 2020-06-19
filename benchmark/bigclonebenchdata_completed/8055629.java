import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8055629 {
public MyHelperClass Ding3dI18N;
	public MyHelperClass inputStream;
public MyHelperClass url;
	public MyHelperClass urlString;
	public MyHelperClass dispatchMessage(){ return null; }

    void setURLString(String path, boolean forceLoad) {
        if (path != null) {
            if (this.url != null || inputStream != null) throw new IllegalArgumentException((String)(Object)Ding3dI18N.getString("MediaContainer5"));
            try {
                URL url = new URL(path);
                InputStream stream;
                stream = url.openStream();
                stream.close();
            } catch (Exception e) {
                throw new SoundException((String)(Object)Ding3dI18N.getString("MediaContainer0"));
            }
        }
        this.urlString =(MyHelperClass)(Object) path;
        if (forceLoad) dispatchMessage();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }}

class SoundException extends Exception{
	public SoundException(String errorMessage) { super(errorMessage); }
}
