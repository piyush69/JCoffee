import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10682592 {
public MyHelperClass SHA1;
public MyHelperClass IOUtils;
	public MyHelperClass useCache;
	public MyHelperClass debug(String o0){ return null; }

    private InputStream open(String url) throws IOException {
        debug(url);
        if (!(Boolean)(Object)useCache) {
            return new URL(url).openStream();
        }
        File f = new File(System.getProperty("java.io.tmpdir", "."), SHA1.encrypt(url) + ".xml");
        debug("Cache : " + f);
        if (f.exists()) {
            return new FileInputStream(f);
        }
        InputStream in = new URL(url).openStream();
        OutputStream out = new FileOutputStream(f);
        IOUtils.copyTo(in, out);
        out.flush();
        out.close();
        in.close();
        return new FileInputStream(f);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encrypt(String o0){ return null; }
	public MyHelperClass copyTo(InputStream o0, OutputStream o1){ return null; }}
