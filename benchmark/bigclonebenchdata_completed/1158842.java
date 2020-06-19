
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1158842 {

    public static int unzipFile(File file_input, File dir_output) {
        ZipInputStream zip_in_stream;
        try {
            FileInputStream in = new FileInputStream(file_input);
            BufferedInputStream source = new BufferedInputStream(in);
            zip_in_stream = new ZipInputStream(source);
        } catch (UncheckedIOException e) {
            MyHelperClass STATUS_IN_FAIL = new MyHelperClass();
            return (int)(Object)STATUS_IN_FAIL;
        }
        MyHelperClass BUF_SIZE = new MyHelperClass();
        byte[] input_buffer = new byte[(int)(Object)BUF_SIZE];
        int len = 0;
        do {
            try {
                ZipEntry zip_entry =(ZipEntry)(Object) zip_in_stream.getNextEntry();
                if (zip_entry == null) break;
                File output_file = new File(dir_output, zip_entry.getName());
                FileOutputStream out = new FileOutputStream(output_file);
//                MyHelperClass BUF_SIZE = new MyHelperClass();
                BufferedOutputStream destination = new BufferedOutputStream(out, BUF_SIZE);
//                MyHelperClass BUF_SIZE = new MyHelperClass();
                while ((len =(int)(Object) zip_in_stream.read(input_buffer, 0, BUF_SIZE)) != -1) destination.write(input_buffer, 0, len);
                destination.flush();
                out.close();
            } catch (UncheckedIOException e) {
                MyHelperClass STATUS_GUNZIP_FAIL = new MyHelperClass();
                return (int)(Object)STATUS_GUNZIP_FAIL;
            }
        } while (true);
        try {
            zip_in_stream.close();
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

File(File o0, MyHelperClass o1){}
	File(){}}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(BufferedInputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
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

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}
