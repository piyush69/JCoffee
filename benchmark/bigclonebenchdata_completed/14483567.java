


class c14483567 {

    private String md5(String... args) throws FlickrException {
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : args) {
                sb.append(str);
            }
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(sb.toString().getBytes());
            byte[] bytes =(byte[])(Object) md.digest();
            StringBuilder result = new StringBuilder();
            for (byte b : bytes) {
                String hx = Integer.toHexString(0xFF & b);
                if (hx.length() == 1) {
                    hx = "0" + hx;
                }
                result.append(hx);
            }
            return result.toString();
        } catch (Exception ex) {
            throw new FlickrException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class FlickrException extends Exception{
	public FlickrException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
