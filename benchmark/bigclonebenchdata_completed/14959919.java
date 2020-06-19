import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14959919 {
public MyHelperClass FuLog;
	public MyHelperClass url_;
	public MyHelperClass canRead_;
	public MyHelperClass exists_;
	public MyHelperClass readList(BufferedReader o0){ return null; }
	public MyHelperClass getContentURL(){ return null; }
	public MyHelperClass isDirectory(){ return null; }

    public final void build()  throws Throwable {
        MyHelperClass built_ = new MyHelperClass();
        if (!(Boolean)(Object)built_) {
//            MyHelperClass built_ = new MyHelperClass();
            built_ =(MyHelperClass)(Object) true;
            final boolean[] done = new boolean[] { false };
            Runnable runnable = new Runnable() {

                public void run() {
                    try {
                        MyHelperClass NULL = new MyHelperClass();
                        boolean exists_ =(boolean)(Object) NULL; //new boolean();
                        exists_ = true;
                        URL url =(URL)(Object) getContentURL();
                        URLConnection cnx = url.openConnection();
                        cnx.connect();
//                        MyHelperClass NULL = new MyHelperClass();
                        long lastModified_ =(long)(Object) NULL; //new long();
                        lastModified_ = cnx.getLastModified();
//                        MyHelperClass NULL = new MyHelperClass();
                        int length_ =(int)(Object) NULL; //new int();
                        length_ = cnx.getContentLength();
//                        MyHelperClass NULL = new MyHelperClass();
                        String type_ =(String)(Object) NULL; //new String();
                        type_ = cnx.getContentType();
                        if ((boolean)(Object)isDirectory()) {
                            InputStream in = cnx.getInputStream();
                            BufferedReader nr = new BufferedReader(new InputStreamReader(in));
                            FuVectorString v =(FuVectorString)(Object) readList(nr);
                            nr.close();
                            v.sort();
                            v.uniq();
                            MyHelperClass list_ = new MyHelperClass();
                            list_ = v.toArray();
                        }
                    } catch (Exception ex) {
                        MyHelperClass NULL = new MyHelperClass();
                        boolean exists_ =(boolean)(Object) NULL; //new boolean();
                        exists_ = false;
                    }
                    done[0] = true;
                }
            };
            Thread t = new Thread(runnable, "VfsFileUrl connection " + getContentURL());
            t.setPriority(Math.max(Thread.MIN_PRIORITY, t.getPriority() - 1));
            t.start();
            for (int i = 0; i < 100; i++) {
                if (done[0]) break;
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException ex) {
                }
            }
            if (!done[0]) {
                t.interrupt();
                exists_ =(MyHelperClass)(Object) false;
                canRead_ =(MyHelperClass)(Object) false;
                FuLog.warning("VFS: fail to get " + url_);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }}

class FuVectorString {

public MyHelperClass uniq(){ return null; }
	public MyHelperClass sort(){ return null; }
	public MyHelperClass toArray(){ return null; }}
