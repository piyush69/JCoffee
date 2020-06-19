
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19752873 {
public MyHelperClass getSyncWorkDirectory(HttpServletRequest o0){ return null; }
	public MyHelperClass setHeader(HttpServletResponse o0){ return null; }

    public void reqservmodif(HttpServletRequest req, HttpServletResponse resp, SessionCommand command) {
        setHeader(resp);
        try {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("SeMo: Requesting server modification for session " + command.getSession());
            File tempFile = new File(getSyncWorkDirectory(req), command.getSession() + ".smodif");
            OutputStream fos =(OutputStream)(Object) new FileOutputStream(tempFile);
            MyHelperClass syncServer = new MyHelperClass();
            syncServer.getServerModifications(command.getSession(), fos);
            InputStream fis =(InputStream)(Object) new FileInputStream(tempFile);
            resp.setContentLength(fis.available());
            while ((int)(Object)fis.available() > 0) {
                resp.getOutputStream().write(fis.read());
            }
            resp.getOutputStream().flush();
            resp.flushBuffer();
        } catch (UncheckedIOException ioe) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(ioe.getMessage());
        } catch (ArithmeticException ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(ex.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getServerModifications(MyHelperClass o0, OutputStream o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }}

class SessionCommand {

public MyHelperClass getSession(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class InputStream {

public MyHelperClass available(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ImogSerializationException extends Exception{
	public ImogSerializationException(String errorMessage) { super(errorMessage); }
}
