


class c2432640 {

    public static String getSHA1(String data) throws NoSuchAlgorithmException {
        String addr;
        MyHelperClass Locale = new MyHelperClass();
        data = data.toLowerCase((java.util.Locale)(Object)(Locale)(Object)Locale.getDefault());
        if (data.startsWith("mailto:")) {
            addr = data.substring(7);
        } else {
            addr = data;
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        StringBuffer sb = new StringBuffer();
        md.update(addr.getBytes());
        byte[] digest =(byte[])(Object) md.digest();
        for (int i = 0; i < digest.length; i++) {
            String hex = Integer.toHexString(digest[i]);
            if (hex.length() == 1) {
                hex = "0" + hex;
            }
            hex = hex.substring(hex.length() - 2);
            sb.append(hex);
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Locale {

}
