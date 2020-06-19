


class c12776420 {
public MyHelperClass mPage;

    public Bitmap getImage() throws IOException {
        MyHelperClass mCount = new MyHelperClass();
        int recordBegin = 78 + 8 * (int)(Object)mCount;
        Bitmap result = null;
        MyHelperClass mFile = new MyHelperClass();
        FileChannel channel =(FileChannel)(Object) (new FileInputStream(mFile).getChannel());
MyHelperClass[] mRecodeOffset = new MyHelperClass[5];
        channel.position(mRecodeOffset[(int)(Object)mPage]);
        ByteBuffer bodyBuffer;
        MyHelperClass mPage = new MyHelperClass();
        if ((int)(Object)mPage + 1 < (int)(Object)mCount) {
//            MyHelperClass mRecodeOffset = new MyHelperClass();
            int length =(int)(Object) mRecodeOffset[(int)(Object)mPage + 1] - (int)(Object)mRecodeOffset[(int)(Object)mPage];
            MyHelperClass MapMode = new MyHelperClass();
            bodyBuffer =(ByteBuffer)(Object) channel.map(MapMode.READ_ONLY, mRecodeOffset[(int)(Object)mPage], length);
            byte[] tmpCache = new byte[(int)(Object)bodyBuffer.capacity()];
            bodyBuffer.get(tmpCache);
            FileOutputStream o = new FileOutputStream("/sdcard/test.bmp");
            o.write(tmpCache);
            o.flush();
            o.getFD().sync();
            o.close();
            MyHelperClass BitmapFactory = new MyHelperClass();
            result =(Bitmap)(Object) BitmapFactory.decodeByteArray(tmpCache, 0, length);
        } else {
        }
        channel.close();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
	public MyHelperClass[] mRecodeOffset;
public MyHelperClass decodeByteArray(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass sync(){ return null; }}

class Bitmap {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass map(MyHelperClass o0, MyHelperClass o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass position(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass capacity(){ return null; }
	public MyHelperClass get(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getFD(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
