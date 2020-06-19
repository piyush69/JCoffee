


class c20282670 {

    public void downloadFtpFile(SynchrnServerVO synchrnServerVO, String fileNm) throws Exception {
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
        ftpClient.changeWorkingDirectory(synchrnServerVO.getSynchrnLc());
//        MyHelperClass EgovWebUtil = new MyHelperClass();
        File downFile = new File(EgovWebUtil.filePathBlackList(synchrnServerVO.getFilePath() + fileNm));
        OutputStream outputStream = null;
        try {
            outputStream =(OutputStream)(Object) new FileOutputStream(downFile);
            ftpClient.retrieveFile(fileNm, outputStream);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (outputStream != null) outputStream.close();
        }
        ftpClient.logout();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isIPAddress(MyHelperClass o0){ return null; }
	public MyHelperClass filePathBlackList(String o0){ return null; }
	public MyHelperClass getByName(MyHelperClass o0){ return null; }}

class SynchrnServerVO {

public MyHelperClass getServerIp(){ return null; }
	public MyHelperClass getFtpId(){ return null; }
	public MyHelperClass getFilePath(){ return null; }
	public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass getFtpPassword(){ return null; }
	public MyHelperClass getSynchrnLc(){ return null; }}

class FTPClient {

public MyHelperClass setControlEncoding(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass retrieveFile(String o0, OutputStream o1){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class InetAddress {

}

class File {

File(MyHelperClass o0){}
	File(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
