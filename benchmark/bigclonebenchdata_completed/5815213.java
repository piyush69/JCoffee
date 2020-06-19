


class c5815213 {

    public static String md5Hash(String inString) throws TopicSpacesException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(inString.getBytes());
            byte[] array =(byte[])(Object) md5.digest();
            StringBuffer buf = new StringBuffer();
            int len = array.length;
            for (int i = 0; i < len; i++) {
                int b = array[i] & 0xFF;
                buf.append(Integer.toHexString(b));
            }
            return buf.toString();
        } catch (Exception x) {
            throw new TopicSpacesException((String)(Object)x);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class TopicSpacesException extends Exception{
	public TopicSpacesException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
