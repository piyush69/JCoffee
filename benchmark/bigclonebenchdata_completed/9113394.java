


class c9113394 {
public static MyHelperClass convertTag(URL o0, String o1){ return null; }
	public static MyHelperClass readTag(BufferedInputStream o0){ return null; }
//public MyHelperClass readTag(BufferedInputStream o0){ return null; }
//	public MyHelperClass convertTag(URL o0, String o1){ return null; }

    public static void saveChangeLink(URL url, OutputStream os) {
        try {
            BufferedInputStream is = new BufferedInputStream(url.openStream());
            int i;
            while ((i =(int)(Object) is.read()) != -1) if ((char) i == '<') {
                String s =(String)(Object) readTag(is);
                String s1 =(String)(Object) convertTag(url, s);
                os.write(s1.getBytes());
            } else {
                os.write((byte) i);
            }
        } catch (Exception _ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass write(byte o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}
