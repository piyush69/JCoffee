import java.io.*;
import java.lang.*;
import java.util.*;



class c21592798 {

    public static void addClasses(final Checker checker, final ArrayList<Class<?>> list, final String packageName, final int levels, final URL url) {
        final File directory = new File((String)(Object)url.getFile());
        if (directory.exists()) addClasses(checker, list, packageName, levels,(URL)(Object) directory); else try {
            final JarURLConnection conn = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
            addClasses(checker, list,(String)(Object) levels,(int)(Object) conn,(URL)(Object) packageName.replace('.', '/'));
        } catch (final UncheckedIOException ioex) {
            System.err.println(ioex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Checker {

}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class JarURLConnection {

}
