import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5247455 {
public static MyHelperClass providers;
	public static MyHelperClass providerNamesFromReader(BufferedReader o0){ return null; }
//public MyHelperClass providers;
//	public MyHelperClass providerNamesFromReader(BufferedReader o0){ return null; }

    private static void findAllProviders()  throws Throwable {
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            Enumeration<URL> resources = loader.getResources("META-INF/services/" + PersistenceProvider.class.getName());
            Set<String> names = new HashSet<String>();
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                InputStream is = url.openStream();
                try {
                    names.addAll((Collection<? extends String>)(Object)providerNamesFromReader(new BufferedReader(new InputStreamReader(is))));
                } finally {
                    is.close();
                }
            }
            for (String s : names) {
                Class providerClass = loader.loadClass(s);
                providers.add((PersistenceProvider) providerClass.newInstance());
            }
        } catch (IOException e) {
            throw new PersistenceException((String)(Object)e);
        } catch (InstantiationException e) {
            throw new PersistenceException((String)(Object)e);
        } catch (IllegalAccessException e) {
            throw new PersistenceException((String)(Object)e);
        } catch (ClassNotFoundException e) {
            throw new PersistenceException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(PersistenceProvider o0){ return null; }}

class PersistenceProvider {

}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}
