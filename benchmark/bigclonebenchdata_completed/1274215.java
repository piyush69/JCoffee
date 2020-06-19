
import java.io.UncheckedIOException;


class c1274215 {

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.err.println("usage: test [src] [dest]");
                return;
            }
            FileInputStream in = new FileInputStream(args[0]);
            FileOutputStream out = new FileOutputStream(args[1]);
            FileChannel src =(FileChannel)(Object) in.getChannel();
            FileChannel channel =(FileChannel)(Object) out.getChannel();
            long pos = 0, len =(long)(Object) src.size(), ret;
            while (len > 0) {
                if ((ret =(long)(Object) channel.transferFrom(src, pos, len)) < 0) break;
                len -= ret;
                pos += ret;
            }
            out.close();
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, long o1, long o2){ return null; }
	public MyHelperClass size(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
