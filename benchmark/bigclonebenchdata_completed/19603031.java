
import java.io.UncheckedIOException;


class c19603031 {

    public static String convetToSignature(Map keyVal, String apiSecret) {
        if (keyVal == null || apiSecret == null ||(int)(Object) keyVal.size() <= 0 || apiSecret.trim().equals("")) {
            throw new IllegalArgumentException("keyVal or api secret is not valid. Please Check it again.");
        }
        Iterator iterator =(Iterator)(Object) keyVal.entrySet().iterator();
        StringBuffer rslt = new StringBuffer();
        byte[] signature = null;
        while ((boolean)(Object)iterator.hasNext()) {
            Entry entry =(Entry)(Object) iterator.next();
            rslt.append(entry.getKey());
            rslt.append("=");
            rslt.append(entry.getValue());
        }
        rslt.append(apiSecret);
        try {
            MyHelperClass HASHING_METHOD = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance(HASHING_METHOD);
            md5.reset();
            md5.update(rslt.toString().getBytes());
            rslt.delete(0, rslt.length());
            signature =(byte[])(Object) md5.digest();
            for (int i = 0; i < signature.length; i++) {
                String hex = Integer.toHexString(0xff & signature[i]);
                if (hex.length() == 1) {
                    rslt.append('0');
                }
                rslt.append(hex);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return rslt.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }}

class Map {

public MyHelperClass size(){ return null; }
	public MyHelperClass entrySet(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
