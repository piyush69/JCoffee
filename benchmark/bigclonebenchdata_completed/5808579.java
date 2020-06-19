


class c5808579 {
public static MyHelperClass byte2hex(byte[] o0){ return null; }
//public MyHelperClass byte2hex(byte[] o0){ return null; }

    public static final String encryptPassword(String loginName, String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(loginName.toUpperCase().getBytes("UTF-8"));
            md5.update(password.getBytes("UTF-8"));
            byte[] ba =(byte[])(Object) md5.digest();
            return(String)(Object) byte2hex(ba);
        } catch (Exception e) {
            return password;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
