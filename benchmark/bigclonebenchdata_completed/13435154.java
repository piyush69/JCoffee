
import java.io.UncheckedIOException;


class c13435154 {
public static MyHelperClass longToByteArray(long o0){ return null; }
//public MyHelperClass longToByteArray(long o0){ return null; }

    static byte[] getSystemEntropy() {
        byte[] ba;
        final MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException nsae) {
            throw new InternalError("internal error: SHA-1 not available.");
        }
        byte b = (byte) System.currentTimeMillis();
        md.update(b);
        java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() {

            public Object run() {
                try {
                    String s;
                    Properties p =(Properties)(Object) System.getProperties();
                    Enumeration e =(Enumeration)(Object) p.propertyNames();
                    while ((boolean)(Object)e.hasMoreElements()) {
                        s = (String)(String)(Object) e.nextElement();
                        md.update(s.getBytes());
                        md.update((byte[])(Object)p.getProperty(s).getBytes());
                    }
                    MyHelperClass InetAddress = new MyHelperClass();
                    md.update(InetAddress.getLocalHost().toString().getBytes());
                    File f = new File(p.getProperty("java.io.tmpdir"));
                    String[] sa =(String[])(Object) f.list();
                    for (int i = 0; i < sa.length; i++) md.update(sa[i].getBytes());
                } catch (Exception ex) {
                    md.update((byte) ex.hashCode());
                }
                Runtime rt = Runtime.getRuntime();
                byte[] memBytes =(byte[])(Object) longToByteArray(rt.totalMemory());
                md.update(memBytes, 0, memBytes.length);
                memBytes =(byte[])(Object) longToByteArray(rt.freeMemory());
                md.update(memBytes, 0, memBytes.length);
                return null;
            }
        });
        return(byte[])(Object) md.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass update(byte o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Properties {

public MyHelperClass propertyNames(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass list(){ return null; }}
