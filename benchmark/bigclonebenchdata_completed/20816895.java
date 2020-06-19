import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20816895 {
public MyHelperClass load(MyHelperClass o0){ return null; }
public MyHelperClass URLUtil;
	public MyHelperClass ResourceUtil;
	public MyHelperClass envs;
	public MyHelperClass StreamUtil;

    public void mode(String env)  throws Throwable {
        String path =(String)(Object) this.envs.get(env);
        InputStream in = null;
        try {
            URL url =(URL)(Object) ResourceUtil.getResourceNoException(path);
            if (url == null) {
                throw new IllegalEnvironmentException(env);
            }
            load(URLUtil.openStream(url));
        } catch (UncheckedIOException e) {
            throw new IllegalEnvironmentException(env,(IOException)(Object) e);
        } finally {
            StreamUtil.close(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass openStream(URL o0){ return null; }
	public MyHelperClass getResourceNoException(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class IllegalEnvironmentException extends Exception{
	public IllegalEnvironmentException(String errorMessage) { super(errorMessage); }
	IllegalEnvironmentException(){}
	IllegalEnvironmentException(String o0, IOException o1){}
}
