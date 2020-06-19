
import java.io.UncheckedIOException;


class c5606566 {

    public boolean authenticate(String user, String pass) throws IOException {
        MessageDigest hash = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest.getInstance("BrokenMD4");
        } catch (UncheckedIOException x) {
            throw new Error(x);
        }
        hash.update(new byte[4], 0, 4);
        try {
            hash.update(pass.getBytes("US-ASCII"), 0, pass.length());
            MyHelperClass challenge = new MyHelperClass();
            hash.update((byte[])(Object)challenge.getBytes("US-ASCII"), 0,(int)(Object) challenge.length());
        } catch (java.io.UnsupportedEncodingException shouldNeverHappen) {
        }
        MyHelperClass Util = new MyHelperClass();
        String response =(String)(Object) Util.base64(hash.digest());
        MyHelperClass out = new MyHelperClass();
        Util.writeASCII(out, user + " " + response + '\n');
        MyHelperClass in = new MyHelperClass();
        String reply =(String)(Object) Util.readLine(in);
        MyHelperClass RSYNCD_OK = new MyHelperClass();
        if (reply.startsWith((String)(Object)RSYNCD_OK)) {
            boolean authReqd;// = new boolean();
            authReqd = false;
            return true;
        }
        boolean connected;// = new boolean();
        connected = false;
        String error;// = new String();
        error = reply;
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readLine(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass base64(MyHelperClass o0){ return null; }
	public MyHelperClass writeASCII(MyHelperClass o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
