


class c16503138 {

    private byte[] hash(String toHash) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5", "BC");
            md5.update(toHash.getBytes("ISO-8859-1"));
            return(byte[])(Object) md5.digest();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0, String o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
