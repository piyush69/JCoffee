import java.io.*;
import java.lang.*;
import java.util.*;



class c1630148 {

    public static void replaceEntry(File file, String entryName, InputStream stream) throws PersistenceException {
        try {
            File temporaryFile = File.createTempFile("pmMDA_zargo", ".zargo");
            temporaryFile.deleteOnExit();
            FileInputStream inputStream = new FileInputStream(file);
            ZipInputStream input = new ZipInputStream(inputStream);
            ZipOutputStream output = new ZipOutputStream(new FileOutputStream(temporaryFile));
            ZipEntry entry =(ZipEntry)(Object) input.getNextEntry();
            while (entry != null) {
                ZipEntry zipEntry = new ZipEntry(entry);
                zipEntry.setCompressedSize(-1);
                output.putNextEntry(zipEntry);
                if (!entry.getName().equals(entryName)) {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(input, output);
                } else {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(stream, output);
                }
                input.closeEntry();
                output.closeEntry();
                entry =(ZipEntry)(Object) input.getNextEntry();
            }
            input.close();
            inputStream.close();
            output.close();
            System.gc();
            boolean isSuccess = file.delete();
            if (!isSuccess) {
                throw new PersistenceException();
            }
            isSuccess = temporaryFile.renameTo(file);
            if (!isSuccess) {
                throw new PersistenceException();
            }
        } catch (IOException e) {
            throw new PersistenceException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ZipInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
	PersistenceException(){}
}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(ZipEntry o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setCompressedSize(int o0){ return null; }}
