import java.io.*;
import java.lang.*;
import java.util.*;



class c18284810 {

    protected void discoverFactories() {
        DataSourceRegistry registry =(DataSourceRegistry)(Object) this;
        try {
            ClassLoader loader = DataSetURI.class.getClassLoader();
            Enumeration<URL> urls;
            if (loader == null) {
                urls =(Enumeration<URL>)(Object) ClassLoader.getSystemResources("META-INF/org.virbo.datasource.DataSourceFactory");
            } else {
                urls =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.virbo.datasource.DataSourceFactory");
            }
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine();
                while (s != null) {
                    if (s.trim().length() > 0) {
                        List<String> extensions = null;
                        List<String> mimeTypes = null;
                        String factoryClassName = s;
                        try {
                            Class c = Class.forName(factoryClassName);
                            DataSourceFactory f = (DataSourceFactory) c.newInstance();
                            try {
                                Method m =(Method)(Object) c.getMethod("extensions", new Class[0]);
                                extensions = (List<String>) m.invoke(f, new Object[0]);
                            } catch (NoSuchMethodException ex) {
                            } catch (UncheckedIOException ex) {
                                ex.printStackTrace();
                            }
                            try {
                                Method m =(Method)(Object) c.getMethod("mimeTypes", new Class[0]);
                                mimeTypes = (List<String>) m.invoke(f, new Object[0]);
                            } catch (NoSuchMethodException ex) {
                            } catch (UncheckedIOException ex) {
                                ex.printStackTrace();
                            }
                        } catch (ClassNotFoundException ex) {
                            ex.printStackTrace();
                        } catch (InstantiationException ex) {
                            ex.printStackTrace();
                        } catch (IllegalAccessException ex) {
                            ex.printStackTrace();
                        }
                        if (extensions != null) {
                            for (String e : extensions) {
                                registry.registerExtension(factoryClassName, e, null);
                            }
                        }
                        if (mimeTypes != null) {
                            for (String m : mimeTypes) {
                                registry.registerMimeType(factoryClassName, m);
                            }
                        }
                    }
                    s = reader.readLine();
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DataSourceRegistry {

public MyHelperClass registerExtension(String o0, String o1, Object o2){ return null; }
	public MyHelperClass registerMimeType(String o0, String o1){ return null; }}

class DataSetURI {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class DataSourceFactory {

}

class Method {

public MyHelperClass invoke(DataSourceFactory o0, Object[] o1){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}
