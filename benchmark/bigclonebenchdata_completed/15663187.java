import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15663187 {

    public ClientDTO changePassword(String pMail, String pMdp)  throws Throwable {
        Client vClientBean = null;
        ClientDTO vClientDTO = null;
        MyHelperClass mClientDao = new MyHelperClass();
        vClientBean =(Client)(Object) mClientDao.getClient(pMail);
        if (vClientBean != null) {
            MessageDigest vMd5Instance;
            try {
                vMd5Instance = MessageDigest.getInstance("MD5");
                vMd5Instance.reset();
                vMd5Instance.update(pMdp.getBytes());
                byte[] vDigest = vMd5Instance.digest();
                BigInteger vBigInt = new BigInteger(1, vDigest);
                String vHashPassword = vBigInt.toString(16);
                vClientBean.setMdp(vHashPassword);
                MyHelperClass BeanToDTO = new MyHelperClass();
                vClientDTO =(ClientDTO)(Object) BeanToDTO.getInstance().createClientDTO(vClientBean);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return vClientDTO;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getClient(String o0){ return null; }
	public MyHelperClass createClientDTO(Client o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class ClientDTO {

}

class Client {

public MyHelperClass setMdp(String o0){ return null; }}
