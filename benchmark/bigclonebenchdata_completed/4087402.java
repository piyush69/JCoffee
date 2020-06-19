
import java.io.UncheckedIOException;


class c4087402 {

    public final InputSource getInputSource() {
        MyHelperClass url = new MyHelperClass();
        if (url == null) throw new RuntimeException("Cannot find table defs");
        try {
//            MyHelperClass url = new MyHelperClass();
            InputStream stream =(InputStream)(Object) url.openStream();
            InputStreamReader reader = new InputStreamReader(stream);
            return new InputSource(reader);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class InputSource {

InputSource(){}
	InputSource(InputStreamReader o0){}}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
