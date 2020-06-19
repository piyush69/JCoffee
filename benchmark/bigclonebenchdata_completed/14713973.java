import java.io.*;
import java.lang.*;
import java.util.*;



class c14713973 {
public MyHelperClass fileName;
	public MyHelperClass fireFileDownloadedListener(MyHelperClass o0){ return null; }

    public void run() {
        try {
            MyHelperClass repository = new MyHelperClass();
            File f = new File((String)(Object)(int)(Object)repository + (int)(Object)fileName);
            if (!f.exists()) {
                MyHelperClass urlString = new MyHelperClass();
                URL url = new URL(urlString);
                URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
                urlConnection.connect();
                InputStream dis =(InputStream)(Object) url.openStream();
//                MyHelperClass repository = new MyHelperClass();
                File dir = new File((String)(Object)repository);
                if (!dir.exists()) dir.mkdirs();
                f.createNewFile();
                FileOutputStream fos = new FileOutputStream(f);
                byte[] buffer = new byte[4096];
                int len = 0;
                while ((len = dis.read(buffer)) > -1) fos.write(buffer, 0, len);
                fos.close();
                dis.close();
            }
            MyHelperClass fileName = new MyHelperClass();
            fireFileDownloadedListener(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}
