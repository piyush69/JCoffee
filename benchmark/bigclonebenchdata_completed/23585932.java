
import java.io.UncheckedIOException;


class c23585932 {

    public static void concatenateOutput(File[] inputFiles, File outputFile) {
        int numberOfInputFiles = inputFiles.length;
        byte lf = (byte) '\n';
        try {
            FileOutputStream fos = new FileOutputStream(outputFile);
            FileChannel outfc =(FileChannel)(Object) fos.getChannel();
            System.out.println("Processing " + inputFiles[0].getPath());
            FileInputStream fis = new FileInputStream(inputFiles[0]);
            FileChannel infc =(FileChannel)(Object) fis.getChannel();
            int bufferCapacity = 100000;
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer bb =(ByteBuffer)(Object) ByteBuffer.allocate(bufferCapacity);
            bb.clear();
            while ((int)(Object)infc.read(bb) > 0) {
                bb.flip();
                outfc.write(bb);
                bb.clear();
            }
            infc.close();
            for (int f = 1; f < numberOfInputFiles; f++) {
                System.out.println("Processing " + inputFiles[f].getPath());
                fis = new FileInputStream(inputFiles[f]);
                infc =(FileChannel)(Object) fis.getChannel();
                bb.clear();
                int bytesread =(int)(Object) infc.read(bb);
                bb.flip();
                byte b =(byte)(Object) bb.get();
                while (b != lf) {
                    b =(byte)(Object) bb.get();
                }
                outfc.write(bb);
                bb.clear();
                while ((int)(Object)infc.read(bb) > 0) {
                    bb.flip();
                    outfc.write(bb);
                    bb.clear();
                }
                infc.close();
            }
            outfc.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass flip(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
