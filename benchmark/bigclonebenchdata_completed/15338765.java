import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15338765 {
public MyHelperClass uploadFile(String o0, ByteArrayInputStream o1, FTPClient o2){ return null; }
	public MyHelperClass serializeDocument(MyHelperClass o0){ return null; }
public MyHelperClass _fileNames2Progress;
	public MyHelperClass _totalUploadSize;
	public MyHelperClass FTP;
	public MyHelperClass FTPReply;
	public MyHelperClass getMetaDocument(){ return null; }
	public MyHelperClass getFtpServer(){ return null; }
	public MyHelperClass isCancelled(){ return null; }
	public MyHelperClass checkinCompleted(){ return null; }
	public MyHelperClass getFilesDocument(){ return null; }
	public MyHelperClass getIdentifier(){ return null; }
	public MyHelperClass checkinStarted(){ return null; }
	public MyHelperClass getFiles(){ return null; }
	public MyHelperClass checkin(){ return null; }
	public MyHelperClass isFtpDirPreMade(){ return null; }
	public MyHelperClass getFtpPath(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass connected(){ return null; }

    public void upload() throws Throwable, UnknownHostException, SocketException, FTPConnectionClosedException, LoginFailedException, DirectoryChangeFailedException, CopyStreamException, RefusedConnectionException, IOException {
        final int NUM_XML_FILES = 2;
        final String META_XML_SUFFIX = "_meta.xml";
        final String FILES_XML_SUFFIX = "_files.xml";
        final String username =(String)(Object) getUsername();
        final String password =(String)(Object) getPassword();
        if (getFtpServer() == null) {
            throw new IllegalStateException("ftp server not set");
        }
        if (getFtpPath() == null) {
            throw new IllegalStateException("ftp path not set");
        }
        if (username == null) {
            throw new IllegalStateException("username not set");
        }
        if (password == null) {
            throw new IllegalStateException("password not set");
        }
        final String metaXmlString =(String)(Object) serializeDocument(getMetaDocument());
        final String filesXmlString =(String)(Object) serializeDocument(getFilesDocument());
        final byte[] metaXmlBytes = metaXmlString.getBytes();
        final byte[] filesXmlBytes = filesXmlString.getBytes();
        final int metaXmlLength = metaXmlBytes.length;
        final int filesXmlLength = filesXmlBytes.length;
        final Collection files =(Collection)(Object) getFiles();
        final int totalFiles = NUM_XML_FILES + files.size();
        final String[] fileNames = new String[totalFiles];
        final long[] fileSizes = new long[totalFiles];
        final String metaXmlName = getIdentifier() + META_XML_SUFFIX;
        fileNames[0] = metaXmlName;
        fileSizes[0] = metaXmlLength;
        final String filesXmlName = getIdentifier() + FILES_XML_SUFFIX;
        fileNames[1] = filesXmlName;
        fileSizes[1] = filesXmlLength;
        int j = 2;
        for (Iterator i = files.iterator(); i.hasNext(); ) {
            final ArchiveFile f = (ArchiveFile) i.next();
            fileNames[j] =(String)(Object) f.getRemoteFileName();
            fileSizes[j] =(long)(Object) f.getFileSize();
            j++;
        }
        for (int i = 0; i < fileSizes.length; i++) {
            _fileNames2Progress.put(fileNames[i], new UploadFileProgress(fileSizes[i]));
           (long)(Object) _totalUploadSize += fileSizes[i];
        }
        FTPClient ftp = new FTPClient();
        try {
            if ((boolean)(Object)isCancelled()) {
                return;
            }
            ftp.enterLocalPassiveMode();
            if ((boolean)(Object)isCancelled()) {
                return;
            }
            ftp.connect(getFtpServer());
            final int reply =(int)(Object) ftp.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                throw new RefusedConnectionException(getFtpServer() + "refused FTP connection");
            }
            if ((boolean)(Object)isCancelled()) {
                return;
            }
            if (!(Boolean)(Object)ftp.login(username, password)) {
                throw new LoginFailedException();
            }
            try {
                if (!(Boolean)(Object)ftp.changeWorkingDirectory(getFtpPath())) {
                    if (!(Boolean)(Object)isFtpDirPreMade() && !(Boolean)(Object)ftp.makeDirectory(getFtpPath())) {
                        throw new DirectoryChangeFailedException();
                    }
                    if ((boolean)(Object)isCancelled()) {
                        return;
                    }
                    if (!(Boolean)(Object)ftp.changeWorkingDirectory(getFtpPath())) {
                        throw new DirectoryChangeFailedException();
                    }
                }
                if ((boolean)(Object)isCancelled()) {
                    return;
                }
                connected();
                uploadFile(metaXmlName, new ByteArrayInputStream(metaXmlBytes), ftp);
                uploadFile(filesXmlName, new ByteArrayInputStream(filesXmlBytes), ftp);
                if ((boolean)(Object)isCancelled()) {
                    return;
                }
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
                for (final Iterator i = files.iterator(); i.hasNext(); ) {
                    final ArchiveFile f = (ArchiveFile) i.next();
                    uploadFile((String)(Object)f.getRemoteFileName(),(ByteArrayInputStream)(Object) new FileInputStream((String)(Object)f.getIOFile()), ftp);
                }
            } catch (InterruptedIOException ioe) {
                return;
            } finally {
                ftp.logout();
            }
        } finally {
            try {
                ftp.disconnect();
            } catch (IOException e) {
            }
        }
        if ((boolean)(Object)isCancelled()) {
            return;
        }
        checkinStarted();
        if ((boolean)(Object)isCancelled()) {
            return;
        }
        checkin();
        if ((boolean)(Object)isCancelled()) {
            return;
        }
        checkinCompleted();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass put(String o0, UploadFileProgress o1){ return null; }}

class FTPConnectionClosedException extends Exception{
	public FTPConnectionClosedException(String errorMessage) { super(errorMessage); }
}

class LoginFailedException extends Exception{
	public LoginFailedException(String errorMessage) { super(errorMessage); }
	LoginFailedException(){}
}

class DirectoryChangeFailedException extends Exception{
	public DirectoryChangeFailedException(String errorMessage) { super(errorMessage); }
	DirectoryChangeFailedException(){}
}

class CopyStreamException extends Exception{
	public CopyStreamException(String errorMessage) { super(errorMessage); }
}

class RefusedConnectionException extends Exception{
	public RefusedConnectionException(String errorMessage) { super(errorMessage); }
}

class ArchiveFile {

public MyHelperClass getRemoteFileName(){ return null; }
	public MyHelperClass getFileSize(){ return null; }
	public MyHelperClass getIOFile(){ return null; }}

class UploadFileProgress {

UploadFileProgress(long o0){}
	UploadFileProgress(){}}

class FTPClient {

public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass makeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}
