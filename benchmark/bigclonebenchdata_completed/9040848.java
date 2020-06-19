


class c9040848 {

    @SuppressWarnings("unused")
    private static int chkPasswd(final String sInputPwd, final String sSshaPwd) {
        assert sInputPwd != null;
        assert sSshaPwd != null;
        MyHelperClass ERR_LOGIN_ACCOUNT = new MyHelperClass();
        int r =(int)(Object) ERR_LOGIN_ACCOUNT;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] ba =(byte[])(Object) decoder.decodeBuffer(sSshaPwd);
            MyHelperClass FIXED_HASH_SIZE = new MyHelperClass();
            assert ba.length >= (int)(Object)FIXED_HASH_SIZE;
//            MyHelperClass FIXED_HASH_SIZE = new MyHelperClass();
            byte[] hash = new byte[(int)(Object)FIXED_HASH_SIZE];
            MyHelperClass FIXED_SALT_SIZE = new MyHelperClass();
            byte[] salt = new byte[(int)(Object)FIXED_SALT_SIZE];
//            MyHelperClass FIXED_HASH_SIZE = new MyHelperClass();
            System.arraycopy(ba, 0, hash, 0,(int)(Object) FIXED_HASH_SIZE);
//            MyHelperClass FIXED_HASH_SIZE = new MyHelperClass();
            System.arraycopy(ba,(int)(Object) FIXED_HASH_SIZE, salt, 0,(int)(Object) FIXED_SALT_SIZE);
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(sInputPwd.getBytes());
            md.update(salt);
            byte[] baPwdHash =(byte[])(Object) md.digest();
//            MyHelperClass MessageDigest = new MyHelperClass();
            if ((boolean)(Object)MessageDigest.isEqual(hash, baPwdHash)) {
                MyHelperClass ERR_LOGIN_OK = new MyHelperClass();
                r =(int)(Object) ERR_LOGIN_OK;
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return r;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isEqual(byte[] o0, byte[] o1){ return null; }}

class BASE64Decoder {

public MyHelperClass decodeBuffer(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
