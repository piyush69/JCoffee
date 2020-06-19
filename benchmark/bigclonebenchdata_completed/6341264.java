
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6341264 {

    public static byte[] getJarEntry(String jarName, String entry, int port) {
        byte[] b = null;
        try {
            MyHelperClass InetAddress = new MyHelperClass();
            String codebase = System.getProperty("java.rmi.server.codebase",(String)(Object) InetAddress.getLocalHost().getHostName());
            String protocol = "http://";
            int x = codebase.indexOf(protocol) + protocol.length();
            String s2 = codebase.substring(x);
            int x2 = s2.indexOf('/');
            String downloadHost = s2.substring(0, x2);
            if (downloadHost.indexOf(':') == -1) {
                downloadHost += ":" + port;
            }
            URL url = new URL("jar:http://" + downloadHost + "/" + jarName + "!/" + entry);
            JarURLConnection jurl = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
            JarEntry je =(JarEntry)(Object) jurl.getJarEntry();
            InputStream is =(InputStream)(Object) jurl.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            int size = (int)(int)(Object) je.getSize();
            b = new byte[size];
            int rb = 0;
            int chunk = 0;
            while ((size - rb) > 0) {
                chunk =(int)(Object) bis.read(b, rb, size - rb);
                if (chunk == -1) {
                    break;
                }
                rb += chunk;
            }
            bis.close();
            is.close();
            bis = null;
            is = null;
            url = null;
            jurl = null;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return null;
        }
        return b;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLocalHost(){ return null; }
	public MyHelperClass getHostName(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class JarURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getJarEntry(){ return null; }}

class JarEntry {

public MyHelperClass getSize(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(InputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
