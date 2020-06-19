


class c20175752 {
public MyHelperClass chgDir(FTPClient o0, MyHelperClass o1){ return null; }
public MyHelperClass put(FTPClient o0, File o1){ return null; }

    public void putFullDirectory(final String ftpURL, final String remoteDir, final String userId, final String pwd, final String localDir) throws Exception {
        MyHelperClass Strings = new MyHelperClass();
        if (!(Boolean)(Object)Strings.isPopulated(ftpURL)) {
            MyHelperClass Util = new MyHelperClass();
            Util.dspmsg("Need an FTP url.");
            return;
        }
//        MyHelperClass Strings = new MyHelperClass();
        if (!(Boolean)(Object)Strings.isPopulated(remoteDir)) {
            MyHelperClass Util = new MyHelperClass();
            Util.dspmsg("Need a remote directory.");
            return;
        }
//        MyHelperClass Strings = new MyHelperClass();
        if (!(Boolean)(Object)Strings.isPopulated(userId)) {
            MyHelperClass Util = new MyHelperClass();
            Util.dspmsg("Need a user ID.");
            return;
        }
//        MyHelperClass Strings = new MyHelperClass();
        if (!(Boolean)(Object)Strings.isPopulated(pwd)) {
            MyHelperClass Util = new MyHelperClass();
            Util.dspmsg("Need a password.");
            return;
        }
//        MyHelperClass Strings = new MyHelperClass();
        if (!(Boolean)(Object)Strings.isPopulated(localDir)) {
            MyHelperClass Util = new MyHelperClass();
            Util.dspmsg("Need a local directory.");
            return;
        }
        FTPClient c = new FTPClient();
        c.connect(ftpURL);
        int replyCode =(int)(Object) c.getReplyCode();
        MyHelperClass FTPReply = new MyHelperClass();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(replyCode)) {
            MyHelperClass Util = new MyHelperClass();
            Util.dspmsg("Could not connect, code: " + replyCode);
            c.disconnect();
            return;
        }
        if (!(Boolean)(Object)c.login(userId, pwd)) {
            MyHelperClass Util = new MyHelperClass();
            Util.dspmsg("Could not log on, userId: " + userId + " pwd: " + pwd);
            return;
        }
        StringTokenizer st = new StringTokenizer(remoteDir, "/");
        while ((boolean)(Object)st.hasMoreElements()) {
            if (!(Boolean)(Object)chgDir(c, st.nextToken())) {
                return;
            }
        }
        MyHelperClass FTP = new MyHelperClass();
        c.setFileType(FTP.BINARY_FILE_TYPE);
        File file = new File(localDir);
        if ((boolean)(Object)file.isDirectory()) {
            FOR: for (File f :(File[])(Object) (Object[])(Object)file.listFiles()) {
                if (!(Boolean)(Object)put(c, f)) {
                    break FOR;
                }
            }
        } else {
            put(c, file);
        }
        c.logout();
        c.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPopulated(String o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass dspmsg(String o0){ return null; }}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
