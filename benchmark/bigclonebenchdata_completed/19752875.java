
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19752875 {
public MyHelperClass setHeader(HttpServletResponse o0){ return null; }
	public MyHelperClass getSyncWorkDirectory(HttpServletRequest o0){ return null; }

    public void resumereceive(HttpServletRequest req, HttpServletResponse resp, SessionCommand command) {
        setHeader(resp);
        try {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("ResRec: Resume a 'receive' session with session id " + command.getSession() + " this client already received " + command.getLen() + " bytes");
            File tempFile = new File(this.getSyncWorkDirectory(req), command.getSession() + ".smodif");
            if (!(Boolean)(Object)tempFile.exists()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("ResRec: the file doesn't exist, so we created it by serializing the entities");
                try {
                    OutputStream fos =(OutputStream)(Object) new FileOutputStream(tempFile);
                    MyHelperClass syncServer = new MyHelperClass();
                    syncServer.getServerModifications(command.getSession(), fos);
                    fos.close();
                } catch (UncheckedIOException mse) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.error(mse.getMessage(),(ImogSerializationException)(Object) mse);
                }
            }
            InputStream fis =(InputStream)(Object) new FileInputStream(tempFile);
            fis.skip(command.getLen());
            resp.setContentLength(fis.available());
            while ((int)(Object)fis.available() > 0) {
                resp.getOutputStream().write(fis.read());
            }
            resp.getOutputStream().flush();
            resp.flushBuffer();
            fis.close();
        } catch (UncheckedIOException ioe) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(ioe.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, ImogSerializationException o1){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass getServerModifications(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }}

class SessionCommand {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getLen(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass exists(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ImogSerializationException extends Exception{
	public ImogSerializationException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass skip(MyHelperClass o0){ return null; }
	public MyHelperClass available(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
