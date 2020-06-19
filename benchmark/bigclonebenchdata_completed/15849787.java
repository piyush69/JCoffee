
import java.io.UncheckedIOException;


class c15849787 {
public static MyHelperClass getMetaTagCharset(Document o0){ return null; }
//public MyHelperClass getMetaTagCharset(Document o0){ return null; }

    public static Document getDocument(String string, String defaultCharset) {
        DOMParser parser = new DOMParser();
        try {
            URL url = new URL(string);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            con.setConnectTimeout(10000);
            con.setUseCaches(false);
            MyHelperClass UUID = new MyHelperClass();
            con.addRequestProperty("_", UUID.randomUUID().toString());
            String contentType =(String)(Object) con.getContentType();
            if (contentType == null) {
                return null;
            }
            String charsetSearch = contentType.replaceFirst("(?i).*charset=(.*)", "$1");
            String contentTypeCharset =(String)(Object) con.getContentEncoding();
            BufferedReader reader = null;
            if (!contentType.equals(charsetSearch)) {
                contentTypeCharset = charsetSearch;
            }
            if (contentTypeCharset == null) {
                reader = new BufferedReader(new InputStreamReader(con.getInputStream(), defaultCharset));
            } else {
                reader = new BufferedReader(new InputStreamReader(con.getInputStream(), contentTypeCharset));
            }
            InputSource source = new InputSource(reader);
            parser.setFeature("http://xml.org/sax/features/namespaces", false);
            parser.parse(source);
            Document document =(Document)(Object) parser.getDocument();
            String metaTagCharset =(String)(Object) getMetaTagCharset(document);
            if (metaTagCharset != null && !metaTagCharset.equals(contentTypeCharset)) {
                HttpURLConnection reconnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                reconnection.setConnectTimeout(10000);
                reconnection.setUseCaches(false);
//                MyHelperClass UUID = new MyHelperClass();
                reconnection.addRequestProperty("_", UUID.randomUUID().toString());
                reader = new BufferedReader(new InputStreamReader(reconnection.getInputStream(), metaTagCharset));
                source = new InputSource(reader);
                parser.setFeature("http://xml.org/sax/features/namespaces", false);
                parser.parse(source);
                document =(Document)(Object) parser.getDocument();
            }
            reader.close();
            return document;
        } catch (UncheckedIOException e) {
            if (!"UTF-8".equals(defaultCharset)) {
                return getDocument(string, "UTF-8");
            }
            return null;
        } catch (Exception ex) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass randomUUID(){ return null; }}

class Document {

}

class DOMParser {

public MyHelperClass getDocument(){ return null; }
	public MyHelperClass setFeature(String o0, boolean o1){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class InputSource {

InputSource(BufferedReader o0){}
	InputSource(){}}

class DOMException extends Exception{
	public DOMException(String errorMessage) { super(errorMessage); }
}
