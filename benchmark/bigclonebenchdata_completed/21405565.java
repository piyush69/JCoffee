


class c21405565 {

    public String getSHA1(String input) {
        byte[] output = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            md.update(input.getBytes());
            output =(byte[])(Object) md.digest();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        MyHelperClass StringUtils = new MyHelperClass();
        return(String)(Object) StringUtils.byte2hex(output);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass byte2hex(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
