
import java.io.UncheckedIOException;


class c6613739 {

    private static MappedObject sendHttpRequestToUrl(URL url, String method) throws Exception {
        try {
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod(method);
            connection.connect();
            InputStream is =(InputStream)(Object) connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder buffer = new StringBuilder();
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                buffer.append(line);
            }
            System.out.println("Read: " + buffer.toString());
            connection.disconnect();
            MyHelperClass JAXBContext = new MyHelperClass();
            JAXBContext context =(JAXBContext)(Object) JAXBContext.newInstance(MappedObject.class);
            Unmarshaller unmarshaller =(Unmarshaller)(Object) context.createUnmarshaller();
            MappedObject mapped = (MappedObject)(MappedObject)(Object) unmarshaller.unmarshal(new StringReader(buffer.toString()));
            return mapped;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        throw new Exception("Could not establish connection to " + url.toExternalForm());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(Class<MappedObject> o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class MappedObject {

}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class JAXBContext {

public MyHelperClass createUnmarshaller(){ return null; }}

class Unmarshaller {

public MyHelperClass unmarshal(StringReader o0){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
