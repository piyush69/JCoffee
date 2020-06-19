
import java.io.UncheckedIOException;


class c2747367 {

    private Document getOpenLinkResponse(String queryDoc) throws IOException, UnvalidResponseException {
        MyHelperClass WS_URI = new MyHelperClass();
        URL url = new URL(WS_URI);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        MyHelperClass logger = new MyHelperClass();
        logger.debug(".conn open");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "text/xml");
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(queryDoc);
        wr.flush();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        MyHelperClass logger = new MyHelperClass();
        logger.debug(".resp obtained");
        StringBuffer responseBuffer = new StringBuffer();
        String line;
        while ((line =(String)(Object) rd.readLine()) != null) {
            responseBuffer.append(line);
            MyHelperClass NEWLINE = new MyHelperClass();
            responseBuffer.append(NEWLINE);
        }
        wr.close();
        rd.close();
//        MyHelperClass logger = new MyHelperClass();
        logger.debug(".done");
        try {
            MyHelperClass documentParser = new MyHelperClass();
            return(Document)(Object) documentParser.parse(responseBuffer.toString());
        } catch (UncheckedIOException e) {
            throw new UnvalidResponseException("Response is not a valid XML file",(SAXException)(Object) e);
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

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

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
