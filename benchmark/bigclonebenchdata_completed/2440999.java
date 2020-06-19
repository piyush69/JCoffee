


class c2440999 {

    private static boolean validateSshaPwd(String sSshaPwd, String sUserPwd) {
        boolean b = false;
        if (sSshaPwd != null && sUserPwd != null) {
            MyHelperClass SSHA_PREFIX = new MyHelperClass();
            if (sSshaPwd.startsWith((String)(Object)SSHA_PREFIX)) {
//                MyHelperClass SSHA_PREFIX = new MyHelperClass();
                sSshaPwd = sSshaPwd.substring((int)(Object)SSHA_PREFIX.length());
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
                    BASE64Decoder decoder = new BASE64Decoder();
                    byte[] ba =(byte[])(Object) decoder.decodeBuffer(sSshaPwd);
                    MyHelperClass FIXED_HASH_SIZE = new MyHelperClass();
                    byte[] hash = new byte[(int)(Object)FIXED_HASH_SIZE];
                    MyHelperClass FIXED_SALT_SIZE = new MyHelperClass();
                    byte[] salt = new byte[(int)(Object)FIXED_SALT_SIZE];
//                    MyHelperClass FIXED_HASH_SIZE = new MyHelperClass();
                    System.arraycopy(ba, 0, hash, 0,(int)(Object) FIXED_HASH_SIZE);
//                    MyHelperClass FIXED_HASH_SIZE = new MyHelperClass();
                    System.arraycopy(ba,(int)(Object) FIXED_HASH_SIZE, salt, 0,(int)(Object) FIXED_SALT_SIZE);
                    md.update(sUserPwd.getBytes());
                    md.update(salt);
                    byte[] baPwdHash =(byte[])(Object) md.digest();
//                    MyHelperClass MessageDigest = new MyHelperClass();
                    b =(boolean)(Object) MessageDigest.isEqual(hash, baPwdHash);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
        }
        return b;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isEqual(byte[] o0, byte[] o1){ return null; }
	public MyHelperClass length(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Decoder {

public MyHelperClass decodeBuffer(String o0){ return null; }}
