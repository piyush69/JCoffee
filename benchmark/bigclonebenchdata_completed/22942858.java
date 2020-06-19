
import java.io.UncheckedIOException;


class c22942858 {
public MyHelperClass readHTMLFromStream(InputStreamReader o0){ return null; }
public MyHelperClass Logger;

    public void readHTMLFromURL(URL url) throws IOException {
        InputStream in =(InputStream)(Object) url.openStream();
        try {
            readHTMLFromStream(new InputStreamReader(in));
        } finally {
            try {
                in.close();
            } catch (UncheckedIOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(HTMLTextAreaModel.class.getName()).log(Level.SEVERE, "Exception while closing InputStream",(IOException)(Object) ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class HTMLTextAreaModel {

}
