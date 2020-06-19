import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22627884 {
public MyHelperClass isLoggable(MyHelperClass o0){ return null; }
	public MyHelperClass findResources(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, Object o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, IOException o2){ return null; }
public MyHelperClass Level;
	public MyHelperClass createProviderObject(Class<T> o0, String o1, URL o2){ return null; }
	public MyHelperClass getMessage(String o0, String o1){ return null; }
	public MyHelperClass getMessage(IOException o0){ return null; }
	public MyHelperClass getMessage(String o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass getProviderLocation(){ return null; }
	public MyHelperClass getPlatformProviderLocation(){ return null; }

    private <T> Collection<T> loadProviders(final Class<T> providerClass) throws Throwable, ModelException {
        try {
            final String providerNamePrefix = providerClass.getName() + ".";
            final Map<String, T> providers = new TreeMap<String, T>(new Comparator<String>() {

                public int compare(final String key1, final String key2) {
                    return key1.compareTo(key2);
                }
            });
            final File platformProviders = new File((String)(Object)this.getPlatformProviderLocation());
            if (platformProviders.exists()) {
                if ((boolean)(Object)this.isLoggable(Level.FINEST)) {
                    this.log(Level.FINEST, getMessage("processing", platformProviders.getAbsolutePath()), null);
                }
                InputStream in = null;
                boolean suppressExceptionOnClose = true;
                final java.util.Properties p = new java.util.Properties();
                try {
                    in = new FileInputStream(platformProviders);
                    p.load(in);
                    suppressExceptionOnClose = false;
                } finally {
                    try {
                        if (in != null) {
                            in.close();
                        }
                    } catch (final IOException e) {
                        if (suppressExceptionOnClose) {
                            this.log(Level.SEVERE, getMessage(e), e);
                        } else {
                            throw e;
                        }
                    }
                }
                for (Map.Entry<Object, Object> e : p.entrySet()) {
                    if (e.getKey().toString().startsWith(providerNamePrefix)) {
                        final String configuration = e.getValue().toString();
                        if ((boolean)(Object)this.isLoggable(Level.FINEST)) {
                            this.log(Level.FINEST, getMessage("providerInfo", platformProviders.getAbsolutePath(), providerClass.getName(), configuration), null);
                        }
                        providers.put(e.getKey().toString(),(T)(Object) this.createProviderObject((Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)providerClass, configuration, platformProviders.toURI().toURL()));
                    }
                }
            }
            final Enumeration<URL> classpathProviders =(Enumeration<URL>)(Object) this.findResources((char)(Object)this.getProviderLocation() + '/' + providerClass.getName());
            int count = 0;
            final long t0 = System.currentTimeMillis();
            while (classpathProviders.hasMoreElements()) {
                count++;
                final URL url = classpathProviders.nextElement();
                if ((boolean)(Object)this.isLoggable(Level.FINEST)) {
                    this.log(Level.FINEST, getMessage("processing", url.toExternalForm()), null);
                }
                BufferedReader reader = null;
                boolean suppressExceptionOnClose = true;
                try {
                    reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains("#")) {
                            continue;
                        }
                        if ((boolean)(Object)this.isLoggable(Level.FINEST)) {
                            this.log(Level.FINEST, getMessage("providerInfo", url.toExternalForm(), providerClass.getName(), line), null);
                        }
                        providers.put(providerNamePrefix + providers.size(),(T)(Object) this.createProviderObject((Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)(Class<T>)(Object)providerClass, line, url));
                    }
                    suppressExceptionOnClose = false;
                } finally {
                    try {
                        if (reader != null) {
                            reader.close();
                        }
                    } catch (final IOException e) {
                        if (suppressExceptionOnClose) {
                            this.log(Level.SEVERE, getMessage(e), e);
                        } else {
                            throw new ModelException(getMessage(e), e);
                        }
                    }
                }
            }
            if ((boolean)(Object)this.isLoggable(Level.FINE)) {
                this.log(Level.FINE, getMessage("contextReport",(String)(Object) count,(char)(Object) this.getProviderLocation() + '/' + providerClass.getName(),(String)(Object) Long.valueOf(System.currentTimeMillis() - t0)), null);
            }
            return providers.values();
        } catch (final IOException e) {
            throw new ModelException(getMessage(e), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINEST;
	public MyHelperClass FINE;
	public MyHelperClass SEVERE;
}

class ModelException extends Exception{
	public ModelException(String errorMessage) { super(errorMessage); }
	ModelException(MyHelperClass o0, IOException o1){}
	ModelException(){}
}

class T {

}
