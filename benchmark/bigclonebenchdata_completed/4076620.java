
import java.io.UncheckedIOException;


class c4076620 {
public MyHelperClass IOUtils;
	public MyHelperClass ftpClient;
	public MyHelperClass server;
	public MyHelperClass checkFtpClient(){ return null; }

    public boolean downloadFile(String sourceFilename, String targetFilename) throws RQLException {
        checkFtpClient();
        InputStream in = null;
        try {
            in =(InputStream)(Object) ftpClient.retrieveFileStream(sourceFilename);
            if (in == null) {
                return false;
            }
            FileOutputStream target = new FileOutputStream(targetFilename);
            IOUtils.copy(in, target);
            in.close();
            target.close();
            return(boolean)(Object) ftpClient.completePendingCommand();
        } catch (UncheckedIOException ex) {
            throw new RQLException("Download of file with name " + sourceFilename + " via FTP from server " + server + " failed.",(IOException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass completePendingCommand(){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class RQLException extends Exception{
	public RQLException(String errorMessage) { super(errorMessage); }
	RQLException(){}
	RQLException(String o0, IOException o1){}
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
