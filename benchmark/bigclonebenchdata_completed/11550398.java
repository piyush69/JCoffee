import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11550398 {
public MyHelperClass ILogTypes;

    private void loadDefaultDrivers()  throws Throwable {
        MyHelperClass _app = new MyHelperClass();
        final URL url =(URL)(Object) _app.getResources().getDefaultDriversUrl();
        try {
            InputStreamReader isr = new InputStreamReader(url.openStream());
            try {
                MyHelperClass _cache = new MyHelperClass();
                _cache.load(isr);
            } finally {
                isr.close();
            }
        } catch (Exception ex) {
//            MyHelperClass _app = new MyHelperClass();
            final Logger logger =(Logger)(Object) _app.getLogger();
            logger.showMessage(ILogTypes.ERROR, "Error loading default driver file: " + url != null ? url.toExternalForm() : "");
            logger.showMessage(ILogTypes.ERROR, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass getDefaultDriversUrl(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass load(InputStreamReader o0){ return null; }
	public MyHelperClass getResources(){ return null; }}

class Logger {

public MyHelperClass showMessage(MyHelperClass o0, Exception o1){ return null; }}
