


class c14373268 {

    public static String encode(String username, String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            digest.update(username.getBytes());
            digest.update(password.getBytes());
            return new String((String)(Object)digest.digest());
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.error("Error encrypting credentials", e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
