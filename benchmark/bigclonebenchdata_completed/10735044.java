


class c10735044 {

    public static byte[] getBytes(URL url) throws IOException {
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        InputStream in =(InputStream)(Object) connection.getInputStream();
        int contentLength =(int)(Object) connection.getContentLength();
        ByteArrayOutputStream tmpOut;
        if (contentLength != -1) {
            tmpOut = new ByteArrayOutputStream(contentLength);
        } else {
            tmpOut = new ByteArrayOutputStream(16384);
        }
        byte[] buf = new byte[512];
        while (true) {
            int len =(int)(Object) in.read(buf);
            if (len == -1) {
                break;
            }
            tmpOut.write(buf, 0, len);
        }
        in.close();
        tmpOut.close();
        byte[] array =(byte[])(Object) tmpOut.toByteArray();
        return array;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(){}
	ByteArrayOutputStream(int o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
