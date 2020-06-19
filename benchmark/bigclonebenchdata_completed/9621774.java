import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c9621774 {
public MyHelperClass NULL;
public MyHelperClass logger;
	public MyHelperClass channelObject;

    public void initResources() throws XAwareException {
        final String methodName = "initResources";
        MyHelperClass initialized = new MyHelperClass();
        if (!(Boolean)(Object)initialized) {
            MyHelperClass XAwareConstants = new MyHelperClass();
            String host =(String)(Object) channelObject.getProperty(XAwareConstants.BIZDRIVER_HOST);
            if (host == null || host.trim().length() == 0) {
                throw new XAwareException("xa:host must be specified.");
            }
//            MyHelperClass XAwareConstants = new MyHelperClass();
            String portString =(String)(Object) channelObject.getProperty(XAwareConstants.BIZDRIVER_PORT);
            if (portString == null || portString.trim().length() == 0) {
                throw new XAwareException("xa:port must be specified.");
            }
            int port = 0;
            try {
                port = Integer.parseInt(portString);
            } catch (Exception exception) {
                throw new XAwareException("xa:port must be numeric.");
            }
//            MyHelperClass XAwareConstants = new MyHelperClass();
            String remoteVerification =(String)(Object) channelObject.getProperty(XAwareConstants.XAWARE_FTP_REMOTE_VERIFICATION);
//            MyHelperClass XAwareConstants = new MyHelperClass();
            String userName =(String)(Object) channelObject.getProperty(XAwareConstants.BIZDRIVER_USER);
//            MyHelperClass XAwareConstants = new MyHelperClass();
            String password =(String)(Object) channelObject.getProperty(XAwareConstants.BIZDRIVER_PWD);
//            MyHelperClass XAwareConstants = new MyHelperClass();
            String proxyUser =(String)(Object) channelObject.getProperty(XAwareConstants.BIZCOMPONENT_ATTR_PROXYUSER);
//            MyHelperClass XAwareConstants = new MyHelperClass();
            String proxyPassword =(String)(Object) channelObject.getProperty(XAwareConstants.BIZCOMPONENT_ATTR_PROXYPASSWORD);
            FTPClient ftpClient =(FTPClient)(Object) NULL; //new FTPClient();
            ftpClient = new FTPClient();
            MyHelperClass className = new MyHelperClass();
            logger.finest("Connecting to host:" + host + " Port:" + port, className, methodName);
            try {
//                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient.connect(host, port);
//                MyHelperClass XAwareConstants = new MyHelperClass();
                if (remoteVerification != null && remoteVerification.trim().equals(XAwareConstants.XAWARE_YES)) {
//                    MyHelperClass ftpClient = new MyHelperClass();
                    ftpClient.setRemoteVerificationEnabled(true);
                } else {
//                    MyHelperClass ftpClient = new MyHelperClass();
                    ftpClient.setRemoteVerificationEnabled(false);
                }
//                MyHelperClass ftpClient = new MyHelperClass();
                final int reply =(int)(Object) ftpClient.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                    MyHelperClass ftpClient = new MyHelperClass();
                    ftpClient.disconnect();
                    String errorMessage = "FTP server refused connection. Error Code:" + reply;
//                    MyHelperClass className = new MyHelperClass();
                    logger.severe(errorMessage, className, methodName);
                    throw new XAwareException(errorMessage);
                }
//                MyHelperClass className = new MyHelperClass();
                logger.finest("Logging in User:" + userName + " PWD:" + password, className, methodName);
//                MyHelperClass ftpClient = new MyHelperClass();
                if (!(Boolean)(Object)ftpClient.login(userName, password)) {
//                    MyHelperClass ftpClient = new MyHelperClass();
                    ftpClient.logout();
                    String errorMessage = "Error logging into server. Please check credentials.";
//                    MyHelperClass className = new MyHelperClass();
                    logger.severe(errorMessage, className, methodName);
                    throw new XAwareException(errorMessage);
                }
                if (proxyUser != null && proxyUser.trim().length() > 0) {
//                    MyHelperClass className = new MyHelperClass();
                    logger.finest("Logging in again proxy UID:" + proxyUser + " proxy password:" + proxyPassword, className, methodName);
//                    MyHelperClass ftpClient = new MyHelperClass();
                    if (!(Boolean)(Object)ftpClient.login(proxyUser, proxyPassword)) {
//                        MyHelperClass ftpClient = new MyHelperClass();
                        ftpClient.logout();
                        String errorMessage = "Error logging using proxy user/pwd. Please check proxy credentials.";
//                        MyHelperClass className = new MyHelperClass();
                        logger.severe(errorMessage, className, methodName);
                        throw new XAwareException(errorMessage);
                    }
                }
            } catch (UncheckedIOException e) {
                MyHelperClass ExceptionMessageHelper = new MyHelperClass();
                String errorMessage = "SocketException: " + ExceptionMessageHelper.getExceptionMessage((SocketException)(Object)e);
//                MyHelperClass className = new MyHelperClass();
                logger.severe(errorMessage, className, methodName);
                throw new XAwareException(errorMessage,(SocketException)(Object) e);
            } catch (ArithmeticException e) {
                MyHelperClass ExceptionMessageHelper = new MyHelperClass();
                String errorMessage = "IOException: " + ExceptionMessageHelper.getExceptionMessage((SocketException)(Object)e);
//                MyHelperClass className = new MyHelperClass();
                logger.severe(errorMessage, className, methodName);
                throw new XAwareException(errorMessage,(SocketException)(Object) e);
            }
//            MyHelperClass className = new MyHelperClass();
            logger.finest("Connected to host:" + host + " Port:" + port, className, methodName);
//            MyHelperClass initialized = new MyHelperClass();
            initialized =(MyHelperClass)(Object) true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BIZCOMPONENT_ATTR_PROXYUSER;
	public MyHelperClass BIZDRIVER_PORT;
	public MyHelperClass BIZCOMPONENT_ATTR_PROXYPASSWORD;
	public MyHelperClass BIZDRIVER_USER;
	public MyHelperClass XAWARE_YES;
	public MyHelperClass BIZDRIVER_HOST;
	public MyHelperClass XAWARE_FTP_REMOTE_VERIFICATION;
	public MyHelperClass BIZDRIVER_PWD;
public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass getExceptionMessage(SocketException o0){ return null; }
	public MyHelperClass severe(String o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass setRemoteVerificationEnabled(boolean o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass finest(String o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass getExceptionMessage(IOException o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class XAwareException extends Exception{
	public XAwareException(String errorMessage) { super(errorMessage); }
	XAwareException(String o0, SocketException o1){}
	XAwareException(){}
	XAwareException(String o0, IOException o1){}
}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass setRemoteVerificationEnabled(boolean o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}
