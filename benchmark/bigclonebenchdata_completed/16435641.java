import java.io.*;
import java.lang.*;
import java.util.*;



class c16435641 {
public static MyHelperClass _LOG;
	public static MyHelperClass Level;
	public static MyHelperClass _getClass(ClassLoader o0, String o1){ return null; }
	public static MyHelperClass _parseLine(String o0){ return null; }
//public MyHelperClass _LOG;
//	public MyHelperClass Level;
//	public MyHelperClass _parseLine(String o0){ return null; }
//	public MyHelperClass _getClass(ClassLoader o0, String o1){ return null; }

    @SuppressWarnings("unchecked")
    public static <T> List<T> getServices(String service) {
        String serviceUri = "META-INF/services/" + service;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            Enumeration<URL> urls =(Enumeration<URL>)(Object) loader.getResources(serviceUri);
            if (urls.hasMoreElements()) {
                List<T> services = new ArrayList<T>(1);
                Set<String> keys = new HashSet<String>(20);
                do {
                    URL url = urls.nextElement();
                    MyHelperClass Level = new MyHelperClass();
                    if ((boolean)(Object)_LOG.isLoggable(Level.FINEST)) {
                        MyHelperClass _LOG = new MyHelperClass();
                        _LOG.finest("Processing: " + url);
                    }
                    try {
                        BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                        try {
                            while (true) {
                                String line = in.readLine();
                                if (line == null) break;
                                String className =(String)(Object) _parseLine(line);
                                if (className != null && keys.add(className)) {
                                    T instance = (T) _getClass(loader, className);
                                    services.add(instance);
                                }
                            }
                        } finally {
                            in.close();
                        }
                    } catch (Exception e) {
                        if ((boolean)(Object)_LOG.isLoggable(Level.WARNING)) {
                            _LOG.log(Level.WARNING, "Error parsing URL: " + url, e);
                        }
                    }
                } while (urls.hasMoreElements());
                if (services.size() == 1) return Collections.singletonList(services.get(0));
                return Collections.unmodifiableList(services);
            }
        } catch (IOException e) {
            if ((boolean)(Object)_LOG.isLoggable(Level.SEVERE)) {
                _LOG.log(Level.SEVERE, "Error loading Resource: " + serviceUri, e);
            }
        }
        return Collections.emptyList();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINEST;
	public MyHelperClass WARNING;
	public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }
	public MyHelperClass finest(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
