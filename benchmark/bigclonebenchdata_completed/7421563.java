


class c7421563 {
public MyHelperClass toHex(MyHelperClass o0){ return null; }

    private StringBuffer encoder(String arg) {
        if (arg == null) {
            arg = "";
        }
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass SysConstant = new MyHelperClass();
            md5.update(arg.getBytes((String)(Object)SysConstant.charset));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return(StringBuffer)(Object) toHex(md5.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass charset;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
