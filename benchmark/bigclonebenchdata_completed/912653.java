
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c912653 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: GUnzip source");
            return;
        }
        String zipname, source;
        if (args[0].endsWith(".gz")) {
            zipname = args[0];
            source = args[0].substring(0, args[0].length() - 3);
        } else {
            zipname = args[0] + ".gz";
            source = args[0];
        }
        GZIPInputStream zipin;
        try {
            FileInputStream in = new FileInputStream(zipname);
            zipin = new GZIPInputStream(in);
        } catch (UncheckedIOException e) {
            System.out.println("Couldn't open " + zipname + ".");
            return;
        }
        MyHelperClass sChunk = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)sChunk];
        try {
            FileOutputStream out = new FileOutputStream(source);
            int length;
//            MyHelperClass sChunk = new MyHelperClass();
            while ((length =(int)(Object) zipin.read(buffer, 0, sChunk)) != -1) out.write(buffer, 0, length);
            out.close();
        } catch (UncheckedIOException e) {
            System.out.println("Couldn't decompress " + args[0] + ".");
        }
        try {
            zipin.close();
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
