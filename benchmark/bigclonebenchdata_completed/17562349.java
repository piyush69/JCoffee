


class c17562349 {
public MyHelperClass nonceCount;
	public MyHelperClass cnonce;
	public MyHelperClass method;
	public MyHelperClass nonce;
	public MyHelperClass uri;
	public MyHelperClass qop;
	public MyHelperClass MessageDigest;
	public MyHelperClass bytesToHex(byte[] o0){ return null; }

    public String digestResponse() {
        String digest = null;
        MyHelperClass nonce = new MyHelperClass();
        if (null == nonce) return null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass username = new MyHelperClass();
            md.update((byte[])(Object)username.getBytes());
            md.update(":".getBytes());
            MyHelperClass realm = new MyHelperClass();
            md.update((byte[])(Object)realm.getBytes());
            md.update(":".getBytes());
            MyHelperClass password = new MyHelperClass();
            md.update((byte[])(Object)password.getBytes());
            byte[] d =(byte[])(Object) md.digest();
            MyHelperClass algorithm = new MyHelperClass();
            if (null != algorithm && -1 != (int)(Object)(algorithm.toLowerCase()).indexOf("md5-sess")) {
//                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                md.update(d);
                md.update(":".getBytes());
//                MyHelperClass nonce = new MyHelperClass();
                md.update((byte[])(Object)nonce.getBytes());
                md.update(":".getBytes());
                MyHelperClass cnonce = new MyHelperClass();
                md.update((byte[])(Object)cnonce.getBytes());
                d =(byte[])(Object) md.digest();
            }
            byte[] a1 =(byte[])(Object) bytesToHex(d);
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update((byte[])(Object)method.getBytes());
            md.update(":".getBytes());
            md.update((byte[])(Object)uri.getBytes());
            d =(byte[])(Object) md.digest();
            byte[] a2 =(byte[])(Object) bytesToHex(d);
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(a1);
            md.update(":".getBytes());
            md.update((byte[])(Object)nonce.getBytes());
            md.update(":".getBytes());
            if (null != qop) {
                md.update((byte[])(Object)nonceCount.getBytes());
                md.update(":".getBytes());
                md.update((byte[])(Object)cnonce.getBytes());
                md.update(":".getBytes());
                md.update((byte[])(Object)qop.getBytes());
                md.update(":".getBytes());
            }
            md.update(a2);
            d =(byte[])(Object) md.digest();
            byte[] r =(byte[])(Object) bytesToHex(d);
            digest = new String(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
