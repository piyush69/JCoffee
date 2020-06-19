
import java.io.UncheckedIOException;


class c16623181 {

    public static void main(String[] args) {
        File srcDir = new File(args[0]);
        File dstDir = new File(args[1]);
        File[] srcFiles =(File[])(Object) srcDir.listFiles();
        for (File f : srcFiles) {
            if ((boolean)(Object)f.isDirectory()) continue;
            try {
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(f).getChannel());
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dstDir.getAbsolutePath() + System.getProperty("file.separator") + f.getName()).getChannel());
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(1024);
                int nr = 0;
                srcChannel.position(nr);
                nr += (int)(Object)srcChannel.read(buffer);
                while (nr < (int)(Object)f.length()) {
                    buffer.flip();
                    dstChannel.write(buffer);
                    buffer.clear();
                    nr += (int)(Object)srcChannel.read(buffer);
                }
                srcChannel.close();
                dstChannel.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass position(int o0){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass clear(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
