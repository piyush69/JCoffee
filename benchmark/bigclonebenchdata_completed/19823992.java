


class c19823992 {

    public String getHash(String key, boolean base64) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        md.update(key.getBytes());
        if (base64) return new String((byte[])(Object)new Base64().encode(md.digest()), "UTF8"); else return new String((byte[])(Object)md.digest(), "UTF8");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Base64 {

public MyHelperClass encode(MyHelperClass o0){ return null; }}
