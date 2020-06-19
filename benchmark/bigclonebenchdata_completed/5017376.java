


class c5017376 {
public static MyHelperClass errorLog(String o0){ return null; }
//public MyHelperClass errorLog(String o0){ return null; }

    public static String md5(String str) {
        StringBuffer buf = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            byte[] data = new byte[32];
            MyHelperClass md5Encoding = new MyHelperClass();
            md.update(str.getBytes((String)(Object)md5Encoding), 0, str.length());
            data =(byte[])(Object) md.digest();
            for (int i = 0; i < data.length; i++) {
                int halfbyte = (data[i] >>> 4) & 0x0F;
                int two_halfs = 0;
                do {
                    if ((0 <= halfbyte) && (halfbyte <= 9)) buf.append((char) ('0' + halfbyte)); else buf.append((char) ('a' + (halfbyte - 10)));
                    halfbyte = data[i] & 0x0F;
                } while (two_halfs++ < 1);
            }
        } catch (Exception e) {
            errorLog("{Malgn.md5} " + e.getMessage());
        }
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}
