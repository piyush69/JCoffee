


class c1849189 {
public MyHelperClass getFile(String o0){ return null; }

    public InputPort getInputPort(String file) throws IOException {
        if (file.equals("/dev/null")) {
            return (InputPort)(Object)new StreamInputPort(new NullInputStream(), file);
        }
        MyHelperClass Util = new MyHelperClass();
        URL url =(URL)(Object) Util.tryURL(file);
        if (url != null) {
            return (InputPort)(Object)new StreamInputPort((NullInputStream)(Object)url.openStream(),(String)(Object) url.toExternalForm());
        } else return (InputPort)(Object)new FileInputPort(getFile(file));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass tryURL(String o0){ return null; }}

class InputPort {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StreamInputPort {

StreamInputPort(){}
	StreamInputPort(NullInputStream o0, String o1){}}

class NullInputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class FileInputPort {

FileInputPort(MyHelperClass o0){}
	FileInputPort(){}}
