
import java.io.UncheckedIOException;


class c15286502 {

    public static String md5(String senha) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            System.out.println("Ocorreu NoSuchAlgorithmException");
        }
        md.update(senha.getBytes());
        byte[] xx =(byte[])(Object) md.digest();
        String n2 = null;
        StringBuffer resposta = new StringBuffer();
        for (int i = 0; i < xx.length; i++) {
            n2 = Integer.toHexString(0XFF & ((int) (xx[i])));
            if (n2.length() < 2) {
                n2 = "0" + n2;
            }
            resposta.append(n2);
        }
        return resposta.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
