


class c9399634 {

    protected static String fileName2md5(String input) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.reset();
            md.update(input.getBytes("iso-8859-1"));
            byte[] byteHash =(byte[])(Object) md.digest();
            md.reset();
            StringBuffer resultString = new StringBuffer();
            for (int i = 0; i < byteHash.length; i++) {
                resultString.append(Integer.toHexString(0xFF & byteHash[i]));
            }
            return (resultString.toString());
        } catch (Exception ex) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.error(ex.getClass() + " " + ex.getMessage());
//            MyHelperClass Logger = new MyHelperClass();
            for (int i = 0; i < ex.getStackTrace().length; i++) Logger.error("     " + ex.getStackTrace()[i].toString());
            ex.printStackTrace();
        }
        return String.valueOf(Math.random() * Long.MAX_VALUE);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
