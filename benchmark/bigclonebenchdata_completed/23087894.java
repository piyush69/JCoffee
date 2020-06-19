


class c23087894 {

    public static String digest(String str) {
        StringBuffer sb = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            md5.update(str.getBytes("ISO8859-1"));
            byte[] array =(byte[])(Object) md5.digest();
            for (int x = 0; x < 16; x++) {
                if ((array[x] & 0xff) < 0x10) sb.append("0");
                sb.append(Long.toString(array[x] & 0xff, 16));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
