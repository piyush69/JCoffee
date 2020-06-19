


class c18253220 {

    public boolean downloadFTP(String ipFTP, String loginFTP, String senhaFTP, String diretorioFTP, String diretorioAndroid, String arquivoFTP) throws SocketException, IOException {
        boolean retorno = false;
        FileOutputStream arqReceber = null;
        try {
            MyHelperClass ftp = new MyHelperClass();
            ftp.connect(ipFTP);
            MyHelperClass Log = new MyHelperClass();
            Log.i("DownloadFTP", "Connected: " + ipFTP);
//            MyHelperClass ftp = new MyHelperClass();
            ftp.login(loginFTP, senhaFTP);
//            MyHelperClass Log = new MyHelperClass();
            Log.i("DownloadFTP", "Logged on");
//            MyHelperClass ftp = new MyHelperClass();
            ftp.enterLocalPassiveMode();
            MyHelperClass FTPClient = new MyHelperClass();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            MyHelperClass file = new MyHelperClass();
            arqReceber = new FileOutputStream(file.toString());
//            MyHelperClass ftp = new MyHelperClass();
            ftp.retrieveFile("/tablet_ftp/Novo/socialAlimenta.xml", arqReceber);
            retorno = true;
//            MyHelperClass ftp = new MyHelperClass();
            ftp.disconnect();
//            MyHelperClass Log = new MyHelperClass();
            Log.i("DownloadFTP", "retorno:" + retorno);
        } catch (Exception e) {
            MyHelperClass ftp = new MyHelperClass();
            ftp.disconnect();
            MyHelperClass Log = new MyHelperClass();
            Log.e("DownloadFTP", "Erro:" + e.getMessage());
        } finally {
            MyHelperClass Log = new MyHelperClass();
            Log.e("DownloadFTP", "Finally");
        }
        return retorno;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass retrieveFile(String o0, FileOutputStream o1){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
