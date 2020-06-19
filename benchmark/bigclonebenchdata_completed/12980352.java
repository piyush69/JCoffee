import java.io.*;
import java.lang.*;
import java.util.*;



class c12980352 {
public MyHelperClass Log;
	public MyHelperClass FileFunctions;
	public MyHelperClass Modifier;
	public MyHelperClass getURLs(){ return null; }
	public MyHelperClass loadClass(String o0){ return null; }
	public MyHelperClass getAddedURLs(){ return null; }

    public List<Class<?>> getImplementingClasses(Class<?> ancestor, boolean searchAllClasspath) throws MutableClassLoaderException {
        List<Class<?>> classes = new LinkedList<Class<?>>();
        for (URL url :(URL[])(Object) (Object[])(Object)(searchAllClasspath ? getURLs() : getAddedURLs())) {
            Log.verbose("Checking classpath item " + url);
            if (!(Boolean)(Object)url.getPath().toLowerCase().endsWith("/")) {
                try {
                    JarInputStream jis = new JarInputStream(url.openStream());
                    JarEntry je;
                    while ((je =(JarEntry)(Object) jis.getNextJarEntry()) != null) {
                        Log.verbose("Checking resource " + je.getName());
                        try {
                            if ((boolean)(Object)je.getName().endsWith(".class")) {
                                Class<?> c =(Class<?>)(Object) this.loadClass((String)(Object)je.getName().replaceAll("/", ".").replaceAll(".class$", ""));
                                if (!(Boolean)(Object)Modifier.isAbstract(c.getModifiers()) && !(Boolean)(Object)Modifier.isInterface(c.getModifiers()) && ancestor.isAssignableFrom(c)) {
                                    Log.verbose("Found class " + c.getCanonicalName() + " which implements class " + ancestor.getCanonicalName());
                                    classes.add(c);
                                }
                            }
                        } catch (Error e) {
                        } catch (RuntimeException re) {
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e) {
                    Log.error(e);
                }
            } else if ((boolean)(Object)url.getPath().endsWith("/")) {
                File root = new File((String)(Object)url.getPath());
                for (File file :(File[])(Object) (Object[])(Object)FileFunctions.getFileTree(root)) {
                    try {
                        if (file.getName().toLowerCase().endsWith(".class")) {
                            Class<?> c =(Class<?>)(Object) this.loadClass(file.getAbsolutePath().replaceAll("^" + root.getAbsolutePath() + "/", "").replaceAll("/", ".").replaceAll(".class$", ""));
                            if (!(Boolean)(Object)Modifier.isAbstract(c.getModifiers()) && !(Boolean)(Object)Modifier.isInterface(c.getModifiers()) && ancestor.isAssignableFrom(c)) {
                                Log.verbose("Found class " + c.getCanonicalName() + " which implements class " + ancestor.getCanonicalName());
                                classes.add(c);
                            }
                        }
                    } catch (Exception e) {
                        Log.error(e);
                    }
                }
            }
        }
        return classes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFileTree(File o0){ return null; }
	public MyHelperClass isAbstract(int o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass verbose(String o0){ return null; }
	public MyHelperClass isInterface(int o0){ return null; }}

class MutableClassLoaderException extends Exception{
	public MutableClassLoaderException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class JarInputStream {

JarInputStream(){}
	JarInputStream(MyHelperClass o0){}
	public MyHelperClass getNextJarEntry(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}
