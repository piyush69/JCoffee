


class c16762677 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copyFile(File src, File dest) throws IOException {
        FileInputStream fIn;
        FileOutputStream fOut;
        FileChannel fIChan, fOChan;
        long fSize;
        MappedByteBuffer mBuf;
        fIn = new FileInputStream(src);
        fOut = new FileOutputStream(dest);
        fIChan =(FileChannel)(Object) fIn.getChannel();
        fOChan =(FileChannel)(Object) fOut.getChannel();
        fSize =(long)(Object) fIChan.size();
        mBuf =(MappedByteBuffer)(Object) fIChan.map(MapMode.READ_ONLY, 0, fSize);
        fOChan.write(mBuf);
        fIChan.close();
        fIn.close();
        fOChan.close();
        fOut.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class MappedByteBuffer {

}
