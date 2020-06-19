import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22492282 {

    public static boolean isODF(URL url) throws Throwable, IOException {
        MyHelperClass ODFUtil = new MyHelperClass();
        InputStream resStream =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ODFUtil.findDataInputStream(url.openStream(), ODFUtil.MIMETYPE_FILE);
        if (null == resStream) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("mimetype stream not found in ODF package");
            return false;
        }
        MyHelperClass IOUtils = new MyHelperClass();
        String mimetypeContent = IOUtils.toString(resStream);
//        MyHelperClass ODFUtil = new MyHelperClass();
        return mimetypeContent.startsWith((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)ODFUtil.MIMETYPE_START);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MIMETYPE_FILE;
	public MyHelperClass MIMETYPE_START;
public MyHelperClass findDataInputStream(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
