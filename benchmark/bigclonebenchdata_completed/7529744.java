
import java.io.UncheckedIOException;


class c7529744 {
public MyHelperClass NEWLINE;
	public MyHelperClass logger;
	public MyHelperClass documentParser;
	public MyHelperClass isADbPediaURI(String o0){ return null; }
	public MyHelperClass fromResourceToRawDataUri(String o0){ return null; }

    public Document retrieveDefinition(String uri) throws IOException, UnvalidResponseException {
        if (!(Boolean)(Object)isADbPediaURI(uri)) throw new IllegalArgumentException("Not a DbPedia Resource URI");
        String rawDataUri =(String)(Object) fromResourceToRawDataUri(uri);
        URL url = new URL(rawDataUri);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        logger.debug(".conn open");
        conn.setDoOutput(true);
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        logger.debug(".resp obtained");
        StringBuffer responseBuffer = new StringBuffer();
        String line;
        while ((line =(String)(Object) rd.readLine()) != null) {
            responseBuffer.append(line);
            responseBuffer.append(NEWLINE);
        }
        rd.close();
        logger.debug(".done");
        try {
            return(Document)(Object) documentParser.parse(responseBuffer.toString());
        } catch (UncheckedIOException e) {
            throw new UnvalidResponseException("Incorrect XML document",(SAXException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Document {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class UnvalidResponseException extends Exception{
	public UnvalidResponseException(String errorMessage) { super(errorMessage); }
	UnvalidResponseException(){}
	UnvalidResponseException(String o0, SAXException o1){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
