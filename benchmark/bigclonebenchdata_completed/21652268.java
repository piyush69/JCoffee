import java.io.*;
import java.lang.*;
import java.util.*;



class c21652268 {

    private final synchronized Vector<Class<?>> findSubclasses(URL location, String packageName, Class<?> superClass) {
        MyHelperClass CLASS_COMPARATOR = new MyHelperClass();
        Map<Class<?>, URL> thisResult = new TreeMap<Class<?>, URL>((Comparator<? super Class<?>>)(Object)CLASS_COMPARATOR);
        Vector<Class<?>> v = new Vector<Class<?>>();
        MyHelperClass searchClass = new MyHelperClass();
        String fqcn =(String)(Object) searchClass.getName();
        List<URL> knownLocations = new ArrayList<URL>();
        knownLocations.add(location);
        for (int loc = 0; loc < knownLocations.size(); loc++) {
            URL url = knownLocations.get(loc);
            File directory = new File((String)(Object)url.getFile());
            if (directory.exists()) {
                String[] files = directory.list();
                for (int i = 0; i < files.length; i++) if (files[i].endsWith(".class")) {
                    String classname = files[i].substring(0, files[i].length() - 6);
                    try {
                        Class<?> c = Class.forName(packageName + "." + classname);
                        if (superClass.isAssignableFrom(c) && !fqcn.equals(packageName + "." + classname)) thisResult.put(c, url);
                    } catch (ClassNotFoundException cnfex) {
                        MyHelperClass errors = new MyHelperClass();
                        errors.add(cnfex);
                    } catch (Exception ex) {
                        MyHelperClass errors = new MyHelperClass();
                        errors.add(ex);
                    }
                }
            } else try {
                JarURLConnection conn = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                JarFile jarFile =(JarFile)(Object) conn.getJarFile();
                Enumeration<JarEntry> e =(Enumeration<JarEntry>)(Object) jarFile.entries();
                while (e.hasMoreElements()) {
                    JarEntry entry = e.nextElement();
                    String entryname =(String)(Object) entry.getName();
                    if (!(Boolean)(Object)entry.isDirectory() && entryname.endsWith(".class")) {
                        String classname = entryname.substring(0, entryname.length() - 6);
                        if (classname.startsWith("/")) classname = classname.substring(1);
                        classname = classname.replace('/', '.');
                        System.err.println("Trying " + classname);
                        try {
                            Class c = Class.forName(classname);
                            if (superClass.isAssignableFrom(c) && !fqcn.equals(classname)) thisResult.put(c, url);
                        } catch (ClassNotFoundException cnfex) {
                            MyHelperClass errors = new MyHelperClass();
                            errors.add(cnfex);
                        } catch (NoClassDefFoundError ncdfe) {
                            MyHelperClass errors = new MyHelperClass();
                            errors.add(ncdfe);
                        } catch (UnsatisfiedLinkError ule) {
                            MyHelperClass errors = new MyHelperClass();
                            errors.add(ule);
                        } catch (Exception exception) {
                            MyHelperClass errors = new MyHelperClass();
                            errors.add(exception);
                        } catch (Error error) {
                            MyHelperClass errors = new MyHelperClass();
                            errors.add(error);
                        }
                    }
                }
            } catch (UncheckedIOException ioex) {
                MyHelperClass errors = new MyHelperClass();
                errors.add(ioex);
            }
        }
        MyHelperClass results = new MyHelperClass();
        results.putAll(thisResult);
        Iterator<Class<?>> it = thisResult.keySet().iterator();
        while (it.hasNext()) v.add(it.next());
        return v;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Exception o0){ return null; }
	public MyHelperClass add(NoClassDefFoundError o0){ return null; }
	public MyHelperClass add(UnsatisfiedLinkError o0){ return null; }
	public MyHelperClass add(ClassNotFoundException o0){ return null; }
	public MyHelperClass add(Error o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass putAll(Map<Class<?>,URL> o0){ return null; }
	public MyHelperClass add(IOException o0){ return null; }}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class JarFile {

public MyHelperClass entries(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
