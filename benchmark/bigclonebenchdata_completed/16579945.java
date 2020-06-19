
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16579945 {
public MyHelperClass ioEx;
public MyHelperClass _decode(ByteArrayOutputStream o0){ return null; }
public MyHelperClass extension;
	public MyHelperClass appname;

    public void he3Decode(String in_file) {
        try {
            File out = new File(in_file + extension);
            File in = new File(in_file);
            int file_size = (int)(int)(Object) in.length();
            FileInputStream in_stream = new FileInputStream(in_file);
            out.createNewFile();
            FileOutputStream out_stream = new FileOutputStream(out.getName());
            ByteArrayOutputStream os = new ByteArrayOutputStream(file_size);
            byte byte_arr[] = new byte[8];
            int buff_size = byte_arr.length;
            int _fetched = 0;
            int _chars_read = 0;
            System.out.println(appname + ".\n" + "decoding: " + in_file + "\n" + "decoding to: " + in_file + extension + "\n" + "\nreading: ");
            while (_fetched < file_size) {
                _chars_read =(int)(Object) in_stream.read(byte_arr, 0, buff_size);
                if (_chars_read == -1) break;
                os.write(byte_arr, 0, _chars_read);
                _fetched += _chars_read;
                System.out.print("*");
            }
            System.out.print("\ndecoding: ");
            out_stream.write(_decode((ByteArrayOutputStream) os));
            System.out.print("complete\n\n");
        } catch (java.io.UncheckedIOException fnfEx) {
            System.err.println("Exception: " + fnfEx.getMessage());
//         } catch (java.io.ArithmeticException ioEx) {
            System.err.println("Exception: " + ioEx.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(){}
	ByteArrayOutputStream(int o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
