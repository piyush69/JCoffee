import java.io.*;
import java.lang.*;
import java.util.*;



class c6742637 {

    private static List<Properties> findExtensions() {
        URL url = null;
        try {
            List<Properties> extensions = new ArrayList<Properties>();
            Enumeration<URL> res =(Enumeration<URL>)(Object) ExtensionHelper.class.getClassLoader().getResources("logdistiller.properties");
            while (res.hasMoreElements()) {
                url = res.nextElement();
                Properties prop = new Properties();
                prop.load((Reader)(Object)url.openStream());
                extensions.add(prop);
            }
            return extensions;
        } catch (IOException ioe) {
            String msg = (url == null) ? "unable to list resources logdistiller.properties" : "unable to load resource " + url.toExternalForm();
            throw new RuntimeException(msg, ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class ExtensionHelper {

}
