import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22611968 {
public MyHelperClass Log;

    public Bitmap retrieveBitmap(String urlString) {
        MyHelperClass Constants = new MyHelperClass();
        Log.d(Constants.LOG_TAG, "making HTTP trip for image:" + urlString);
        Bitmap bitmap = null;
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(5000);
            MyHelperClass BitmapFactory = new MyHelperClass();
            bitmap =(Bitmap)(Object) BitmapFactory.decodeStream(conn.getInputStream());
        } catch (MalformedURLException e) {
//            MyHelperClass Constants = new MyHelperClass();
            Log.e(Constants.LOG_TAG, "Exception loading image, malformed URL", e);
        } catch (IOException e) {
//            MyHelperClass Constants = new MyHelperClass();
            Log.e(Constants.LOG_TAG, "Exception loading image, IO error", e);
        }
        return bitmap;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG_TAG;
public MyHelperClass e(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, MalformedURLException o2){ return null; }
	public MyHelperClass decodeStream(InputStream o0){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }}

class Bitmap {

}
