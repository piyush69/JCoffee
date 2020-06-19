import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10384641 {
public MyHelperClass pssTracker;
	public MyHelperClass Activator;
	public MyHelperClass fail(String o0){ return null; }

    protected void setUp() throws Throwable, Exception {
        this.setUp();
        MyHelperClass bundles = new MyHelperClass();
        bundles = Activator.bundleContext.getBundles();
        MyHelperClass bundles = new MyHelperClass();
        for (int i = 0; i < bundles.length; ++i) {
            MyHelperClass bundles = new MyHelperClass();
            if (bundles[i] != null) {
                MyHelperClass bundles = new MyHelperClass();
                if ((bundles[i].getSymbolicName() == null) || (!bundles[i].getSymbolicName().startsWith(PSS))) {
                    MyHelperClass bundles = new MyHelperClass();
                    bundles[i] = null;
                }
            }
        }
        MyHelperClass checklist = new MyHelperClass();
        checklist = new Properties();
        try {
            MyHelperClass CHECK_FILE = new MyHelperClass();
            URL url = Activator.bundleContext.getBundle().getResource(CHECK_FILE);
            InputStream is = new BufferedInputStream(url.openStream());
            MyHelperClass checklist = new MyHelperClass();
            checklist.load(is);
            is.close();
        } catch (FileNotFoundException fe) {
            fail("Failed to find service checklist file");
        } catch (IOException e) {
            fail("Failed to load service checklist file");
        }
        if (pssTracker == null) {
            pssTracker = new ServiceTracker(Activator.bundleContext, IPssManager.class.getName(), null);
        }
        pssTracker.open();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ServiceTracker {

}

class IPssManager {

}
