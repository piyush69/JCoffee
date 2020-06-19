
import java.io.UncheckedIOException;


class c21618564 {
public MyHelperClass bytesToHex(MyHelperClass o0){ return null; }

    protected String insertCommand(String command) throws ServletException {
        String digest;
        try {
            MyHelperClass m_messagedigest_algorithm = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(m_messagedigest_algorithm);
            md.update(command.getBytes());
            byte bytes[] = new byte[20];
            MyHelperClass m_random = new MyHelperClass();
            m_random.nextBytes(bytes);
            md.update(bytes);
            digest =(String)(Object) bytesToHex(md.digest());
        } catch (UncheckedIOException e) {
            throw new ServletException("NoSuchAlgorithmException while " + "attempting to generate graph ID: " + e);
        }
        String id = System.currentTimeMillis() + "-" + digest;
        MyHelperClass m_map = new MyHelperClass();
        m_map.put(id, command);
        return id;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass nextBytes(byte[] o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
