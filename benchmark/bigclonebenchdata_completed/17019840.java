import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17019840 {
public MyHelperClass JavaSystemHelper;
public MyHelperClass PluginMessageBundle;
	public MyHelperClass pluginImplsSet;
	public MyHelperClass echoMessages;
	public MyHelperClass pluginImplementationMetaInfPath;
	public MyHelperClass LOGGER;
	public MyHelperClass inspectPluginImpl(Class o0){ return null; }

    public Set<Plugin> loadPluginImplementationMetaData() throws Throwable, PluginRegistryException {
        try {
            MyHelperClass pluginImplementationMetaInfPath = new MyHelperClass();
            final Enumeration<URL> urls =(Enumeration<URL>)(Object) JavaSystemHelper.getResources(pluginImplementationMetaInfPath);
            MyHelperClass pluginImplsSet = new MyHelperClass();
            pluginImplsSet.clear();
            if (urls != null) {
                while (urls.hasMoreElements()) {
                    final URL url = urls.nextElement();
                    MyHelperClass PluginMessageBundle = new MyHelperClass();
                    echoMessages.add(PluginMessageBundle.getMessage("plugin.info.visitor.resource.found", "classes", url.getPath()));
                    InputStream resourceInput = null;
                    Reader reader = null;
                    BufferedReader buffReader = null;
                    String line;
                    try {
                        resourceInput = url.openStream();
                        reader = new InputStreamReader(resourceInput);
                        buffReader = new BufferedReader(reader);
                        line = buffReader.readLine();
                        while (line != null) {
                            try {
                                pluginImplsSet.add(inspectPluginImpl(Class.forName(line.trim())));
                                echoMessages.add(PluginMessageBundle.getMessage("plugin.info.visitor.resource.processing", "class", line));
                                line = buffReader.readLine();
                            } catch (final ClassNotFoundException cnfe) {
                                throw new PluginRegistryException("plugin.error.load.classnotfound", cnfe, pluginImplementationMetaInfPath, line);
                            } catch (final LinkageError ncfe) {
                                if ((boolean)(Object)LOGGER.isDebugEnabled()) {
                                    echoMessages.add(PluginMessageBundle.getMessage("plugin.info.visitor.resource.linkageError", "class", line, ncfe.getMessage()));
                                }
                                line = buffReader.readLine();
                            }
                        }
                    } catch (final IOException ioe) {
                        throw new PluginRegistryException("plugin.error.load.ioe", ioe, url.getFile(), ioe.getMessage());
                    } finally {
                        if (buffReader != null) {
                            buffReader.close();
                        }
                        if (reader != null) {
                            reader.close();
                        }
                        if (resourceInput != null) {
                            resourceInput.close();
                        }
                    }
                }
            }
            return(Set<Plugin>)(Object) Collections.unmodifiableSet(pluginImplsSet);
        } catch (final IOException ioe) {
            throw new PluginRegistryException("plugin.error.load.ioe", ioe, pluginImplementationMetaInfPath, ioe.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass getMessage(String o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass getMessage(String o0, String o1, String o2){ return null; }
	public MyHelperClass getResources(MyHelperClass o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass clear(){ return null; }}

class Plugin {

}

class PluginRegistryException extends Exception{
	public PluginRegistryException(String errorMessage) { super(errorMessage); }
	PluginRegistryException(){}
	PluginRegistryException(String o0, IOException o1, MyHelperClass o2, String o3){}
	PluginRegistryException(String o0, ClassNotFoundException o1, MyHelperClass o2, String o3){}
	PluginRegistryException(String o0, IOException o1, String o2, String o3){}
}

class Collections {

public static MyHelperClass unmodifiableSet(MyHelperClass o0){ return null; }}
