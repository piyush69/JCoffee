
import java.io.UncheckedIOException;


class c2559993 {

    private String hashSong(Song s) {
        if (s == null) return null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
            digest.update(s.getTitle().getBytes());
            digest.update(s.getAllLyrics().getBytes());
            MyHelperClass Base64 = new MyHelperClass();
            String hash =(String)(Object) Base64.encodeBytes(digest.digest());
            return hash;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeBytes(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class Song {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getAllLyrics(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
