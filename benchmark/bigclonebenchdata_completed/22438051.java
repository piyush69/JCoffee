


class c22438051 {

    public static String hashValue(String password, String salt) throws TeqloException {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(password.getBytes("UTF-8"));
            md.update(salt.getBytes("UTF-8"));
            byte raw[] =(byte[])(Object) md.digest();
            char[] encoded =(char[])(Object) (new BASE64Encoder()).encode(raw).toCharArray();
            int length = encoded.length;
            while (length > 0 && encoded[length - 1] == '=') length--;
            for (int i = 0; i < length; i++) {
                if (encoded[i] == '+') encoded[i] = '*'; else if (encoded[i] == '/') encoded[i] = '-';
            }
            return new String(encoded, 0, length);
        } catch (Exception e) {
            throw new TeqloException("Security", "password", e, "Could not process password");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass toCharArray(){ return null; }}

class TeqloException extends Exception{
	public TeqloException(String errorMessage) { super(errorMessage); }
	TeqloException(){}
	TeqloException(String o0, String o1, Exception o2, String o3){}
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
