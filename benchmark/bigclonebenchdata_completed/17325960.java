


class c17325960 {
public MyHelperClass convertToHex(byte[] o0){ return null; }

    private String getMD5(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] data =(byte[])(Object) md.digest();
            return(String)(Object) convertToHex(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
