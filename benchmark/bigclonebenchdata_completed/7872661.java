
import java.io.UncheckedIOException;


class c7872661 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    private static boolean genMovieRatingFile(String completePath, String masterFile, String CustLocationsFileName, String MovieRatingFileName) {
        try {
            MyHelperClass fSep = new MyHelperClass();
            File inFile1 = new File(completePath + fSep + "SmartGRAPE" + fSep + masterFile);
            FileChannel inC1 =(FileChannel)(Object) (new FileInputStream(inFile1).getChannel());
            int fileSize1 = (int)(int)(Object) inC1.size();
            int totalNoDataRows = fileSize1 / 7;
            ByteBuffer mappedBuffer =(ByteBuffer)(Object) inC1.map(MapMode.READ_ONLY, 0, fileSize1);
            System.out.println("Loaded master binary file");
//            MyHelperClass fSep = new MyHelperClass();
            File inFile2 = new File(completePath + fSep + "SmartGRAPE" + fSep + CustLocationsFileName);
            FileChannel inC2 =(FileChannel)(Object) (new FileInputStream(inFile2).getChannel());
            int fileSize2 = (int)(int)(Object) inC2.size();
            System.out.println(fileSize2);
//            MyHelperClass fSep = new MyHelperClass();
            File outFile = new File(completePath + fSep + "SmartGRAPE" + fSep + MovieRatingFileName);
            FileChannel outC =(FileChannel)(Object) (new FileOutputStream(outFile, true).getChannel());
            for (int i = 0; i < 1; i++) {
                ByteBuffer locBuffer =(ByteBuffer)(Object) inC2.map(MapMode.READ_ONLY, i * fileSize2, fileSize2);
                System.out.println("Loaded cust location file chunk: " + i);
                while ((boolean)(Object)locBuffer.hasRemaining()) {
                    int locationToRead =(int)(Object) locBuffer.getInt();
                    mappedBuffer.position((locationToRead - 1) * 7);
                    short movieName =(short)(Object) mappedBuffer.getShort();
                    int customer =(int)(Object) mappedBuffer.getInt();
                    byte rating =(byte)(Object) mappedBuffer.get();
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    ByteBuffer outBuf =(ByteBuffer)(Object) ByteBuffer.allocate(3);
                    outBuf.putShort(movieName);
                    outBuf.put(rating);
                    outBuf.flip();
                    outC.write(outBuf);
                }
            }
            mappedBuffer.clear();
            inC1.close();
            inC2.close();
            outC.close();
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

class ByteBuffer {

public MyHelperClass getInt(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass putShort(short o0){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass position(int o0){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass put(byte o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass get(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
