
import java.io.UncheckedIOException;


class c17575095 {
public MyHelperClass _parser;
	public MyHelperClass compile(InputSource o0, MyHelperClass o1){ return null; }

    public boolean compile(URL url) {
        try {
            final InputStream stream =(InputStream)(Object) url.openStream();
            final InputSource input = new InputSource(stream);
            input.setSystemId(url.toString());
            MyHelperClass _className = new MyHelperClass();
            return(boolean)(Object) compile(input, _className);
        } catch (UncheckedIOException e) {
            MyHelperClass Constants = new MyHelperClass();
            _parser.reportError(Constants.FATAL, new ErrorMsg((IOException)(Object)e));
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FATAL;
public MyHelperClass reportError(MyHelperClass o0, ErrorMsg o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ErrorMsg {

ErrorMsg(IOException o0){}
	ErrorMsg(){}}
