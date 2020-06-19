
import java.io.UncheckedIOException;


class c16445079 {

    private static JvUndoableTableModel CSVReader(String filepath) throws IOException {
        try {
            URI url = new URI(filepath);
            return CSVReader((String)(Object)url.toURL().openStream());
        } catch (UncheckedIOException ex) {
            File file = new File(filepath);
            return CSVReader((String)(Object)file);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class JvUndoableTableModel {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass toURL(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}
