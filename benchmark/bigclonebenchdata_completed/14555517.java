import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14555517 {
public MyHelperClass aeskeySpec;
	public MyHelperClass aes;

//    @Override
//    @RemoteMethod
    public boolean encrypt(int idAnexo)  throws Throwable {
        try {
            MyHelperClass anexoService = new MyHelperClass();
            Anexo anexo =(Anexo)(Object) anexoService.selectById(idAnexo);
            MyHelperClass Cipher = new MyHelperClass();
            aes.init(Cipher.ENCRYPT_MODE, aeskeySpec);
            MyHelperClass config = new MyHelperClass();
            FileInputStream fis = new FileInputStream(config.baseDir + "/arquivos_upload_direto/" + anexo.getAnexoCaminho());
//            MyHelperClass config = new MyHelperClass();
            CipherOutputStream cos = new CipherOutputStream(new FileOutputStream(config.baseDir + "/arquivos_upload_direto/encrypt/" + anexo.getAnexoCaminho()), aes);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fis, cos);
            cos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass baseDir;
	public MyHelperClass ENCRYPT_MODE;
public MyHelperClass init(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass selectById(int o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, CipherOutputStream o1){ return null; }}

class RemoteMethod {

}

class Anexo {

public MyHelperClass getAnexoCaminho(){ return null; }}

class CipherOutputStream {

CipherOutputStream(){}
	CipherOutputStream(FileOutputStream o0, MyHelperClass o1){}
	public MyHelperClass close(){ return null; }}
