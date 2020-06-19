import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14555518 {
public MyHelperClass aeskeySpec;
	public MyHelperClass aes;

//    @Override
//    @RemoteMethod
    public boolean decrypt(int idAnexo)  throws Throwable {
        try {
            MyHelperClass anexoService = new MyHelperClass();
            Anexo anexo =(Anexo)(Object) anexoService.selectById(idAnexo);
            MyHelperClass Cipher = new MyHelperClass();
            aes.init(Cipher.DECRYPT_MODE, aeskeySpec);
            MyHelperClass config = new MyHelperClass();
            CipherInputStream cis = new CipherInputStream(new FileInputStream(config.baseDir + "/arquivos_upload_direto/encrypt/" + anexo.getAnexoCaminho()), aes);
//            MyHelperClass config = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream(config.baseDir + "/arquivos_upload_direto/decrypt/" + anexo.getAnexoCaminho());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(cis, fos);
            cis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DECRYPT_MODE;
	public MyHelperClass baseDir;
public MyHelperClass init(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(CipherInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass selectById(int o0){ return null; }}

class RemoteMethod {

}

class Anexo {

public MyHelperClass getAnexoCaminho(){ return null; }}

class CipherInputStream {

CipherInputStream(){}
	CipherInputStream(FileInputStream o0, MyHelperClass o1){}
	public MyHelperClass close(){ return null; }}
