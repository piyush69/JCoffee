


class c9141695 {

    public static String calcResponse(String ha1, String nonce, String nonceCount, String cnonce, String qop, String method, String uri) throws FatalException, MD5DigestException {
        MD5Encoder encoder = new MD5Encoder();
        String ha2 = null;
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new FatalException((String)(Object)e);
        }
        if (method == null || uri == null) {
            MyHelperClass WebdavStatus = new MyHelperClass();
            throw new MD5DigestException(WebdavStatus.SC_BAD_REQUEST, "method or uri");
        }
        if (qop != null && qop.equals("auth-int")) {
            MyHelperClass WebdavStatus = new MyHelperClass();
            throw new MD5DigestException((String)(Object)WebdavStatus.SC_UNSUPPORTED_MEDIA_TYPE);
        }
        if (nonce == null) {
            MyHelperClass WebdavStatus = new MyHelperClass();
            throw new MD5DigestException(WebdavStatus.SC_BAD_REQUEST, "nonce");
        }
        if (qop != null && (qop.equals("auth") || qop.equals("auth-int"))) {
            if (nonceCount == null || cnonce == null) {
                MyHelperClass WebdavStatus = new MyHelperClass();
                throw new MD5DigestException(WebdavStatus.SC_BAD_REQUEST, "nc or cnonce");
            }
        }
        md5.update((method + ":" + uri).getBytes());
        ha2 =(String)(Object) encoder.encode(md5.digest());
        md5.update((ha1 + ":" + nonce + ":").getBytes());
        if (qop != null && (qop.equals("auth") || qop.equals("auth-int"))) {
            md5.update((nonceCount + ":" + cnonce + ":" + qop + ":").getBytes());
        }
        md5.update(ha2.getBytes());
        String response =(String)(Object) encoder.encode(md5.digest());
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_BAD_REQUEST;
	public MyHelperClass SC_UNSUPPORTED_MEDIA_TYPE;
public MyHelperClass getInstance(String o0){ return null; }}

class FatalException extends Exception{
	public FatalException(String errorMessage) { super(errorMessage); }
}

class MD5DigestException extends Exception{
	public MD5DigestException(String errorMessage) { super(errorMessage); }
	MD5DigestException(){}
	MD5DigestException(MyHelperClass o0, String o1){}
}

class MD5Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
