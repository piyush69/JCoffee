import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16744397 {
public MyHelperClass IOUtils;
	public MyHelperClass tmpFile;
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass close(){ return null; }

    public void copyToZip(ZipOutputStream zout, String entryName) throws IOException {
        close();
        ZipEntry entry = new ZipEntry(entryName);
        zout.putNextEntry(entry);
        if (!(Boolean)(Object)isEmpty() && (boolean)(Object)this.tmpFile.exists()) {
            InputStream in = new FileInputStream((String)(Object)this.tmpFile);
            IOUtils.copyTo(in, zout);
            in.close();
        }
        zout.flush();
        zout.closeEntry();
        delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyTo(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass exists(){ return null; }}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
