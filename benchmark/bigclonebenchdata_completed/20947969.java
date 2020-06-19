import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20947969 {

    static InputStream getFileAsStream(Class clazz, HandlerChain chain) {
        URL url = clazz.getResource((String)(Object)chain.file());
        if (url == null) {
            url = Thread.currentThread().getContextClassLoader().getResource((String)(Object)chain.file());
        }
        if (url == null) {
            String tmp = clazz.getPackage().getName();
            tmp = tmp.replace('.', '/');
            tmp += "/" + chain.file();
            url = Thread.currentThread().getContextClassLoader().getResource(tmp);
        }
        if (url == null) {
            throw new UtilException("util.failed.to.find.handlerchain.file", clazz.getName(), chain.file());
        }
        try {
            return url.openStream();
        } catch (IOException e) {
            throw new UtilException("util.failed.to.parse.handlerchain.file", clazz.getName(), chain.file());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HandlerChain {

public MyHelperClass file(){ return null; }}

class UtilException extends Exception{
	public UtilException(String errorMessage) { super(errorMessage); }
	UtilException(String o0, String o1, MyHelperClass o2){}
	UtilException(){}
}
