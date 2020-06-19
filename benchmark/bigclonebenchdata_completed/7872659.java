
import java.io.UncheckedIOException;


class c7872659 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    private static boolean genCustRatingFileAndMovieIndexFile(String completePath, String masterFile, String CustRatingFileName, String MovieIndexFileName) {
        try {
            MyHelperClass fSep = new MyHelperClass();
            File inFile = new File(completePath + fSep + "SmartGRAPE" + fSep + masterFile);
            FileChannel inC =(FileChannel)(Object) (new FileInputStream(inFile).getChannel());
//            MyHelperClass fSep = new MyHelperClass();
            File outFile1 = new File(completePath + fSep + "SmartGRAPE" + fSep + MovieIndexFileName);
            FileChannel outC1 =(FileChannel)(Object) (new FileOutputStream(outFile1, true).getChannel());
//            MyHelperClass fSep = new MyHelperClass();
            File outFile2 = new File(completePath + fSep + "SmartGRAPE" + fSep + CustRatingFileName);
            FileChannel outC2 =(FileChannel)(Object) (new FileOutputStream(outFile2, true).getChannel());
            int fileSize = (int)(int)(Object) inC.size();
            int totalNoDataRows = fileSize / 7;
            ByteBuffer mappedBuffer =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, fileSize);
            int startIndex = 1, count = 0;
            short currentMovie = 1;
            while ((boolean)(Object)mappedBuffer.hasRemaining()) {
                count++;
                short movieName =(short)(Object) mappedBuffer.getShort();
                int customer =(int)(Object) mappedBuffer.getInt();
                byte rating =(byte)(Object) mappedBuffer.get();
                if (movieName != currentMovie) {
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    ByteBuffer outBuf1 =(ByteBuffer)(Object) ByteBuffer.allocate(10);
                    outBuf1.putShort(currentMovie);
                    outBuf1.putInt(startIndex);
                    outBuf1.putInt(count - 1);
                    outBuf1.flip();
                    outC1.write(outBuf1);
                    currentMovie = movieName;
                    startIndex = count;
                }
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer outBuf2 =(ByteBuffer)(Object) ByteBuffer.allocate(5);
                outBuf2.putInt(customer);
                outBuf2.put(rating);
                outBuf2.flip();
                outC2.write(outBuf2);
            }
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer endOfIndexFile =(ByteBuffer)(Object) ByteBuffer.allocate(10);
            endOfIndexFile.putShort(currentMovie);
            endOfIndexFile.putInt(startIndex);
            endOfIndexFile.putInt(100480506);
            endOfIndexFile.flip();
            outC1.write(endOfIndexFile);
            outC1.close();
            outC2.close();
            return true;
        } catch (UncheckedIOException e) {
            System.err.println(e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass allocate(int o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileChannel {

public MyHelperClass map(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass getInt(){ return null; }
	public MyHelperClass putShort(short o0){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass put(byte o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass get(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
