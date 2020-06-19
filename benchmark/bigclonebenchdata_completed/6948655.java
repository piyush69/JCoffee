
import java.io.UncheckedIOException;


class c6948655 {

    public static void main(String[] args) throws IOException {
        File fileIn = new File("D:\\zz_c\\study2\\src\\study\\io\\A.java");
        InputStream fin =(InputStream)(Object) new FileInputStream(fileIn);
        PipedInputStream pin = new PipedInputStream();
        PipedOutputStream pout = new PipedOutputStream();
        pout.connect(pin);
        IoRead i = new IoRead();
        i.setIn(pin);
        File fileOU1 = new File("D:\\zz_c\\study2\\src\\study\\io\\A1.java");
        File fileOU2 = new File("D:\\zz_c\\study2\\src\\study\\io\\A2.java");
        File fileOU3 = new File("D:\\zz_c\\study2\\src\\study\\io\\A3.java");
        i.addOut((PipedOutputStream)(Object)new BufferedOutputStream(new FileOutputStream(fileOU1)));
        i.addOut((PipedOutputStream)(Object)new BufferedOutputStream(new FileOutputStream(fileOU2)));
        i.addOut((PipedOutputStream)(Object)new BufferedOutputStream(new FileOutputStream(fileOU3)));
        PipedInputStream pin2 = new PipedInputStream();
        PipedOutputStream pout2 = new PipedOutputStream();
        i.addOut(pout2);
        pout2.connect(pin2);
        i.start();
        int read;
        try {
            read =(int)(Object) fin.read();
            while (read != -1) {
                pout.write(read);
                read =(int)(Object) fin.read();
            }
            fin.close();
            pout.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        int c =(int)(Object) pin2.read();
        while (c != -1) {
            System.out.print((char) c);
            c =(int)(Object) pin2.read();
        }
        pin2.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class PipedInputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class PipedOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass connect(PipedInputStream o0){ return null; }}

class IoRead {

public MyHelperClass setIn(PipedInputStream o0){ return null; }
	public MyHelperClass addOut(PipedOutputStream o0){ return null; }
	public MyHelperClass start(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
