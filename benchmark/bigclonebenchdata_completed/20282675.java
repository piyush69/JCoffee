


class c20282675 {

    public List getFtpFileList(String serverIp, int port, String user, String password, String synchrnPath) throws Exception {
        List list =(List)(Object) new ArrayList();
        FTPClient ftpClient = new FTPClient();
        ftpClient.setControlEncoding("euc-kr");
        MyHelperClass EgovWebUtil = new MyHelperClass();
        if (!(Boolean)(Object)EgovWebUtil.isIPAddress(serverIp)) {
            throw new RuntimeException("IP is needed. (" + serverIp + ")");
        }
        MyHelperClass InetAddress = new MyHelperClass();
        InetAddress host =(InetAddress)(Object) InetAddress.getByName(serverIp);
        ftpClient.connect(host, port);
        ftpClient.login(user, password);
        ftpClient.changeWorkingDirectory(synchrnPath);
        FTPFile[] fTPFile =(FTPFile[])(Object) ftpClient.listFiles(synchrnPath);
        for (int i = 0; i < fTPFile.length; i++) {
            list.add(fTPFile[i].getName());
        }
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getByName(String o0){ return null; }
	public MyHelperClass isIPAddress(String o0){ return null; }}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class ArrayList {

}

class FTPClient {

public MyHelperClass setControlEncoding(String o0){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class InetAddress {

}

class FTPFile {

public MyHelperClass getName(){ return null; }}
