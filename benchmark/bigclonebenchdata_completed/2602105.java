


class c2602105 {
public MyHelperClass setPath(MyHelperClass o0){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass getContent(){ return null; }

    public void dumpToFile(File file) throws IOException {
        OutputStream out =(OutputStream)(Object) new FileOutputStream(file);
        MyHelperClass contentStream = new MyHelperClass();
        if (contentStream != null) {
//            MyHelperClass contentStream = new MyHelperClass();
            IOUtils.copy(contentStream, out);
            setPath(file.getAbsolutePath());
        } else {
            IOUtils.write(getContent(), out);
        }
        IOUtils.closeQuietly(out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
