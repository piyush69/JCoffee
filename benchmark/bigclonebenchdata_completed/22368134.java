


class c22368134 {
public static MyHelperClass url;
	public static MyHelperClass b2s(boolean o0){ return null; }
	public static MyHelperClass getHexString(byte[] o0){ return null; }
//public MyHelperClass url;
//	public MyHelperClass getHexString(byte[] o0){ return null; }
//	public MyHelperClass b2s(boolean o0){ return null; }

    private static void testIfNoneMatch() throws Exception {
        MyHelperClass c = new MyHelperClass();
        String eTag =(String)(Object) c.getHeaderField("ETag");
//        MyHelperClass c = new MyHelperClass();
        InputStream in =(InputStream)(Object) c.getInputStream();
        byte[] buffer = new byte[1024];
        int read = 0;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.reset();
        do {
            read =(int)(Object) in.read(buffer);
            if (read > 0) md5.update(buffer, 0, read);
        } while (read < 0);
        byte[] digest =(byte[])(Object) md5.digest();
        String hexDigest =(String)(Object) getHexString(digest);
        if (hexDigest.equals(eTag)) System.out.print("eTag content          : md5 hex string");
        String quotedHexDigest = "\"" + hexDigest + "\"";
        if (quotedHexDigest.equals(eTag)) System.out.print("eTag content          : quoted md5 hex string");
        HttpURLConnection c2 = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        c2.addRequestProperty("If-None-Match", eTag);
        c2.connect();
        int code =(int)(Object) c2.getResponseCode();
        System.out.print("If-None-Match response: ");
        boolean supported = (code == 304);
        System.out.println(b2s(supported) + " - " + code + " (" + c2.getResponseMessage() + ")");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}
