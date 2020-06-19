import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2964000 {

    private void addConfigurationResource(final String fileName, final boolean ensureLoaded)  throws Throwable {
        try {
            final ClassLoader cl = this.getClass().getClassLoader();
            final Properties p = new Properties();
            final URL url = cl.getResource(fileName);
            if (url == null) {
                throw new NakedObjectRuntimeException("Failed to load configuration resource: " + fileName);
            }
            p.load(url.openStream());
            MyHelperClass configuration = new MyHelperClass();
            configuration.add(p);
        } catch (Exception e) {
            if (ensureLoaded) {
                throw new NakedObjectRuntimeException((String)(Object)e);
            }
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Resource: " + fileName + " not found, but not needed");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Properties o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class NakedObjectRuntimeException extends Exception{
	public NakedObjectRuntimeException(String errorMessage) { super(errorMessage); }
}
