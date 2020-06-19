


class c18193745 {
public static MyHelperClass updateChannelList(FTPClient o0, String o1){ return null; }
	public static MyHelperClass updateMasterChannelIP(FTPClient o0, String o1){ return null; }
//public MyHelperClass updateChannelList(FTPClient o0, String o1){ return null; }
//	public MyHelperClass updateMasterChannelIP(FTPClient o0, String o1){ return null; }

    public static boolean update(String user, String pass, String channelString, String globalIP) {
        FTPClient ftp = new FTPClient();
        int reply;
        try {
            ftp.connect("witna.co.uk", 21);
            ftp.login(user, pass);
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if ((boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                updateChannelList(ftp, channelString);
                MyHelperClass ipUpdated = new MyHelperClass();
                if (!(Boolean)(Object)ipUpdated) {
//                    MyHelperClass ipUpdated = new MyHelperClass();
                    ipUpdated = updateMasterChannelIP(ftp, globalIP);
                }
                ftp.disconnect();
                return true;
            } else {
                ftp.disconnect();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
