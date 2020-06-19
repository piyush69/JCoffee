import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18372548 {
public MyHelperClass jndiProp;
	public MyHelperClass mergProps(Properties o0, Properties o1){ return null; }
	public MyHelperClass mergSysProps(Properties o0, Properties o1){ return null; }
	public MyHelperClass mergProps(Properties o0, Hashtable<CAP#1 o1, CAP#2 o2){ return null; }

    static Properties readAllProps(Hashtable<?, ?> env) throws IOException {
        Properties props = new Properties();
        if (env != null) {
            props = mergProps(props, env);
        }
        props = mergSysProps(props, System.getProperties());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Enumeration<?> resources = classLoader.getResources(jndiProp);
        while (resources.hasMoreElements()) {
            URL url = (URL) resources.nextElement();
            InputStream fis = url.openStream();
            Properties resource = new Properties();
            resource.load(fis);
            fis.close();
            props = mergProps(props, resource);
        }
        return props;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
