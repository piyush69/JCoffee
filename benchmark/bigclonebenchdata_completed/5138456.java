
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5138456 {

    public static int save(File inputFile, File outputFile) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new FileInputStream(inputFile);
            outputFile.getParentFile().mkdirs();
            out =(OutputStream)(Object) new FileOutputStream(outputFile);
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            return(int)(Object) IOUtils.copy(in, out);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
            try {
                if (out != null) {
                    out.close();
                }
            } catch (UncheckedIOException ioe) {
                ioe.getMessage();
            }
            try {
                if (in != null) {
                    in.close();
                }
            } catch (UncheckedIOException ioe) {
                ioe.getMessage();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
