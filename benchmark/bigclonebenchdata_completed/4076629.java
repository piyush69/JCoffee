
import java.io.UncheckedIOException;


class c4076629 {
public MyHelperClass IOUtils;
	public MyHelperClass ftpClient;
	public MyHelperClass server;
	public MyHelperClass checkFtpClient(){ return null; }

    public void uploadFile(String filename) throws RQLException {
        checkFtpClient();
        OutputStream out = null;
        try {
            out =(OutputStream)(Object) ftpClient.storeFileStream(filename);
            IOUtils.copy(new FileReader(filename), out);
            out.close();
            ftpClient.completePendingCommand();
        } catch (UncheckedIOException ex) {
            throw new RQLException("Upload of local file with name " + filename + " via FTP to server " + server + " failed.",(IOException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass completePendingCommand(){ return null; }
	public MyHelperClass copy(FileReader o0, OutputStream o1){ return null; }
	public MyHelperClass storeFileStream(String o0){ return null; }}

class RQLException extends Exception{
	public RQLException(String errorMessage) { super(errorMessage); }
	RQLException(){}
	RQLException(String o0, IOException o1){}
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
