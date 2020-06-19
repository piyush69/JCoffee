
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20109501 {
public MyHelperClass ascii(String o0){ return null; }
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass println(String o0){ return null; }

    private void native2ascii(LanguageInfo info) {
        if (!(Boolean)(Object)info.isUTF8()) throw new IllegalArgumentException("requires utf8 language.");
        InputStream in = null;
        OutputStream out = null;
        print("\tConverting to ASCII... ");
        try {
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(info.getFileName()));
            in.mark(3);
            if ((int)(Object)in.read() != 0xEF ||(int)(Object) in.read() != 0xBB ||(int)(Object) in.read() != 0xBF) in.reset();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF8"));
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(info.getAlternateFileName()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "ISO-8859-1"));
            String read;
            while ((read =(String)(Object) reader.readLine()) != null) {
                writer.write(ascii(read));
                writer.newLine();
            }
            writer.flush();
            out.flush();
            println("... done!");
        } catch (UncheckedIOException ignored) {
            println("... error! (" + ignored.getMessage() + ")");
        } finally {
            if (in != null) try {
                in.close();
            } catch (UncheckedIOException ignored) {
            }
            if (out != null) try {
                out.close();
            } catch (UncheckedIOException ignored) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LanguageInfo {

public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getAlternateFileName(){ return null; }
	public MyHelperClass isUTF8(){ return null; }}

class InputStream {

public MyHelperClass reset(){ return null; }
	public MyHelperClass mark(int o0){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass newLine(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, String o1){}
	OutputStreamWriter(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
