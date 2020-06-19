
import java.io.UncheckedIOException;


class c10937085 {
public static MyHelperClass dec_mode;
	public static MyHelperClass _decode(ByteArrayOutputStream o0){ return null; }
//public MyHelperClass dec_mode;
//	public MyHelperClass _decode(ByteArrayOutputStream o0){ return null; }

    public static void _he3Decode(String in_file) {
        try {
            MyHelperClass dec_extension = new MyHelperClass();
            File out = new File(in_file + dec_extension);
            File in = new File(in_file);
            int file_size = (int)(int)(Object) in.length();
            FileInputStream in_stream = new FileInputStream(in_file);
            out.createNewFile();
            FileOutputStream out_stream = new FileOutputStream(out.getName());
            InputStreamReader inputReader = new InputStreamReader(in_stream, "ISO8859_1");
            OutputStreamWriter outputWriter = new OutputStreamWriter(out_stream, "ISO8859_1");
            ByteArrayOutputStream os = new ByteArrayOutputStream(file_size);
            byte byte_arr[] = new byte[8];
            char char_arr[] = new char[8];
            int buff_size = char_arr.length;
            int _fetched = 0;
            int _chars_read = 0;
            MyHelperClass appname = new MyHelperClass();
            System.out.println(appname + ".\n" + dec_mode + ": " + in_file + "\n" + dec_mode + " to: " + in_file + dec_extension + "\n" + "\nreading: ");
            while (_fetched < file_size) {
                _chars_read =(int)(Object) inputReader.read(char_arr, 0, buff_size);
                if (_chars_read == -1) break;
                for (int i = 0; i < _chars_read; i++) byte_arr[i] = (byte) char_arr[i];
                os.write(byte_arr, 0, _chars_read);
                _fetched += _chars_read;
                System.out.print("*");
            }
            MyHelperClass dec_mode = new MyHelperClass();
            System.out.print("\n" + dec_mode + ": ");
            outputWriter.write(new String((byte[])(Object)_decode((ByteArrayOutputStream) os), "ISO-8859-1"));
            System.out.print("complete\n\n");
        } catch (java.io.UncheckedIOException fnfEx) {
            System.err.println("Exception: " + fnfEx.getMessage());
        } catch (java.io.IOException ioEx) {
            System.err.println("Exception: " + ioEx.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class InputStreamReader {

InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
