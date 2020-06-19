import java.io.*;
import java.lang.*;
import java.util.*;



class c22198322 {
public MyHelperClass NULL;
public MyHelperClass _LOG;
	public MyHelperClass _internalViews;
	public MyHelperClass _getClassLoader(){ return null; }

    private void _loadInternalViews() {
        HashMap<String,InternalView> _internalViews =(HashMap<String,InternalView>)(Object) NULL; //new HashMap<String,InternalView>();
        _internalViews = new HashMap<String, InternalView>();
        List<URL> list = new ArrayList<URL>();
        ClassLoader loader =(ClassLoader)(Object) _getClassLoader();
        try {
            Enumeration<URL> en =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.apache.myfaces.trinidad.render.InternalView.properties");
            while (en.hasMoreElements()) {
                list.add(en.nextElement());
            }
            en =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.apache.myfaces.trinidad.InternalView.properties");
            while (en.hasMoreElements()) {
                list.add(en.nextElement());
            }
            Collections.reverse(list);
        } catch (IOException ioe) {
            _LOG.severe(ioe);
        }
        for (URL url : list) {
            try {
                Properties properties = new Properties();
                _LOG.fine("Loading internal views from {0}", url);
                InputStream is =(InputStream)(Object) url.openStream();
                try {
                    properties.load(is);
                } finally {
                    is.close();
                }
                for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                    String name = (String) entry.getKey();
                    String className = (String) entry.getValue();
                    Class<?> clazz = loader.loadClass(className);
                    InternalView view = (InternalView) clazz.newInstance();
                    _internalViews.put(name, view);
                }
            } catch (IllegalAccessException iae) {
                _LOG.severe("CANNOT_LOAD_URL", url);
                _LOG.severe(iae);
            } catch (InstantiationException ie) {
                _LOG.severe("CANNOT_LOAD_URL", url);
                _LOG.severe(ie);
            } catch (ClassNotFoundException cnfe) {
                _LOG.severe("CANNOT_LOAD_URL", url);
                _LOG.severe(cnfe);
            } catch (IOException ioe) {
                _LOG.severe("CANNOT_LOAD_URL", url);
                _LOG.severe(ioe);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, InternalView o1){ return null; }
	public MyHelperClass severe(ClassNotFoundException o0){ return null; }
	public MyHelperClass fine(String o0, URL o1){ return null; }
	public MyHelperClass severe(InstantiationException o0){ return null; }
	public MyHelperClass severe(IllegalAccessException o0){ return null; }
	public MyHelperClass severe(String o0, URL o1){ return null; }
	public MyHelperClass severe(IOException o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InternalView {

}
