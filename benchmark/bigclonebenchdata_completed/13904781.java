import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13904781 {
public MyHelperClass NULL;
public MyHelperClass HKEY;
	public MyHelperClass Jvm;
public MyHelperClass closeStreams(){ return null; }

    public void run()  throws Throwable {
        MyHelperClass software = new MyHelperClass();
        if (software == null) return;
//        MyHelperClass software = new MyHelperClass();
        Jvm.hashtable(HKEY).put(software, this);
        try {
//            MyHelperClass software = new MyHelperClass();
            software.setException(null);
//            MyHelperClass software = new MyHelperClass();
            software.setDownloaded(false);
//            MyHelperClass software = new MyHelperClass();
            software.setDownloadStartTime(System.currentTimeMillis());
            try {
//                MyHelperClass software = new MyHelperClass();
                software.downloadStarted();
            } catch (Exception dsx) {
            }
//            MyHelperClass software = new MyHelperClass();
            if (software.getDownloadDir() == null) {
//                MyHelperClass software = new MyHelperClass();
                software.setException(new Exception("The DownloadDir is null."));
//                MyHelperClass software = new MyHelperClass();
                software.setDownloadStartTime(0);
//                MyHelperClass software = new MyHelperClass();
                software.setDownloaded(false);
//                MyHelperClass software = new MyHelperClass();
                throw(Throwable)(Object) software.getException();
            }
//            MyHelperClass software = new MyHelperClass();
            URL url = new URL((String)(Object)software.getURL());
            URLConnection con = url.openConnection();
//            MyHelperClass software = new MyHelperClass();
            software.setDownloadLength(con.getContentLength());
            InputStream inputStream =(InputStream)(Object) NULL; //new InputStream();
            inputStream = con.getInputStream();
//            MyHelperClass software = new MyHelperClass();
            File file = new File((String)(Object)software.getDownloadDir(),(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) software.getURLFilename());
            FileOutputStream outputStream =(FileOutputStream)(Object) NULL; //new FileOutputStream();
            outputStream = new FileOutputStream(file);
            int totalBytes = 0;
            byte[] buffer = new byte[8192];
            MyHelperClass cancelled = new MyHelperClass();
            while (!(Boolean)(Object)cancelled) {
//                MyHelperClass inputStream = new MyHelperClass();
                int bytesRead =(int)(Object) Jvm.copyPartialStream(inputStream, outputStream, buffer);
                if (bytesRead == -1) break;
                totalBytes += bytesRead;
                try {
//                    MyHelperClass software = new MyHelperClass();
                    software.downloadProgress(totalBytes);
                } catch (Exception dx) {
                }
            }
//            MyHelperClass cancelled = new MyHelperClass();
            if (!(Boolean)(Object)cancelled) software.setDownloaded(true);
        } catch (Exception x) {
//            MyHelperClass software = new MyHelperClass();
            software.setException(x);
//            MyHelperClass software = new MyHelperClass();
            software.setDownloadStartTime(0);
//            MyHelperClass software = new MyHelperClass();
            software.setDownloaded(false);
        }
        try {
//            MyHelperClass software = new MyHelperClass();
            software.downloadComplete();
        } catch (Exception dcx) {
        }
//        MyHelperClass software = new MyHelperClass();
        Jvm.hashtable(HKEY).remove(software);
        closeStreams();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getException(){ return null; }
	public MyHelperClass setDownloadStartTime(long o0){ return null; }
	public MyHelperClass downloadProgress(int o0){ return null; }
	public MyHelperClass getDownloadDir(){ return null; }
	public MyHelperClass put(MyHelperClass o0, c13904781 o1){ return null; }
	public MyHelperClass setException(Exception o0){ return null; }
	public MyHelperClass setDownloadLength(int o0){ return null; }
	public MyHelperClass downloadComplete(){ return null; }
	public MyHelperClass downloadStarted(){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass setException(Object o0){ return null; }
	public MyHelperClass setDownloadStartTime(int o0){ return null; }
	public MyHelperClass remove(MyHelperClass o0){ return null; }
	public MyHelperClass setDownloaded(boolean o0){ return null; }
	public MyHelperClass getURLFilename(){ return null; }
	public MyHelperClass hashtable(MyHelperClass o0){ return null; }
	public MyHelperClass copyPartialStream(InputStream o0, FileOutputStream o1, byte[] o2){ return null; }}
