


class c21028032 {

    public void convert(File file, String fromEncoding, String toEncoding) throws IOException {
        InputStream in =(InputStream)(Object) new FileInputStream(file);
        StringWriter cache = new StringWriter();
        Reader reader =(Reader)(Object) new InputStreamReader(in, fromEncoding);
        char[] buffer = new char[128];
        int read;
        while ((read =(int)(Object) reader.read(buffer)) > -1) {
            cache.write(buffer, 0, read);
        }
        reader.close();
        in.close();
        MyHelperClass Log = new MyHelperClass();
        Log.warn(this, "read from file " + file + " (" + fromEncoding + "):" + cache);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(out, toEncoding);
        writer.write(cache.toString());
        cache.close();
        writer.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(c21028032 o0, String o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class StringWriter {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}

class Reader {

public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, String o1){}
	OutputStreamWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }}
