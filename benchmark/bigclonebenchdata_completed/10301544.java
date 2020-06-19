import java.io.*;
import java.lang.*;
import java.util.*;



class c10301544 {
public static MyHelperClass findAndAddClassesInPackageByFile(String o0, String o1, boolean o2, Set<Class<?>> o3){ return null; }
//public MyHelperClass findAndAddClassesInPackageByFile(String o0, String o1, boolean o2, Set<Class<?>> o3){ return null; }

    public static Set<Class<?>> getClasses(String pack) {
        Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
        boolean recursive = true;
        String packageName = pack;
        String packageDirName = packageName.replace('.', '/');
        Enumeration<URL> dirs;
        try {
            dirs =(Enumeration<URL>)(Object) Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            while (dirs.hasMoreElements()) {
                URL url = dirs.nextElement();
                String protocol =(String)(Object) url.getProtocol();
                if ("file".equals(protocol)) {
                    MyHelperClass URLDecoder = new MyHelperClass();
                    String filePath =(String)(Object) URLDecoder.decode(url.getFile(), "UTF-8");
                    findAndAddClassesInPackageByFile(packageName, filePath, recursive, classes);
                } else if ("jar".equals(protocol)) {
                    JarFile jar;
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
                                    if (name.endsWith(".class") && !(Boolean)(Object)entry.isDirectory()) {
                                        String className = name.substring(packageName.length() + 1, name.length() - 6);
                                        try {
                                            classes.add(Class.forName(packageName + '.' + className));
                                        } catch (ClassNotFoundException e) {
                                            System.out.println("添加用户自定义视图类错误 找不到此类的.class文件");
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                    } catch (UncheckedIOException e) {
                        System.out.println("在扫描用户定义视图时从jar包获取文件出错");
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decode(MyHelperClass o0, String o1){ return null; }}

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
