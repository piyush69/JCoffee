
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1158841 {

    public static int gzipFile(File file_input, String file_output) {
        File gzip_output = new File(file_output);
        GZIPOutputStream gzip_out_stream;
        try {
            FileOutputStream out = new FileOutputStream(gzip_output);
            gzip_out_stream = new GZIPOutputStream(new BufferedOutputStream(out));
        } catch (UncheckedIOException e) {
            MyHelperClass STATUS_OUT_FAIL = new MyHelperClass();
            return (int)(Object)STATUS_OUT_FAIL;
        }
        MyHelperClass BUF_SIZE = new MyHelperClass();
        byte[] input_buffer = new byte[(int)(Object)BUF_SIZE];
        int len = 0;
        try {
            FileInputStream in = new FileInputStream(file_input);
//            MyHelperClass BUF_SIZE = new MyHelperClass();
            BufferedInputStream source = new BufferedInputStream(in, BUF_SIZE);
//            MyHelperClass BUF_SIZE = new MyHelperClass();
            while ((len =(int)(Object) source.read(input_buffer, 0, BUF_SIZE)) != -1) gzip_out_stream.write(input_buffer, 0, len);
            in.close();
        } catch (UncheckedIOException e) {
            MyHelperClass STATUS_GZIP_FAIL = new MyHelperClass();
            return (int)(Object)STATUS_GZIP_FAIL;
        }
        try {
            gzip_out_stream.close();
        } catch (UncheckedIOException e) {
        }
        MyHelperClass STATUS_OK = new MyHelperClass();
        return (int)(Object)STATUS_OK;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, MyHelperClass o1){}
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}
