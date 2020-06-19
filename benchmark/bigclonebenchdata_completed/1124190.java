import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1124190 {
public MyHelperClass PropertiesUtil;
	public MyHelperClass _props;
	public MyHelperClass SYSTEM_PROPERTIES_FINAL;
	public MyHelperClass Validator;
	public MyHelperClass SYSTEM_PROPERTIES_LOAD;
	public MyHelperClass GetterUtil;

    private  void SystemProperties()  throws Throwable {
        Properties p = new Properties();
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            URL url = classLoader.getResource("system.properties");
            if (url != null) {
                InputStream is = url.openStream();
                p.load(is);
                is.close();
                System.out.println("Loading " + url);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            URL url = classLoader.getResource("system-ext.properties");
            if (url != null) {
                InputStream is = url.openStream();
                p.load(is);
                is.close();
                System.out.println("Loading " + url);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean systemPropertiesLoad =(boolean)(Object) GetterUtil.get(System.getProperty((String)(Object)SYSTEM_PROPERTIES_LOAD), true);
        boolean systemPropertiesFinal =(boolean)(Object) GetterUtil.get(System.getProperty((String)(Object)SYSTEM_PROPERTIES_FINAL), true);
        if (systemPropertiesLoad) {
            Enumeration enu = p.propertyNames();
            while (enu.hasMoreElements()) {
                String key = (String) enu.nextElement();
                if (systemPropertiesFinal || (boolean)(Object)Validator.isNull(System.getProperty(key))) {
                    System.setProperty(key, (String) p.get(key));
                }
            }
        }
        PropertiesUtil.fromProperties(p, _props);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fromProperties(Properties o0, MyHelperClass o1){ return null; }
	public MyHelperClass isNull(String o0){ return null; }
	public MyHelperClass get(String o0, boolean o1){ return null; }}
