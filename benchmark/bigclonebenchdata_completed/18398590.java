


class c18398590 {

    public byte[] getCoded(String name, String pass) {
        byte[] digest = null;
        if (pass != null && 0 < pass.length()) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
                md.update(name.getBytes());
                md.update(pass.getBytes());
                digest =(byte[])(Object) md.digest();
            } catch (Exception e) {
                e.printStackTrace();
                digest = null;
            }
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
