import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20855053 {
public MyHelperClass log;
	public MyHelperClass addClass(Class o0){ return null; }

    public void init(ServletContext context) throws Throwable, ScratchException {
        try {
            MyHelperClass REGISTRY_FILENAME = new MyHelperClass();
            log.debug("Attempting to load Controllers from file: " + REGISTRY_FILENAME);
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//            MyHelperClass REGISTRY_FILENAME = new MyHelperClass();
            Enumeration<URL> urls = classLoader.getResources((String)(Object)REGISTRY_FILENAME);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                MyHelperClass log = new MyHelperClass();
                log.debug("Found: " + url);
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String className = null;
                while ((className = reader.readLine()) != null) {
                    className = className.trim();
                    if (!"".equals(className) && !className.startsWith("#")) {
//                        MyHelperClass log = new MyHelperClass();
                        log.debug("Found class: " + className);
                        Class<?> clazz = classLoader.loadClass(className);
                        addClass(clazz);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            log.error(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(ClassNotFoundException o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class ServletContext {

}

class ScratchException extends Exception{
	public ScratchException(String errorMessage) { super(errorMessage); }
}
