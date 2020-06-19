import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13720313 {
public MyHelperClass LOGGERHelper;
public MyHelperClass fs;
	public MyHelperClass CContext;
	public MyHelperClass CResourceBundle;
	public MyHelperClass name;
	public MyHelperClass hasPrintedLog4JWarning;
	public MyHelperClass CJNDIContextSetup;
	public MyHelperClass log;
	public MyHelperClass JDBCPooler;
	public MyHelperClass PropertyConfigurator;
	public MyHelperClass loadServletContextListener(){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass init(){ return null; }
	public MyHelperClass fireInitEvent(){ return null; }

    public  void CServletContextWrapper(final FileSystem fs, final String contextName)  throws Throwable {
        this.fs = fs;
        this.name =(MyHelperClass)(Object) contextName;
        CContext.getInstance().init(this);
        try {
            URL url =(URL)(Object) this.getResource("/WEB-INF/classes/log4j.properties");
            boolean ok = false;
            InputStream in = null;
            try {
                in = url.openStream();
                ok = true;
            } catch (Throwable e) {
            } finally {
                try {
                    if (in != null) in.close();
                } catch (Exception ignore) {
                }
            }
            if (ok) {
                PropertyConfigurator.configure(url);
            }
        } catch (final Throwable e) {
            if (!(Boolean)(Object)hasPrintedLog4JWarning) {
                hasPrintedLog4JWarning =(MyHelperClass)(Object) true;
                System.err.println("!!! WARNING: /WEB-INF/classes/log4j.properties missing.");
            }
        }
        this.init();
        this.loadServletContextListener();
        this.log = LOGGERHelper.getLogger(this.getClass());
        CJNDIContextSetup.init(this);
        JDBCPooler.init(this);
        CResourceBundle.registerBundles(this);
        this.fireInitEvent();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass configure(URL o0){ return null; }
	public MyHelperClass init(c13720313 o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getLogger(Class o0){ return null; }
	public MyHelperClass registerBundles(c13720313 o0){ return null; }}
