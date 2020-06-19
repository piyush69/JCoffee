import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7020500 {
public static MyHelperClass createTempFile(String o0, InputStream o1, File o2){ return null; }
//public MyHelperClass createTempFile(String o0, InputStream o1, File o2){ return null; }

    public static URL[] getURLsForAllJars(URL url, File tmpDir) {
        FileInputStream fin = null;
        InputStream in = null;
        ZipInputStream zin = null;
        try {
            ArrayList array = new ArrayList();
            in = url.openStream();
            String fileName = url.getFile();
            int index = fileName.lastIndexOf('/');
            if (index != -1) {
                fileName = fileName.substring(index + 1);
            }
            final File f =(File)(Object) createTempFile(fileName, in, tmpDir);
            fin = (FileInputStream) AccessController.doPrivileged(new PrivilegedExceptionAction() {

                public Object run() throws FileNotFoundException {
                    return new FileInputStream(f);
                }
            });
            array.add(f.toURL());
            zin = new ZipInputStream(fin);
            ZipEntry entry;
            String entryName;
            while ((entry =(ZipEntry)(Object) zin.getNextEntry()) != null) {
                entryName =(String)(Object) entry.getName();
                if ((entryName != null) && entryName.toLowerCase().startsWith("lib/") && entryName.toLowerCase().endsWith(".jar")) {
                    String suffix = entryName.substring(4);
                    File f2 =(File)(Object) createTempFile(suffix,(InputStream)(Object) zin, tmpDir);
                    array.add(f2.toURL());
                }
            }
            return (URL[]) array.toArray(new URL[array.size()]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (zin != null) {
                try {
                    zin.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
