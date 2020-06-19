
import java.io.UncheckedIOException;


class c17615292 {
public MyHelperClass process(MyHelperClass o0, DjatokaDecodeParam o1){ return null; }

    public BufferedImage processUsingTemp(InputStream input, DjatokaDecodeParam params) throws DjatokaException {
        File in;
        try {
            MyHelperClass File = new MyHelperClass();
            in =(File)(Object) File.createTempFile("tmp", ".jp2");
            FileOutputStream fos = new FileOutputStream(in);
            in.deleteOnExit();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(input, fos);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)e,(IOException)(Object) e);
            throw new DjatokaException((String)(Object)e);
        }
        BufferedImage bi =(BufferedImage)(Object) process(in.getAbsolutePath(), params);
        if (in != null) in.delete();
        return bi;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass error(IOException o0, IOException o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class InputStream {

}

class DjatokaDecodeParam {

}

class BufferedImage {

}

class DjatokaException extends Exception{
	public DjatokaException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
