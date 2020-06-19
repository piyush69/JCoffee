import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c576704 {
public MyHelperClass read(InputStream o0){ return null; }

    void testFileObject(JavaFileObject fo) throws Exception {
        URI uri =(URI)(Object) fo.toUri();
        System.err.println("uri: " + uri);
        URLConnection urlconn = uri.toURL().openConnection();
        if (urlconn instanceof JarURLConnection) {
            JarURLConnection jarconn = (JarURLConnection) urlconn;
            File f = new File(jarconn.getJarFile().getName());
            MyHelperClass foundJars = new MyHelperClass();
            foundJars.add(f.getName());
        }
        try {
            byte[] uriData =(byte[])(Object) read(urlconn.getInputStream());
            byte[] foData =(byte[])(Object) read((InputStream)(Object)fo.openInputStream());
            if (!Arrays.equals(uriData, foData)) {
                if (uriData.length != foData.length) throw new Exception("data size differs: uri data " + uriData.length + " bytes, fo data " + foData.length + " bytes");
                for (int i = 0; i < uriData.length; i++) {
                    if (uriData[i] != foData[i]) throw new Exception("unexpected data returned at offset " + i + ", uri data " + uriData[i] + ", fo data " + foData[i]);
                }
                throw new AssertionError("cannot find difference");
            }
        } finally {
            if (urlconn instanceof JarURLConnection) {
                JarURLConnection jarconn = (JarURLConnection) urlconn;
                jarconn.getJarFile().close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }}

class JavaFileObject {

public MyHelperClass toUri(){ return null; }
	public MyHelperClass openInputStream(){ return null; }}
