


class c19169483 {

    public static String encryptString(String str) {
        StringBuffer sb = new StringBuffer();
        int i;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            byte[] md5Bytes =(byte[])(Object) md5.digest();
            for (i = 0; i < md5Bytes.length; i++) {
                sb.append(md5Bytes[i]);
            }
        } catch (Exception e) {
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
