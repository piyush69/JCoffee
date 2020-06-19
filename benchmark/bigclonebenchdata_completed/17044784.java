import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17044784 {
public MyHelperClass IOUtils;
	public MyHelperClass Message;
	public MyHelperClass out;
	public MyHelperClass FileUtils;
	public MyHelperClass BackupCommand;
	public MyHelperClass Constants;
	public MyHelperClass printNoDatabaseFilesFound(String o0, String o1){ return null; }

    private void process(String zipFileName, String directory, String db, boolean quiet) throws Throwable, SQLException {
        MyHelperClass FileLister = new MyHelperClass();
        ArrayList<String> list =(ArrayList<String>)(Object) FileLister.getDatabaseFiles(directory, db, true);
        if (list.size() == 0) {
            if (!quiet) {
                printNoDatabaseFilesFound(directory, db);
            }
            return;
        }
        zipFileName =(String)(Object) FileUtils.normalize(zipFileName);
        if ((boolean)(Object)FileUtils.exists(zipFileName)) {
            FileUtils.delete(zipFileName);
        }
        OutputStream fileOut = null;
        try {
            fileOut =(OutputStream)(Object) FileUtils.openFileOutputStream(zipFileName, false);
            ZipOutputStream zipOut = new ZipOutputStream(fileOut);
            String base = "";
            for (String fileName : list) {
                if (fileName.endsWith((String)(Object)Constants.SUFFIX_PAGE_FILE)) {
                    base =(String)(Object) FileUtils.getParent(fileName);
                    break;
                } else if (fileName.endsWith((String)(Object)Constants.SUFFIX_DATA_FILE)) {
                    base =(String)(Object) FileUtils.getParent(fileName);
                    break;
                }
            }
            for (String fileName : list) {
                String f =(String)(Object) FileUtils.getAbsolutePath(fileName);
                if (!f.startsWith(base)) {
                    Message.throwInternalError(f + " does not start with " + base);
                }
                if ((boolean)(Object)FileUtils.isDirectory(fileName)) {
                    continue;
                }
                f = f.substring(base.length());
                f =(String)(Object) BackupCommand.correctFileName(f);
                ZipEntry entry = new ZipEntry(f);
                zipOut.putNextEntry(entry);
                InputStream in = null;
                try {
                    in =(InputStream)(Object) FileUtils.openFileInputStream(fileName);
                    IOUtils.copyAndCloseInput(in, zipOut);
                } catch (UncheckedIOException e) {
                } finally {
                    IOUtils.closeSilently(in);
                }
                zipOut.closeEntry();
                if (!quiet) {
                    out.println("Processed: " + fileName);
                }
            }
            zipOut.closeEntry();
            zipOut.close();
        } catch (UncheckedIOException e) {
            throw(Throwable)(Object) Message.convertIOException((IOException)(Object)e, zipFileName);
        } finally {
            IOUtils.closeSilently(fileOut);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SUFFIX_PAGE_FILE;
	public MyHelperClass SUFFIX_DATA_FILE;
public MyHelperClass isDirectory(String o0){ return null; }
	public MyHelperClass correctFileName(String o0){ return null; }
	public MyHelperClass copyAndCloseInput(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass getParent(String o0){ return null; }
	public MyHelperClass getAbsolutePath(String o0){ return null; }
	public MyHelperClass getDatabaseFiles(String o0, String o1, boolean o2){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass throwInternalError(String o0){ return null; }
	public MyHelperClass openFileInputStream(String o0){ return null; }
	public MyHelperClass openFileOutputStream(String o0, boolean o1){ return null; }
	public MyHelperClass delete(String o0){ return null; }
	public MyHelperClass convertIOException(IOException o0, String o1){ return null; }
	public MyHelperClass normalize(String o0){ return null; }
	public MyHelperClass closeSilently(OutputStream o0){ return null; }
	public MyHelperClass exists(String o0){ return null; }
	public MyHelperClass closeSilently(InputStream o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(OutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
