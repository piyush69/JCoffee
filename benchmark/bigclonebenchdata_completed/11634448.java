import java.io.*;
import java.lang.*;
import java.util.*;



class c11634448 {

//    @Override
    public int run() {
        Enumeration<?> e;
        try {
            e = About.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
            while (e.hasMoreElements()) {
                final URL url = (URL) e.nextElement();
                if (url.toString().indexOf("renaissance") != -1) {
                    final InputStream is =(InputStream)(Object) url.openStream();
                    Properties p = new Properties();
                    p.load(is);
                    for (Entry entry :(Entry[])(Object)(Object[])(Object)(Entry)(Object) p.entrySet()) {
                        System.err.println(entry);
                    }
                }
            }
        } catch (IOException e1) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal("Caught an exception " + e1);
            return 1;
        }
        System.err.println("Classpath is " + System.getProperty("java.class.path"));
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(String o0){ return null; }}

class About {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Entry {

}
