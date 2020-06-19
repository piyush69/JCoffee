


class c1235538 {

    public static String encrypt(final String pass) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(pass.getBytes("UTF-8"));
            MyHelperClass Base64 = new MyHelperClass();
            return new String((String)(Object)Base64.encodeBase64(md.digest()));
        } catch (final Exception e) {
            throw new RuntimeException("No se pudo encriptar el password.", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeBase64(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
