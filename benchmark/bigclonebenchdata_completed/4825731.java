import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4825731 {
public static MyHelperClass isConcreteSubclass(Class o0, Class o1){ return null; }
//public MyHelperClass isConcreteSubclass(Class o0, Class o1){ return null; }

    public static Class[] findSubClasses(Class baseClass)  throws Throwable {
        String packagePath = "/" + baseClass.getPackage().getName().replace('.', '/');
        URL url = baseClass.getResource(packagePath);
        if (url == null) {
            return new Class[0];
        }
        List<Class> derivedClasses = new ArrayList<Class>();
        try {
            URLConnection connection = url.openConnection();
            if (connection instanceof JarURLConnection) {
                JarFile jarFile =(JarFile)(Object) ((JarURLConnection) connection).getJarFile();
                Enumeration e =(Enumeration)(Object) jarFile.entries();
                while (e.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry) e.nextElement();
                    String entryName =(String)(Object) entry.getName();
                    if (entryName.endsWith(".class")) {
                        String clazzName = entryName.substring(0, entryName.length() - 6);
                        clazzName = clazzName.replace('/', '.');
                        try {
                            Class clazz = Class.forName(clazzName);
                            if ((boolean)(Object)isConcreteSubclass(baseClass, clazz)) {
                                derivedClasses.add(clazz);
                            }
                        } catch (Throwable ignoreIt) {
                        }
                    }
                }
            } else if ((FileURLConnection)(Object)connection instanceof FileURLConnection) {
                File file = new File(url.getFile());
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    String filename = files[i].getName();
                    if (filename.endsWith(".class")) {
                        filename = filename.substring(0, filename.length() - 6);
                        String clazzname = baseClass.getPackage().getName() + "." + filename;
                        try {
                            Class clazz = Class.forName(clazzname);
                            if ((boolean)(Object)isConcreteSubclass(baseClass, clazz)) {
                                derivedClasses.add(clazz);
                            }
                        } catch (Throwable ignoreIt) {
                        }
                    }
                }
            }
        } catch (IOException ignoreIt) {
        }
        return derivedClasses.toArray(new Class[derivedClasses.size()]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JarFile {

public MyHelperClass entries(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class FileURLConnection {

}
