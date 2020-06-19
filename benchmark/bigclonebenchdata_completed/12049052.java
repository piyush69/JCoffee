import java.io.*;
import java.lang.*;
import java.util.*;



class c12049052 {
public MyHelperClass logger;

    private Collection<Class<? extends Plugin>> loadFromResource(ClassLoader classLoader, String resource) throws IOException {
        Collection<Class<? extends Plugin>> pluginClasses = new HashSet<Class<? extends Plugin>>();
        Enumeration providerFiles = classLoader.getResources(resource);
        if (!providerFiles.hasMoreElements()) {
            MyHelperClass logger = new MyHelperClass();
            logger.warning("Can't find the resource: " + resource);
            return pluginClasses;
        }
        do {
            URL url = (URL) providerFiles.nextElement();
            InputStream stream =(InputStream)(Object) url.openStream();
            BufferedReader reader;
            try {
                reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            } catch (IOException e) {
                continue;
            }
            String line;
            while ((line = reader.readLine()) != null) {
                int index = line.indexOf('#');
                if (index != -1) {
                    line = line.substring(0, index);
                }
                line = line.trim();
                if (line.length() > 0) {
                    Class pluginClass;
                    try {
                        pluginClass = classLoader.loadClass(line);
                    } catch (ClassNotFoundException e) {
                        MyHelperClass Level = new MyHelperClass();
                        logger.log(Level.WARNING, "Can't use the Pluginclass with the name " + line + ".", e);
                        continue;
                    }
                    if (Plugin.class.isAssignableFrom(pluginClass)) {
                        pluginClasses.add((Class<? extends Plugin>) pluginClass);
                    } else {
                        MyHelperClass logger = new MyHelperClass();
                        logger.warning("The Pluginclass with the name " + line + " isn't a subclass of Plugin.");
                    }
                }
            }
            reader.close();
            stream.close();
        } while (providerFiles.hasMoreElements());
        return pluginClasses;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, ClassNotFoundException o2){ return null; }
	public MyHelperClass warning(String o0){ return null; }}

class Plugin {

}

class URL {

public MyHelperClass openStream(){ return null; }}
