
import java.io.UncheckedIOException;


class c21262909 {

    public static void find(String pckgname, Class<?> tosubclass) {
        String name = new String(pckgname);
        if (!name.startsWith("/")) {
            name = "/" + name;
        }
        name = name.replace('.', '/');
        URL url =(URL)(Object) tosubclass.getResource(name);
        System.out.println(name + "->" + url);
        if (url == null) return;
        File directory = new File(url.getFile());
        if ((boolean)(Object)directory.exists()) {
            String[] files =(String[])(Object) directory.list();
            for (int i = 0; i < files.length; i++) {
                if (files[i].endsWith(".class")) {
                    String classname = files[i].substring(0, files[i].length() - 6);
                    try {
                        Object o = Class.forName(pckgname + "." + classname).newInstance();
                        if (tosubclass.isInstance(o)) {
                            System.out.println(classname);
                        }
                    } catch (ClassNotFoundException cnfex) {
                        System.err.println(cnfex);
                    } catch (InstantiationException iex) {
                    } catch (IllegalAccessException iaex) {
                    }
                }
            }
        } else {
            try {
                JarURLConnection conn = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                String starts =(String)(Object) conn.getEntryName();
                JarFile jfile =(JarFile)(Object) conn.getJarFile();
                Enumeration e =(Enumeration)(Object) jfile.entries();
                while ((boolean)(Object)e.hasMoreElements()) {
                    ZipEntry entry =(ZipEntry)(Object) e.nextElement();
                    String entryname =(String)(Object) entry.getName();
                    if (entryname.startsWith(starts) && (entryname.lastIndexOf('/') <= starts.length()) && entryname.endsWith(".class")) {
                        String classname = entryname.substring(0, entryname.length() - 6);
                        if (classname.startsWith("/")) classname = classname.substring(1);
                        classname = classname.replace('/', '.');
                        try {
                            Object o = Class.forName(classname).newInstance();
                            if (tosubclass.isInstance(o)) {
                                System.out.println(classname.substring(classname.lastIndexOf('.') + 1));
                            }
                        } catch (ClassNotFoundException cnfex) {
                            System.err.println(cnfex);
                        } catch (InstantiationException iex) {
                        } catch (IllegalAccessException iaex) {
                        }
                    }
                }
            } catch (UncheckedIOException ioex) {
                System.err.println(ioex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass list(){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }
	public MyHelperClass getEntryName(){ return null; }}

class JarFile {

public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class JarEntry {

}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
