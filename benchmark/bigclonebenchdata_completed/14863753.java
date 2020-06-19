


class c14863753 {

    private void generateGuid() throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        StringBuilder stringToDigest = new StringBuilder();
        long time = System.currentTimeMillis();
        MyHelperClass random = new MyHelperClass();
        long rand =(long)(Object) random.nextLong();
        stringToDigest.append(time);
        stringToDigest.append("-");
        stringToDigest.append(rand);
        md5.update(stringToDigest.toString().getBytes());
        byte[] digestBytes =(byte[])(Object) md5.digest();
        StringBuilder digest = new StringBuilder();
        for (int i = 0; i < digestBytes.length; ++i) {
            int b = digestBytes[i] & 0xFF;
            if (b < 0x10) {
                digest.append('0');
            }
            digest.append(Integer.toHexString(b));
        }
        String guid;// = new String();
        guid = digest.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
