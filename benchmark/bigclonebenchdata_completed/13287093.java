
import java.io.UncheckedIOException;


class c13287093 {

    private boolean load(URL url) {
        try {
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            PDFParser parser;// = new PDFParser();
            parser = new PDFParser(connection.getInputStream());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PDFParser {

PDFParser(){}
	PDFParser(MyHelperClass o0){}}
