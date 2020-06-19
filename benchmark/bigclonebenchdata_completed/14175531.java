


class c14175531 {
public MyHelperClass toHex(MyHelperClass o0){ return null; }

    public String getShortToken(String md5Str) {
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass JspRunConfig = new MyHelperClass();
            md5.update(md5Str.getBytes((String)(Object)JspRunConfig.charset));
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuffer token =(StringBuffer)(Object) toHex(md5.digest());
        return token.substring(8, 24);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass charset;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
