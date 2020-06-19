
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21649269 {

    public void gzipCompress(String file) {
        try {
            File inputFile = new File(file);
            FileInputStream fileinput = new FileInputStream(inputFile);
            File outputFile = new File(file.substring(0, file.length() - 1) + "z");
            FileOutputStream stream = new FileOutputStream(outputFile);
            GZIPOutputStream gzipstream = new GZIPOutputStream(stream);
            BufferedInputStream bis = new BufferedInputStream(fileinput);
            int bytes_read = 0;
            MyHelperClass READ_BUFFER_SIZE = new MyHelperClass();
            byte[] buf = new byte[(int)(Object)READ_BUFFER_SIZE];
            MyHelperClass BLOCK_SIZE = new MyHelperClass();
            while ((bytes_read =(int)(Object) bis.read(buf, 0, BLOCK_SIZE)) != -1) {
                gzipstream.write(buf, 0, bytes_read);
            }
            bis.close();
            inputFile.delete();
            gzipstream.finish();
            gzipstream.close();
        } catch (UncheckedIOException fnfe) {
            System.out.println("Compressor: Cannot find file " + fnfe.getMessage());
        } catch (SecurityException se) {
            System.out.println("Problem saving file " + se.getMessage());
        } catch (ArithmeticException ioe) {
            System.out.println("Problem saving file " + ioe.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass finish(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
