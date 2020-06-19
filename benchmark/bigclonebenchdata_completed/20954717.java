
import java.io.UncheckedIOException;


class c20954717 {

    private static final void copyFile(File srcFile, File destDir, byte[] buffer) {
        try {
            File destFile = new File(destDir, srcFile.getName());
            InputStream in =(InputStream)(Object) new FileInputStream(srcFile);
            OutputStream out =(OutputStream)(Object) new FileOutputStream(destFile);
            int bytesRead;
            while ((bytesRead =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, bytesRead);
            in.close();
            out.close();
        } catch (UncheckedIOException ioe) {
            System.err.println("Couldn't copy file '" + srcFile + "' to directory '" + destDir + "'");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
