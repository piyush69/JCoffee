
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3408151 {
public static MyHelperClass cryptTo64(int o0, int o1){ return null; }
//public MyHelperClass cryptTo64(int o0, int o1){ return null; }

    public static String crypt(String password, String salt) {
        MyHelperClass magic = new MyHelperClass();
        if (salt.startsWith((String)(Object)magic)) {
//            MyHelperClass magic = new MyHelperClass();
            salt = salt.substring((int)(Object)magic.length());
        }
        int saltEnd = salt.indexOf('$');
        if (saltEnd != -1) {
            salt = salt.substring(0, saltEnd);
        }
        if (salt.length() > 8) {
            salt = salt.substring(0, 8);
        }
        MessageDigest md5_1, md5_2;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5_1 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
        md5_1.update(password.getBytes());
//        MyHelperClass magic = new MyHelperClass();
        md5_1.update((byte[])(Object)magic.getBytes());
        md5_1.update(salt.getBytes());
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5_2 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
        md5_2.update(password.getBytes());
        md5_2.update(salt.getBytes());
        md5_2.update(password.getBytes());
        byte[] md5_2_digest =(byte[])(Object) md5_2.digest();
        int md5Size = md5_2_digest.length;
        int pwLength = password.length();
        for (int i = pwLength; i > 0; i -= md5Size) {
            md5_1.update(md5_2_digest, 0, i > md5Size ? md5Size : i);
        }
        md5_2.reset();
        byte[] pwBytes = password.getBytes();
        for (int i = pwLength; i > 0; i >>= 1) {
            if ((i & 1) == 1) {
                md5_1.update((byte) 0);
            } else {
                md5_1.update(pwBytes[0]);
            }
        }
//        MyHelperClass magic = new MyHelperClass();
        StringBuffer output = new StringBuffer((int)(Object)magic);
        output.append(salt);
        output.append("$");
        byte[] md5_1_digest =(byte[])(Object) md5_1.digest();
        byte[] saltBytes = salt.getBytes();
        for (int i = 0; i < 1000; i++) {
            md5_2.reset();
            if ((i & 1) == 1) {
                md5_2.update(pwBytes);
            } else {
                md5_2.update(md5_1_digest);
            }
            if (i % 3 != 0) {
                md5_2.update(saltBytes);
            }
            if (i % 7 != 0) {
                md5_2.update(pwBytes);
            }
            if ((i & 1) != 0) {
                md5_2.update(md5_1_digest);
            } else {
                md5_2.update(pwBytes);
            }
            md5_1_digest =(byte[])(Object) md5_2.digest();
        }
        int value;
        value = ((md5_1_digest[0] & 0xff) << 16) | ((md5_1_digest[6] & 0xff) << 8) | (md5_1_digest[12] & 0xff);
        output.append(cryptTo64(value, 4));
        value = ((md5_1_digest[1] & 0xff) << 16) | ((md5_1_digest[7] & 0xff) << 8) | (md5_1_digest[13] & 0xff);
        output.append(cryptTo64(value, 4));
        value = ((md5_1_digest[2] & 0xff) << 16) | ((md5_1_digest[8] & 0xff) << 8) | (md5_1_digest[14] & 0xff);
        output.append(cryptTo64(value, 4));
        value = ((md5_1_digest[3] & 0xff) << 16) | ((md5_1_digest[9] & 0xff) << 8) | (md5_1_digest[15] & 0xff);
        output.append(cryptTo64(value, 4));
        value = ((md5_1_digest[4] & 0xff) << 16) | ((md5_1_digest[10] & 0xff) << 8) | (md5_1_digest[5] & 0xff);
        output.append(cryptTo64(value, 4));
        value = md5_1_digest[11] & 0xff;
        output.append(cryptTo64(value, 2));
        md5_1 = null;
        md5_2 = null;
        md5_1_digest = null;
        md5_2_digest = null;
        pwBytes = null;
        saltBytes = null;
        password = salt = null;
        return output.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass update(byte o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
