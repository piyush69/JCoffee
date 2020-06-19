
import java.io.UncheckedIOException;


class c10771590 {
public static MyHelperClass to64(StringBuffer o0, int o1, int o2){ return null; }
//public MyHelperClass to64(StringBuffer o0, int o1, int o2){ return null; }

    public static String crypt(String strPassword, String strSalt) {
        try {
            StringTokenizer st = new StringTokenizer(strSalt, "$");
            st.nextToken();
            byte[] abyPassword = strPassword.getBytes();
            byte[] abySalt =(byte[])(Object) st.nextToken().getBytes();
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest _md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            _md.update(abyPassword);
            MyHelperClass MAGIC = new MyHelperClass();
            _md.update((byte[])(Object)MAGIC.getBytes());
            _md.update(abySalt);
//            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md2 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md2.update(abyPassword);
            md2.update(abySalt);
            md2.update(abyPassword);
            byte[] abyFinal =(byte[])(Object) md2.digest();
            for (int n = abyPassword.length; n > 0; n -= 16) {
                _md.update(abyFinal, 0, n > 16 ? 16 : n);
            }
            abyFinal = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            for (int j = 0, i = abyPassword.length; i != 0; i >>>= 1) {
                if ((i & 1) == 1) _md.update(abyFinal, j, 1); else _md.update(abyPassword, j, 1);
            }
            StringBuffer sbPasswd = new StringBuffer();
//            MyHelperClass MAGIC = new MyHelperClass();
            sbPasswd.append(MAGIC);
            sbPasswd.append(new String(abySalt));
            sbPasswd.append('$');
            abyFinal =(byte[])(Object) _md.digest();
            for (int n = 0; n < 1000; n++) {
//                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md3 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                if ((n & 1) != 0) md3.update(abyPassword); else md3.update(abyFinal);
                if ((n % 3) != 0) md3.update(abySalt);
                if ((n % 7) != 0) md3.update(abyPassword);
                if ((n & 1) != 0) md3.update(abyFinal); else md3.update(abyPassword);
                abyFinal =(byte[])(Object) md3.digest();
            }
            int[] anFinal = new int[] { (abyFinal[0] & 0x7f) | (abyFinal[0] & 0x80), (abyFinal[1] & 0x7f) | (abyFinal[1] & 0x80), (abyFinal[2] & 0x7f) | (abyFinal[2] & 0x80), (abyFinal[3] & 0x7f) | (abyFinal[3] & 0x80), (abyFinal[4] & 0x7f) | (abyFinal[4] & 0x80), (abyFinal[5] & 0x7f) | (abyFinal[5] & 0x80), (abyFinal[6] & 0x7f) | (abyFinal[6] & 0x80), (abyFinal[7] & 0x7f) | (abyFinal[7] & 0x80), (abyFinal[8] & 0x7f) | (abyFinal[8] & 0x80), (abyFinal[9] & 0x7f) | (abyFinal[9] & 0x80), (abyFinal[10] & 0x7f) | (abyFinal[10] & 0x80), (abyFinal[11] & 0x7f) | (abyFinal[11] & 0x80), (abyFinal[12] & 0x7f) | (abyFinal[12] & 0x80), (abyFinal[13] & 0x7f) | (abyFinal[13] & 0x80), (abyFinal[14] & 0x7f) | (abyFinal[14] & 0x80), (abyFinal[15] & 0x7f) | (abyFinal[15] & 0x80) };
            to64(sbPasswd, anFinal[0] << 16 | anFinal[6] << 8 | anFinal[12], 4);
            to64(sbPasswd, anFinal[1] << 16 | anFinal[7] << 8 | anFinal[13], 4);
            to64(sbPasswd, anFinal[2] << 16 | anFinal[8] << 8 | anFinal[14], 4);
            to64(sbPasswd, anFinal[3] << 16 | anFinal[9] << 8 | anFinal[15], 4);
            to64(sbPasswd, anFinal[4] << 16 | anFinal[10] << 8 | anFinal[5], 4);
            to64(sbPasswd, anFinal[11], 2);
            return sbPasswd.toString();
        } catch (UncheckedIOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
