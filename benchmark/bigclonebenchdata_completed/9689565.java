


class c9689565 {
public static MyHelperClass pad(String o0, MyHelperClass o1, int o2, boolean o3){ return null; }
//public MyHelperClass pad(String o0, MyHelperClass o1, int o2, boolean o3){ return null; }
public static MyHelperClass log(Exception o0){ return null; }
//public MyHelperClass log(Exception o0){ return null; }

    public static String md5sum(String s, String alg) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(alg);
            md.update(s.getBytes(), 0, s.length());
            StringBuffer sb = new StringBuffer();
            synchronized (sb) {
                MyHelperClass ZERO = new MyHelperClass();
                for (byte b :(byte[])(Object) (Object[])(Object)md.digest()) sb.append(pad(Integer.toHexString(0xFF & b), ZERO.charAt(0), 2, true));
            }
            return sb.toString();
        } catch (Exception ex) {
            log(ex);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass charAt(int o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
