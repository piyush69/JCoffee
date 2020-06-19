


class c5004897 {

    private boolean passwordMatches(String user, String plainPassword, String scrambledPassword) {
        MessageDigest md;
        byte[] temp_digest, pass_digest;
        byte[] hex_digest = new byte[35];
        byte[] scrambled = scrambledPassword.getBytes();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(plainPassword.getBytes("US-ASCII"));
            md.update(user.getBytes("US-ASCII"));
            temp_digest =(byte[])(Object) md.digest();
            MyHelperClass Utils = new MyHelperClass();
            Utils.bytesToHex(temp_digest, hex_digest, 0);
            md.update(hex_digest, 0, 32);
            MyHelperClass salt = new MyHelperClass();
            md.update((byte[])(Object)salt.getBytes());
            pass_digest =(byte[])(Object) md.digest();
//            MyHelperClass Utils = new MyHelperClass();
            Utils.bytesToHex(pass_digest, hex_digest, 3);
            hex_digest[0] = (byte) 'm';
            hex_digest[1] = (byte) 'd';
            hex_digest[2] = (byte) '5';
            for (int i = 0; i < hex_digest.length; i++) {
                if (scrambled[i] != hex_digest[i]) {
                    return false;
                }
            }
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass bytesToHex(byte[] o0, byte[] o1, int o2){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
