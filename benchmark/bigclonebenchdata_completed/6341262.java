
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6341262 {

    public static Map getResources(String jarFileName, String resource, int port, String protocol) throws Exception {
        Hashtable content = new Hashtable();
        if (!(protocol.equalsIgnoreCase("http") || protocol.equalsIgnoreCase("file"))) throw new IllegalArgumentException("Unsupported protocol; supported is: file or http");
        MyHelperClass InetAddress = new MyHelperClass();
        URL url = new URL(protocol, InetAddress.getLocalHost().getHostName(), port, jarFileName);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        JarInputStream zipIs = new JarInputStream(bis);
        ZipEntry entry;
        int size = 0;
        Vector v = new Vector();
        try {
            while ((entry =(ZipEntry)(Object) zipIs.getNextEntry()) != null) {
                MyHelperClass Console = new MyHelperClass();
                Console.log(entry.getName() + ", " + entry.getSize() + "..." + entry.toString());
                content.put((String)(Object)entry.getName(),(byte[])(Object) new ZipEntry(entry));
                v.add(entry);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        ZipEntry ze = null;
        for (int i = 0; i < (int)(Object)v.size(); i++) {
            ZipEntry zipEntry = (ZipEntry)(ZipEntry)(Object) v.elementAt(i);
            if (zipEntry.getName().equals(resource)) {
                ze = zipEntry;
                break;
            }
        }
        size = (int)(int)(Object) ze.getSize();
        MyHelperClass Console = new MyHelperClass();
        Console.log("resource size=" + size);
        byte[] buf = new byte[size];
        int rb = 0;
        int chunk = 0;
        while ((size - rb) > 0) {
            chunk =(int)(Object) zipIs.read(buf);
//            MyHelperClass Console = new MyHelperClass();
            Console.log("chunk = " + chunk + ", rb=" + rb);
            if (chunk == -1) {
                break;
            }
            rb += chunk;
        }
        try {
            zipIs.close();
            bis.close();
            url = null;
        } catch (UncheckedIOException e) {
//            MyHelperClass Console = new MyHelperClass();
            Console.log("error closing jar " + e.getMessage());
            e.printStackTrace();
        }
        if (size != buf.length) throw new Exception("Resource '" + resource + "' has not been read correctly.");
        System.out.println("buf=" + buf);
        content.put(resource, buf);
        return (Map)(Object)content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHostName(){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class Map {

}

class Hashtable {

public MyHelperClass put(String o0, byte[] o1){ return null; }}

class URL {

URL(String o0, MyHelperClass o1, int o2, String o3){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class JarInputStream {

JarInputStream(){}
	JarInputStream(BufferedInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

ZipEntry(ZipEntry o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class Vector {

public MyHelperClass add(ZipEntry o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
