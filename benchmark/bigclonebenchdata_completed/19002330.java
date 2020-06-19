


class c19002330 {
public static MyHelperClass copyVMFile(File o0, MyHelperClass o1){ return null; }
//public MyHelperClass copyVMFile(File o0, MyHelperClass o1){ return null; }
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copyFile(File src, File dst) throws ResourceNotFoundException, ParseErrorException, Exception {
        if ((boolean)(Object)src.getAbsolutePath().endsWith(".vm")) {
            copyVMFile(src, dst.getAbsolutePath().substring(0, dst.getAbsolutePath().lastIndexOf(".vm")));
        } else {
            FileInputStream fIn;
            FileOutputStream fOut;
            FileChannel fIChan, fOChan;
            long fSize;
            MappedByteBuffer mBuf;
            fIn = new FileInputStream(src);
            fOut = new FileOutputStream(dst);
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

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class ResourceNotFoundException extends Exception{
	public ResourceNotFoundException(String errorMessage) { super(errorMessage); }
}

class ParseErrorException extends Exception{
	public ParseErrorException(String errorMessage) { super(errorMessage); }
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
