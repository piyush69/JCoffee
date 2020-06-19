


class c2431931 {

    public String encrypt(String pstrPlainText) throws Exception {
        if (pstrPlainText == null) {
            return "";
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        md.update(pstrPlainText.getBytes("UTF-8"));
        byte raw[] =(byte[])(Object) md.digest();
        return(String)(Object) (new BASE64Encoder()).encode(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
