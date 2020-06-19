


class c16502662 {

    public static String hash(String toEncripty) {
        if (toEncripty != null) {
            try {
                synchronized (toEncripty) {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                    md.update(toEncripty.getBytes());
                    byte[] hash =(byte[])(Object) md.digest();
                    StringBuffer hexString = new StringBuffer();
                    for (int i = 0; i < hash.length; i++) {
                        if ((0xff & hash[i]) < 0x10) hexString.append("0" + Integer.toHexString((0xFF & hash[i]))); else hexString.append(Integer.toHexString(0xFF & hash[i]));
                    }
                    toEncripty = hexString.toString();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return toEncripty;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
