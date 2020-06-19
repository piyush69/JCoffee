
import java.io.UncheckedIOException;


class c7872662 {

    private static boolean prepareProbeFile(String completePath, String outputFile) {
        try {
            MyHelperClass fSep = new MyHelperClass();
            File inFile = new File(completePath + fSep + "probe.txt");
            FileChannel inC =(FileChannel)(Object) (new FileInputStream(inFile).getChannel());
            BufferedReader br = new BufferedReader(new FileReader(inFile));
//            MyHelperClass fSep = new MyHelperClass();
            File outFile = new File(completePath + fSep + "SmartGRAPE" + fSep + outputFile);
            FileChannel outC =(FileChannel)(Object) (new FileOutputStream(outFile, true).getChannel());
            boolean endOfFile = true;
            short movieName = 0;
            int customer = 0;
            while (endOfFile) {
                String line =(String)(Object) br.readLine();
                if (line != null) {
                    if (line.indexOf(":") >= 0) {
                        movieName = new Short(line.substring(0, line.length() - 1)).shortValue();
                    } else {
                        customer = new Integer(line).intValue();
                        MyHelperClass ByteBuffer = new MyHelperClass();
                        ByteBuffer outBuf =(ByteBuffer)(Object) ByteBuffer.allocate(6);
                        outBuf.putShort(movieName);
                        outBuf.putInt(customer);
                        outBuf.flip();
                        outC.write(outBuf);
                    }
                } else endOfFile = false;
            }
            br.close();
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

public MyHelperClass allocate(int o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(File o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass putShort(short o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
