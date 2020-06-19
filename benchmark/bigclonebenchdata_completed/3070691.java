import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3070691 {
public MyHelperClass getFactoryClasses(InputStream o0){ return null; }

    public void lookupAllFactories() throws IOException {
        Enumeration setOfFactories = null;
        ClassLoader classLoader = null;
        InputStream inputStream = null;
        classLoader = (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {

            public Object run() {
                ClassLoader cl = Thread.currentThread().getContextClassLoader();
                if (cl == null) {
                    cl = ClassLoader.getSystemClassLoader();
                }
                return cl;
            }
        });
        if (classLoader == null) {
            return;
        }
        try {
            setOfFactories = classLoader.getResources("META-INF/services/javax.print.StreamPrintServiceFactory");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("IOException during resource finding");
        }
        try {
            while (setOfFactories.hasMoreElements()) {
                URL url = (URL) setOfFactories.nextElement();
                inputStream = url.openStream();
                getFactoryClasses(inputStream);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
            throw new IOException("IOException during resource reading");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
