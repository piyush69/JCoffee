import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9714373 {
public MyHelperClass properties;
	public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass warning(String o0, IOException o1){ return null; }

    private void loadOverrideProperties(String uri)  throws Throwable {
        try {
            File f = new File(uri);
            Properties temp = new Properties();
            if (f.exists()) {
                info("Found config override file " + f.getAbsolutePath());
                try {
                    InputStream readStream = new BufferedInputStream(new FileInputStream(f));
                    try {
                        temp.load(readStream);
                    } finally {
                        readStream.close();
                    }
                } catch (IOException iex) {
                    warning("Error while loading override properties file; skipping.", iex);
                    return;
                }
            } else {
                InputStream in = null;
                try {
                    URL url = new URL(uri);
                    in = new BufferedInputStream(url.openStream());
                    info("Found config override URI " + uri);
                    temp.load(in);
                } catch (MalformedURLException e) {
                    warning("URI for override properties is malformed, skipping: " + uri);
                    return;
                } catch (IOException e) {
                    warning("Overridden properties could not be loaded from URI: " + uri, e);
                    return;
                } finally {
                    if (in != null) try {
                        in.close();
                    } catch (IOException e) {
                    }
                }
            }
            Enumeration elem =(Enumeration)(Object) this.properties.keys();
            List lp = Collections.list(elem);
            Collections.sort(lp);
            Iterator iter = lp.iterator();
            int cnt = 0;
            while (iter.hasNext()) {
                String key = (String) iter.next();
                String val = temp.getProperty(key);
                if (val != null) {
                    this.properties.setProperty(key, val);
                    finer("  " + key + " -> " + val);
                    cnt++;
                }
            }
            finer("Configuration: " + cnt + " properties overridden from secondary properties file.");
            Enumeration allRead = temp.keys();
            List ap = Collections.list(allRead);
            Collections.sort(ap);
            iter = ap.iterator();
            cnt = 0;
            while (iter.hasNext()) {
                String key = (String) iter.next();
                String val = temp.getProperty(key);
                if (val != null) {
                    this.properties.setProperty(key, val);
                    finer("  (+)" + key + " -> " + val);
                    cnt++;
                }
            }
            finer("Configuration: " + cnt + " properties added from secondary properties file.");
        } catch (SecurityException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass keys(){ return null; }
	public MyHelperClass setProperty(String o0, String o1){ return null; }}
