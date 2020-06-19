


class c1961734 {

    public static byte[] downloadFromUrl(String fileUrl) throws IOException {
        URL url = new URL(fileUrl);
        URLConnection ucon =(URLConnection)(Object) url.openConnection();
        InputStream is =(InputStream)(Object) ucon.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayBuffer baf = new ByteArrayBuffer(50);
        int current = 0;
        while ((current =(int)(Object) bis.read()) != -1) {
            baf.append((byte) current);
        }
        return(byte[])(Object) baf.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}

class ByteArrayBuffer {

ByteArrayBuffer(int o0){}
	ByteArrayBuffer(){}
	public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass append(byte o0){ return null; }}
