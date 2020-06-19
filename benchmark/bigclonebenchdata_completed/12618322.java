import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12618322 {
public MyHelperClass add(String o0, Set<Class<? o1, String o2){ return null; }
	public MyHelperClass findClassesInDirPackage(String o0, String o1, boolean o2, Set<Class<? o3){ return null; }

//    @NotNull
    public Set<Class<?>> in(Package pack)  throws Throwable {
        String packageName = pack.getName();
        String packageOnly = pack.getName();
        final boolean recursive = true;
        Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
        String packageDirName = packageOnly.replace('.', '/');
        Enumeration<URL> dirs;
        try {
            dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
        } catch (IOException e) {
            throw new PackageScanFailedException("Could not read from package directory: " + packageDirName, e);
        }
        while (dirs.hasMoreElements()) {
            URL url = dirs.nextElement();
            String protocol = url.getProtocol();
            if ("file".equals(protocol)) {
                try {
                    findClassesInDirPackage(packageOnly, URLDecoder.decode(url.getFile(), "UTF-8"), recursive, classes);
                } catch (UnsupportedEncodingException e) {
                    throw new PackageScanFailedException("Could not read from file: " + url, e);
                }
            } else if ("jar".equals(protocol)) {
                JarFile jar;
                try {
                    jar = ((JarURLConnection) url.openConnection()).getJarFile();
                } catch (IOException e) {
                    throw new PackageScanFailedException("Could not read from jar url: " + url, e);
                }
                Enumeration<JarEntry> entries = jar.entries();
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    String name = entry.getName();
                    if (name.charAt(0) == '/') {
                        name = name.substring(1);
                    }
                    if (name.startsWith(packageDirName)) {
                        int idx = name.lastIndexOf('/');
                        if (idx != -1) {
                            packageName = name.substring(0, idx).replace('/', '.');
                        }
                        if ((idx != -1) || recursive) {
                            if (name.endsWith(".class") && !entry.isDirectory()) {
                                String className = name.substring(packageName.length() + 1, name.length() - 6);
                                add(packageName, classes, className);
                            }
                        }
                    }
                }
            }
        }
        return classes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class NotNull {

}

class PackageScanFailedException extends Exception{
	public PackageScanFailedException(String errorMessage) { super(errorMessage); }
}

class JarFile {

}

class JarEntry {

}
