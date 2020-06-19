import java.io.*;
import java.lang.*;
import java.util.*;



class c16885088 {
public static MyHelperClass URLDecoder;
public static MyHelperClass LOG;
//	public MyHelperClass URLDecoder;
	public static MyHelperClass JAVA_CLASS_SUFFIX;
	public static MyHelperClass loadClass(String o0){ return null; }
	public static MyHelperClass getClassesByPackageFile(String o0, String o1, boolean o2, Collection<Class<?>> o3){ return null; }
//public MyHelperClass LOG;
//	public MyHelperClass JAVA_CLASS_SUFFIX;
//	public MyHelperClass loadClass(String o0){ return null; }
//	public MyHelperClass getClassesByPackageFile(String o0, String o1, boolean o2, Collection<Class<?>> o3){ return null; }

    private static void getClasses(Collection<Class<?>> classes, String... packageNames) throws ClassNotFoundException {
        boolean recursive = true;
        for (String packageName : packageNames) {
            MyHelperClass StringUtil = new MyHelperClass();
            if ((boolean)(Object)StringUtil.isEmpty(packageName)) continue;
            String packageDirName = packageName.replace('.', '/');
            Enumeration<URL> dirs = null;
            try {
                dirs =(Enumeration<URL>)(Object) Thread.currentThread().getContextClassLoader().getResources(packageDirName);
                while (dirs.hasMoreElements()) {
                    URL url = dirs.nextElement();
                    String protocol =(String)(Object) url.getProtocol();
                    if ("file".equals(protocol)) {
                        MyHelperClass DECODING = new MyHelperClass();
                        String filePath =(String)(Object) URLDecoder.decode(url.getFile(), DECODING);
                        getClassesByPackageFile(packageName, filePath, recursive, classes);
                    } else if ("jar".equals(protocol)) {
                        JarFile jar = null;
                        try {
                            jar =(JarFile)(Object) ((JarURLConnection)(JarURLConnection)(Object) url.openConnection()).getJarFile();
                            Enumeration<JarEntry> entries =(Enumeration<JarEntry>)(Object) jar.entries();
                            while (entries.hasMoreElements()) {
                                JarEntry entry = entries.nextElement();
                                String name =(String)(Object) entry.getName();
                                if (name.charAt(0) == '/') {
                                    name = name.substring(1);
                                }
                                if (name.startsWith(packageDirName)) {
                                    int idx = name.lastIndexOf('/');
                                    if (idx != -1) {
                                        packageName = name.substring(0, idx).replace('/', '.');
                                    }
                                    if ((idx != -1) || recursive) {
                                        if (name.endsWith((String)(Object)JAVA_CLASS_SUFFIX) && !(Boolean)(Object)entry.isDirectory()) {
                                            String className = name.substring(packageName.length() + 1, name.length() - 6);
                                            classes.add((Class<?>)(Object)loadClass(packageName + '.' + className));
                                        }
                                    }
                                }
                            }
                        } catch (UncheckedIOException e) {
                            LOG.error("IOException when loading files from : " + url,(IOException)(Object) e);
                        }
                    }
                }
            } catch (IOException e) {
                LOG.error("IOException when get classes from : " + packageName, e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass decode(MyHelperClass o0, MyHelperClass o1){ return null; }}

class URL {

public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class JarFile {

public MyHelperClass entries(){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
