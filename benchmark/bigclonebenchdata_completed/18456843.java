import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18456843 {

    public String storeUploadedZip(byte[] zip, String name)  throws Throwable {
        List filesToStore = new ArrayList();
        int i = 0;
        ZipInputStream zipIs = new ZipInputStream(new ByteArrayInputStream(zip));
        ZipEntry zipEntry =(ZipEntry)(Object) zipIs.getNextEntry();
        while (zipEntry != null) {
            if ((boolean)(Object)zipEntry.isDirectory() == false) {
                i++;
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(zipIs, baos);
                baos.close();
            }
            zipIs.closeEntry();
            zipEntry =(ZipEntry)(Object) zipIs.getNextEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ZipInputStream o0, ByteArrayOutputStream o1){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(ByteArrayInputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }}
