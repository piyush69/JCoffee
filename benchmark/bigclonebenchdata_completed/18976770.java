
import java.io.UncheckedIOException;


class c18976770 {

    public void compressImage(InputStream input, String output, DjatokaEncodeParam params) throws DjatokaException {
        if (params == null) params = new DjatokaEncodeParam();
        File inputFile;
        try {
            MyHelperClass File = new MyHelperClass();
            inputFile =(File)(Object) File.createTempFile("tmp", ".tif");
            inputFile.deleteOnExit();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(input, new FileOutputStream(inputFile));
            if ((int)(Object)params.getLevels() == 0) {
                MyHelperClass ImageRecordUtils = new MyHelperClass();
                ImageRecord dim =(ImageRecord)(Object) ImageRecordUtils.getImageDimensions(inputFile.getAbsolutePath());
                MyHelperClass ImageProcessingUtils = new MyHelperClass();
                params.setLevels(ImageProcessingUtils.getLevelCount(dim.getWidth(), dim.getHeight()));
                dim = null;
            }
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)e,(IOException)(Object) e);
            throw new DjatokaException((String)(Object)e);
        }
        compressImage((InputStream)(Object)inputFile.getAbsolutePath(), output, params);
        if (inputFile != null) inputFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0, IOException o1){ return null; }
	public MyHelperClass getLevelCount(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getImageDimensions(MyHelperClass o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass copyStream(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

}

class DjatokaEncodeParam {

public MyHelperClass setLevels(MyHelperClass o0){ return null; }
	public MyHelperClass getLevels(){ return null; }}

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

class ImageRecord {

public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
