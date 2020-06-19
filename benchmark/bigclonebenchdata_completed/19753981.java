
import java.io.UncheckedIOException;


class c19753981 {
public MyHelperClass Type;

    private void download(String address, String localFileName, String host, int porta) {
        InputStream in = null;
        URLConnection conn = null;
        OutputStream out = null;
        System.out.println("Update.download() BAIXANDO " + address);
        try {
            URL url = new URL(address);
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(localFileName));
            if (host != "" && host != null) {
                Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(host, porta));
                conn =(URLConnection)(Object) url.openConnection(proxy);
            } else {
                conn =(URLConnection)(Object) url.openConnection();
            }
            in =(InputStream)(Object) conn.getInputStream();
            byte[] buffer = new byte[1024];
            int numRead;
            long numWritten = 0;
            while ((numRead =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                numWritten += numRead;
            }
            System.out.println(localFileName + "\t" + numWritten);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (UncheckedIOException ioe) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP;
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class Proxy {

Proxy(MyHelperClass o0, InetSocketAddress o1){}
	Proxy(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InetSocketAddress {

InetSocketAddress(String o0, int o1){}
	InetSocketAddress(){}}
