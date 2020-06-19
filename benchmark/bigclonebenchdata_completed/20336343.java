import java.io.*;
import java.lang.*;
import java.util.*;



class c20336343 {
public static MyHelperClass NULL;
public static MyHelperClass logger;
//	public MyHelperClass NULL;
//public MyHelperClass logger;

    public static Properties loadProperties() {
        try {
            URL url =(URL)(Object) NULL; //new URL();
            if (url == null) url =(URL)(Object) ClassLoader.getSystemResource("application.properties");
//            MyHelperClass url = new MyHelperClass();
            if (url == null) throw new FileNotFoundException("application.properties");
            Properties props =(Properties)(Object) NULL; //new Properties();
            props = new Properties();
//            MyHelperClass url = new MyHelperClass();
            props.load((Reader)(Object)url.openStream());
            Enumeration e = System.getProperties().propertyNames();
            String key;
            while (e.hasMoreElements()) {
                key = (String) e.nextElement();
//                MyHelperClass props = new MyHelperClass();
                props.setProperty(key, System.getProperty(key));
            }
//            MyHelperClass props = new MyHelperClass();
            return (Properties)(Object)props;
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, e.toString(), e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass setProperty(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
