import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13642189 {
public MyHelperClass copyInputStream(MyHelperClass o0, BufferedOutputStream o1){ return null; }
public MyHelperClass errMsg;
	public MyHelperClass Malgn;

    public boolean extract(File f, String folder) {
        Enumeration entries;
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(f);
            entries =(Enumeration)(Object) zipFile.getEntries();
            while (entries.hasMoreElements()) {
                ZipArchiveEntry entry = (ZipArchiveEntry) entries.nextElement();
                if (entry == null) continue;
                String path = folder + "/" + entry.getName().replace('\\', '/');
                if (!(Boolean)(Object)entry.isDirectory()) {
                    File destFile = new File(path);
                    String parent = destFile.getParent();
                    if (parent != null) {
                        File parentFile = new File(parent);
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                    }
                    copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(destFile)));
                }
            }
            zipFile.close();
        } catch (IOException ioe) {
            this.errMsg =(MyHelperClass)(Object) ioe.getMessage();
            Malgn.errorLog("{Zip.unzip} " + ioe.getMessage());
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass errorLog(String o0){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass getEntries(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInputStream(ZipArchiveEntry o0){ return null; }}

class ZipArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
