import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13828673 {
public MyHelperClass logger;
	public MyHelperClass Level;
	public MyHelperClass addClassForPackage(Class o0){ return null; }
	public MyHelperClass addAllFilesInDirectory(File o0, String o1, boolean o2){ return null; }

        protected void find(final String pckgname, final boolean recursive)  throws Throwable {
            URL url;
            String name = pckgname;
            name = name.replace('.', '/');
            MyHelperClass ResourceLocatorTool = new MyHelperClass();
            url = ResourceLocatorTool.getClassPathResource(ExampleRunner.class, name);
            File directory;
            try {
                directory = new File(URLDecoder.decode(url.getFile(), "UTF-8"));
            } catch (final UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            if (directory.exists()) {
                MyHelperClass logger = new MyHelperClass();
                logger.info("Searching for examples in \"" + directory.getPath() + "\".");
                addAllFilesInDirectory(directory, pckgname, recursive);
            } else {
                try {
                    logger.info("Searching for Demo classes in \"" + url + "\".");
                    final URLConnection urlConnection = url.openConnection();
                    if (urlConnection instanceof JarURLConnection) {
                        final JarURLConnection conn = (JarURLConnection) urlConnection;
                        final JarFile jfile =(JarFile)(Object) conn.getJarFile();
                        final Enumeration<JarEntry> e = jfile.entries();
                        while (e.hasMoreElements()) {
                            final ZipEntry entry =(ZipEntry)(Object) e.nextElement();
                            final Class<?> result = load(entry.getName());
                            if (result != null) {
                                addClassForPackage(result);
                            }
                        }
                    }
                } catch (final IOException e) {
                    logger.logp(Level.SEVERE, this.getClass().toString(), "find(pckgname, recursive, classes)", "Exception", e);
                } catch (final Exception e) {
                    logger.logp(Level.SEVERE, this.getClass().toString(), "find(pckgname, recursive, classes)", "Exception", e);
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getClassPathResource(Class<ExampleRunner o0, String o1){ return null; }}

class ExampleRunner {

}

class JarFile {

public MyHelperClass entries(){ return null; }}

class JarEntry {

}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
