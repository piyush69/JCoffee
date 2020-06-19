import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5826730 {

    private void copyFromZip(File zipFile) throws Throwable, GLMRessourceManagerException {
        if (zipFile == null) throw new GLMRessourceZIPException((String)(Object)1);
        if (!zipFile.exists()) throw new GLMRessourceZIPException((String)(Object)2);
        int len = 0;
        MyHelperClass ContentManager = new MyHelperClass();
        byte[] buffer =(byte[])(Object) ContentManager.getDefaultBuffer();
        try {
            ZipInputStream zip_in = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFile)));
            ZipEntry zipEntry;
            File rootDir = null;
            while ((zipEntry =(ZipEntry)(Object) zip_in.getNextEntry()) != null) {
                MyHelperClass tempDirectory = new MyHelperClass();
                File destFile = new File((String)(Object)tempDirectory,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) zipEntry.getName());
                if (rootDir == null) rootDir = destFile.getParentFile();
                if (!(Boolean)(Object)zipEntry.isDirectory() && destFile.getParentFile().equals(rootDir)) {
//                    MyHelperClass ContentManager = new MyHelperClass();
                    if (!zipEntry.getName().equals(ContentManager.IMS_MANIFEST_FILENAME)) {
//                        MyHelperClass tempDirectory = new MyHelperClass();
                        FileOutputStream file_out = new FileOutputStream(new File((String)(Object)tempDirectory,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) zipEntry.getName()));
                        while ((len =(int)(Object) zip_in.read(buffer)) > 0) file_out.write(buffer, 0, len);
                        file_out.flush();
                        file_out.close();
                    }
                }
            }
            zip_in.close();
        } catch (Exception e) {
            throw new GLMRessourceZIPException((String)(Object)3);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMS_MANIFEST_FILENAME;
public MyHelperClass getDefaultBuffer(){ return null; }}

class GLMRessourceManagerException extends Exception{
	public GLMRessourceManagerException(String errorMessage) { super(errorMessage); }
}

class GLMRessourceZIPException extends Exception{
	public GLMRessourceZIPException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(BufferedInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
