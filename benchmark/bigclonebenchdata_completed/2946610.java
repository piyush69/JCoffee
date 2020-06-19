


class c2946610 {

    private static Document getDocument(URL url, String applicationVersion, boolean addHeader, int timeOut) throws IOException, ParserConfigurationException, SAXException {
        HttpURLConnection huc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        huc.setConnectTimeout(1000 * timeOut);
        huc.setRequestMethod("GET");
        if (addHeader) {
            huc.setRequestProperty("JavaPEG-Version", applicationVersion);
        }
        huc.connect();
        int code =(int)(Object) huc.getResponseCode();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        if (code != (int)(Object)HttpURLConnection.HTTP_OK) {
            throw new IOException("Invaild HTTP response: " + code);
        }
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
        return(Document)(Object) db.parse(huc.getInputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass newInstance(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Document {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(MyHelperClass o0){ return null; }}
