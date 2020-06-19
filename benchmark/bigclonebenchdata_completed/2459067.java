import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2459067 {
public MyHelperClass log;

//    @Provides
//    @Singleton
    Properties provideCfg() {
        InputStream propStream = null;
        MyHelperClass PROPERTY_FILE = new MyHelperClass();
        URL url = Thread.currentThread().getContextClassLoader().getResource((String)(Object)PROPERTY_FILE);
        Properties cfg = new Properties();
        if (url != null) {
            try {
                MyHelperClass log = new MyHelperClass();
                log.info("Loading app config from properties: " + url.toURI());
                propStream = url.openStream();
                cfg.load(propStream);
                return cfg;
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.warn(e);
            }
        }
        if (cfg.size() < 1) {
//            MyHelperClass PROPERTY_FILE = new MyHelperClass();
            log.info(PROPERTY_FILE + " doesnt contain any configuration for application properties.");
        }
        return cfg;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(Exception o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Provides {

}

class Singleton {

}
