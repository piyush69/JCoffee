import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10251387 {
public MyHelperClass IOUtils;
	public MyHelperClass targetOutputStream;
	public MyHelperClass LOG;
	public MyHelperClass originalZipFile;
	public MyHelperClass ODFUtil;
	public MyHelperClass toByteArray(){ return null; }

//    @Override
    public void close() throws IOException {
        this.close();
        byte[] signatureData =(byte[])(Object) toByteArray();
        ZipOutputStream zipOutputStream = new ZipOutputStream(this.targetOutputStream);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream((String)(Object)this.originalZipFile));
        ZipEntry zipEntry;
        while (null != (zipEntry =(ZipEntry)(Object) zipInputStream.getNextEntry())) {
            if (!zipEntry.getName().equals(ODFUtil.SIGNATURE_FILE)) {
                ZipEntry newZipEntry = new ZipEntry(zipEntry.getName());
                zipOutputStream.putNextEntry(newZipEntry);
                LOG.debug("copying " + zipEntry.getName());
                IOUtils.copy(zipInputStream, zipOutputStream);
            }
        }
        zipInputStream.close();
        zipEntry = new ZipEntry(ODFUtil.SIGNATURE_FILE);
        LOG.debug("writing " + zipEntry.getName());
        zipOutputStream.putNextEntry(zipEntry);
        IOUtils.write(signatureData, zipOutputStream);
        zipOutputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SIGNATURE_FILE;
public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(ZipInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass write(byte[] o0, ZipOutputStream o1){ return null; }}

class ZipOutputStream {

ZipOutputStream(MyHelperClass o0){}
	ZipOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }}
