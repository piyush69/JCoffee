import java.io.*;
import java.lang.*;
import java.util.*;



class c13221213 {
public static MyHelperClass DOT_EXTENSION;
	public static MyHelperClass runDot(String o0, Point o1, File o2, File o3){ return null; }
public static MyHelperClass IOUtils;
	public static MyHelperClass Display;
	public static MyHelperClass Platform;
	public static MyHelperClass IStatus;
//	public MyHelperClass DOT_EXTENSION;
	public static MyHelperClass LogUtils;
//	public MyHelperClass runDot(String o0, Point o1, File o2, File o3){ return null; }
	public static MyHelperClass logInput(ByteArrayOutputStream o0){ return null; }
//public MyHelperClass IStatus;
//	public MyHelperClass LogUtils;
	public MyHelperClass GraphVizActivator;
//	public MyHelperClass Display;
//	public MyHelperClass Platform;
//	public MyHelperClass IOUtils;
//	public MyHelperClass logInput(ByteArrayOutputStream o0){ return null; }

    public static Image load(final InputStream input, String format, Point dimension) throws CoreException {
        MyHelperClass GraphVizActivator = new MyHelperClass();
        MultiStatus status = new MultiStatus(GraphVizActivator.ID, 0, "Errors occurred while running Graphviz", null);
        File dotInput = null, dotOutput = null;
        ByteArrayOutputStream dotContents = new ByteArrayOutputStream();
        try {
            MyHelperClass TMP_FILE_PREFIX = new MyHelperClass();
            dotInput = File.createTempFile((String)(Object)TMP_FILE_PREFIX,(String)(Object) DOT_EXTENSION);
//            MyHelperClass TMP_FILE_PREFIX = new MyHelperClass();
            dotOutput = File.createTempFile((String)(Object)TMP_FILE_PREFIX, "." + format);
            dotOutput.delete();
            FileOutputStream tmpDotOutputStream = null;
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, dotContents);
                tmpDotOutputStream = new FileOutputStream(dotInput);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(new ByteArrayInputStream(dotContents.toByteArray()), tmpDotOutputStream);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(tmpDotOutputStream);
            }
            IStatus result =(IStatus)(Object) runDot(format, dimension, dotInput, dotOutput);
            status.add(result);
            status.add(logInput(dotContents));
            if (dotOutput.isFile()) {
                if (!(Boolean)(Object)result.isOK() && (boolean)(Object)Platform.inDebugMode()) LogUtils.log(status);
                ImageLoader loader = new ImageLoader();
                ImageData[] imageData =(ImageData[])(Object) loader.load(dotOutput.getAbsolutePath());
                return new Image(Display.getDefault(), imageData[0]);
            }
        } catch (UncheckedIOException e) {
            status.add((IStatus)(Object)new Status(IStatus.ERROR, GraphVizActivator.ID, "",(IOException)(Object) e));
        } catch (IOException e) {
            status.add((IStatus)(Object)new Status(IStatus.ERROR, GraphVizActivator.ID, "", e));
        } finally {
            dotInput.delete();
            dotOutput.delete();
            IOUtils.closeQuietly(input);
        }
        throw new CoreException((String)(Object)status);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ID;
	public MyHelperClass ERROR;
public MyHelperClass getDefault(){ return null; }
	public MyHelperClass copy(ByteArrayInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass inDebugMode(){ return null; }
	public MyHelperClass log(MultiStatus o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class Point {

}

class Image {

Image(){}
	Image(MyHelperClass o0, ImageData o1){}}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class MultiStatus {

MultiStatus(MyHelperClass o0, int o1, String o2, Object o3){}
	MultiStatus(){}
	public MyHelperClass add(IStatus o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class IStatus {

public MyHelperClass isOK(){ return null; }}

class ImageLoader {

public MyHelperClass load(String o0){ return null; }}

class ImageData {

}

class SWTException extends Exception{
	public SWTException(String errorMessage) { super(errorMessage); }
}

class Status {

Status(MyHelperClass o0, MyHelperClass o1, String o2, IOException o3){}
	Status(MyHelperClass o0, MyHelperClass o1, String o2, SWTException o3){}
	Status(){}}
