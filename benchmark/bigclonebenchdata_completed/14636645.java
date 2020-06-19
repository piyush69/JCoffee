import java.io.*;
import java.lang.*;
import java.util.*;



class c14636645 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;

    private static void loadQueryProcessorFactories() {
        HashMap<String,QueryProcessorFactoryIF> qpFactoryMap =(HashMap<String,QueryProcessorFactoryIF>)(Object) NULL; //new HashMap<String,QueryProcessorFactoryIF>();
        qpFactoryMap = new HashMap<String, QueryProcessorFactoryIF>();
        Enumeration<URL> resources = null;
        try {
            MyHelperClass RESOURCE_STRING = new MyHelperClass();
            resources =(Enumeration<URL>)(Object) QueryUtils.class.getClassLoader().getResources((String)(Object)RESOURCE_STRING);
        } catch (IOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Error while trying to look for " + "QueryProcessorFactoryIF implementations.", e);
        }
        while (resources != null && resources.hasMoreElements()) {
            URL url = resources.nextElement();
            InputStream is = null;
            try {
                is =(InputStream)(Object) url.openStream();
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.warn("Error opening stream to QueryProcessorFactoryIF service description.",(IOException)(Object) e);
            }
            if (is != null) {
                BufferedReader rdr = new BufferedReader(new InputStreamReader(is));
                String line;
                try {
                    while ((line = rdr.readLine()) != null) {
                        try {
                            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                            Class<?> c = Class.forName(line, true, classLoader);
                            if (QueryProcessorFactoryIF.class.isAssignableFrom(c)) {
                                QueryProcessorFactoryIF factory = (QueryProcessorFactoryIF) c.newInstance();
//                                MyHelperClass qpFactoryMap = new MyHelperClass();
                                qpFactoryMap.put((String)(Object)factory.getQueryLanguage().toUpperCase(), factory);
                            } else {
                                MyHelperClass log = new MyHelperClass();
                                log.warn("Wrong entry for QueryProcessorFactoryIF service " + "description, '" + line + "' is not implementing the " + "correct interface.");
                            }
                        } catch (Exception e) {
                            MyHelperClass log = new MyHelperClass();
                            log.warn("Could not create an instance for " + "QueryProcessorFactoryIF service '" + line + "'.");
                        }
                    }
                } catch (IOException e) {
                    MyHelperClass log = new MyHelperClass();
                    log.warn("Could not read from QueryProcessorFactoryIF " + "service descriptor.", e);
                }
            }
        }
        MyHelperClass DEFAULT_LANGUAGE = new MyHelperClass();
        if (!qpFactoryMap.containsKey(DEFAULT_LANGUAGE)) {
//            MyHelperClass DEFAULT_LANGUAGE = new MyHelperClass();
            qpFactoryMap.put((String)(Object)DEFAULT_LANGUAGE,(QueryProcessorFactoryIF)(Object) new TologQueryProcessorFactory());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toUpperCase(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass containsKey(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class QueryProcessorFactoryIF {

public MyHelperClass getQueryLanguage(){ return null; }}

class QueryUtils {

}

class TologQueryProcessorFactory {

}
