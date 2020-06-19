
import java.io.UncheckedIOException;


class c18573528 {

    public int process(ProcessorContext context) throws InterruptedException, ProcessorException {
        MyHelperClass logger = new MyHelperClass();
        logger.info("JAISaveTask:process");
        final RenderedOp im = (RenderedOp)(RenderedOp)(Object) context.get("RenderedOp");
        final String path = "s3://s3.amazonaws.com/rssfetch/" + (new Guid());
        final RGB encPar = new RGB();
        encPar.setTransparentRGB(new int[] { 0, 0, 0 });
        File tmpFile = null;
        try {
            MyHelperClass File = new MyHelperClass();
            tmpFile =(File)(Object) File.createTempFile("thmb", ".png");
            OutputStream out =(OutputStream)(Object) new FileOutputStream(tmpFile);
            final ParameterBlock pb =(ParameterBlock)(Object) (new ParameterBlock()).addSource(im).add(out).add((OutputStream)(Object)"png").add((OutputStream)(Object)encPar);
            MyHelperClass JAI = new MyHelperClass();
            JAI.create("encode", pb, null);
            out.flush();
            out.close();
            FileInputStream in = new FileInputStream(tmpFile);
            final XFile xfile = new XFile(path);
            final XFileOutputStream xout = new XFileOutputStream(xfile);
            final XFileExtensionAccessor xfa = ((XFileExtensionAccessor)(XFileExtensionAccessor)(Object) xfile.getExtensionAccessor());
            if (xfa != null) {
                xfa.setMimeType("image/png");
                xfa.setContentLength(tmpFile.length());
            }
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, xout);
            xout.flush();
            xout.close();
            in.close();
            context.put("outputPath", path);
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
            throw new ProcessorException((String)(Object)e);
        } catch (Throwable e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
            throw new ProcessorException((String)(Object)e);
        } finally {
            if (tmpFile != null && (boolean)(Object)tmpFile.exists()) {
                tmpFile.delete();
            }
        }
        MyHelperClass TaskState = new MyHelperClass();
        return(int)(Object) TaskState.STATE_MO_START + (int)(Object)TaskState.STATE_ENCODE;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STATE_MO_START;
	public MyHelperClass STATE_ENCODE;
public MyHelperClass add(OutputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, XFileOutputStream o1){ return null; }
	public MyHelperClass create(String o0, ParameterBlock o1, Object o2){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(Throwable o0){ return null; }}

class ProcessorContext {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class ProcessorException extends Exception{
	public ProcessorException(String errorMessage) { super(errorMessage); }
}

class RenderedOp {

}

class Guid {

}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass length(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ParameterBlock {

public MyHelperClass addSource(RenderedOp o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class XFile {

XFile(String o0){}
	XFile(){}
	public MyHelperClass getExtensionAccessor(){ return null; }}

class XFileOutputStream {

XFileOutputStream(XFile o0){}
	XFileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class RGB {

public MyHelperClass setTransparentRGB(int[] o0){ return null; }}

class XFileExtensionAccessor {

public MyHelperClass setContentLength(MyHelperClass o0){ return null; }
	public MyHelperClass setMimeType(String o0){ return null; }}
