
import java.io.UncheckedIOException;


class c18253221 {

    public boolean uploadFTP(String ipFTP, String loginFTP, String senhaFTP, String diretorioFTP, String diretorioAndroid, String arquivoFTP) {
        try {
            MyHelperClass dialogHandler = new MyHelperClass();
            dialogHandler.sendEmptyMessage(0);
            File file = new File(diretorioAndroid);
            File file2 = new File(diretorioAndroid + arquivoFTP);
            MyHelperClass Log = new MyHelperClass();
            Log.v("uploadFTP", "Atribuidas as vari�veis");
            String status = "";
            if ((boolean)(Object)file.isDirectory()) {
//                MyHelperClass Log = new MyHelperClass();
                Log.v("uploadFTP", "� diret�rio");
                if ((int)(Object)file.list().length > 0) {
//                    MyHelperClass Log = new MyHelperClass();
                    Log.v("uploadFTP", "file.list().length > 0");
                    MyHelperClass ftp = new MyHelperClass();
                    ftp.connect(ipFTP);
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.login(loginFTP, senhaFTP);
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.enterLocalPassiveMode();
                    MyHelperClass FTPClient = new MyHelperClass();
                    ftp.setFileTransferMode(FTPClient.ASCII_FILE_TYPE);
//                    MyHelperClass FTPClient = new MyHelperClass();
                    ftp.setFileType(FTPClient.ASCII_FILE_TYPE);
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.changeWorkingDirectory(diretorioFTP);
                    FileInputStream arqEnviar = new FileInputStream(diretorioAndroid + arquivoFTP);
//                    MyHelperClass Log = new MyHelperClass();
                    Log.v("uploadFTP", "FileInputStream declarado");
//                    MyHelperClass ftp = new MyHelperClass();
                    if ((boolean)(Object)ftp.storeFile(arquivoFTP, arqEnviar)) {
//                        MyHelperClass Log = new MyHelperClass();
                        Log.v("uploadFTP", "ftp.storeFile(arquivoFTP, arqEnviar)");
//                        MyHelperClass ftp = new MyHelperClass();
                        status = ftp.getStatus().toString();
//                        MyHelperClass Log = new MyHelperClass();
                        Log.v("uploadFTP", "getStatus(): " + status);
                        if ((boolean)(Object)file2.delete()) {
//                            MyHelperClass Log = new MyHelperClass();
                            Log.i("uploadFTP", "Arquivo " + arquivoFTP + " exclu�do com sucesso");
                            boolean retorno;// = new boolean();
                            retorno = true;
                        } else {
//                            MyHelperClass Log = new MyHelperClass();
                            Log.e("uploadFTP", "Erro ao excluir o arquivo " + arquivoFTP);
                            boolean retorno;// = new boolean();
                            retorno = false;
                        }
                    } else {
//                        MyHelperClass Log = new MyHelperClass();
                        Log.e("uploadFTP", "ERRO: arquivo " + arquivoFTP + "n�o foi enviado!");
                        boolean retorno;// = new boolean();
                        retorno = false;
                    }
                } else {
//                    MyHelperClass Log = new MyHelperClass();
                    Log.e("uploadFTP", "N�o existe o arquivo " + arquivoFTP + "neste diret�rio!");
                    boolean retorno;// = new boolean();
                    retorno = false;
                }
            } else {
//                MyHelperClass Log = new MyHelperClass();
                Log.e("uploadFTP", "N�o � diret�rio");
                boolean retorno;// = new boolean();
                retorno = false;
            }
            MyHelperClass ftp = new MyHelperClass();
            if ((boolean)(Object)ftp.isConnected()) {
//                MyHelperClass Log = new MyHelperClass();
                Log.v("uploadFTP", "isConnected ");
//                MyHelperClass ftp = new MyHelperClass();
                ftp.abort();
//                MyHelperClass ftp = new MyHelperClass();
                status = ftp.getStatus().toString();
                MyHelperClass retorno = new MyHelperClass();
                Log.v("uploadFTP", "quit " + retorno);
            }
            MyHelperClass retorno = new MyHelperClass();
            return (boolean)(Object)retorno;
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("uploadFTP", "ERRO FTP: " + e);
            boolean retorno;// = new boolean();
            retorno = false;
//            MyHelperClass retorno = new MyHelperClass();
            return (boolean)(Object)retorno;
        } finally {
            MyHelperClass handler = new MyHelperClass();
            handler.sendEmptyMessage(0);
            MyHelperClass Log = new MyHelperClass();
            Log.v("uploadFTP", "finally executado");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
	public MyHelperClass ASCII_FILE_TYPE;
public MyHelperClass abort(){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass v(String o0, String o1){ return null; }
	public MyHelperClass getStatus(){ return null; }
	public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass sendEmptyMessage(int o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
