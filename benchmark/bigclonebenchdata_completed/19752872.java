
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19752872 {
public MyHelperClass setHeader(HttpServletResponse o0){ return null; }

    public void searchEntity(HttpServletRequest req, HttpServletResponse resp, SearchCommand command) {
        setHeader(resp);
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Search: Looking for the entity with the id:" + command.getSearchedid());
        String login =(String)(Object) command.getLogin();
        String password =(String)(Object) command.getPassword();
        MyHelperClass userAccessControl = new MyHelperClass();
        SynchronizableUser currentUser =(SynchronizableUser)(Object) userAccessControl.authenticate(login, password);
        if (currentUser != null) {
            try {
                MyHelperClass File = new MyHelperClass();
                File tempFile =(File)(Object) File.createTempFile("medoo", "search");
                OutputStream fos =(OutputStream)(Object) new FileOutputStream(tempFile);
                MyHelperClass syncServer = new MyHelperClass();
                syncServer.searchEntity(currentUser, command.getSearchedid(), fos);
                InputStream fis =(InputStream)(Object) new FileInputStream(tempFile);
                resp.setContentLength(fis.available());
                while ((int)(Object)fis.available() > 0) {
                    resp.getOutputStream().write(fis.read());
                }
                resp.getOutputStream().flush();
                resp.flushBuffer();
            } catch (UncheckedIOException ioe) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error(ioe.getMessage(),(IOException)(Object) ioe);
            } catch (ArithmeticException ex) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error(ex.getMessage(),(IOException)(Object) ex);
            }
        } else {
            try {
                OutputStream out =(OutputStream)(Object) resp.getOutputStream();
                out.write("-ERROR-".getBytes());
                out.flush();
                out.close();
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Search: user " + login + " has not been authenticated");
            } catch (UncheckedIOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, ImogSerializationException o1){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass searchEntity(SynchronizableUser o0, MyHelperClass o1, OutputStream o2){ return null; }
	public MyHelperClass authenticate(String o0, String o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }}

class SearchCommand {

public MyHelperClass getLogin(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getSearchedid(){ return null; }}

class SynchronizableUser {

}

class File {

}

class OutputStream {

public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

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
