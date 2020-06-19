


class c4762101 {
public static MyHelperClass byteHEX(byte o0, String o1){ return null; }
//public MyHelperClass byteHEX(byte o0, String o1){ return null; }

    private static String processStr(String srcStr, String sign) throws NoSuchAlgorithmException, NullPointerException {
        if (null == srcStr) {
            throw new java.lang.NullPointerException("��Ҫ���ܵ��ַ�ΪNull");
        }
        MessageDigest digest;
        String algorithm = "MD5";
        String result = "";
        MyHelperClass MessageDigest = new MyHelperClass();
        digest =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        digest.update(srcStr.getBytes());
        byte[] byteRes =(byte[])(Object) digest.digest();
        int length = byteRes.length;
        for (int i = 0; i < length; i++) {
            result = result + byteHEX(byteRes[i], sign);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
