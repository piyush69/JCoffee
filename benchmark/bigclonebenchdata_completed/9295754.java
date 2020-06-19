


class c9295754 {

    public static String encryptPassword(String password) {
        try {
            MessageDigest digest =(MessageDigest)(Object) java.security.MessageDigest.getInstance("SHA1");
            digest.update(password.getBytes("UTF-8"));
            byte[] hash =(byte[])(Object) digest.digest();
            StringBuffer buf = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                int halfbyte = (hash[i] >>> 4) & 0x0F;
                int two_halfs = 0;
                do {
                    if ((0 <= halfbyte) && (halfbyte <= 9)) {
                        buf.append((char) ('0' + halfbyte));
                    } else {
                        buf.append((char) ('a' + (halfbyte - 10)));
                    }
                    halfbyte = hash[i] & 0x0F;
                } while (two_halfs++ < 1);
            }
            return buf.toString();
        } catch (Exception e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
