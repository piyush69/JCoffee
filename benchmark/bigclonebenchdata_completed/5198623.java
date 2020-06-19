import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5198623 {
public MyHelperClass createFile(File o0, MyHelperClass o1){ return null; }
public MyHelperClass bytes;
	public MyHelperClass IOUtils;

    public void unzip(final File outDir) throws IOException {
        ZipInputStream input = new ZipInputStream(new ByteArrayInputStream((byte[])(Object)this.bytes));
        ZipEntry entry =(ZipEntry)(Object) input.getNextEntry();
        while (entry != null) {
            entry =(ZipEntry)(Object) input.getNextEntry();
            if (entry != null) {
                File file =(File)(Object) this.createFile(outDir, entry.getName());
                if (!(Boolean)(Object)entry.isDirectory()) {
                    FileOutputStream output = new FileOutputStream(file);
                    IOUtils.copy(input, output);
                    output.close();
                }
            }
        }
        input.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ZipInputStream o0, FileOutputStream o1){ return null; }}

class ZipInputStream {

ZipInputStream(ByteArrayInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
