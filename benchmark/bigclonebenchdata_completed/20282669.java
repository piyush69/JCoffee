


class c20282669 {

    public void deleteSynchrnServerFile(SynchrnServerVO synchrnServerVO) throws Exception {
        FTPClient ftpClient = new FTPClient();
        ftpClient.setControlEncoding("euc-kr");
        MyHelperClass EgovWebUtil = new MyHelperClass();
        if (!(Boolean)(Object)EgovWebUtil.isIPAddress(synchrnServerVO.getServerIp())) {
            throw new RuntimeException("IP is needed. (" + synchrnServerVO.getServerIp() + ")");
        }
        MyHelperClass InetAddress = new MyHelperClass();
        InetAddress host =(InetAddress)(Object) InetAddress.getByName(synchrnServerVO.getServerIp());
        ftpClient.connect(host, Integer.parseInt((String)(Object)synchrnServerVO.getServerPort()));
        ftpClient.login(synchrnServerVO.getFtpId(), synchrnServerVO.getFtpPassword());
        FTPFile[] fTPFile = null;
        try {
            ftpClient.changeWorkingDirectory(synchrnServerVO.getSynchrnLc());
            fTPFile =(FTPFile[])(Object) ftpClient.listFiles(synchrnServerVO.getSynchrnLc());
            for (int i = 0; i < fTPFile.length; i++) {
                if (synchrnServerVO.getDeleteFileNm().equals(fTPFile[i].getName())) ftpClient.deleteFile(fTPFile[i].getName());
            }
            SynchrnServer synchrnServer = new SynchrnServer();
            synchrnServer.setServerId(synchrnServerVO.getServerId());
            synchrnServer.setReflctAt("N");
            MyHelperClass synchrnServerDAO = new MyHelperClass();
            synchrnServerDAO.processSynchrn(synchrnServer);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ftpClient.logout();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isIPAddress(MyHelperClass o0){ return null; }
	public MyHelperClass processSynchrn(SynchrnServer o0){ return null; }
	public MyHelperClass getByName(MyHelperClass o0){ return null; }}

class SynchrnServerVO {

public MyHelperClass getServerId(){ return null; }
	public MyHelperClass getServerIp(){ return null; }
	public MyHelperClass getFtpId(){ return null; }
	public MyHelperClass getDeleteFileNm(){ return null; }
	public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass getFtpPassword(){ return null; }
	public MyHelperClass getSynchrnLc(){ return null; }}

class FTPClient {

public MyHelperClass setControlEncoding(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass deleteFile(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass listFiles(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class InetAddress {

}

class FTPFile {

public MyHelperClass getName(){ return null; }}

class SynchrnServer {

public MyHelperClass setReflctAt(String o0){ return null; }
	public MyHelperClass setServerId(MyHelperClass o0){ return null; }}
