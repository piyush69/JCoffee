
import java.io.UncheckedIOException;


class c15896098 {
public MyHelperClass Logger;

    public String getSHA256Checksum(String source) {
        String checksum = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
            md.update(source.getBytes());
            byte[] byteData =(byte[])(Object) md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            System.out.println("Hex format : " + sb.toString());
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                String hex = Integer.toHexString(0xff & byteData[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            checksum = hexString.toString();
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(CMessageDigestFile.class.getName()).log(Level.SEVERE, null,(NoSuchAlgorithmException)(Object) ex);
        }
        return checksum;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class CMessageDigestFile {

}
