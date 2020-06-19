
import java.io.UncheckedIOException;


class c21618559 {
public MyHelperClass bytesToHex(MyHelperClass o0){ return null; }
public MyHelperClass File;
	public MyHelperClass getServletContext(){ return null; }

    protected String getGraphPath(String name) throws ServletException {
        String hash;
        try {
            MyHelperClass m_messagedigest_algorithm = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(m_messagedigest_algorithm);
            md.update(name.getBytes());
            hash =(String)(Object) bytesToHex(md.digest());
        } catch (UncheckedIOException e) {
            throw new ServletException("NoSuchAlgorithmException while " + "attempting to hash file name: " + e);
        }
        File tempDir = (File)(File)(Object) getServletContext().getAttribute("javax.servlet.context.tempdir");
        return(int)(Object) tempDir.getAbsolutePath() + (int)(Object)File.separatorChar + hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separatorChar;
public MyHelperClass getAttribute(String o0){ return null; }}

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

class File {

public MyHelperClass getAbsolutePath(){ return null; }}
