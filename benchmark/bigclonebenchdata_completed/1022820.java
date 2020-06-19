


class c1022820 {

    public static final String computeHash(String stringToCompile) {
        String retVal = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(stringToCompile.getBytes());
            byte[] result =(byte[])(Object) md5.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < result.length; i++) {
                hexString.append(Integer.toHexString(0xFF & result[i]));
            }
            retVal = hexString.toString();
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("MD5 hash for \"" + stringToCompile + "\" is: " + retVal);
        } catch (Exception exe) {
            MyHelperClass log = new MyHelperClass();
            log.error(exe.getMessage(), exe);
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
