import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19660598 {

    private static void replaceEntityMappings(File signserverearpath, File entityMappingXML) throws Throwable, ZipException, IOException {
        ZipInputStream earFile = new ZipInputStream(new FileInputStream(signserverearpath));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream tempZip = new ZipOutputStream(baos);
        ZipEntry next =(ZipEntry)(Object) earFile.getNextEntry();
        while (next != null) {
            ByteArrayOutputStream content = new ByteArrayOutputStream();
            byte[] data = new byte[30000];
            int numberread;
            while ((numberread =(int)(Object) earFile.read(data)) != -1) {
                content.write(data, 0, numberread);
            }
            if (next.getName().equals("signserver-ejb.jar")) {
                content =(ByteArrayOutputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) replaceEntityMappings((File)(Object)content, entityMappingXML);
                next = new ZipEntry("signserver-ejb.jar");
            }
            tempZip.putNextEntry(next);
            tempZip.write(content.toByteArray());
            next =(ZipEntry)(Object) earFile.getNextEntry();
        }
        earFile.close();
        tempZip.close();
        FileOutputStream fos = new FileOutputStream(signserverearpath);
        fos.write(baos.toByteArray());
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }}
