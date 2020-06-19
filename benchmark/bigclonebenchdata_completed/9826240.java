import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9826240 {

    private boolean checkHashBack(Facade facade, HttpServletRequest req) {
        String txtTransactionID =(String)(Object) req.getParameter("txtTransactionID");
        String txtOrderTotal =(String)(Object) req.getParameter("txtOrderTotal");
        MyHelperClass GlobalParameter = new MyHelperClass();
        String txtShopId =(String)(Object) facade.getSystemParameter(GlobalParameter.yellowPayMDMasterShopID);
//        MyHelperClass GlobalParameter = new MyHelperClass();
        String txtArtCurrency =(String)(Object) facade.getSystemParameter(GlobalParameter.yellowPayMDCurrency);
        String txtHashBack =(String)(Object) req.getParameter("txtHashBack");
//        MyHelperClass GlobalParameter = new MyHelperClass();
        String hashSeed =(String)(Object) facade.getSystemParameter(GlobalParameter.yellowPayMDHashSeed);
        String securityValue = txtShopId + txtArtCurrency + txtOrderTotal + hashSeed + txtTransactionID;
        MessageDigest digest;
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(securityValue.getBytes());
            byte[] array = digest.digest();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array.length; ++j) {
                int b = array[j] & 0xFF;
                if (b < 0x10) sb.append('0');
                sb.append(Integer.toHexString(b));
            }
            String hash = sb.toString();
            System.out.println("com.eshop.http.servlets.PaymentController.checkHashBack: " + hash + " " + txtHashBack);
            if (txtHashBack.equals(hash)) {
                return true;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass yellowPayMDCurrency;
	public MyHelperClass yellowPayMDMasterShopID;
	public MyHelperClass yellowPayMDHashSeed;
}

class Facade {

public MyHelperClass getSystemParameter(MyHelperClass o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}
