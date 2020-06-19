import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10750170 {
public MyHelperClass _properties;

    private  void PropertiesLoader(String masterFileLocation, String extraFileLocation) throws Throwable, IOException {
        List propertiesList = new ArrayList();
        ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            InputStream is = classLoader.getResourceAsStream(masterFileLocation);
            Properties p = new Properties();
            p.load(is);
            is.close();
            propertiesList.add(p);
        } catch (IOException ioex) {
            IOException ex = new IOException("could not load ROME master plugins file [" + masterFileLocation + "], " + ioex.getMessage());
            ex.setStackTrace(ioex.getStackTrace());
            throw ex;
        }
        Enumeration urls = classLoader.getResources(extraFileLocation);
        while (urls.hasMoreElements()) {
            URL url = (URL) urls.nextElement();
            Properties p = new Properties();
            try {
                InputStream is = url.openStream();
                p.load(is);
                is.close();
            } catch (IOException ioex) {
                IOException ex = new IOException("could not load ROME extensions plugins file [" + url.toString() + "], " + ioex.getMessage());
                ex.setStackTrace(ioex.getStackTrace());
                throw ex;
            }
            propertiesList.add(p);
        }
        _properties =(MyHelperClass)(Object) new Properties[propertiesList.size()];
        propertiesList.toArray((Object[])(Object)_properties);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
