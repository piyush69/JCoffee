import java.io.*;
import java.lang.*;
import java.util.*;



class c19657489 {

    private static boolean tryExpandGorillaHome(File f) throws GorillaHomeException {
        if (f.exists()) {
            if (!f.isDirectory() || !f.canWrite()) {
                return false;
            }
        } else {
            boolean dirOK = f.mkdirs();
        }
        if (f.exists() && f.isDirectory() && f.canWrite()) {
            java.net.URL url = GorillaHome.class.getResource("/resource_defaults/GORILLA_HOME");
            if (url == null) {
                throw new GorillaHomeException("cannot find gorilla.home resources relative to class " + GorillaHome.class.getName());
            }
            java.net.URLConnection conn;
            try {
                conn = url.openConnection();
            } catch (IOException e) {
                String msg = "Error opening connection to " + url.toString();
                MyHelperClass logger = new MyHelperClass();
                logger.error(msg, e);
                throw new GorillaHomeException("Error copying " + url.toString(), e);
            }
            if (conn == null) {
                throw new GorillaHomeException("cannot find gorilla.home resources relative to class " + GorillaHome.class.getName());
            }
            if (conn instanceof java.net.JarURLConnection) {
                MyHelperClass logger = new MyHelperClass();
                logger.debug("Expanding gorilla.home from from jar file via url " + url.toString());
                try {
                    MyHelperClass IOUtil = new MyHelperClass();
                    IOUtil.expandJar((JarURLConnection)(Object)(java.net.JarURLConnection) conn, f);
                    return true;
                } catch (Exception e) {
                    throw new GorillaHomeException("Error expanding gorilla.home" + " from jar file at " + conn.getURL().toString() + ": " + e.getMessage());
                }
            } else {
                try {
                    MyHelperClass IOUtil = new MyHelperClass();
                    IOUtil.copyDir(new File(url.getFile()), f);
                    return true;
                } catch (Exception e) {
                    throw new GorillaHomeException("Error expanding gorilla.home" + " from file at " + conn.getURL().toString() + ": " + e.getMessage());
                }
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass expandJar(JarURLConnection o0, File o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copyDir(File o0, File o1){ return null; }}

class GorillaHomeException extends Exception{
	public GorillaHomeException(String errorMessage) { super(errorMessage); }
	GorillaHomeException(){}
	GorillaHomeException(String o0, IOException o1){}
}

class GorillaHome {

}

class JarURLConnection {

}
