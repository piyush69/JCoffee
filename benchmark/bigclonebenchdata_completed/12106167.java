import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12106167 {

    public static void init(Locale lng)  throws Throwable {
        try {
            MyHelperClass DEFAULT_LOCALE = new MyHelperClass();
            Locale toLoad = lng != null ? lng : DEFAULT_LOCALE;
            URL url = ClassLoader.getSystemResource("locales/" + toLoad.getISO3Language() + ".properties");
            if (url == null) {
//                MyHelperClass DEFAULT_LOCALE = new MyHelperClass();
                url = ClassLoader.getSystemResource("locales/" + DEFAULT_LOCALE.getISO3Language() + ".properties");
            }
            MyHelperClass PROPS = new MyHelperClass();
            PROPS.clear();
//            MyHelperClass PROPS = new MyHelperClass();
            PROPS.load(url.openStream());
        } catch (IOException ioe) {
            try {
                MyHelperClass DEFAULT_LOCALE = new MyHelperClass();
                URL url = ClassLoader.getSystemResource("locales/" + DEFAULT_LOCALE.getISO3Language() + ".properties");
                MyHelperClass PROPS = new MyHelperClass();
                PROPS.clear();
//                MyHelperClass PROPS = new MyHelperClass();
                PROPS.load(url.openStream());
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(99);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(99);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass getISO3Language(){ return null; }}
