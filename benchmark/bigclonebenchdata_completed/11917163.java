import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11917163 {

    private void addConfigurationResource(final String fileName, NotFoundPolicy notFoundPolicy)  throws Throwable {
        try {
            final ClassLoader cl = this.getClass().getClassLoader();
            final Properties p = new Properties();
            final URL url = cl.getResource(fileName);
            if (url == null) {
                throw new NakedObjectException("Failed to load configuration resource: " + fileName);
            }
            p.load(url.openStream());
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("configuration resource " + fileName + " loaded");
            MyHelperClass configuration = new MyHelperClass();
            configuration.add(p);
        } catch (final Exception e) {
            MyHelperClass NotFoundPolicy = new MyHelperClass();
            if (notFoundPolicy == (NotFoundPolicy)(Object)NotFoundPolicy.FAIL_FAST) {
                throw new NakedObjectException((String)(Object)e);
            }
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("configuration resource " + fileName + " not found, but not needed");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FAIL_FAST;
public MyHelperClass add(Properties o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class NotFoundPolicy {

}

class NakedObjectException extends Exception{
	public NakedObjectException(String errorMessage) { super(errorMessage); }
}
