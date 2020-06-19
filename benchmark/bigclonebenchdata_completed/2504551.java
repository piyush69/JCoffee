import java.io.*;
import java.lang.*;
import java.util.*;



class c2504551 {
public static MyHelperClass registerPlugin(GDSFactoryPlugin o0){ return null; }
//public MyHelperClass registerPlugin(GDSFactoryPlugin o0){ return null; }

    private static void loadPluginsFromClassLoader(ClassLoader classLoader) throws IOException {
        Enumeration res = classLoader.getResources("META-INF/services/" + GDSFactoryPlugin.class.getName());
        while (res.hasMoreElements()) {
            URL url = (URL) res.nextElement();
            InputStreamReader rin = new InputStreamReader((InputStream)(Object)url.openStream());
            BufferedReader bin = new BufferedReader(rin);
            while (bin.ready()) {
                String className = bin.readLine();
                try {
                    Class clazz = Class.forName(className);
                    GDSFactoryPlugin plugin = (GDSFactoryPlugin) clazz.newInstance();
                    registerPlugin(plugin);
                } catch (ClassNotFoundException ex) {
                    MyHelperClass log = new MyHelperClass();
                    if (log != null) log.error("Can't register plugin" + className, ex);
                } catch (IllegalAccessException ex) {
                    MyHelperClass log = new MyHelperClass();
                    if (log != null) log.error("Can't register plugin" + className, ex);
                } catch (InstantiationException ex) {
                    MyHelperClass log = new MyHelperClass();
                    if (log != null) log.error("Can't register plugin" + className, ex);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IllegalAccessException o1){ return null; }
	public MyHelperClass error(String o0, ClassNotFoundException o1){ return null; }
	public MyHelperClass error(String o0, InstantiationException o1){ return null; }}

class GDSFactoryPlugin {

}

class URL {

public MyHelperClass openStream(){ return null; }}
