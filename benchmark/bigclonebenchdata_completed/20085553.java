
import java.io.UncheckedIOException;


class c20085553 {

    public int sftp_connect(HttpServletRequest request) {
        Map setting = (Map)(Map)(Object) request.getAttribute("globalSetting");
        MyHelperClass Common = new MyHelperClass();
        int ftpssl =(int)(Object) Common.intval(setting.get("ftpssl") + "");
        String ftphost = setting.get("ftphost") + "";
//        MyHelperClass Common = new MyHelperClass();
        int ftpport =(int)(Object) Common.intval(setting.get("ftpport") + "");
        String ftpuser = setting.get("ftpuser") + "";
        String ftppassword = setting.get("ftppassword") + "";
//        MyHelperClass Common = new MyHelperClass();
        int ftppasv =(int)(Object) Common.intval(setting.get("ftppasv") + "");
        String ftpdir = setting.get("ftpdir") + "";
//        MyHelperClass Common = new MyHelperClass();
        int ftptimeout =(int)(Object) Common.intval(setting.get("ftptimeout") + "");
        if (ftpssl > 0) {
            try {
                FTPSClient fc;// = new FTPSClient();
                fc = new FTPSClient();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                MyHelperClass JC_FTPClientException = new MyHelperClass();
                return (int)(Object)JC_FTPClientException;
            }
        } else {
            FTPClient fc;// = new FTPClient();
            fc = new FTPClient();
        }
        try {
            MyHelperClass fc = new MyHelperClass();
            fc.setConnectTimeout(20000);
            MyHelperClass InetAddress = new MyHelperClass();
            InetAddress inetAddress =(InetAddress)(Object) InetAddress.getByName(ftphost);
//            MyHelperClass fc = new MyHelperClass();
            fc.connect(inetAddress, ftpport);
//            MyHelperClass fc = new MyHelperClass();
            if ((boolean)(Object)fc.login(ftpuser, ftppassword)) {
                if (ftppasv > 0) {
//                    MyHelperClass fc = new MyHelperClass();
                    fc.pasv();
                }
                if (ftptimeout > 0) {
//                    MyHelperClass fc = new MyHelperClass();
                    fc.setDataTimeout(ftptimeout);
                }
//                MyHelperClass fc = new MyHelperClass();
                if ((boolean)(Object)fc.changeWorkingDirectory(ftpdir)) {
                    MyHelperClass JC_FTPClientYES = new MyHelperClass();
                    return (int)(Object)JC_FTPClientYES;
                } else {
                    MyHelperClass FileHelper = new MyHelperClass();
                    FileHelper.writeLog(request, "FTP", "CHDIR " + ftpdir + " ERROR.");
                    try {
//                        MyHelperClass fc = new MyHelperClass();
                        fc.disconnect();
//                        MyHelperClass fc = new MyHelperClass();
                        fc = null;
                    } catch (Exception e1) {
                    }
                    MyHelperClass JC_FTPClientNO = new MyHelperClass();
                    return (int)(Object)JC_FTPClientNO;
                }
            } else {
                MyHelperClass FileHelper = new MyHelperClass();
                FileHelper.writeLog(request, "FTP", "530 NOT LOGGED IN.");
                try {
//                    MyHelperClass fc = new MyHelperClass();
                    fc.disconnect();
//                    MyHelperClass fc = new MyHelperClass();
                    fc = null;
                } catch (Exception e1) {
                }
                MyHelperClass JC_FTPClientNO = new MyHelperClass();
                return (int)(Object)JC_FTPClientNO;
            }
        } catch (Exception e) {
            MyHelperClass FileHelper = new MyHelperClass();
            FileHelper.writeLog(request, "FTP", "COULDN'T CONNECT TO " + ftphost + ":" + ftpport + ".");
            e.printStackTrace();
            MyHelperClass fc = new MyHelperClass();
            if (fc != null) {
                try {
//                    MyHelperClass fc = new MyHelperClass();
                    fc.disconnect();
//                    MyHelperClass fc = new MyHelperClass();
                    fc = null;
                } catch (Exception e1) {
                }
            }
            MyHelperClass JC_FTPClientException = new MyHelperClass();
            return (int)(Object)JC_FTPClientException;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeLog(HttpServletRequest o0, String o1, String o2){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getByName(String o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass intval(String o0){ return null; }
	public MyHelperClass pasv(){ return null; }
	public MyHelperClass setDataTimeout(int o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getAttribute(String o0){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class InetAddress {

}

class FTPSClient {

}

class FTPClient {

}
