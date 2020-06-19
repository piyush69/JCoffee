import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3567574 {
public MyHelperClass NULL;
public MyHelperClass Context;
	public MyHelperClass context;
	public MyHelperClass ConnectionHandler;
	public MyHelperClass url;
	public MyHelperClass BitmapFactory;
	public MyHelperClass CompressFormat;
	public MyHelperClass FILE_EXT;
	public MyHelperClass TAG;
	public MyHelperClass Log;
	public MyHelperClass md5(String o0){ return null; }

//    @Override
    protected String doInBackground(String... params)  throws Throwable {
        Bitmap bm = null;
        if (params.length == 0) return null;
        String urlStr = params[0];
        String url =(String)(Object) NULL; //new String();
        url = urlStr;
        String md5 =(String)(Object) "";
        try {
            md5 =(String)(Object) md5(urlStr);
            File f =(File)(Object) context.getFileStreamPath(md5 + (String)(Object)FILE_EXT);
            if (f.exists()) {
                return(String)(Object) f.getAbsolutePath();
            }
        } catch (FileNotFoundException fnf) {
        } catch (Exception e1) {
        }
        InputStream is = null;
        try {
            if (urlStr != null && url.indexOf("http://{HOST}:{PORT}") != -1) {
                urlStr = urlStr.replace((char)(Object)"{HOST}", ConnectionHandler.host);
                urlStr = urlStr.replace("{PORT}", ConnectionHandler.port + "");
            }
//            URL url = new URL(urlStr);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.connect();
            is = conn.getInputStream();
            bm =(Bitmap)(Object) BitmapFactory.decodeStream(is);
        } catch (IOException e) {
            Log.i(TAG, "Download of image failed: "(String)(Object) + e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
            }
        }
        if (bm != null) {
            FileOutputStream fos = null;
            try {
                fos = context.openFileOutput(md5 + (String)(Object)FILE_EXT, Context.MODE_WORLD_READABLE);
                bm.compress(CompressFormat.JPEG, 90, fos);
            } catch (Exception e) {
                Log.e(TAG, "Storage of image failed: "(String)(Object) + e.getMessage());
            } finally {
                if (fos != null) {
                    try {
                        fos.flush();
                        fos.close();
                    } catch (IOException e) {
                    }
                }
                if (bm != null) {
                    bm.recycle();
                }
            }
        }
        File f =(File)(Object) context.getFileStreamPath(md5 + (String)(Object)FILE_EXT);
        if (f.exists()) {
            return(String)(Object) f.getAbsolutePath();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JPEG;
	public MyHelperClass host;
	public MyHelperClass MODE_WORLD_READABLE;
	public MyHelperClass port;
public MyHelperClass getFileStreamPath(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass openFileOutput(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass decodeStream(InputStream o0){ return null; }}

class Bitmap {

public MyHelperClass compress(MyHelperClass o0, int o1, FileOutputStream o2){ return null; }
	public MyHelperClass recycle(){ return null; }}

class String {

public MyHelperClass replace(char o0, MyHelperClass o1){ return null; }
	public MyHelperClass replace(java.lang.String o0, java.lang.String o1){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass indexOf(java.lang.String o0){ return null; }}
