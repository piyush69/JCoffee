import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14231450 {
public MyHelperClass NULL;
	public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass setStatusText(String o0){ return null; }
public MyHelperClass hideProgress(){ return null; }

    public byte[] download(URL url, OutputStream out) throws Throwable, IOException {
        boolean returnByByteArray = (out == null);
        ByteArrayOutputStream helper = null;
        if (returnByByteArray) {
            helper = new ByteArrayOutputStream();
        }
        String s = url.toExternalForm();
        URLConnection conn = url.openConnection();
        MyHelperClass Launcher = new MyHelperClass();
        String name =(String)(Object) Launcher.getFileName(s);
        InputStream in = conn.getInputStream();
        int total =(int)(Object) NULL; //new int();
        total = url.openConnection().getContentLength();
//        MyHelperClass total = new MyHelperClass();
        setStatusText(String.format("Downloading %s (%.2fMB)...", name, ((float)(float)(Object) total / 1024 / 1024)));
        long justNow = System.currentTimeMillis();
        int numRead = -1;
        byte[] buffer = new byte[2048];
        while ((numRead = in.read(buffer)) != -1) {
            MyHelperClass size = new MyHelperClass();
           (int)(Object) size += numRead;
            if (returnByByteArray) {
                helper.write(buffer, 0, numRead);
            } else {
                out.write(buffer, 0, numRead);
            }
            long now = System.currentTimeMillis();
            if ((now - justNow) > 250) {
//                MyHelperClass size = new MyHelperClass();
                setProgress((int) (((float)(float)(Object) size / (float) total) * 100));
                justNow = now;
            }
        }
        hideProgress();
        if (returnByByteArray) {
            return helper.toByteArray();
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFileName(String o0){ return null; }}
