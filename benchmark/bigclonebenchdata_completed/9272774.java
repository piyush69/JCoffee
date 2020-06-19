import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9272774 {
public MyHelperClass NULL;

    private PluginInterface getClasseJar(String arquivo) {
        URLClassLoader load;
        try {
            URL url = new URL("jar", "", "file:" + arquivo + "!/");
            JarURLConnection jar = (JarURLConnection) url.openConnection();
            Enumeration arq = jar.getJarFile().entries();
            load = new URLClassLoader(new URL[] { url });
            while (arq.hasMoreElements()) {
                Object object = arq.nextElement();
                if (object.toString().contains(".class") && !object.toString().contains("PluginInterface.class")) {
                    Class cl = load.loadClass(object.toString().replace(".class", ""));
                    PluginInterface pl =(PluginInterface)(Object) NULL; //new PluginInterface();
                    pl = (PluginInterface) cl.newInstance();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        MyHelperClass pl = new MyHelperClass();
        return (PluginInterface)(Object)pl;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class PluginInterface {

}
