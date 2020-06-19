import java.io.*;
import java.lang.*;
import java.util.*;



class c5735102 {
public static MyHelperClass FastComparator;
	public static MyHelperClass loadResource(String o0, ClassLoader o1){ return null; }
public MyHelperClass FastSet;
//	public MyHelperClass FastComparator;
//	public MyHelperClass loadResource(String o0, ClassLoader o1){ return null; }

    private static PointGeomReader[] loadResourceList(final String resourceName, ClassLoader loader) {
        if (loader == null) loader = ClassLoader.getSystemClassLoader();
        MyHelperClass FastSet = new MyHelperClass();
        final FastSet result =(FastSet)(Object) FastSet.newInstance();
        try {
            final Enumeration<URL> resources =(Enumeration<URL>)(Object) loader.getResources(resourceName);
            if (resources != null) {
                while (resources.hasMoreElements()) {
                    final URL url = resources.nextElement();
                    final Properties mapping;
                    InputStream urlIn = null;
                    try {
                        urlIn =(InputStream)(Object) url.openStream();
                        mapping = new Properties();
                        mapping.load(urlIn);
                    } catch (IOException ioe) {
                        continue;
                    } finally {
                        if (urlIn != null) try {
                            urlIn.close();
                        } catch (Exception ignore) {
                        }
                    }
                    for (Enumeration keys = mapping.propertyNames(); keys.hasMoreElements(); ) {
                        final String format = (String) keys.nextElement();
                        final String implClassName = mapping.getProperty(format);
                        result.add(loadResource(implClassName, loader));
                    }
                }
            }
        } catch (IOException ignore) {
        }
        PointGeomReader[] resultArr =(PointGeomReader[])(Object) result.toArray(new PointGeomReader[(int)(Object)result.size()]);
        Arrays.sort(resultArr, FastComparator.DEFAULT);
        FastSet.recycle(result);
        return resultArr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT;
public MyHelperClass recycle(FastSet o0){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class PointGeomReader {

}

class FastSet {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass toArray(PointGeomReader[] o0){ return null; }
	public MyHelperClass size(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Arrays {

public static MyHelperClass sort(PointGeomReader[] o0, MyHelperClass o1){ return null; }}
