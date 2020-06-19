import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8344806 {
public MyHelperClass MANIFEST_FILE_NAME;
public MyHelperClass zipFile;
	public MyHelperClass destDirectory;
	public MyHelperClass manifestFile;
	public MyHelperClass zipInputStream;
	public MyHelperClass BUFFER_SIZE;
	public MyHelperClass delete(File o0){ return null; }

    public void unpack(File destDirectory, boolean delete)  throws Throwable {
        if (delete) delete(destDirectory);
        if (destDirectory.exists()) throw new ContentPackageException("Destination directory already exists.");
        this.destDirectory =(MyHelperClass)(Object) destDirectory;
        this.manifestFile =(MyHelperClass)(Object) new File((String)(Object)destDirectory,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) MANIFEST_FILE_NAME);
        try {
            if (zipInputStream == null) zipInputStream =(MyHelperClass)(Object) new ZipInputStream(new FileInputStream((String)(Object)zipFile));
            ZipEntry zipEntry;
            while ((zipEntry =(ZipEntry)(Object) zipInputStream.getNextEntry()) != null) {
                File destFile = new File((String)(Object)destDirectory,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) zipEntry.getName());
                destFile.getParentFile().mkdirs();
                if (!(Boolean)(Object)zipEntry.isDirectory()) {
                    BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(destFile),(int)(Object) BUFFER_SIZE);
                    byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
                    int length;
                    while ((length =(int)(Object) zipInputStream.read(buffer, 0, BUFFER_SIZE)) != -1) output.write(buffer, 0, length);
                    output.close();
                    zipInputStream.closeEntry();
                }
            }
            zipInputStream.close();
        } catch (IOException ex) {
            throw new ContentPackageException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class ContentPackageException extends Exception{
	public ContentPackageException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
