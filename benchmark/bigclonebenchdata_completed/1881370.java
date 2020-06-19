import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1881370 {
public MyHelperClass inJar;
	public MyHelperClass Debug;
	public MyHelperClass getClassResourceUrl(Class o0, String o1){ return null; }

    public InputStream getFileStream(String filePath)  throws Throwable {
        if ((boolean)(Object)this.inJar) {
            try {
                URL url =(URL)(Object) getClassResourceUrl(this.getClass(), filePath);
                if (url != null) {
                    return url.openStream();
                }
            } catch (IOException ioe) {
                Debug.signal(Debug.ERROR, this, ioe);
            }
        } else {
            try {
                return new FileInputStream(filePath);
            } catch (FileNotFoundException fe) {
                Debug.signal(Debug.ERROR, this, fe);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass signal(MyHelperClass o0, c1881370 o1, IOException o2){ return null; }
	public MyHelperClass signal(MyHelperClass o0, c1881370 o1, FileNotFoundException o2){ return null; }}
