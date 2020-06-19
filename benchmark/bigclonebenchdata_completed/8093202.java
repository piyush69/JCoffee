import java.io.*;
import java.lang.*;
import java.util.*;



class c8093202 {

    private Properties loadDefaultProperties() throws IOException {
        Properties merged = new Properties();
        try {
            merged.setProperty("user", System.getProperty("user.name"));
        } catch (java.lang.SecurityException se) {
        }
        ClassLoader cl = getClass().getClassLoader();
        if (cl == null) cl = ClassLoader.getSystemClassLoader();
        if (cl == null) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Can't find a classloader for the Driver; not loading driver configuration");
            return merged;
        }
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Loading driver configuration via classloader " + cl);
        ArrayList urls = new ArrayList();
        Enumeration urlEnum = cl.getResources("org/postgresql/driverconfig.properties");
        while (urlEnum.hasMoreElements()) {
            urls.add(urlEnum.nextElement());
        }
        for (int i = urls.size() - 1; i >= 0; i--) {
            URL url = (URL) urls.get(i);
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Loading driver configuration from: " + url);
            InputStream is =(InputStream)(Object) url.openStream();
            merged.load(is);
            is.close();
        }
        return merged;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
