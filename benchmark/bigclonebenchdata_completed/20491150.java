
import java.io.UncheckedIOException;


class c20491150 {
public MyHelperClass addInstanceIfCommand(String o0, Map o1){ return null; }

    private void retrieveClasses(URL url, Map cmds) {
        try {
            MyHelperClass URLDecoder = new MyHelperClass();
            String resource =(String)(Object) URLDecoder.decode(url.getPath(), "UTF-8");
            File directory = new File(resource);
            if ((boolean)(Object)directory.exists()) {
                String[] files =(String[])(Object) directory.list();
                for (String file : files) {
                    if (file.endsWith(".class")) {
                        MyHelperClass pckgname = new MyHelperClass();
                        addInstanceIfCommand((char)(Object)pckgname + '.' + file.substring(0, file.length() - 6), cmds);
                    }
                }
            } else {
                JarURLConnection con = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                String starts =(String)(Object) con.getEntryName();
                Enumeration entriesEnum =(Enumeration)(Object) con.getJarFile().entries();
                while ((boolean)(Object)entriesEnum.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry)(ZipEntry)(Object) entriesEnum.nextElement();
                    String entryname =(String)(Object) entry.getName();
                    if (entryname.startsWith(starts) && (entryname.lastIndexOf('/') <= starts.length()) && entryname.endsWith(".class")) {
                        String classname = entryname.substring(0, entryname.length() - 6);
                        if (classname.startsWith("/")) {
                            classname = classname.substring(1);
                        }
                        classname = classname.replace('/', '.');
                        addInstanceIfCommand(classname, cmds);
                    }
                }
            }
        } catch (UncheckedIOException ioe) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.warning("couldn't retrieve classes of " + url + ". Reason: " + ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass entries(){ return null; }
	public MyHelperClass decode(MyHelperClass o0, String o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class Map {

}

class T {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass list(){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }
	public MyHelperClass getEntryName(){ return null; }}

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
