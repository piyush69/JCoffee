import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10935129 {
public MyHelperClass getHexadecimalValue2(int o0){ return null; }

    private String encryptUserPassword(int userId, String password)  throws Throwable {
        password = password.trim();
        if (password.length() == 0) {
            return "";
        } else {
            MessageDigest md;
            try {
                md = MessageDigest.getInstance("SHA");
            } catch (NoSuchAlgorithmException ex) {
                throw new BoardRuntimeException((String)(Object)ex);
            }
            md.update(String.valueOf(userId).getBytes());
            md.update(password.getBytes());
            byte b[] = md.digest();
            StringBuffer sb = new StringBuffer(1 + b.length * 2);
            for (int i = 0; i < b.length; i++) {
                int ii = b[i];
                if (ii < 0) {
                    ii = 256 + ii;
                }
                sb.append(getHexadecimalValue2(ii));
            }
            return sb.toString();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BoardRuntimeException extends Exception{
	public BoardRuntimeException(String errorMessage) { super(errorMessage); }
}
