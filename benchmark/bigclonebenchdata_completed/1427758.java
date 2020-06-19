import java.io.*;
import java.lang.*;
import java.util.*;



class c1427758 {
public static MyHelperClass getClassBytesFromStream(MyHelperClass o0){ return null; }
//public MyHelperClass getClassBytesFromStream(MyHelperClass o0){ return null; }

    private static void ensureJavaScriptHostBytes(TreeLogger logger) throws UnableToCompleteException {
        MyHelperClass javaScriptHostBytes = new MyHelperClass();
        if (javaScriptHostBytes != null) {
            return;
        }
        String className = JavaScriptHost.class.getName();
        try {
            String path = className.replace('.', '/') + ".class";
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            URL url =(URL)(Object) cl.getResource(path);
            if (url != null) {
//                MyHelperClass javaScriptHostBytes = new MyHelperClass();
                javaScriptHostBytes = getClassBytesFromStream(url.openStream());
            } else {
                MyHelperClass TreeLogger = new MyHelperClass();
                logger.log(TreeLogger.ERROR, "Could not find required bootstrap class '" + className + "' in the classpath", null);
                throw new UnableToCompleteException();
            }
        } catch (UncheckedIOException e) {
            MyHelperClass TreeLogger = new MyHelperClass();
            logger.log(TreeLogger.ERROR, "Error reading class bytes for " + className, e);
            throw new UnableToCompleteException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
}

class TreeLogger {

public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Object o2){ return null; }}

class UnableToCompleteException extends Exception{
	public UnableToCompleteException(String errorMessage) { super(errorMessage); }
	UnableToCompleteException(){}
}

class JavaScriptHost {

}

class URL {

public MyHelperClass openStream(){ return null; }}
