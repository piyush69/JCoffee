import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19979783 {
public static MyHelperClass ArgoWriter;
	public static MyHelperClass XMI_EXT;
//public MyHelperClass ArgoWriter;
//	public MyHelperClass XMI_EXT;

    public static void writeEntry(File file, File input) throws Throwable, PersistenceException {
        try {
            MyHelperClass ARGOUML_EXT = new MyHelperClass();
            File temporaryFile = File.createTempFile("pmMDA_zargo",(String)(Object) ARGOUML_EXT);
            temporaryFile.deleteOnExit();
            ZipOutputStream output = new ZipOutputStream(new FileOutputStream(temporaryFile));
            FileInputStream inputStream = new FileInputStream(input);
//            MyHelperClass ARGOUML_EXT = new MyHelperClass();
            ZipEntry entry = new ZipEntry((ZipEntry)(Object)(int)(Object)(ZipEntry)(Object)(int)(Object)(ZipEntry)(Object)file.getName().substring(0, file.getName().indexOf((int)(Object)ARGOUML_EXT)) + (int)(Object)(ZipEntry)(Object)XMI_EXT);
            output.putNextEntry(new ZipEntry(entry));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, output);
            output.closeEntry();
            inputStream.close();
//            MyHelperClass ARGOUML_EXT = new MyHelperClass();
            entry = new ZipEntry((ZipEntry)(Object)(ZipEntry)(Object)(ZipEntry)(Object)(ZipEntry)(Object)(ZipEntry)(Object)(ZipEntry)(Object)(ZipEntry)(Object)(ZipEntry)(Object)file.getName().substring(0, file.getName().indexOf((int)(Object)ARGOUML_EXT)) + ".argo");
            output.putNextEntry(new ZipEntry(entry));
//            MyHelperClass ARGOUML_EXT = new MyHelperClass();
            output.write(ArgoWriter.getArgoContent(file.getName().substring(0, file.getName().indexOf((int)(Object)ARGOUML_EXT)) + XMI_EXT).getBytes());
            output.closeEntry();
            output.close();
            temporaryFile.renameTo(file);
        } catch (IOException ioe) {
            throw new PersistenceException((String)(Object)ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass getArgoContent(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(ZipEntry o0){}
	ZipEntry(){}}
