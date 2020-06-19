import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2084427 {
public static MyHelperClass url2file(URL o0){ return null; }
	public static MyHelperClass copyStream(InputStream o0, ByteArrayOutputStream o1, int o2){ return null; }
//public MyHelperClass copyStream(InputStream o0, ByteArrayOutputStream o1, int o2){ return null; }
//	public MyHelperClass url2file(URL o0){ return null; }

    public static InputStream getResourceInputStream(final URL url) throws IOException {
        File file =(File)(Object) url2file(url);
        if (file != null) {
            return new BufferedInputStream(new FileInputStream(file));
        }
        if (!"jar".equalsIgnoreCase(url.getProtocol())) {
            return url.openStream();
        }
        String urlStr = url.toExternalForm();
        if (urlStr.endsWith("!/")) {
            throw new FileNotFoundException(url.toExternalForm());
        }
        int p = urlStr.indexOf("!/");
        if (p == -1) {
            throw new MalformedURLException(url.toExternalForm());
        }
        String path = urlStr.substring(p + 2);
        file =(File)(Object) url2file(new URL(urlStr.substring(4, p)));
        if (file == null) {
            return url.openStream();
        }
        JarFile jarFile = new JarFile(file);
        try {
            ZipEntry entry =(ZipEntry)(Object) jarFile.getEntry(path);
            if (entry == null) {
                throw new FileNotFoundException(url.toExternalForm());
            }
            InputStream in =(InputStream)(Object) jarFile.getInputStream(entry);
            try {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                copyStream(in, out, 1024);
                return new ByteArrayInputStream(out.toByteArray());
            } finally {
                in.close();
            }
        } finally {
            jarFile.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JarFile {

JarFile(File o0){}
	JarFile(){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

}
