
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6432491 {

    public void reqservmodif(HttpServletRequest req, HttpServletResponse resp, SessionCommand command) {
        try {
            System.err.println(req.getSession().getServletContext().getRealPath("WEB-INF/syncWork"));
            MyHelperClass File = new MyHelperClass();
            File tempFile =(File)(Object) File.createTempFile("localmodif-", ".medoorequest");
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
            tempFile.delete();
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

public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass getServerModifications(MyHelperClass o0, OutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }}

class SessionCommand {

public MyHelperClass getSession(){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

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
