
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22544688 {

//    @Override
    protected RequestLogHandler createRequestLogHandler() {
        try {
            MyHelperClass File = new MyHelperClass();
            File logbackConf =(File)(Object) File.createTempFile("logback-access", ".xml");
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy((InputStream)(Object)Thread.currentThread().getContextClassLoader().getResourceAsStream("logback-access.xml"), new FileOutputStream(logbackConf));
            RequestLogHandler requestLogHandler = new RequestLogHandler();
            RequestLogImpl requestLog = new RequestLogImpl();
            requestLog.setFileName(logbackConf.getPath());
            requestLogHandler.setRequestLog(requestLog);
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Could not create request log handler",(FileNotFoundException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Could not create request log handler",(FileNotFoundException)(Object) e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class RequestLogHandler {

public MyHelperClass setRequestLog(RequestLogImpl o0){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class RequestLogImpl {

public MyHelperClass setFileName(MyHelperClass o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
