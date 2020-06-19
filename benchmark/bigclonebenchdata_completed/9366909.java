import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9366909 {
public MyHelperClass CheckSum;
public MyHelperClass proxy;
	public MyHelperClass checkSum;
	public MyHelperClass cancelled;
	public MyHelperClass length;
	public MyHelperClass progress(){ return null; }
	public MyHelperClass isCancelled(){ return null; }
	public MyHelperClass reset(){ return null; }

    public synchronized void download(URL url, File file) throws Throwable, IOException {
        reset();
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        InputStream in = url.openConnection((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Proxy)(Object)proxy).getInputStream();
        byte[] buffer = new byte[2048];
        BufferedOutputStream bos = file == null ? null : new BufferedOutputStream(new FileOutputStream(file), buffer.length);
        try {
            int size;
            while ((size = in.read(buffer, 0, buffer.length)) != -1) {
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)this.isCancelled()) break;
                if (bos != null) bos.write(buffer, 0, size);
                if (size > 0) {
                    digest.update(buffer, 0, size);
                   (int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) this.length += size;
                    progress();
                }
            }
        } finally {
            if (bos != null) {
                bos.flush();
                bos.close();
            }
        }
        if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)cancelled) this.checkSum = CheckSum.toString(digest.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Object {

public MyHelperClass toString(byte[] o0){ return null; }}
