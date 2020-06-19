import java.io.*;
import java.lang.*;
import java.util.*;



class c5609518 {
public MyHelperClass classloader;
	public MyHelperClass logger;

    private void init() {
        MyHelperClass cachedProperties = new MyHelperClass();
        synchronized (cachedProperties) {
            MyHelperClass firstTime = new MyHelperClass();
            if ((boolean)(Object)firstTime) {
                try {
                    Enumeration<URL> configFiles;
                    MyHelperClass CONFIG_LOCATION = new MyHelperClass();
                    configFiles =(Enumeration<URL>)(Object) classloader.getResources(CONFIG_LOCATION);
                    if (configFiles == null) {
//                        MyHelperClass CONFIG_LOCATION = new MyHelperClass();
                        logger.info("No configuration file ({}) found in the classpath.",(URL)(Object) CONFIG_LOCATION);
                        return;
                    }
//                    MyHelperClass firstTime = new MyHelperClass();
                    firstTime =(MyHelperClass)(Object) false;
                    boolean alreadyLoaded = false;
                    while (configFiles.hasMoreElements()) {
                        final URL url = configFiles.nextElement();
                        if (!alreadyLoaded) {
                            final InputStream is =(InputStream)(Object) url.openStream();
//                            MyHelperClass cachedProperties = new MyHelperClass();
                            cachedProperties.load(is);
                            is.close();
                            MyHelperClass logger = new MyHelperClass();
                            logger.info("XmlFieldFactory configuration loaded from the file {}", url);
                        } else {
                            MyHelperClass logger = new MyHelperClass();
                            logger.info("An other XmlFieldFactory configuration file is found in the classpath. This file won't be loaded {}", url);
                        }
                    }
                } catch (IOException e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("An error occur during the XmlFieldFActory initialization", e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResources(MyHelperClass o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass info(String o0, URL o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
