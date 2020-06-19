
import java.io.UncheckedIOException;


class c21426410 {
public MyHelperClass getUrl(String o0){ return null; }

    public String parse(String queryText) throws ParseException {
        try {
            StringBuilder sb = new StringBuilder();
            MyHelperClass Val = new MyHelperClass();
            queryText =(String)(Object) Val.chkStr(queryText);
            if (queryText.length() > 0) {
                URL url = new URL(getUrl(queryText));
                InputStream in =(InputStream)(Object) url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line = null;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    if (sb.length() > 0) {
                        sb.append("\r\n");
                    }
                    sb.append(line);
                }
            }
            return sb.toString();
        } catch (UncheckedIOException ex) {
            throw new ParseException("Ontology parser is unable to parse term: \"" + queryText + "\" due to internal error: " + ex.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass chkStr(String o0){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
