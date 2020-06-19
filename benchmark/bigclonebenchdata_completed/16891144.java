


class c16891144 {

    public static byte[] expandPasswordToKey(String password, int keyLen, byte[] salt) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            int digLen =(int)(Object) md5.getDigestLength();
            byte[] mdBuf = new byte[digLen];
            byte[] key = new byte[keyLen];
            int cnt = 0;
            while (cnt < keyLen) {
                if (cnt > 0) {
                    md5.update(mdBuf);
                }
                md5.update(password.getBytes());
                md5.update(salt);
                md5.digest(mdBuf, 0, digLen);
                int n = ((digLen > (keyLen - cnt)) ? keyLen - cnt : digLen);
                System.arraycopy(mdBuf, 0, key, cnt, n);
                cnt += n;
            }
            return key;
        } catch (Exception e) {
            throw new Error("Error in SSH2KeyPairFile.expandPasswordToKey: " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getDigestLength(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
