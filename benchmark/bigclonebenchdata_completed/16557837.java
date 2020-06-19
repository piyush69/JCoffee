
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16557837 {

    public static void copyFromTo(File srcFile, File destFile) {
        FileChannel in = null, out = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcFile);
        } catch (UncheckedIOException fnfe) {
            System.out.println("File: " + srcFile.toString());
            System.out.println("file does not exist, " + "is a directory rather than a regular file, " + "or for some other reason cannot be opened for reading");
            System.exit(-1);
        }
        try {
            fos = new FileOutputStream(destFile);
        } catch (UncheckedIOException fnfe) {
            System.out.println("File: " + destFile.toString());
            System.out.println("file exists but is a directory rather than a regular file, " + "does not exist but cannot be created, " + "or cannot be opened for any other reason");
            System.exit(-1);
        }
        try {
            in =(FileChannel)(Object) fis.getChannel();
            out =(FileChannel)(Object) fos.getChannel();
            in.transferTo(0, in.size(), out);
            fos.flush();
            fos.close();
            out.close();
            fis.close();
            in.close();
            System.out.println("Completed copying " + srcFile.toString() + " to " + destFile.toString());
        } catch (UncheckedIOException ioe) {
            System.out.println("IOException copying file: " + ioe.getMessage());
            System.exit(-1);
        }
        long srcModified =(long)(Object) srcFile.lastModified();
        if (srcModified > 0L && (boolean)(Object)destFile.exists()) {
            destFile.setLastModified(srcModified);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
