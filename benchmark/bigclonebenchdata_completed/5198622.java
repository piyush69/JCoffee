import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5198622 {
public MyHelperClass files;
	public MyHelperClass IOUtils;
	public MyHelperClass bytes;

    public byte[] getFile(final String file) throws IOException {
        if ((boolean)(Object)this.files.contains(file)) {
            ZipInputStream input = new ZipInputStream(new ByteArrayInputStream((byte[])(Object)this.bytes));
            ZipEntry entry =(ZipEntry)(Object) input.getNextEntry();
            while (entry != null) {
                entry =(ZipEntry)(Object) input.getNextEntry();
                if ((entry.getName().equals(file)) && (!(Boolean)(Object)entry.isDirectory())) {
                    ByteArrayOutputStream output = new ByteArrayOutputStream();
                    IOUtils.copy(input, output);
                    output.close();
                    input.close();
                    return output.toByteArray();
                }
            }
            input.close();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass copy(ZipInputStream o0, ByteArrayOutputStream o1){ return null; }}

class ZipInputStream {

ZipInputStream(ByteArrayInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
