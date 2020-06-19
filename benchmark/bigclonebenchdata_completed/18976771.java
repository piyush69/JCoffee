import java.io.*;
import java.lang.*;
import java.util.*;



class c18976771 {
public MyHelperClass env;
	public MyHelperClass getKduCompressCommand(String o0, String o1, DjatokaEncodeParam o2){ return null; }

    public void compressImage(InputStream input, OutputStream output, DjatokaEncodeParam params) throws DjatokaException {
        if (params == null) params = new DjatokaEncodeParam();
        File inputFile = null;
        try {
            inputFile = File.createTempFile("tmp", ".tif");
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(input, new FileOutputStream(inputFile));
            if ((int)(Object)params.getLevels() == 0) {
                MyHelperClass ImageRecordUtils = new MyHelperClass();
                ImageRecord dim =(ImageRecord)(Object) ImageRecordUtils.getImageDimensions(inputFile.getAbsolutePath());
                MyHelperClass ImageProcessingUtils = new MyHelperClass();
                params.setLevels(ImageProcessingUtils.getLevelCount(dim.getWidth(), dim.getHeight()));
                dim = null;
            }
        } catch (IOException e1) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Unexpected file format; expecting uncompressed TIFF", e1);
            throw new DjatokaException("Unexpected file format; expecting uncompressed TIFF");
        }
        MyHelperClass STDOUT = new MyHelperClass();
        String out =(String)(Object) STDOUT;
        File winOut = null;
        MyHelperClass isWindows = new MyHelperClass();
        if ((boolean)(Object)isWindows) {
            try {
                winOut = File.createTempFile("pipe_", ".jp2");
            } catch (IOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error(e, e);
                throw new DjatokaException((String)(Object)e);
            }
            out = winOut.getAbsolutePath();
        }
        String command =(String)(Object) getKduCompressCommand(inputFile.getAbsolutePath(), out, params);
        MyHelperClass logger = new MyHelperClass();
        logger.debug("compressCommand: " + command);
        Runtime rt = Runtime.getRuntime();
        try {
            MyHelperClass envParams = new MyHelperClass();
            final Process process = rt.exec(command,(String[])(Object) envParams, new File((String)(Object)env));
//            MyHelperClass STDOUT = new MyHelperClass();
            if (out.equals(STDOUT)) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyStream(process.getInputStream(), output);
//            MyHelperClass isWindows = new MyHelperClass();
            } else if ((boolean)(Object)isWindows) {
                FileInputStream fis = new FileInputStream(out);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyStream(fis, output);
                fis.close();
            }
            process.waitFor();
            if (process != null) {
                String errorCheck = null;
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    errorCheck = new String((String)(Object)IOUtils.getByteArray(process.getErrorStream()));
                } catch (Exception e1) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.error(e1, e1);
                }
                process.getInputStream().close();
                process.getOutputStream().close();
                process.getErrorStream().close();
                process.destroy();
                if (errorCheck != null) throw new DjatokaException(errorCheck);
            }
        } catch (IOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error(e, e);
            throw new DjatokaException((String)(Object)e);
        } catch (InterruptedException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error(e, e);
            throw new DjatokaException((String)(Object)e);
        }
        if (inputFile != null) inputFile.delete();
        if (winOut != null) winOut.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass copyStream(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass error(IOException o0, IOException o1){ return null; }
	public MyHelperClass getByteArray(InputStream o0){ return null; }
	public MyHelperClass getImageDimensions(String o0){ return null; }
	public MyHelperClass getLevelCount(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass copyStream(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass error(InterruptedException o0, InterruptedException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class DjatokaEncodeParam {

public MyHelperClass getLevels(){ return null; }
	public MyHelperClass setLevels(MyHelperClass o0){ return null; }}

class DjatokaException extends Exception{
	public DjatokaException(String errorMessage) { super(errorMessage); }
}

class ImageRecord {

public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}
