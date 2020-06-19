


class c14856221 {

    public static String encodeByMd5(String str) {
        try {
            if (str == null) {
                str = "";
            }
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(str.getBytes("utf-8"));
            byte[] b =(byte[])(Object) md5.digest();
            int i;
            StringBuffer buff = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buff.append("0");
                }
                buff.append(Integer.toHexString(i));
            }
            return buff.toString();
        } catch (Exception e) {
            return str;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
