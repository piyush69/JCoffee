import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14291788 {
public MyHelperClass Util;
	public MyHelperClass logger;
	public MyHelperClass cacheManager;
	public MyHelperClass modelsMap;
	public MyHelperClass LogFilter;
	public MyHelperClass properties;

    protected  void Configuration()  throws Throwable {
        try {
            Enumeration<URL> resources = getClass().getClassLoader().getResources("activejdbc_models.properties");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                LogFilter.log(logger, "Load models from: " + url.toExternalForm());
                InputStream inputStream = null;
                try {
                    inputStream = url.openStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] parts = Util.split(line, ':');
                        String modelName = parts[0];
                        String dbName = parts[1];
                        if (modelsMap.get(dbName) == null) {
                            modelsMap.put(dbName, new ArrayList<String>());
                        }
                        modelsMap.get(dbName).add(modelName);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (inputStream != null) inputStream.close();
                }
            }
        } catch (IOException e) {
            throw new InitException((String)(Object)e);
        }
        if (modelsMap.isEmpty()) {
            LogFilter.log(logger, "ActiveJDBC Warning: Cannot locate any models, assuming project without models.");
            return;
        }
        try {
            InputStream in = getClass().getResourceAsStream("/activejdbc.properties");
            if (in != null) properties.load(in);
        } catch (Exception e) {
            throw new InitException((String)(Object)e);
        }
        String cacheManagerClass = properties.getProperty("cache.manager");
        if (cacheManagerClass != null) {
            try {
                Class cmc = Class.forName(cacheManagerClass);
                cacheManager =(MyHelperClass)(Object) (CacheManager) cmc.newInstance();
            } catch (Exception e) {
                throw new InitException("failed to initialize a CacheManager. Please, ensure that the property " + "'cache.manager' points to correct class which extends 'activejdbc.cache.CacheManager' class and provides a default constructor.", e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass split(String o0, char o1){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass put(String o0, ArrayList<String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }}

class InitException extends Exception{
	public InitException(String errorMessage) { super(errorMessage); }
	InitException(){}
	InitException(String o0, Exception o1){}
}

class CacheManager {

}
