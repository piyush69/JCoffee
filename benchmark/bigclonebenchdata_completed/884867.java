
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c884867 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: GZip source");
            return;
        }
        String zipname = args[0] + ".gz";
        GZIPOutputStream zipout;
        try {
            FileOutputStream out = new FileOutputStream(zipname);
            zipout = new GZIPOutputStream(out);
        } catch (UncheckedIOException e) {
            System.out.println("Couldn't create " + zipname + ".");
            return;
        }
        MyHelperClass sChunk = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)sChunk];
        try {
            FileInputStream in = new FileInputStream(args[0]);
            int length;
//            MyHelperClass sChunk = new MyHelperClass();
            while ((length =(int)(Object) in.read(buffer, 0, sChunk)) != -1) zipout.write(buffer, 0, length);
            in.close();
        } catch (UncheckedIOException e) {
            System.out.println("Couldn't compress " + args[0] + ".");
        }
        try {
            zipout.close();
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}
