
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1158840 {

    public static int zipFile(File file_input, File dir_output) {
        File zip_output = new File(dir_output, file_input.getName() + ".zip");
        ZipOutputStream zip_out_stream;
        try {
            FileOutputStream out = new FileOutputStream(zip_output);
            zip_out_stream = new ZipOutputStream(new BufferedOutputStream(out));
        } catch (UncheckedIOException e) {
            MyHelperClass STATUS_OUT_FAIL = new MyHelperClass();
            return (int)(Object)STATUS_OUT_FAIL;
        }
        MyHelperClass BUF_SIZE = new MyHelperClass();
        byte[] input_buffer = new byte[(int)(Object)BUF_SIZE];
        int len = 0;
        try {
            ZipEntry zip_entry = new ZipEntry(file_input.getName());
            zip_out_stream.putNextEntry(zip_entry);
            FileInputStream in = new FileInputStream(file_input);
//            MyHelperClass BUF_SIZE = new MyHelperClass();
            BufferedInputStream source = new BufferedInputStream(in, BUF_SIZE);
//            MyHelperClass BUF_SIZE = new MyHelperClass();
            while ((len =(int)(Object) source.read(input_buffer, 0, BUF_SIZE)) != -1) zip_out_stream.write(input_buffer, 0, len);
            in.close();
        } catch (UncheckedIOException e) {
            MyHelperClass STATUS_ZIP_FAIL = new MyHelperClass();
            return (int)(Object)STATUS_ZIP_FAIL;
        }
        try {
            zip_out_stream.close();
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

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, MyHelperClass o1){}
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}
