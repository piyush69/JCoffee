
import java.io.UncheckedIOException;


class c3908311 {

    public byte[] uniqueID(String name, String topic) {
        String key;
        byte[] id;
        MyHelperClass cache_ = new MyHelperClass();
        synchronized (cache_) {
            key = name + "|" + topic;
//            MyHelperClass cache_ = new MyHelperClass();
            id = (byte[])(byte[])(Object) cache_.get(key);
            if (id == null) {
                MessageDigest md;
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
                    md.update(name.getBytes());
                    md.update(topic.getBytes());
                    id =(byte[])(Object) md.digest();
//                    MyHelperClass cache_ = new MyHelperClass();
                    cache_.put(key, id);
                    MyHelperClass debug_ = new MyHelperClass();
                    if ((boolean)(Object)debug_) {
                        System.out.println("Cached " + key + " [" + id[0] + "," + id[1] + ",...]");
                    }
                } catch (UncheckedIOException e) {
                    throw new Error("SHA not available!");
                }
            }
        }
        return id;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, byte[] o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
