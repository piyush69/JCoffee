


class c9040190 {
public static MyHelperClass to64(int o0, int o1){ return null; }
//public MyHelperClass to64(int o0, int o1){ return null; }

    public static String crypt(String password, String salt) throws java.security.NoSuchAlgorithmException {
        int saltEnd;
        int len;
        int value;
        int i;
        MessageDigest hash1;
        MessageDigest hash2;
        byte[] digest;
        byte[] passwordBytes;
        byte[] saltBytes;
        StringBuffer result;
        MyHelperClass magic = new MyHelperClass();
        if (salt.startsWith((String)(Object)magic)) {
//            MyHelperClass magic = new MyHelperClass();
            salt = salt.substring((int)(Object)magic.length());
        }
        if ((saltEnd = salt.indexOf('$')) != -1) {
            salt = salt.substring(0, saltEnd);
        }
        if (salt.length() > 8) {
            salt = salt.substring(0, 8);
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        hash1 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        hash1.update(password.getBytes());
//        MyHelperClass magic = new MyHelperClass();
        hash1.update((byte[])(Object)magic.getBytes());
        hash1.update(salt.getBytes());
//        MyHelperClass MessageDigest = new MyHelperClass();
        hash2 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        hash2.update(password.getBytes());
        hash2.update(salt.getBytes());
        hash2.update(password.getBytes());
        digest =(byte[])(Object) hash2.digest();
        for (len = password.length(); len > 0; len -= 16) {
            hash1.update(digest, 0, len > 16 ? 16 : len);
        }
        passwordBytes = password.getBytes();
        for (i = password.length(); i > 0; i >>= 1) {
            if ((i & 1) == 1) {
                hash1.update((byte) 0);
            } else {
                hash1.update(passwordBytes, 0, 1);
            }
        }
//        MyHelperClass magic = new MyHelperClass();
        result = new StringBuffer((int)(Object)magic);
        result.append(salt);
        result.append("$");
        digest =(byte[])(Object) hash1.digest();
        saltBytes = salt.getBytes();
        for (i = 0; i < 1000; i++) {
            hash2.reset();
            if ((i & 1) == 1) {
                hash2.update(passwordBytes);
            } else {
                hash2.update(digest);
            }
            if (i % 3 != 0) {
                hash2.update(saltBytes);
            }
            if (i % 7 != 0) {
                hash2.update(passwordBytes);
            }
            if ((i & 1) != 0) {
                hash2.update(digest);
            } else {
                hash2.update(passwordBytes);
            }
            digest =(byte[])(Object) hash2.digest();
        }
        value = ((digest[0] & 0xff) << 16) | ((digest[6] & 0xff) << 8) | (digest[12] & 0xff);
        result.append(to64(value, 4));
        value = ((digest[1] & 0xff) << 16) | ((digest[7] & 0xff) << 8) | (digest[13] & 0xff);
        result.append(to64(value, 4));
        value = ((digest[2] & 0xff) << 16) | ((digest[8] & 0xff) << 8) | (digest[14] & 0xff);
        result.append(to64(value, 4));
        value = ((digest[3] & 0xff) << 16) | ((digest[9] & 0xff) << 8) | (digest[15] & 0xff);
        result.append(to64(value, 4));
        value = ((digest[4] & 0xff) << 16) | ((digest[10] & 0xff) << 8) | (digest[5] & 0xff);
        result.append(to64(value, 4));
        value = digest[11] & 0xff;
        result.append(to64(value, 2));
        return result.toString();
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