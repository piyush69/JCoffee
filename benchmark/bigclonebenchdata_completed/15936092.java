import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15936092 {
public MyHelperClass RepositoryException;
public MyHelperClass mimeType;
	public MyHelperClass cached;
	public MyHelperClass logger;
	public MyHelperClass lastModified;
	public MyHelperClass length;
	public MyHelperClass asset;
	public MyHelperClass getCacheFile(){ return null; }

    public java.io.Serializable getContent() throws Throwable, RepositoryException {
        MyHelperClass logger = new MyHelperClass();
        logger.logMethod();
        if (!(Boolean)(Object)this.cached) {
            logger.logTrace("not cached.. getting content");
            Object object = this.asset.getContent();
            if (object instanceof String) {
                String s = (String) object;
                if (s.startsWith("http://")) {
                    try {
                        java.net.URL url = new java.net.URL(s);
                        java.io.InputStream is = url.openStream();
                        java.io.File file =(File)(Object) getCacheFile();
                        java.io.FileOutputStream fos = new java.io.FileOutputStream(file);
                        int len;
                        byte[] b = new byte[10240];
                        this.length =(MyHelperClass)(Object) 0;
                        while ((len = is.read(b)) >= 0) {
                            fos.write(b, 0, len);
                           (int)(Object) this.length += len;
                        }
                        fos.close();
                        is.close();
                        java.net.URLConnection urlc = new java.net.URL(s).openConnection();
                        this.lastModified =(MyHelperClass)(Object) urlc.getLastModified();
                        this.mimeType =(MyHelperClass)(Object) urlc.getContentType();
                    } catch (java.io.IOException ie) {
                        logger.logError("error writing file", ie);
                    }
                }
            }
            this.cached =(MyHelperClass)(Object) true;
        } else {
            logger.logTrace("cached..");
        }
        try {
            return ((Serializable)(Object)new SerializableInputStream(new java.io.FileInputStream((String)(Object)getCacheFile())));
        } catch (java.io.IOException ie) {
            logger.logError("cannot get content", ie);
            throw new RepositoryException((String)(Object)RepositoryException.OPERATION_FAILED);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OPERATION_FAILED;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass logError(String o0, IOException o1){ return null; }
	public MyHelperClass logMethod(){ return null; }
	public MyHelperClass logTrace(String o0){ return null; }}

class SerializableInputStream {

SerializableInputStream(FileInputStream o0){}
	SerializableInputStream(){}}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}
