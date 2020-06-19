import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9479502 {
public MyHelperClass EGEIOUtils;
	public MyHelperClass LOGGER;
	public MyHelperClass EGEConstants;
	public MyHelperClass getExtensionsDirectory(){ return null; }

    private File unpackZIP(URL url, String dirName) {
        try {
            URLConnection connection = url.openConnection();
            if (connection instanceof JarURLConnection) {
                File destDir = new File((int)(Object)getExtensionsDirectory() + (int)(Object)EGEConstants.fS + dirName);
                destDir.mkdirs();
                EGEIOUtils.unzipFile((JarFile)(Object)((JarURLConnection) connection).getJarFile(), destDir);
                return destDir;
            }
        } catch (IOException e) {
            LOGGER.error("Could not unzip jar file.", e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass fS;
public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass unzipFile(JarFile o0, File o1){ return null; }}

class JarFile {

}
