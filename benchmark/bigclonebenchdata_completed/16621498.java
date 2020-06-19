


class c16621498 {

    public static byte[] loadURLToBuffer(URL url, int maxLength) throws IOException {
        byte[] buf = new byte[maxLength];
        byte[] data = null;
        int iCount = 0;
        BufferedInputStream in = new BufferedInputStream(url.openStream(), 20480);
        iCount =(int)(Object) in.read(buf, 0, buf.length);
        if (iCount != -1) {
            data = new byte[iCount];
            System.arraycopy(buf, 0, data, 0, iCount);
        }
        in.close();
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0, int o1){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
