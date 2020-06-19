import java.io.*;
import java.lang.*;
import java.util.*;



class c3939278 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;

    private static void init() {
        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            Enumeration<URL> enumeration =(Enumeration<URL>)(Object) cl.getResources("extension-services.properties");
            do {
                if (!enumeration.hasMoreElements()) break;
                URL url = (URL) enumeration.nextElement();
                System.out.println(" - " + url);
                try {
                    Properties props =(Properties)(Object) NULL; //new Properties();
                    props = new Properties();
//                    MyHelperClass props = new MyHelperClass();
                    props.load((Reader)(Object)url.openStream());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (true);
        } catch (IOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}
