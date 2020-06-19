
import java.io.UncheckedIOException;


class c18976769 {

    public void compressImage(BufferedImage bi, OutputStream output, DjatokaEncodeParam params) throws DjatokaException {
        if (params == null) params = new DjatokaEncodeParam();
        MyHelperClass ImageProcessingUtils = new MyHelperClass();
        if ((int)(Object)params.getLevels() == 0) params.setLevels(ImageProcessingUtils.getLevelCount(bi.getWidth(), bi.getHeight()));
        File in = null;
        File out = null;
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            in =(File)(Object) IOUtils.createTempTiff(bi);
            MyHelperClass File = new MyHelperClass();
            out =(File)(Object) File.createTempFile("tmp", ".jp2");
            compressImage((BufferedImage)(Object)in.getAbsolutePath(),(OutputStream)(Object) out.getAbsolutePath(), params);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(new FileInputStream(out), output);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e, e);
            throw new DjatokaException((String)(Object)e);
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e, e);
            throw new DjatokaException((String)(Object)e);
        }
        if (in != null) in.delete();
        if (out != null) out.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0, IOException o1){ return null; }
	public MyHelperClass getLevelCount(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass copyStream(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass createTempTiff(BufferedImage o0){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }}

class BufferedImage {

public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}

class OutputStream {

}

class DjatokaEncodeParam {

public MyHelperClass setLevels(MyHelperClass o0){ return null; }
	public MyHelperClass getLevels(){ return null; }}

class DjatokaException extends Exception{
	public DjatokaException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
