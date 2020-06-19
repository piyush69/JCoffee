import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13868519 {

    public static void addClasses(URL url)  throws Throwable {
        BufferedReader reader = null;
        String line;
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if ((line.length() == 0) || line.startsWith(";")) {
                    continue;
                }
                try {
                    MyHelperClass classes = new MyHelperClass();
                    classes.add(Class.forName(line, true, cl));
                } catch (Throwable t) {
                }
            }
        } catch (Throwable t) {
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Throwable t) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Class o0){ return null; }}
