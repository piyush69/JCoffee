import java.io.*;
import java.lang.*;
import java.util.*;



class c5317769 {
public MyHelperClass findResources(String o0){ return null; }
public MyHelperClass getProviderLocation(){ return null; }
	public MyHelperClass getPlatformProviderLocation(){ return null; }
	public MyHelperClass findClass(String o0){ return null; }
	public MyHelperClass getMessage(String o0, String o1, String o2, String o3){ return null; }

    private <T> Collection<Class<? extends T>> loadProviders(final Class<T> providerClass) throws BootstrapException {
        try {
            final String providerNamePrefix = providerClass.getName() + ".";
            final Map<String, Class<? extends T>> providers = new TreeMap<String, Class<? extends T>>(new Comparator<String>() {

                public int compare(final String key1, final String key2) {
                    return key1.compareTo(key2);
                }
            });
            final File platformProviders = new File((String)(Object)this.getPlatformProviderLocation());
            if (platformProviders.exists()) {
                InputStream in = null;
                final java.util.Properties p = new java.util.Properties();
                try {
                    in = new FileInputStream(platformProviders);
                    p.load(in);
                } finally {
                    if (in != null) {
                        in.close();
                    }
                }
                for (Map.Entry e : p.entrySet()) {
                    if (e.getKey().toString().startsWith(providerNamePrefix)) {
                        final Class<?> provider =(Class<?>)(Object) this.findClass(e.getValue().toString());
                        if (provider == null) {
                            throw new BootstrapException((String)(Object)getMessage("implementationNotFound", providerClass.getName(), e.getValue().toString(), platformProviders.getAbsolutePath()));
                        }
                        if (!providerClass.isAssignableFrom(provider)) {
                            throw new BootstrapException((String)(Object)getMessage("illegalImplementation", providerClass.getName(), e.getValue().toString(), platformProviders.getAbsolutePath()));
                        }
                        providers.put(e.getKey().toString(), provider.asSubclass(providerClass));
                    }
                }
            }
            final Enumeration<URL> classpathProviders =(Enumeration<URL>)(Object) this.findResources((char)(Object)this.getProviderLocation() + '/' + providerClass.getName());
            while (classpathProviders.hasMoreElements()) {
                final URL url = classpathProviders.nextElement();
                final BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream(), "UTF-8"));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("#")) {
                        continue;
                    }
                    final Class<?> provider =(Class<?>)(Object) this.findClass(line);
                    if (provider == null) {
                        throw new BootstrapException((String)(Object)getMessage("implementationNotFound", providerClass.getName(), line,(String)(Object) url.toExternalForm()));
                    }
                    if (!providerClass.isAssignableFrom(provider)) {
                        throw new BootstrapException((String)(Object)getMessage("illegalImplementation", providerClass.getName(), line,(String)(Object) url.toExternalForm()));
                    }
                    providers.put(providerNamePrefix + providers.size(), provider.asSubclass(providerClass));
                }
                reader.close();
            }
            return providers.values();
        } catch (final IOException e) {
            throw new BootstrapException(e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BootstrapException extends Exception{
	public BootstrapException(String errorMessage) { super(errorMessage); }
	BootstrapException(){}
	BootstrapException(String o0, IOException o1){}
}

class URL {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}
