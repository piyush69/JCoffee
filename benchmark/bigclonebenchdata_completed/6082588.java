import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6082588 {
public MyHelperClass COLLECTION_TYPE;
public MyHelperClass sm;
	public MyHelperClass ExceptionUtils;
	public MyHelperClass logger;
	public MyHelperClass processAnnotationsStream(InputStream o0){ return null; }

    protected void processAnnotationsJndi(URL url)  throws Throwable {
        try {
            URLConnection urlConn = url.openConnection();
            DirContextURLConnection dcUrlConn;
            if (!((DirContextURLConnection)(Object)urlConn instanceof DirContextURLConnection)) {
                MyHelperClass sm = new MyHelperClass();
                sm.getString("contextConfig.jndiUrlNotDirContextConn", url);
                return;
            }
            dcUrlConn = (DirContextURLConnection)(DirContextURLConnection)(Object) urlConn;
            dcUrlConn.setUseCaches(false);
            MyHelperClass ResourceAttributes = new MyHelperClass();
            String type =(String)(Object) dcUrlConn.getHeaderField(ResourceAttributes.TYPE);
            if (COLLECTION_TYPE.equals(type)) {
                Enumeration<String> dirs =(Enumeration<String>)(Object) dcUrlConn.list();
                while (dirs.hasMoreElements()) {
                    String dir = dirs.nextElement();
                    URL dirUrl = new URL(url.toString() + '/' + dir);
                    processAnnotationsJndi(dirUrl);
                }
            } else {
                if (url.getPath().endsWith(".class")) {
                    InputStream is = null;
                    try {
                        is =(InputStream)(Object) dcUrlConn.getInputStream();
                        processAnnotationsStream(is);
                    } catch (UncheckedIOException e) {
                        logger.error(sm.getString("contextConfig.inputStreamJndi", url),(IOException)(Object) e);
                    } finally {
                        if (is != null) {
                            try {
                                is.close();
                            } catch (Throwable t) {
                                ExceptionUtils.handleThrowable(t);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            logger.error(sm.getString("contextConfig.jndiUrl", url), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE;
public MyHelperClass getString(String o0, URL o1){ return null; }
	public MyHelperClass handleThrowable(Throwable o0){ return null; }
	public MyHelperClass error(MyHelperClass o0, IOException o1){ return null; }}

class DirContextURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(MyHelperClass o0){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }}
