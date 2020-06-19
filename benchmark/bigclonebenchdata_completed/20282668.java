


class c20282668 {

    public List selectSynchrnServerFiles(SynchrnServerVO synchrnServerVO) throws Exception {
        List list =(List)(Object) new ArrayList();
        try {
            FTPClient ftpClient = new FTPClient();
            ftpClient.setControlEncoding("euc-kr");
            MyHelperClass EgovWebUtil = new MyHelperClass();
            if (!(Boolean)(Object)EgovWebUtil.isIPAddress(synchrnServerVO.getServerIp())) {
                throw new RuntimeException("IP is needed. (" + synchrnServerVO.getServerIp() + ")");
            }
            MyHelperClass InetAddress = new MyHelperClass();
            InetAddress host =(InetAddress)(Object) InetAddress.getByName(synchrnServerVO.getServerIp());
            try {
                ftpClient.connect(host, Integer.parseInt((String)(Object)synchrnServerVO.getServerPort()));
                boolean isLogin =(boolean)(Object) ftpClient.login(synchrnServerVO.getFtpId(), synchrnServerVO.getFtpPassword());
                if (!isLogin) throw new Exception("FTP Client Login Error : \n");
            } catch (SocketException se) {
                System.out.println(se);
                throw new Exception(se);
            } catch (Exception e) {
                System.out.println(e);
                throw new Exception(e);
            }
            FTPFile[] fTPFile = null;
            try {
                ftpClient.changeWorkingDirectory(synchrnServerVO.getSynchrnLc());
                fTPFile =(FTPFile[])(Object) ftpClient.listFiles(synchrnServerVO.getSynchrnLc());
                for (int i = 0; i < fTPFile.length; i++) {
                    if ((boolean)(Object)fTPFile[i].isFile()) list.add((String)(Object)fTPFile[i].getName());
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                ftpClient.logout();
            }
        } catch (Exception e) {
            list.add("noList");
        }
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isIPAddress(MyHelperClass o0){ return null; }
	public MyHelperClass getByName(MyHelperClass o0){ return null; }}

class SynchrnServerVO {

public MyHelperClass getServerIp(){ return null; }
	public MyHelperClass getFtpId(){ return null; }
	public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass getFtpPassword(){ return null; }
	public MyHelperClass getSynchrnLc(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class FTPClient {

public MyHelperClass setControlEncoding(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass listFiles(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class InetAddress {

}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class FTPFile {

public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}
