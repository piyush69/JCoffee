


class c16621499 {

    public static byte[] loadURLToBuffer(URL url) throws IOException {
        byte[] buf = new byte[4096];
        byte[] data = null;
        byte[] temp = null;
        int iCount = 0;
        int iTotal = 0;
        BufferedInputStream in = new BufferedInputStream(url.openStream(), 20480);
        while ((iCount =(int)(Object) in.read(buf, 0, buf.length)) != -1) {
            if (iTotal == 0) {
                data = new byte[iCount];
                System.arraycopy(buf, 0, data, 0, iCount);
                iTotal = iCount;
            } else {
                temp = new byte[iCount + iTotal];
                System.arraycopy(data, 0, temp, 0, iTotal);
                System.arraycopy(buf, 0, temp, iTotal, iCount);
                data = temp;
                iTotal = iTotal + iCount;
            }
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
