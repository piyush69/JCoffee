


class c15856337 {

    public BigInteger calculateMd5(String input) throws FileSystemException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(input.getBytes());
            byte[] messageDigest =(byte[])(Object) digest.digest();
            BigInteger bigInt = new BigInteger(1, messageDigest);
            return bigInt;
        } catch (Exception e) {
            throw new FileSystemException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class BigInteger {

BigInteger(int o0, byte[] o1){}
	BigInteger(){}}

class FileSystemException extends Exception{
	public FileSystemException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
