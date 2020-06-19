import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21937981 {
public MyHelperClass FileUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass Message;
	public MyHelperClass getOriginalDbName(String o0, String o1){ return null; }

    private void process(String zipFileName, String directory, String db) throws Throwable, SQLException {
        InputStream in = null;
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            if (!(Boolean)(Object)FileUtils.exists(zipFileName)) {
                throw new IOException("File not found: " + zipFileName);
            }
            String originalDbName = null;
            int originalDbLen = 0;
            if (db != null) {
                originalDbName =(String)(Object) getOriginalDbName(zipFileName, db);
                if (originalDbName == null) {
                    throw new IOException("No database named " + db + " found");
                }
                if (originalDbName.startsWith(File.separator)) {
                    originalDbName = originalDbName.substring(1);
                }
                originalDbLen = originalDbName.length();
            }
            in =(InputStream)(Object) FileUtils.openFileInputStream(zipFileName);
            ZipInputStream zipIn = new ZipInputStream(in);
            while (true) {
                ZipEntry entry =(ZipEntry)(Object) zipIn.getNextEntry();
                if (entry == null) {
                    break;
                }
                String fileName =(String)(Object) entry.getName();
                fileName = fileName.replace('\\', File.separatorChar);
                fileName = fileName.replace('/', File.separatorChar);
                if (fileName.startsWith(File.separator)) {
                    fileName = fileName.substring(1);
                }
                boolean copy = false;
                if (db == null) {
                    copy = true;
                } else if (fileName.startsWith(originalDbName + ".")) {
                    fileName = db + fileName.substring(originalDbLen);
                    copy = true;
                }
                if (copy) {
                    OutputStream out = null;
                    try {
                        out =(OutputStream)(Object) FileUtils.openFileOutputStream(directory + File.separator + fileName, false);
                        IOUtils.copy(zipIn, out);
                        out.close();
                    } finally {
                        IOUtils.closeSilently(out);
                    }
                }
                zipIn.closeEntry();
            }
            zipIn.closeEntry();
            zipIn.close();
        } catch (IOException e) {
            throw(Throwable)(Object) Message.convertIOException(e, zipFileName);
        } finally {
            IOUtils.closeSilently(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ZipInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass openFileInputStream(String o0){ return null; }
	public MyHelperClass openFileOutputStream(String o0, boolean o1){ return null; }
	public MyHelperClass convertIOException(IOException o0, String o1){ return null; }
	public MyHelperClass closeSilently(OutputStream o0){ return null; }
	public MyHelperClass exists(String o0){ return null; }
	public MyHelperClass closeSilently(InputStream o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(InputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
