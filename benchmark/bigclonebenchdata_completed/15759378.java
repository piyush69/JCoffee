


class c15759378 {

    public static String email_get_public_hash(String email) {
        try {
            if (email != null) {
                email = email.trim().toLowerCase();
                CRC32 crc32 = new CRC32();
                crc32.reset();
                crc32.update(email.getBytes());
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                md5.reset();
                return crc32.getValue() + " " + new String((String)(Object)md5.digest(email.getBytes()));
            }
        } catch (Exception e) {
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class CRC32 {

public MyHelperClass reset(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }}
