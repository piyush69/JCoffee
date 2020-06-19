
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5842117 {

    private void copy(final File src, final File dstDir) {
        dstDir.mkdirs();
        final File dst = new File(dstDir, src.getName());
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(src), "ISO-8859-1"));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dst), "ISO-8859-1"));
            String read;
            while ((read =(String)(Object) reader.readLine()) != null) {
                Line line = new Line(read);
                if ((boolean)(Object)line.isComment()) continue;
                writer.write(read);
                writer.newLine();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) try {
                reader.close();
            } catch (UncheckedIOException e) {
            }
            if (writer != null) {
                try {
                    writer.flush();
                } catch (UncheckedIOException e) {
                }
                try {
                    writer.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass newLine(){ return null; }}

class InputStreamReader {

InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Line {

Line(String o0){}
	Line(){}
	public MyHelperClass isComment(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
