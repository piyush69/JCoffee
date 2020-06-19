


class c11015015 {
public MyHelperClass BitUtils;

    public Bits write(Map data) throws IOException {
        String pictureurl = (String)(String)(Object) data.get("pictureurl");
        URL url = new URL(pictureurl);
        InputStream is =(InputStream)(Object) url.openStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int buf =(int)(Object) is.read();
        while (buf >= 0) {
            baos.write(buf);
            buf =(int)(Object) is.read();
        }
        MyHelperClass TypeUtils = new MyHelperClass();
        return(Bits)(Object) BitUtils._concat(BitUtils._bitsUI16(TypeUtils.toLong(data.get("shapeId"))), BitUtils._bytesToBits(baos.toByteArray()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass _bitsUI16(MyHelperClass o0){ return null; }
	public MyHelperClass toLong(MyHelperClass o0){ return null; }
	public MyHelperClass _concat(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass _bytesToBits(MyHelperClass o0){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }}

class Bits {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(int o0){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
