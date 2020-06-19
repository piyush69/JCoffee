import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14488295 {
public static MyHelperClass NULL;
	public static MyHelperClass interpolate(String o0, MyHelperClass o1, int o2){ return null; }
//public MyHelperClass NULL;
//	public MyHelperClass interpolate(String o0, MyHelperClass o1, int o2){ return null; }
public static MyHelperClass log;
	public static MyHelperClass license;
//public MyHelperClass log;
//	public MyHelperClass license;
	public MyHelperClass getProperty(String o0){ return null; }

    public static synchronized void loadConfig(String configFile)  throws Throwable {
        MyHelperClass properties = new MyHelperClass();
        if (properties != null) {
            return;
        }
        URL url = null;
        InputStream is = null;
        try {
            String configProperty = null;
            try {
                configProperty = System.getProperty("dspace.configuration");
            } catch (SecurityException se) {
                MyHelperClass log = new MyHelperClass();
                log.warn("Unable to access system properties, ignoring.", se);
            }
            MyHelperClass loadedFile = new MyHelperClass();
            if (loadedFile != null) {
//                MyHelperClass loadedFile = new MyHelperClass();
                log.info("Reloading current config file: " + loadedFile.getAbsolutePath());
//                MyHelperClass loadedFile = new MyHelperClass();
                url =(URL)(Object) loadedFile.toURI().toURL();
            } else if (configFile != null) {
                MyHelperClass log = new MyHelperClass();
                log.info("Loading provided config file: " + configFile);
//                MyHelperClass loadedFile = new MyHelperClass();
                loadedFile =(MyHelperClass)(Object) new File(configFile);
//                MyHelperClass loadedFile = new MyHelperClass();
                url =(URL)(Object) loadedFile.toURI().toURL();
            } else if (configProperty != null) {
                MyHelperClass log = new MyHelperClass();
                log.info("Loading system provided config property (-Ddspace.configuration): " + configProperty);
//                MyHelperClass loadedFile = new MyHelperClass();
                loadedFile =(MyHelperClass)(Object) new File(configProperty);
//                MyHelperClass loadedFile = new MyHelperClass();
                url =(URL)(Object) loadedFile.toURI().toURL();
            } else {
                url = ConfigurationManager.class.getResource("/dspace.cfg");
                if (url != null) {
                    MyHelperClass log = new MyHelperClass();
                    log.info("Loading from classloader: " + url);
//                    MyHelperClass loadedFile = new MyHelperClass();
                    loadedFile =(MyHelperClass)(Object) new File(url.getPath());
                }
            }
            if (url == null) {
                MyHelperClass log = new MyHelperClass();
                log.fatal("Cannot find dspace.cfg");
                throw new IllegalStateException("Cannot find dspace.cfg");
            } else {
//                MyHelperClass properties = new MyHelperClass();
                properties =(MyHelperClass)(Object) new Properties();
                HashMap<String,Properties> moduleProps =(HashMap<String,Properties>)(Object) NULL; //new HashMap<String,Properties>();
                moduleProps = new HashMap<String, Properties>();
                is = url.openStream();
//                MyHelperClass properties = new MyHelperClass();
                properties.load(is);
//                MyHelperClass properties = new MyHelperClass();
                for (Enumeration<?> pe =(Enumeration<?>)(Object) properties.propertyNames(); pe.hasMoreElements(); ) {
                    String key = (String) pe.nextElement();
//                    MyHelperClass properties = new MyHelperClass();
                    String value =(String)(Object) interpolate(key, properties.getProperty(key), 1);
                    if (value != null) {
//                        MyHelperClass properties = new MyHelperClass();
                        properties.setProperty(key, value);
                    }
                }
            }
        } catch (IOException e) {
            MyHelperClass log = new MyHelperClass();
            log.fatal("Can't load configuration: " + url, e);
            throw new IllegalStateException("Cannot load configuration: " + url, e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ioe) {
                }
            }
        }
        File licenseFile = new File(getProperty("dspace.dir") + File.separator + "config" + File.separator + "default.license");
        FileInputStream fir = null;
        InputStreamReader ir = null;
        BufferedReader br = null;
        try {
            fir = new FileInputStream(licenseFile);
            ir = new InputStreamReader(fir, "UTF-8");
            br = new BufferedReader(ir);
            String lineIn;
            license =(MyHelperClass)(Object) "";
            while ((lineIn = br.readLine()) != null) {
                license =(int)(Object) license +(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) lineIn + '\n';
            }
            br.close();
        } catch (IOException e) {
            log.fatal("Can't load license: " + licenseFile.toString(), e);
            throw new IllegalStateException("Cannot load license: " + licenseFile.toString(), e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ioe) {
                }
            }
            if (ir != null) {
                try {
                    ir.close();
                } catch (IOException ioe) {
                }
            }
            if (fir != null) {
                try {
                    fir.close();
                } catch (IOException ioe) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setProperty(String o0, String o1){ return null; }
	public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass fatal(String o0, IOException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass warn(String o0, SecurityException o1){ return null; }
	public MyHelperClass propertyNames(){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public static MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass toURI(){ return null; }}

class ConfigurationManager {

}
