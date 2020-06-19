
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15612870 {

    public static void main(String[] args) {
        FileInputStream fr = null;
        FileOutputStream fw = null;
        BufferedInputStream br = null;
        BufferedOutputStream bw = null;
        try {
            fr = new FileInputStream("D:/5.xls");
            fw = new FileOutputStream("c:/Dxw.java");
            br = new BufferedInputStream(fr);
            bw = new BufferedOutputStream(fw);
            int read =(int)(Object) br.read();
            while (read != -1) {
                bw.write(read);
                read =(int)(Object) br.read();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
