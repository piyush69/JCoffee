
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21704918 {

    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        MyHelperClass EncoderPlugin = new MyHelperClass();
        File archive = new File(EncoderPlugin.getDefault().getStateLocation().toFile(), "ffmpeg-0.5.zip");
        String message = "Downloading FFMpeg, contacting downloads.sourceforge.net";
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info(message);
        monitor.beginTask(message, 1);
        HttpClient client = new HttpClient();
        MyHelperClass DOWNLOAD_URI = new MyHelperClass();
        HttpMethod method =(HttpMethod)(Object) new GetMethod(DOWNLOAD_URI);
        MyHelperClass HttpStatus = new MyHelperClass();
        int statusCode =(int)(Object) HttpStatus.SC_SERVICE_UNAVAILABLE;
        try {
            statusCode =(int)(Object) client.executeMethod(method);
        } catch (UncheckedIOException exception) {
            monitor.setCanceled(true);
            throw new InvocationTargetException((String)(Object)exception);
        } catch (ArithmeticException exception) {
            monitor.setCanceled(true);
            throw new InvocationTargetException((String)(Object)exception);
        }
//        MyHelperClass HttpStatus = new MyHelperClass();
        if (statusCode != (int)(Object)HttpStatus.SC_OK) {
            MyHelperClass MessageFormat = new MyHelperClass();
            LOGGER.error(MessageFormat.format("Can't download ffmpeg.zip from zourceforge, " + "status = [{0}]", statusCode));
            monitor.setCanceled(true);
            return;
        }
        monitor.worked(1);
        Header header =(Header)(Object) method.getResponseHeader("Content-Length");
        long contentLength = 3173544;
        if (header != null) {
            try {
                contentLength = Long.parseLong((String)(Object)header.getValue());
            } catch (NumberFormatException nfe) {
            }
        }
//        MyHelperClass DOWNLOAD_URI = new MyHelperClass();
        monitor.beginTask("Downloading FFMpeg, " + DOWNLOAD_URI, (int) contentLength);
        OutputStream archiveOutput = null;
        try {
            archiveOutput =(OutputStream)(Object) new FileOutputStream(archive);
        } catch (UncheckedIOException exception) {
            monitor.setCanceled(true);
            throw new InvocationTargetException((IOException)(Object)exception, "Can't write temporary download file");
        }
        InputStream responseInput = null;
        try {
            responseInput =(InputStream)(Object) method.getResponseBodyAsStream();
        } catch (UncheckedIOException exception) {
            monitor.setCanceled(true);
            throw new InvocationTargetException((String)(Object)exception);
        }
        byte[] buffer = new byte[1024 * 4];
        int count = -1;
        try {
            while ((count =(int)(Object) responseInput.read(buffer)) != -1) {
                if ((boolean)(Object)monitor.isCanceled()) {
                    return;
                }
                archiveOutput.write(buffer, 0, count);
                monitor.worked(count);
            }
            archiveOutput.close();
            responseInput.close();
        } catch (UncheckedIOException exception) {
            monitor.setCanceled(true);
            throw new InvocationTargetException((String)(Object)exception);
        }
        monitor.beginTask("Downloading FFMpeg, extracting executable", 1);
        try {
            ZipFile zipFile = new ZipFile(archive);
            ZipEntry entry =(ZipEntry)(Object) zipFile.getEntry("ffmpeg-0.5/ffmpeg.exe");
            InputStream input =(InputStream)(Object) zipFile.getInputStream(entry);
            MyHelperClass target = new MyHelperClass();
            OutputStream output =(OutputStream)(Object) new FileOutputStream(target);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, output);
            input.close();
            output.close();
        } catch (UncheckedIOException exception) {
            monitor.setCanceled(true);
            throw new InvocationTargetException((IOException)(Object)exception, "Can't unzip ffmpeg.exe");
        }
        monitor.worked(1);
        monitor.done();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_SERVICE_UNAVAILABLE;
	public MyHelperClass SC_OK;
public MyHelperClass getDefault(){ return null; }
	public MyHelperClass toFile(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getStateLocation(){ return null; }
	public MyHelperClass format(String o0, int o1){ return null; }
	public MyHelperClass error(MyHelperClass o0){ return null; }}

class IProgressMonitor {

public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass done(){ return null; }
	public MyHelperClass setCanceled(boolean o0){ return null; }
	public MyHelperClass beginTask(String o0, int o1){ return null; }
	public MyHelperClass worked(int o0){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
	InvocationTargetException(){}
	InvocationTargetException(IOException o0, String o1){}
	InvocationTargetException(FileNotFoundException o0, String o1){}
}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class HttpClient {

public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class HttpMethod {

public MyHelperClass getResponseHeader(String o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class GetMethod {

GetMethod(){}
	GetMethod(MyHelperClass o0){}}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Header {

public MyHelperClass getValue(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	FileOutputStream(MyHelperClass o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipFile {

ZipFile(){}
	ZipFile(File o0){}
	public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class ZipEntry {

}
