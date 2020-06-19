import java.io.*;
import java.lang.*;
import java.util.*;



class c17522011 {
public static MyHelperClass StringPool;
	public static MyHelperClass read(InputStream o0){ return null; }
//public MyHelperClass StringPool;
//	public MyHelperClass read(InputStream o0){ return null; }

    public static String read(ClassLoader classLoader, String name, boolean all) throws IOException {
        if (all) {
            StringMaker sm = new StringMaker();
            Enumeration enu = classLoader.getResources(name);
            while (enu.hasMoreElements()) {
                URL url = (URL) enu.nextElement();
                InputStream is =(InputStream)(Object) url.openStream();
                String s =(String)(Object) read(is);
                if (s != null) {
                    sm.append(s);
                    sm.append((String)(Object)StringPool.NEW_LINE);
                }
                is.close();
            }
            return sm.toString().trim();
        } else {
            InputStream is = classLoader.getResourceAsStream(name);
            String s =(String)(Object) read(is);
            is.close();
            return s;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NEW_LINE;
}

class StringMaker {

public MyHelperClass append(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
