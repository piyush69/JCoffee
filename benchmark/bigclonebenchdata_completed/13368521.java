


class c13368521 {
public MyHelperClass Streams;
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass _getFile(String o0){ return null; }

    public void sendBinaryFile(String filename) throws IOException {
        MyHelperClass Checker = new MyHelperClass();
        Checker.checkEmpty(filename, "filename");
        URL url =(URL)(Object) _getFile(filename);
        OutputStream out =(OutputStream)(Object) getOutputStream();
        Streams.copy(url.openStream(), out);
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass checkEmpty(String o0, String o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}
