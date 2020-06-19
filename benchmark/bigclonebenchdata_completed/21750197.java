


class c21750197 {

    public static byte[] getBytesFromURL(URL url) throws IOException {
        byte[] b;
        URLConnection con =(URLConnection)(Object) url.openConnection();
        int size =(int)(Object) con.getContentLength();
        InputStream s =(InputStream)(Object) con.getInputStream();
        try {
            MyHelperClass IOUtil = new MyHelperClass();
            if (size <= 0) b =(byte[])(Object) IOUtil.getBytesFromStream(s); else {
                b = new byte[size];
                int len = 0;
                do {
                    int n =(int)(Object) s.read(b, len, size - len);
                    if (n < 0) throw new IOException("the stream was closed: " + url.toString());
                    len += n;
                } while (len < size);
            }
        } finally {
            s.close();
        }
        return b;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytesFromStream(InputStream o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
