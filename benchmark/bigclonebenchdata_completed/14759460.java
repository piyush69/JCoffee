import java.io.*;
import java.lang.*;
import java.util.*;



class c14759460 {

    public static final Bitmap getBitmap(final String key, int size) {
        Bitmap bmp = null;
        byte[] line = new byte[1024];
        int byteSize = 0;
        MyHelperClass URI_IMAGE = new MyHelperClass();
        String urlStr = URI_IMAGE + key;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            InputStream is =(InputStream)(Object) con.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            while ((byteSize = is.read(line)) > 0) {
                out.write(line, 0, byteSize);
            }
            Options options = new Options();
            options.inSampleSize =(MyHelperClass)(Object) size;
            byte[] byteArray = out.toByteArray();
            MyHelperClass BitmapFactory = new MyHelperClass();
            bmp =(Bitmap)(Object) BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bmp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decodeByteArray(byte[] o0, int o1, int o2, Options o3){ return null; }}

class Bitmap {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass connect(){ return null; }}

class Options {
public MyHelperClass inSampleSize;
}
