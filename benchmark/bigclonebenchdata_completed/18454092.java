import java.io.*;
import java.lang.*;
import java.util.*;



class c18454092 {
public static MyHelperClass log;
	public static MyHelperClass addIfEntity(Set<Class<?>> o0, String o1){ return null; }
//public MyHelperClass log;
//	public MyHelperClass addIfEntity(Set<Class<?>> o0, String o1){ return null; }

    private static Set<? extends Class<?>> findEntitiesFromUrl(URL url) {
        try {
            JarEntry entry;
            JarInputStream jarStream = new JarInputStream(url.openStream());
            Set<Class<?>> classes = new HashSet<Class<?>>();
            while ((entry =(JarEntry)(Object) jarStream.getNextJarEntry()) != null) {
                String name =(String)(Object) entry.getName();
                if (!(Boolean)(Object)entry.isDirectory() && name.endsWith(".class")) {
                    addIfEntity(classes, name);
                }
            }
            return classes;
        } catch (UncheckedIOException ioe) {
            log.error("Could not search URL '", url, "' for entities due to an IOException: ", ioe.getMessage());
        }
        return new HashSet<Class<?>>();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, URL o1, String o2, String o3){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class JarInputStream {

JarInputStream(){}
	JarInputStream(MyHelperClass o0){}
	public MyHelperClass getNextJarEntry(){ return null; }}
