import java.io.*;
import java.lang.*;
import java.util.*;



class c3402511 {
public static MyHelperClass processAndCreateFolderEntries(Zip64File o0, MyHelperClass o1, boolean o2){ return null; }
//public MyHelperClass processAndCreateFolderEntries(Zip64File o0, MyHelperClass o1, boolean o2){ return null; }
	public static MyHelperClass parseTargetPath(MyHelperClass o0, File o1){ return null; }
//public MyHelperClass parseTargetPath(MyHelperClass o0, File o1){ return null; }
	public static MyHelperClass getFileDate(File o0){ return null; }
//public MyHelperClass getFileDate(File o0){ return null; }

    private static FileEntry writeEntry(Zip64File zip64File, FileEntry targetPath, File toWrite, boolean compress) {
        InputStream in = null;
        EntryOutputStream out = null;
        processAndCreateFolderEntries(zip64File, parseTargetPath(targetPath.getName(), toWrite), compress);
        try {
            if (!compress) {
                MyHelperClass FileEntry = new MyHelperClass();
                out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(targetPath.getName(), FileEntry.iMETHOD_STORED, getFileDate(toWrite));
            } else {
                MyHelperClass FileEntry = new MyHelperClass();
                out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(targetPath.getName(), FileEntry.iMETHOD_DEFLATED, getFileDate(toWrite));
            }
            if (!(Boolean)(Object)targetPath.isDirectory()) {
                in = new FileInputStream(toWrite);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyLarge(in, out);
                in.close();
            }
            out.flush();
            out.close();
            if ((boolean)(Object)targetPath.isDirectory()) {
                MyHelperClass log = new MyHelperClass();
                log.info("[createZip] Written folder entry to zip: " + targetPath.getName());
            } else {
                MyHelperClass log = new MyHelperClass();
                log.info("[createZip] Written file entry to zip: " + targetPath.getName());
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return targetPath;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass iMETHOD_STORED;
	public MyHelperClass iMETHOD_DEFLATED;
public MyHelperClass copyLarge(InputStream o0, EntryOutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Zip64File {

public MyHelperClass openEntryOutputStream(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class FileEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class EntryOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}
