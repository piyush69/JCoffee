import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4003117 {
public MyHelperClass Files;
	public MyHelperClass host;
	public MyHelperClass userid;
	public MyHelperClass binary;
	public MyHelperClass remotedir;
	public MyHelperClass remotefile;
	public MyHelperClass port;
	public MyHelperClass localdir;
	public MyHelperClass serverpathseparator;
	public MyHelperClass password;
	public MyHelperClass FTP;
	public MyHelperClass FTPReply;
	public MyHelperClass check(){ return null; }

    public void execute()  throws Throwable {
        check();
        FTPClient ftp = new FTPClient();
        try {
            ftp.connect(host, port);
        } catch (IOException ex) {
            throw new BuildException("FTP connexion failed : IOException caught (" + ex.getMessage() + ")");
        }
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
            throw new BuildException("FTP connexion failed : " + ftp.getReplyString());
        }
        try {
            try {
                if (!(Boolean)(Object)ftp.login(userid, password)) {
                    throw new BuildException("Identification failed");
                }
            } catch (IOException ex) {
                throw new BuildException((String)(Object)ex);
            }
            if ((boolean)(Object)binary) {
                try {
                    ftp.setFileType(FTP.IMAGE_FILE_TYPE);
                } catch (IOException ex) {
                    throw new BuildException((String)(Object)ex);
                }
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                    throw new BuildException("Transfer type not supported : " + ftp.getReplyString());
                }
            }
            try {
                ftp.changeWorkingDirectory(remotedir);
            } catch (IOException ex) {
                throw new BuildException((String)(Object)ex);
            }
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                throw new BuildException("Unacessible remote directory : " + ftp.getReplyString());
            }
            String localFullFileName =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) Files.normalizeDirectoryName(localdir) + (int)(Object)remotefile;
            String remoteFullFileName =(int)(Object)(String)(Object)(String)(Object)(String)(Object) ((boolean)(Object)remotedir.endsWith(serverpathseparator) ? remotedir :(int)(Object) remotedir + (int)(Object)serverpathseparator) + (int)(Object)(Object)(Object)remotefile;
            BufferedOutputStream outstream = null;
            try {
                outstream = new BufferedOutputStream(new FileOutputStream(localFullFileName));
                ftp.retrieveFile(remoteFullFileName, outstream);
            } catch (IOException ex) {
                throw new BuildException((String)(Object)ex);
            }
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                throw new BuildException("File retrieval of '" + localFullFileName + "' has failed (" + ftp.getReplyString() + ")");
            }
        } finally {
            try {
                ftp.disconnect();
            } catch (IOException ex) {
                System.err.println("Disconnexion from " + host + ":" + port + " failed");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGE_FILE_TYPE;
public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass normalizeDirectoryName(MyHelperClass o0){ return null; }
	public MyHelperClass endsWith(MyHelperClass o0){ return null; }}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass retrieveFile(String o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}
