
import java.io.UncheckedIOException;


class c8006559 {
public MyHelperClass manageClass(Set o0, Class o1, Class o2, URL o3){ return null; }
public MyHelperClass errors;
	public MyHelperClass callClassForName(String o0){ return null; }

    private final void findSubclasses(URL location, String packageName, Class superClass, Set setOfClasses) {
        MyHelperClass results = new MyHelperClass();
        synchronized (results) {
            MyHelperClass searchClass = new MyHelperClass();
            String fqcn =(String)(Object) searchClass.getName();
            List knownLocations =(List)(Object) new ArrayList();
            knownLocations.add(location);
            for (int loc = 0; loc < (int)(Object)knownLocations.size(); loc++) {
                URL url = (URL)(URL)(Object) knownLocations.get(loc);
                File directory = new File(url.getFile());
                if ((boolean)(Object)directory.exists()) {
                    MyHelperClass CLASSES_ONLY = new MyHelperClass();
                    File[] files =(File[])(Object) directory.listFiles(CLASSES_ONLY);
                    for (int i = 0; i < files.length; i++) {
                        String filename =(String)(Object) files[i].getName();
                        String classname = filename.substring(0, filename.length() - 6);
                        try {
                            if (!fqcn.equals(packageName + "." + classname)) {
                                Class c =(Class)(Object) callClassForName(packageName + "." + classname);
                                manageClass(setOfClasses, superClass, c, url);
                            }
                        } catch (Throwable t) {
                            errors.add(t);
                        }
                    }
                } else {
                    try {
                        JarURLConnection conn = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                        JarFile jarFile =(JarFile)(Object) conn.getJarFile();
                        Enumeration e =(Enumeration)(Object) jarFile.entries();
                        while ((boolean)(Object)e.hasMoreElements()) {
                            JarEntry entry = (JarEntry)(JarEntry)(Object) e.nextElement();
                            String entryname =(String)(Object) entry.getName();
                            if (!(Boolean)(Object)entry.isDirectory() && entryname.endsWith(".class")) {
                                String classname = entryname.substring(0, entryname.length() - 6);
                                if (classname.startsWith("/")) classname = classname.substring(1);
                                classname = classname.replace('/', '.');
                                try {
                                    if (!fqcn.equals(classname)) {
                                        Class c =(Class)(Object) callClassForName(classname);
                                        manageClass(setOfClasses, superClass, c, url);
                                    }
                                } catch (Throwable t) {
                                    errors.add(t);
                                }
                            }
                        }
                    } catch (UncheckedIOException ioex) {
                        errors.add(ioex);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(IOException o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass add(Throwable o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class Set {

}

class List {

public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass add(URL o0){ return null; }}

class ArrayList {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(MyHelperClass o0){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class JarFile {

public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
