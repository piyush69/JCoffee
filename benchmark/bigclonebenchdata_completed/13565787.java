


class c13565787 {

    public static String encryptPassword(String plainPassword) {
        StringBuffer sb = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.update(plainPassword.getBytes());
            byte[] digestBytes =(byte[])(Object) messageDigest.digest();
            String hex = null;
            for (int i = 0; i < digestBytes.length; i++) {
                hex = Integer.toHexString(0xFF & digestBytes[i]);
                if (hex.length() < 2) sb.append("0");
                sb.append(hex);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return new String(sb);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
