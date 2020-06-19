


class c16891145 {

    public static byte[] expandPasswordToKeySSHCom(String password, int keyLen) {
        try {
            if (password == null) {
                password = "";
            }
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            int digLen =(int)(Object) md5.getDigestLength();
            byte[] buf = new byte[((keyLen + digLen) / digLen) * digLen];
            int cnt = 0;
            while (cnt < keyLen) {
                md5.update(password.getBytes());
                if (cnt > 0) {
                    md5.update(buf, 0, cnt);
                }
                md5.digest(buf, cnt, digLen);
                cnt += digLen;
            }
            byte[] key = new byte[keyLen];
            System.arraycopy(buf, 0, key, 0, keyLen);
            return key;
        } catch (Exception e) {
            throw new Error("Error in SSH2KeyPairFile.expandPasswordToKeySSHCom: " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getDigestLength(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
