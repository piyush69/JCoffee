import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12576210 {

    public static FTPClient createConnection(String hostname, int port, char[] username, char[] password, String workingDirectory, FileSystemOptions fileSystemOptions) throws Throwable, FileSystemException {
        if (username == null) username = "anonymous".toCharArray();
        if (password == null) password = "anonymous".toCharArray();
        try {
            final FTPClient client = new FTPClient();
            MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
            String key =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getEntryParser(fileSystemOptions);
            if (key != null) {
                FTPClientConfig config = new FTPClientConfig(key);
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                String serverLanguageCode =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getServerLanguageCode(fileSystemOptions);
                if (serverLanguageCode != null) config.setServerLanguageCode(serverLanguageCode);
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                String defaultDateFormat =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getDefaultDateFormat(fileSystemOptions);
                if (defaultDateFormat != null) config.setDefaultDateFormatStr(defaultDateFormat);
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                String recentDateFormat =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getRecentDateFormat(fileSystemOptions);
                if (recentDateFormat != null) config.setRecentDateFormatStr(recentDateFormat);
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                String serverTimeZoneId =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getServerTimeZoneId(fileSystemOptions);
                if (serverTimeZoneId != null) config.setServerTimeZoneId(serverTimeZoneId);
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                String[] shortMonthNames =(String[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getShortMonthNames(fileSystemOptions);
                if (shortMonthNames != null) {
                    StringBuffer shortMonthNamesStr = new StringBuffer(40);
                    for (int i = 0; i < shortMonthNames.length; i++) {
                        if (shortMonthNamesStr.length() > 0) shortMonthNamesStr.append("|");
                        shortMonthNamesStr.append(shortMonthNames[i]);
                    }
                    config.setShortMonthNames(shortMonthNamesStr.toString());
                }
                client.configure(config);
            }
//            MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
            FTPFileEntryParserFactory myFactory =(FTPFileEntryParserFactory)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getEntryParserFactory(fileSystemOptions);
            if (myFactory != null) client.setParserFactory(myFactory);
            try {
                client.connect(hostname, port);
                int reply =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) throw new FileSystemException("vfs.provider.ftp/connect-rejected.error", hostname);
                MyHelperClass UserAuthenticatorUtils = new MyHelperClass();
                if (!client.login(UserAuthenticatorUtils.toString(username), UserAuthenticatorUtils.toString(password))) throw new FileSystemException("vfs.provider.ftp/login.error", new Object[] {(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) hostname, UserAuthenticatorUtils.toString(username) }, null);
                MyHelperClass FTP = new MyHelperClass();
                if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)client.setFileType(FTP.BINARY_FILE_TYPE)) throw new FileSystemException("vfs.provider.ftp/set-binary.error", hostname);
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                Integer dataTimeout =(Integer)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getDataTimeout(fileSystemOptions);
                if (dataTimeout != null) client.setDataTimeout(dataTimeout.intValue());
                try {
//                    MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                    FtpFileSystemConfigBuilder.getInstance().setHomeDir(fileSystemOptions, client.printWorkingDirectory());
                } catch (IOException ex) {
                    throw new FileSystemException("Error obtaining working directory!");
                }
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                Boolean userDirIsRoot =(Boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getUserDirIsRoot(fileSystemOptions);
                if (workingDirectory != null && (userDirIsRoot == null || !userDirIsRoot.booleanValue())) if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)client.changeWorkingDirectory(workingDirectory)) throw new FileSystemException("vfs.provider.ftp/change-work-directory.error", workingDirectory);
//                MyHelperClass FtpFileSystemConfigBuilder = new MyHelperClass();
                Boolean passiveMode =(Boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FtpFileSystemConfigBuilder.getInstance().getPassiveMode(fileSystemOptions);
                if (passiveMode != null && passiveMode.booleanValue()) client.enterLocalPassiveMode();
            } catch (final IOException e) {
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)client.isConnected()) client.disconnect();
                throw e;
            }
            return client;
        } catch (final Exception exc) {
            throw new FileSystemException("vfs.provider.ftp/connect.error", new Object[] {(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) hostname }, exc);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getDataTimeout(FileSystemOptions o0){ return null; }
	public MyHelperClass getRecentDateFormat(FileSystemOptions o0){ return null; }
	public MyHelperClass getServerLanguageCode(FileSystemOptions o0){ return null; }
	public MyHelperClass setHomeDir(FileSystemOptions o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getEntryParser(FileSystemOptions o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getUserDirIsRoot(FileSystemOptions o0){ return null; }
	public MyHelperClass getShortMonthNames(FileSystemOptions o0){ return null; }
	public MyHelperClass getPassiveMode(FileSystemOptions o0){ return null; }
	public MyHelperClass getDefaultDateFormat(FileSystemOptions o0){ return null; }
	public MyHelperClass getServerTimeZoneId(FileSystemOptions o0){ return null; }
	public MyHelperClass getEntryParserFactory(FileSystemOptions o0){ return null; }}

class FileSystemOptions {

}

class FTPClient {

public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass setParserFactory(FTPFileEntryParserFactory o0){ return null; }
	public MyHelperClass setDataTimeout(int o0){ return null; }
	public MyHelperClass configure(FTPClientConfig o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class FileSystemException extends Exception{
	public FileSystemException(String errorMessage) { super(errorMessage); }
	FileSystemException(String o0, Object[] o1, Object o2){}
	FileSystemException(){}
	FileSystemException(String o0, Object[] o1, Exception o2){}
	FileSystemException(String o0, String o1){}
}

class FTPClientConfig {

FTPClientConfig(){}
	FTPClientConfig(String o0){}
	public MyHelperClass setRecentDateFormatStr(String o0){ return null; }
	public MyHelperClass setDefaultDateFormatStr(String o0){ return null; }
	public MyHelperClass setShortMonthNames(String o0){ return null; }
	public MyHelperClass setServerLanguageCode(String o0){ return null; }
	public MyHelperClass setServerTimeZoneId(String o0){ return null; }}

class FTPFileEntryParserFactory {

}

class Object {

public MyHelperClass toString(char[] o0){ return null; }}
