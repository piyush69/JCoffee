import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19774092 {
public MyHelperClass numDir;
	public MyHelperClass ftpPort;
	public MyHelperClass bw;
	public MyHelperClass ftpServer;
	public MyHelperClass remoteFileStrings;
	public MyHelperClass remoteFilePatterns;
	public MyHelperClass client;
	public MyHelperClass password;
	public MyHelperClass remoteDir;
	public MyHelperClass username;
	public MyHelperClass Project;
	public MyHelperClass checkInput(){ return null; }

    public void execute()  throws Throwable {
        checkInput();
        try {
            client = new FTPClient();
            log("Connecting to " + ftpServer, Project.MSG_INFO);
            client.connect(ftpServer, ftpPort);
            checkFtpCode(client, "FTP server refused connection:");
            log("Connected", Project.MSG_INFO);
            log("Logging in", Project.MSG_INFO);
            if (!client.login(username, password)) {
                log("Login failed: " + client.getReplyString(), Project.MSG_ERR);
            }
            log("Login successful", Project.MSG_INFO);
            client.enterLocalPassiveMode();
            checkFtpCode(client, "Couldn't change connection type to passive: ");
            log("Changed to passive mode.", Project.MSG_VERBOSE);
            client.changeWorkingDirectory(remoteDir);
            checkFtpCode(client, "Can't change to directory: " + remoteDir);
            log("Listing FTP files", Project.MSG_INFO);
            for (int i = 0; i < remoteFileStrings.length; i++) {
                remoteFilePatterns = makePattern(remoteFileStrings[i]);
                numDir = remoteFilePatterns.length - 1;
                log("Setting number of directories to: " + numDir, Project.MSG_VERBOSE);
                FTPFile[] files = client.listFiles(remoteDir);
                files = followSymLink(client, files);
                log("# of files in " + remoteDir + " is " + files.length, Project.MSG_VERBOSE);
                scanDir(0, numDir, files, null);
            }
            bw.flush();
            bw.close();
        } catch (IOException ioe) {
            if (client.isConnected()) {
                try {
                    client.disconnect();
                } catch (IOException iof) {
                }
            }
            log("Could not connect to " + ftpServer + " " + ioe.getMessage(), Project.MSG_ERR);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

}

class FTPFile {

}
