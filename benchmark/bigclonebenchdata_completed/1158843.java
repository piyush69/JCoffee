
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1158843 {

    public static int gunzipFile(File file_input, File dir_output) {
        GZIPInputStream gzip_in_stream;
        try {
            FileInputStream in = new FileInputStream(file_input);
            BufferedInputStream source = new BufferedInputStream(in);
            gzip_in_stream = new GZIPInputStream(source);
        } catch (UncheckedIOException e) {
            MyHelperClass STATUS_IN_FAIL = new MyHelperClass();
            return (int)(Object)STATUS_IN_FAIL;
        }
        String file_input_name =(String)(Object) file_input.getName();
        String file_output_name = file_input_name.substring(0, file_input_name.length() - 3);
        File output_file = new File(dir_output, file_output_name);
        MyHelperClass BUF_SIZE = new MyHelperClass();
        byte[] input_buffer = new byte[(int)(Object)BUF_SIZE];
        int len = 0;
        try {
            FileOutputStream out = new FileOutputStream(output_file);
//            MyHelperClass BUF_SIZE = new MyHelperClass();
            BufferedOutputStream destination = new BufferedOutputStream(out, BUF_SIZE);
//            MyHelperClass BUF_SIZE = new MyHelperClass();
            while ((len =(int)(Object) gzip_in_stream.read(input_buffer, 0, BUF_SIZE)) != -1) destination.write(input_buffer, 0, len);
            destination.flush();
            out.close();
        } catch (UncheckedIOException e) {
            MyHelperClass STATUS_GUNZIP_FAIL = new MyHelperClass();
            return (int)(Object)STATUS_GUNZIP_FAIL;
        }
        try {
            gzip_in_stream.close();
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

File(File o0, String o1){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class GZIPInputStream {

GZIPInputStream(BufferedInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}
