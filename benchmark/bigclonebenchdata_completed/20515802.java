import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20515802 {
public MyHelperClass Hex;
	public MyHelperClass getAllFiles(String o0, AllFilesFilter o1){ return null; }

    private static synchronized void calcLocalFileHash()  throws Throwable {
        long startTime = System.currentTimeMillis();
        MyHelperClass currentFileHash = new MyHelperClass();
        if (currentFileHash != null) return;
        List fileList = getAllFiles("/", new AllFilesFilter());
        int len = 0;
        byte[] buf = new byte[1024];
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA");
            for (Iterator i = fileList.iterator(); i.hasNext(); ) {
                String path = (String) i.next();
                LocalFileResource lfr = new LocalFileResource(path);
                if (lfr.isDirectory()) {
                    digest.update(path.getBytes("UTF-8"));
                    continue;
                }
                InputStream stream = lfr.getFileAsInputStream();
                while ((len = stream.read(buf)) != -1) {
                    digest.update(buf, 0, len);
                }
                stream.close();
            }
//            MyHelperClass currentFileHash = new MyHelperClass();
            currentFileHash =(MyHelperClass)(Object) new String(Hex.encodeHex(digest.digest()));
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("No SHA found ...?", e);
//            MyHelperClass currentFileHash = new MyHelperClass();
            currentFileHash = "unknown"(MyHelperClass)(Object) + System.currentTimeMillis();
        } finally {
            MyHelperClass log = new MyHelperClass();
            if (log.isDebugEnabled()) log.debug("Needed " + (System.currentTimeMillis() - startTime) + "ms for hash calculation");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class AllFilesFilter {

}

class LocalFileResource {

LocalFileResource(String o0){}
	LocalFileResource(){}
	public MyHelperClass getFileAsInputStream(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
