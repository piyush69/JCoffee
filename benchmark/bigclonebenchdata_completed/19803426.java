


class c19803426 {

    private String md5Digest(String plain) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        digest.update(plain.trim().getBytes());
        byte pwdDigest[] =(byte[])(Object) digest.digest();
        StringBuilder md5buffer = new StringBuilder();
        for (int i = 0; i < pwdDigest.length; i++) {
            int number = 0xFF & pwdDigest[i];
            if (number <= 0xF) {
                md5buffer.append('0');
            }
            md5buffer.append(Integer.toHexString(number));
        }
        return md5buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
