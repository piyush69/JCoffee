import java.io.*;
import java.lang.*;
import java.util.*;



class c21836608 {
public MyHelperClass password;
	public MyHelperClass FTPReply;
	public MyHelperClass _logger;
	public MyHelperClass port;
public MyHelperClass disconnect(){ return null; }

    private void connect() throws Exception {
        MyHelperClass client = new MyHelperClass();
        if (client != null) throw new IllegalStateException("Already connected.");
        try {
            MyHelperClass server = new MyHelperClass();
            _logger.debug("About to connect to ftp server " + server + " port " + port);
//            MyHelperClass client = new MyHelperClass();
            client =(MyHelperClass)(Object) new FTPClient();
//            MyHelperClass server = new MyHelperClass();
            client.connect(server, port);
//            MyHelperClass client = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(client.getReplyCode())) {
//                MyHelperClass server = new MyHelperClass();
                throw new Exception("Unable to connect to FTP server " + server + " port " + port + " got error [" + client.getReplyString() + "]");
            }
//            MyHelperClass server = new MyHelperClass();
            _logger.info("Connected to ftp server " + server + " port " + port);
//            MyHelperClass client = new MyHelperClass();
            _logger.debug((String)(Object)client.getReplyString());
//            MyHelperClass client = new MyHelperClass();
            _logger.debug("FTP server is [" + client.getSystemName() + "]");
            MyHelperClass username = new MyHelperClass();
            if (!(Boolean)(Object)client.login(username, password)) {
//                MyHelperClass server = new MyHelperClass();
                throw new Exception("Invalid username / password combination for FTP server " + server + " port " + port);
            }
            MyHelperClass _logger = new MyHelperClass();
            _logger.debug("Log in successful.");
            MyHelperClass passiveMode = new MyHelperClass();
            if ((boolean)(Object)passiveMode) {
//                MyHelperClass client = new MyHelperClass();
                client.enterLocalPassiveMode();
//                MyHelperClass _logger = new MyHelperClass();
                _logger.debug("Passive mode selected.");
            } else {
//                MyHelperClass client = new MyHelperClass();
                client.enterLocalActiveMode();
//                MyHelperClass _logger = new MyHelperClass();
                _logger.debug("Active mode selected.");
            }
            MyHelperClass binaryMode = new MyHelperClass();
            if ((boolean)(Object)binaryMode) {
                MyHelperClass FTP = new MyHelperClass();
                client.setFileType(FTP.BINARY_FILE_TYPE);
//                MyHelperClass _logger = new MyHelperClass();
                _logger.debug("BINARY mode selected.");
            } else {
                MyHelperClass FTP = new MyHelperClass();
                client.setFileType(FTP.ASCII_FILE_TYPE);
//                MyHelperClass _logger = new MyHelperClass();
                _logger.debug("ASCII mode selected.");
            }
            MyHelperClass remoteRootDir = new MyHelperClass();
            if ((boolean)(Object)client.changeWorkingDirectory(remoteRootDir)) {
//                MyHelperClass remoteRootDir = new MyHelperClass();
                _logger.debug("Changed directory to " + remoteRootDir);
            } else {
//                MyHelperClass remoteRootDir = new MyHelperClass();
                if ((boolean)(Object)client.makeDirectory(remoteRootDir)) {
//                    MyHelperClass remoteRootDir = new MyHelperClass();
                    _logger.debug("Created directory " + remoteRootDir);
//                    MyHelperClass remoteRootDir = new MyHelperClass();
                    if ((boolean)(Object)client.changeWorkingDirectory(remoteRootDir)) {
//                        MyHelperClass remoteRootDir = new MyHelperClass();
                        _logger.debug("Changed directory to " + remoteRootDir);
                    } else {
//                        MyHelperClass remoteRootDir = new MyHelperClass();
                        throw new Exception("Cannot change directory to [" + remoteRootDir + "] on FTP server " + server + " port " + port);
                    }
                } else {
//                    MyHelperClass remoteRootDir = new MyHelperClass();
                    throw new Exception("Cannot create directory [" + remoteRootDir + "] on FTP server " + server + " port " + port);
                }
            }
        } catch (Exception e) {
            disconnect();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASCII_FILE_TYPE;
	public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass enterLocalActiveMode(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass getSystemName(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass makeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FTPClient {

}
