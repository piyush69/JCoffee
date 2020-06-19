
import java.io.UncheckedIOException;


class c13221212 {
public static MyHelperClass LogUtils;
public static MyHelperClass DOT_EXTENSION;
	public static MyHelperClass runDot(String o0, Point o1, File o2, File o3){ return null; }
//public MyHelperClass DOT_EXTENSION;
//	public MyHelperClass LogUtils;
//	public MyHelperClass runDot(String o0, Point o1, File o2, File o3){ return null; }

    public static void generate(final InputStream input, String format, Point dimension, IPath outputLocation) throws CoreException {
        MyHelperClass GraphVizActivator = new MyHelperClass();
        MultiStatus status = new MultiStatus(GraphVizActivator.ID, 0, "Errors occurred while running Graphviz", null);
        File dotInput = null, dotOutput =(File)(Object) outputLocation.toFile();
        ByteArrayOutputStream dotContents = new ByteArrayOutputStream();
        try {
            MyHelperClass TMP_FILE_PREFIX = new MyHelperClass();
            dotInput =(File)(Object) File.createTempFile(TMP_FILE_PREFIX, DOT_EXTENSION);
            FileOutputStream tmpDotOutputStream = null;
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, dotContents);
                tmpDotOutputStream = new FileOutputStream(dotInput);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy((InputStream)(Object)new ByteArrayInputStream(dotContents.toByteArray()),(ByteArrayOutputStream)(Object) tmpDotOutputStream);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(tmpDotOutputStream);
            }
            IStatus result =(IStatus)(Object) runDot(format, dimension, dotInput, dotOutput);
            if ((boolean)(Object)dotOutput.isFile()) {
                MyHelperClass Platform = new MyHelperClass();
                if (!(Boolean)(Object)result.isOK() && (boolean)(Object)Platform.inDebugMode()) LogUtils.log(status);
                return;
            }
        } catch (UncheckedIOException e) {
            MyHelperClass IStatus = new MyHelperClass();
            status.add(new Status(IStatus.ERROR, GraphVizActivator.ID, "",(IOException)(Object) e));
        } finally {
            dotInput.delete();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        }
        throw new CoreException((String)(Object)status);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass ID;
public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass log(MultiStatus o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass inDebugMode(){ return null; }}

class InputStream {

}

class Point {

}

class IPath {

public MyHelperClass toFile(){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class MultiStatus {

MultiStatus(){}
	MultiStatus(MyHelperClass o0, int o1, String o2, Object o3){}
	public MyHelperClass add(Status o0){ return null; }}

class File {

public static MyHelperClass createTempFile(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass delete(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class IStatus {

public MyHelperClass isOK(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Status {

Status(MyHelperClass o0, MyHelperClass o1, String o2, IOException o3){}
	Status(){}}
