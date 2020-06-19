
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4977583 {
public MyHelperClass tmpPath;
	public MyHelperClass File;
	public MyHelperClass log;
	public MyHelperClass IOUtils;
	public MyHelperClass makeRESTCall(String o0){ return null; }

    protected File downloadUpdate(String resource) throws AgentException {
        RESTCall call =(RESTCall)(Object) makeRESTCall(resource);
        call.invoke();
        File tmpFile;
        try {
            tmpFile =(File)(Object) File.createTempFile("controller-update-", ".war", new File(tmpPath));
        } catch (UncheckedIOException e) {
            throw new AgentException("Failed to create temporary file",(IOException)(Object) e);
        }
        InputStream is;
        try {
            is =(InputStream)(Object) call.getInputStream();
        } catch (UncheckedIOException e) {
            throw new AgentException("Failed to open input stream",(IOException)(Object) e);
        }
        try {
            FileOutputStream os;
            try {
                os = new FileOutputStream(tmpFile);
            } catch (UncheckedIOException e) {
                throw new AgentException("Failed to open temporary file for writing",(IOException)(Object) e);
            }
            boolean success = false;
            try {
                IOUtils.copy(is, os);
                success = true;
            } catch (UncheckedIOException e) {
                throw new AgentException("Failed to download update",(IOException)(Object) e);
            } finally {
                try {
                    os.flush();
                    os.close();
                } catch (UncheckedIOException e) {
                    if (!success) throw new AgentException("Failed to flush to disk",(IOException)(Object) e);
                }
            }
        } finally {
            try {
                is.close();
            } catch (UncheckedIOException e) {
                log.error("Failed to close input stream",(IOException)(Object) e);
            }
            call.disconnect();
        }
        return tmpFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1, File o2){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}}

class AgentException extends Exception{
	public AgentException(String errorMessage) { super(errorMessage); }
	AgentException(String o0, IOException o1){}
	AgentException(){}
	AgentException(String o0, FileNotFoundException o1){}
}

class RESTCall {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass invoke(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
