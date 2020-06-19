


class c18287600 {

    public static String getMD5Hash(String input) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(input.getBytes());
            byte[] result =(byte[])(Object) md5.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < result.length; i++) {
                String byteStr = Integer.toHexString(result[i]);
                String swap = null;
                switch(byteStr.length()) {
                    case 1:
                        swap = "0" + Integer.toHexString(result[i]);
                        break;
                    case 2:
                        swap = Integer.toHexString(result[i]);
                        break;
                    case 8:
                        swap = (Integer.toHexString(result[i])).substring(6, 8);
                        break;
                }
                hexString.append(swap);
            }
            return hexString.toString();
        } catch (Exception ex) {
            System.out.println("Fehler beim Ermitteln eines Hashs (" + ex.getMessage() + ")");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
