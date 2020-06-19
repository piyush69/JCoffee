
import java.io.UncheckedIOException;


class c12571472 {

    public static ParsedXML parseXML(URL url) throws ParseException {
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            ParsedXML px = parseXML((URL)(Object)is);
            is.close();
            return px;
        } catch (UncheckedIOException e) {
            throw new ParseException("could not read from URL" + url.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class ParsedXML {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
