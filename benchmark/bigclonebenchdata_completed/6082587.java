import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c6082587 {
public MyHelperClass ExceptionUtils;
	public MyHelperClass logger;
	public MyHelperClass sm;
	public MyHelperClass processAnnotationsStream(InputStream o0){ return null; }

    protected void processAnnotationsJar(URL url) {
        JarFile jarFile = null;
        try {
            URLConnection urlConn = url.openConnection();
            JarURLConnection jarUrlConn;
            if (!(urlConn instanceof JarURLConnection)) {
                MyHelperClass sm = new MyHelperClass();
                sm.getString("contextConfig.jarUrl", url);
                return;
            }
            jarUrlConn = (JarURLConnection) urlConn;
            jarUrlConn.setUseCaches(false);
            jarFile =(JarFile)(Object) jarUrlConn.getJarFile();
            Enumeration<JarEntry> jarEntries =(Enumeration<JarEntry>)(Object) jarFile.entries();
            while (jarEntries.hasMoreElements()) {
                JarEntry jarEntry = jarEntries.nextElement();
                String entryName =(String)(Object) jarEntry.getName();
                if (entryName.endsWith(".class")) {
                    InputStream is = null;
                    try {
                        is =(InputStream)(Object) jarFile.getInputStream(jarEntry);
                        processAnnotationsStream(is);
                    } catch (UncheckedIOException e) {
                        logger.error(sm.getString("contextConfig.inputStreamJar", entryName, url),(IOException)(Object) e);
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
            logger.error(sm.getString("contextConfig.jarFile", url), e);
        } finally {
            if (jarFile != null) {
                try {
                    jarFile.close();
                } catch (Throwable t) {
                    ExceptionUtils.handleThrowable(t);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(MyHelperClass o0, IOException o1){ return null; }
	public MyHelperClass getString(String o0, String o1, URL o2){ return null; }
	public MyHelperClass getString(String o0, URL o1){ return null; }
	public MyHelperClass handleThrowable(Throwable o0){ return null; }}

class JarFile {

public MyHelperClass close(){ return null; }
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(JarEntry o0){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}
