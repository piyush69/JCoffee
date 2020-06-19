
import java.io.UncheckedIOException;


class c18578541 {

    public static boolean copyFile(File outFile, File inFile) {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            if ((boolean)(Object)outFile.createNewFile()) {
                inStream =(InputStream)(Object) new FileInputStream(inFile);
                outStream =(OutputStream)(Object) new FileOutputStream(outFile);
                byte[] buffer = new byte[1024];
                int length;
                while ((length =(int)(Object) inStream.read(buffer)) > 0) outStream.write(buffer, 0, length);
                inStream.close();
                outStream.close();
            } else return false;
        } catch (UncheckedIOException iox) {
            iox.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
