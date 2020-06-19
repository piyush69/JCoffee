


class c2386120 {
public MyHelperClass htmlFile;
	public MyHelperClass getLastModified(){ return null; }

//    @Override
    public void setContentAsStream(InputStream input) throws IOException {
        MyHelperClass htmlFile = new MyHelperClass();
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(htmlFile));
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, output);
        } finally {
            output.close();
        }
        if ((int)(Object)this.getLastModified() != -1) {
            htmlFile.setLastModified(this.getLastModified());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass copy(InputStream o0, BufferedOutputStream o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}
