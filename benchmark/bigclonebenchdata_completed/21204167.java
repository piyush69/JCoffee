


class c21204167 {

    private String getEncryptedPassword() {
        String encrypted;
        MyHelperClass password = new MyHelperClass();
        char[] pwd =(char[])(Object) password.getPassword();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(new String(pwd).getBytes("UTF-8"));
            byte[] digested =(byte[])(Object) md.digest();
            MyHelperClass Base64Coder = new MyHelperClass();
            encrypted = new String((String)(Object)Base64Coder.encode(digested));
        } catch (Exception e) {
            encrypted = new String(pwd);
        }
        for (int i = 0; i < pwd.length; i++) pwd[i] = 0;
        return encrypted;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
