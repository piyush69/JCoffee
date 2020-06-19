import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c5401999 {
public MyHelperClass NULL;
public MyHelperClass FTPClientConfig;
	public MyHelperClass FTP;

//    @Override
    protected void setUp() throws Exception {
        this.setUp();
        FTPClientConfig FTPConf =(FTPClientConfig)(Object) NULL; //new FTPClientConfig();
        FTPConf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
//        MyHelperClass FTPConf = new MyHelperClass();
        FTPConf.setServerTimeZoneId("GMT");
//        MyHelperClass FTPConf = new MyHelperClass();
        FTP.configure((MyHelperClass)(Object)FTPConf);
        try {
            MyHelperClass FTP = new MyHelperClass();
            FTP.connect("tgftp.nws.noaa.gov");
//            MyHelperClass FTP = new MyHelperClass();
            FTP.login("anonymous", "testing@apache.org");
//            MyHelperClass FTP = new MyHelperClass();
            FTP.changeWorkingDirectory("SL.us008001/DF.an/DC.sflnd/DS.metar");
//            MyHelperClass FTP = new MyHelperClass();
            FTP.enterLocalPassiveMode();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYST_UNIX;
public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass setServerTimeZoneId(String o0){ return null; }
	public MyHelperClass configure(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class FTPClientConfig {

FTPClientConfig(){}
	FTPClientConfig(MyHelperClass o0){}
	public MyHelperClass setServerTimeZoneId(String o0){ return null; }}
