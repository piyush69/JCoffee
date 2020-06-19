


class c13368520 {
public MyHelperClass Streams;
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass _getFile(String o0){ return null; }

    public void sendTextFile(String filename) throws IOException {
        MyHelperClass Checker = new MyHelperClass();
        Checker.checkEmpty(filename, "filename");
        URL url =(URL)(Object) _getFile(filename);
        PrintWriter out =(PrintWriter)(Object) getWriter();
        Streams.copy(new InputStreamReader(url.openStream()), out);
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass checkEmpty(String o0, String o1){ return null; }
	public MyHelperClass copy(InputStreamReader o0, PrintWriter o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class PrintWriter {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
