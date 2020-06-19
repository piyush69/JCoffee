import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3942117 {
public MyHelperClass XPontusConstantsIF;
	public MyHelperClass IOUtils;
	public MyHelperClass MimetypesFileTypeMap;
	public MyHelperClass FileUtils;
	public MyHelperClass provider;

    private  void MimeTypesProvider()  throws Throwable {
        File mimeTypesFile = new File((String)(Object)XPontusConstantsIF.XPONTUS_HOME_DIR, "mimes.properties");
        try {
            if (!mimeTypesFile.exists()) {
                OutputStream os = null;
                InputStream is = getClass().getResourceAsStream("/net/sf/xpontus/configuration/mimetypes.properties");
                os =(OutputStream)(Object) FileUtils.openOutputStream(mimeTypesFile);
                IOUtils.copy(is, os);
                IOUtils.closeQuietly(is);
                IOUtils.closeQuietly(os);
            }
            provider =(MyHelperClass)(Object) new XPontusMimetypesFileTypeMap(mimeTypesFile.getAbsolutePath());
            MimetypesFileTypeMap.setDefaultFileTypeMap(provider);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XPONTUS_HOME_DIR;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass setDefaultFileTypeMap(MyHelperClass o0){ return null; }}

class XPontusMimetypesFileTypeMap {

XPontusMimetypesFileTypeMap(String o0){}
	XPontusMimetypesFileTypeMap(){}}
