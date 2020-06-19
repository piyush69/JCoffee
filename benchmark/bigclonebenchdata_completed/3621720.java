import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3621720 {
public MyHelperClass url;
	public MyHelperClass getUrl(){ return null; }
public MyHelperClass is;
	public MyHelperClass raf;
	public MyHelperClass getFile(){ return null; }

    public InputStream getInputStream(long offset) throws Throwable, IOException {
        MyHelperClass is = new MyHelperClass();
        if (is != null && raf == null) {
            try {
//                MyHelperClass is = new MyHelperClass();
                is.close();
            } catch (Throwable th) {
            } finally {
//                MyHelperClass is = new MyHelperClass();
                is = null;
            }
        }
//        MyHelperClass is = new MyHelperClass();
        if (is == null && getUrl() != null && getFile() == null) {
//            MyHelperClass is = new MyHelperClass();
            is = url.openStream();
        }
//        MyHelperClass is = new MyHelperClass();
        if (is == null) {
            if (getFile() != null) {
                raf = null;
                try {
                    raf =(MyHelperClass)(Object) new RandomAccessFile((String)(Object)getFile(), "r");
                } catch (Exception ex) {
                }
                is = (raf != null) ? new RAFInputStream(raf, 0) : new BufferedInputStream(new FileInputStream((String)(Object)getFile()), 1024 * 30);
            }
        }
        if ((RAFInputStream)(Object)is instanceof RAFInputStream) {
            RAFInputStream ris = (RAFInputStream)(RAFInputStream)(Object) is;
            ris.seek(offset);
        } else {
            is.skip(offset);
        }
        return(InputStream)(Object) is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass skip(long o0){ return null; }}

class RAFInputStream {

RAFInputStream(MyHelperClass o0, int o1){}
	RAFInputStream(){}
	public MyHelperClass seek(long o0){ return null; }}
