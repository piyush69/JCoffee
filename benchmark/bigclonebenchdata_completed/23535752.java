


class c23535752 {
public MyHelperClass convertToHex(byte[] o0){ return null; }

    public String getCipherString(String source) throws CadenaNoCifradaException {
        String encryptedSource = null;
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            byte[] sha1hash = new byte[40];
            MyHelperClass encoding = new MyHelperClass();
            md.update(source.getBytes((String)(Object)encoding), 0, source.length());
            sha1hash =(byte[])(Object) md.digest();
            encryptedSource =(String)(Object) convertToHex(sha1hash);
        } catch (Exception e) {
            throw new CadenaNoCifradaException((String)(Object)e);
        }
        return encryptedSource;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class CadenaNoCifradaException extends Exception{
	public CadenaNoCifradaException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}
