


class c8403573 {

    public static void copyFile(File src, String srcEncoding, File dest, String destEncoding) throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream(src), srcEncoding);
        OutputStreamWriter out = new OutputStreamWriter(new RobustFileOutputStream(dest), destEncoding);
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        out.flush();
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(RobustFileOutputStream o0, String o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class RobustFileOutputStream {

RobustFileOutputStream(File o0){}
	RobustFileOutputStream(){}}
