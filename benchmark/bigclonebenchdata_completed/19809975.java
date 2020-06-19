


class c19809975 {

    public static String getETag(final String uri, final long lastModified) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest dg =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            dg.update(uri.getBytes("utf-8"));
            dg.update(new byte[] { (byte) ((lastModified >> 24) & 0xFF), (byte) ((lastModified >> 16) & 0xFF), (byte) ((lastModified >> 8) & 0xFF), (byte) (lastModified & 0xFF) });
            MyHelperClass CBASE64Codec = new MyHelperClass();
            return(String)(Object) CBASE64Codec.encode(dg.digest());
        } catch (final Exception ignore) {
            return uri + lastModified;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
