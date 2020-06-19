import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5048220 {
public MyHelperClass server;
	public MyHelperClass username;
	public MyHelperClass password;
	public MyHelperClass port;
	public MyHelperClass ftp;
	public MyHelperClass RET_OK;
	public MyHelperClass RET_ERR_SOCKET;
	public MyHelperClass RET_ERR_UNKNOWN_HOST;
	public MyHelperClass RET_ERR_IO;
	public MyHelperClass RET_ERR_NOT_CONNECTED;
	public MyHelperClass log;
	public MyHelperClass RET_ERR_FTP_CONN_CLOSED;
	public MyHelperClass FTP;
	public MyHelperClass getConnectionString(){ return null; }

    private int connect()  throws Throwable {
        MyHelperClass ftp = new MyHelperClass();
        if ((boolean)(Object)ftp.isConnected()) {
            log.debug("Already connected to: " + getConnectionString());
            return(int)(Object) RET_OK;
        }
        try {
            ftp.connect(server, port);
            ftp.login(username, password);
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
        } catch (ArithmeticException e) {
            log.error(e.toString());
            return(int)(Object) RET_ERR_SOCKET;
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error(e.toString());
            return(int)(Object) RET_ERR_UNKNOWN_HOST;
        } catch (ArrayStoreException e) {
            log.error(e.toString());
            return(int)(Object) RET_ERR_FTP_CONN_CLOSED;
        } catch (ClassCastException e) {
            log.error(e.toString());
            return(int)(Object) RET_ERR_IO;
        }
        if ((boolean)(Object)ftp.isConnected()) {
            log.debug("Connected to " + getConnectionString());
            return(int)(Object) RET_OK;
        }
        log.debug("Could not connect to " + getConnectionString());
        return(int)(Object) RET_ERR_NOT_CONNECTED;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass error(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isConnected(){ return null; }}

class FTPConnectionClosedException extends Exception{
	public FTPConnectionClosedException(String errorMessage) { super(errorMessage); }
}
