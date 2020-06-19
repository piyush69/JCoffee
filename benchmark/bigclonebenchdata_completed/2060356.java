import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2060356 {
public static MyHelperClass LoggerChannel;
	public static MyHelperClass preloaded_plugins;
	public static MyHelperClass addFileToClassPath(ClassLoader o0, ClassLoader o1, File o2){ return null; }
	public static MyHelperClass getHighestJarVersions(File[] o0, String[] o1, String[] o2, boolean o3){ return null; }
	public static MyHelperClass getApplicationFile(String o0){ return null; }
//public MyHelperClass preloaded_plugins;
//	public MyHelperClass LoggerChannel;
//	public MyHelperClass getHighestJarVersions(File[] o0, String[] o1, String[] o2, boolean o3){ return null; }
//	public MyHelperClass getApplicationFile(String o0){ return null; }
//	public MyHelperClass addFileToClassPath(ClassLoader o0, ClassLoader o1, File o2){ return null; }

    private static LaunchablePlugin[] findLaunchablePlugins(LoggerChannelListener listener)  throws Throwable {
        List res = new ArrayList();
        File app_dir =(File)(Object) getApplicationFile("plugins");
        if (!(app_dir.exists()) && app_dir.isDirectory()) {
            listener.messageLogged((String)(Object)LoggerChannel.LT_ERROR, "Application dir '" + app_dir +(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object) "' not found");
            return (new LaunchablePlugin[0]);
        }
        File[] plugins = app_dir.listFiles();
        if (plugins == null || plugins.length == 0) {
            listener.messageLogged((String)(Object)LoggerChannel.LT_ERROR, "Application dir '" + app_dir +(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object) "' empty");
            return (new LaunchablePlugin[0]);
        }
        for (int i = 0; i < plugins.length; i++) {
            File plugin_dir = plugins[i];
            if (!plugin_dir.isDirectory()) {
                continue;
            }
            try {
                ClassLoader classLoader = PluginLauncherImpl.class.getClassLoader();
                ClassLoader root_cl = classLoader;
                File[] contents = plugin_dir.listFiles();
                if (contents == null || contents.length == 0) {
                    continue;
                }
                String[] plugin_version = { null };
                String[] plugin_id = { null };
                contents =(File[])(Object) getHighestJarVersions(contents, plugin_version, plugin_id, true);
                for (int j = 0; j < contents.length; j++) {
                    classLoader =(ClassLoader)(Object) addFileToClassPath(root_cl, classLoader, contents[j]);
                }
                Properties props = new Properties();
                File properties_file = new File(plugin_dir, "plugin.properties");
                if (properties_file.exists()) {
                    FileInputStream fis = null;
                    try {
                        fis = new FileInputStream(properties_file);
                        props.load(fis);
                    } finally {
                        if (fis != null) {
                            fis.close();
                        }
                    }
                } else {
                    if (classLoader instanceof URLClassLoader) {
                        URLClassLoader current = (URLClassLoader) classLoader;
                        URL url = current.findResource("plugin.properties");
                        if (url != null) {
                            props.load(url.openStream());
                        }
                    }
                }
                String plugin_class = (String) props.get("plugin.class");
                if (plugin_class == null || plugin_class.indexOf(';') != -1) {
                    continue;
                }
                Class c = classLoader.loadClass(plugin_class);
                Plugin plugin = (Plugin) c.newInstance();
                if ((LaunchablePlugin)(Object)plugin instanceof LaunchablePlugin) {
                    preloaded_plugins.put(plugin_class, plugin);
                    res.add(plugin);
                }
            } catch (Throwable e) {
                listener.messageLogged("Load of plugin in '" + plugin_dir + "' fails", e);
            }
        }
        LaunchablePlugin[] x = new LaunchablePlugin[res.size()];
        res.toArray(x);
        return (x);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LT_ERROR;
public MyHelperClass put(String o0, Plugin o1){ return null; }}

class LoggerChannelListener {

public MyHelperClass messageLogged(String o0, Throwable o1){ return null; }}

class LaunchablePlugin {

}

class PluginLauncherImpl {

}

class Plugin {

}
