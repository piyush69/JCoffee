import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3402498 {

    private static void readFileEntry(Zip64File zip64File, FileEntry fileEntry, File destFolder)  throws Throwable {
        FileOutputStream fileOut;
        File target = new File((String)(Object)destFolder,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) fileEntry.getName());
        File targetsParent = target.getParentFile();
        if (targetsParent != null) {
            targetsParent.mkdirs();
        }
        try {
            fileOut = new FileOutputStream(target);
            MyHelperClass log = new MyHelperClass();
            log.info("[readFileEntry] writing entry: " + fileEntry.getName() + " to file: " + target.getAbsolutePath());
            EntryInputStream entryReader =(EntryInputStream)(Object) zip64File.openEntryInputStream(fileEntry.getName());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(entryReader, fileOut);
            entryReader.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ZipException e) {
            MyHelperClass log = new MyHelperClass();
            log.warning("ATTENTION PLEASE: Some strange, but obviously not serious ZipException occured! Extracted file '" + target.getName() + "' anyway! So don't Panic!" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(EntryInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Zip64File {

public MyHelperClass openEntryInputStream(MyHelperClass o0){ return null; }}

class FileEntry {

public MyHelperClass getName(){ return null; }}

class EntryInputStream {

public MyHelperClass close(){ return null; }}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}
