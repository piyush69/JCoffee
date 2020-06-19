import java.io.*;
import java.lang.*;
import java.util.*;



class c14832470 {
public static MyHelperClass _LOG;
	public static MyHelperClass _parseLine(ClassLoader o0, String o1){ return null; }
//public MyHelperClass _LOG;
//	public MyHelperClass _parseLine(ClassLoader o0, String o1){ return null; }

    @SuppressWarnings("unchecked")
    public static <T> List<T> getServices(String service) {
        String serviceUri = "META-INF/services/" + service;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            Enumeration<URL> urls =(Enumeration<URL>)(Object) loader.getResources(serviceUri);
            if (urls.hasMoreElements()) {
                List<T> services = new ArrayList<T>(1);
                do {
                    URL url = urls.nextElement();
                    MyHelperClass _LOG = new MyHelperClass();
                    _LOG.finest("Processing:{0}", url);
                    try {
                        BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                        try {
                            while (true) {
                                String line = in.readLine();
                                if (line == null) break;
                                T instance = (T) _parseLine(loader, line);
                                if (instance != null) services.add(instance);
                            }
                        } finally {
                            in.close();
                        }
                    } catch (Exception e) {
                        _LOG.warning("ERR_PARSING_URL", url);
                        _LOG.warning(e);
                    }
                } while (urls.hasMoreElements());
                if (services.size() == 1) return Collections.singletonList(services.get(0));
                return Collections.unmodifiableList(services);
            }
        } catch (IOException e) {
            _LOG.severe("ERR_LOADING_RESROUCE", serviceUri);
            _LOG.severe(e);
        }
        return Collections.emptyList();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0, URL o1){ return null; }
	public MyHelperClass finest(String o0, URL o1){ return null; }
	public MyHelperClass warning(Exception o0){ return null; }
	public MyHelperClass severe(String o0, String o1){ return null; }
	public MyHelperClass severe(IOException o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
