import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3621718 {
public MyHelperClass url;
	public MyHelperClass file;
	public MyHelperClass cached;

    public void initURL(URL url, boolean cache) throws Throwable, IOException {
        this.url =(MyHelperClass)(Object) url;
        if (cache) {
            System.out.println(getClass().getName() + ": caching '" + url + "'");
            InputStream urlIS = new BufferedInputStream(url.openStream(), 1024 * 30);
            file =(MyHelperClass)(Object) File.createTempFile("_dss_", "_dss_");
            file.deleteOnExit();
            OutputStream cachedOS = new BufferedOutputStream(new FileOutputStream((String)(Object)file), 1024 * 30);
            byte[] buf = new byte[1024 * 4];
            long cachedBytesCount = 0;
            int count = 0;
            while ((count = urlIS.read(buf)) > 0) {
                cachedOS.write(buf, 0, count);
                cachedBytesCount += count;
            }
            urlIS.close();
            cachedOS.flush();
            cachedOS.close();
            this.cached =(MyHelperClass)(Object) true;
            System.out.println(getClass().getName() + ": cached " + cachedBytesCount + " bytes into '" + file.getAbsolutePath() + "'");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}
