


class c11904056 {

    public static void convertEncoding(File infile, File outfile, String from, String to) throws IOException, UnsupportedEncodingException {
        InputStream in;
        if (infile != null) in =(InputStream)(Object) new FileInputStream(infile); else in =(InputStream)(Object) System.in;
        OutputStream out;
        outfile.createNewFile();
        if (outfile != null) out =(OutputStream)(Object) new FileOutputStream(outfile); else out =(OutputStream)(Object) System.out;
        if (from == null) from = System.getProperty("file.encoding");
        if (to == null) to = "Unicode";
        Reader r =(Reader)(Object) new BufferedReader(new InputStreamReader(in, from));
        Writer w =(Writer)(Object) new BufferedWriter(new OutputStreamWriter(out, to));
        char[] buffer = new char[4096];
        int len;
        while ((len =(int)(Object) r.read(buffer)) != -1) w.write(buffer, 0, len);
        r.close();
        w.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Reader {

public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class Writer {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, String o1){}
	OutputStreamWriter(){}}
