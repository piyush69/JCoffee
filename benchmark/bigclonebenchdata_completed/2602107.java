


class c2602107 {
public MyHelperClass contentStream;
	public MyHelperClass File;
	public MyHelperClass IOUtils;
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getId(){ return null; }

    public OutputStream getAsOutputStream() throws IOException {
        OutputStream out;
        MyHelperClass contentStream = new MyHelperClass();
        if (contentStream != null) {
            File tmp =(File)(Object) File.createTempFile(getId(), null);
            out =(OutputStream)(Object) new FileOutputStream(tmp);
            IOUtils.copy(contentStream, out);
        } else {
            out =(OutputStream)(Object) new ByteArrayOutputStream();
            out.write(getContent());
        }
        return out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass createTempFile(MyHelperClass o0, Object o1){ return null; }}

class OutputStream {

public MyHelperClass write(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ByteArrayOutputStream {

}
