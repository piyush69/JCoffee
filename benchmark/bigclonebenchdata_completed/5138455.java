
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5138455 {

    public static int save(byte[] bytes, File outputFile) throws IOException {
        InputStream in =(InputStream)(Object) new ByteArrayInputStream(bytes);
        outputFile.getParentFile().mkdirs();
        OutputStream out =(OutputStream)(Object) new FileOutputStream(outputFile);
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            return(int)(Object) IOUtils.copy(in, out);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
            try {
                out.close();
            } catch (UncheckedIOException ioe) {
                ioe.getMessage();
            }
            try {
                in.close();
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

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
