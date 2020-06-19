import java.io.*;
import java.lang.*;
import java.util.*;



class c22879400 {

    public static Properties loadAllProperties(String resourceName, ClassLoader classLoader) throws IOException {
        MyHelperClass Assert = new MyHelperClass();
        Assert.notNull(resourceName, "Resource name must not be null");
        ClassLoader clToUse = classLoader;
        if (clToUse == null) {
            MyHelperClass ClassUtils = new MyHelperClass();
            clToUse =(ClassLoader)(Object) ClassUtils.getDefaultClassLoader();
        }
        Properties properties = new Properties();
        Enumeration urls = clToUse.getResources(resourceName);
        while (urls.hasMoreElements()) {
            URL url = (URL) urls.nextElement();
            InputStream is = null;
            try {
                URLConnection con =(URLConnection)(Object) url.openConnection();
                con.setUseCaches(false);
                is =(InputStream)(Object) con.getInputStream();
                properties.load(is);
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        }
        return properties;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notNull(String o0, String o1){ return null; }
	public MyHelperClass getDefaultClassLoader(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
