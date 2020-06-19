


class c21364786 {

    public boolean isPasswordValid(String encPass, String rawPass, Object salt) throws DataAccessException {
        boolean bMatch = false;
        try {
            String strSalt = (String) salt;
            MyHelperClass Hex = new MyHelperClass();
            byte[] baSalt =(byte[])(Object) Hex.decodeHex(strSalt.toCharArray());
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(HASH_ALGORITHM);
            MyHelperClass CHAR_ENCODING = new MyHelperClass();
            md.update(rawPass.getBytes((String)(Object)CHAR_ENCODING));
            md.update(baSalt);
            byte[] baCalculatedHash =(byte[])(Object) md.digest();
//            MyHelperClass Hex = new MyHelperClass();
            byte[] baStoredHash =(byte[])(Object) Hex.decodeHex(encPass.toCharArray());
            MyHelperClass MessageDigest = new MyHelperClass();
            bMatch =(boolean)(Object) MessageDigest.isEqual(baCalculatedHash, baStoredHash);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bMatch;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEqual(byte[] o0, byte[] o1){ return null; }
	public MyHelperClass decodeHex(char[] o0){ return null; }}

class DataAccessException extends Exception{
	public DataAccessException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
