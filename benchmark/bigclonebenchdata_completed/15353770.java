
import java.io.UncheckedIOException;


class c15353770 {
public MyHelperClass bot;
	public MyHelperClass MessageDigest;
	public MyHelperClass getStringProperty(String o0){ return null; }

    private String createHash() {
        String hash = "";
        try {
            final java.util.Calendar c = java.util.Calendar.getInstance();
            String day = "" + c.get(java.util.Calendar.DATE);
            day = (day.length() == 1) ? '0' + day : day;
            String month = "" + (c.get(java.util.Calendar.MONTH) + 1);
            month = (month.length() == 1) ? '0' + month : month;
            final String hashString = getStringProperty("hashkey") + day + "." + month + "." + c.get(java.util.Calendar.YEAR);
            final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(hashString.getBytes());
            final byte digest[] =(byte[])(Object) md.digest();
            hash = "";
            for (int i = 0; i < digest.length; i++) {
                final String s = Integer.toHexString(digest[i] & 0xFF);
                hash += ((s.length() == 1) ? "0" + s : s);
            }
        } catch (final UncheckedIOException e) {
            bot.getLogger().log((NoSuchAlgorithmException)(Object)e);
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(NoSuchAlgorithmException o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getLogger(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
