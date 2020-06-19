


class c21735428 {

    private DictionaryListParser downloadList(final String url) throws IOException, JSONException {
        final HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        final HttpGet httpGet = new HttpGet(url);
        final HttpResponse response =(HttpResponse)(Object) client.execute(httpGet);
        final HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        if (entity == null) {
            throw new IOException("HttpResponse.getEntity() IS NULL");
        }
        MyHelperClass RESPONSE_CONTENT_TYPE = new MyHelperClass();
        final boolean isValidType =(boolean)(Object) entity.getContentType().getValue().startsWith(RESPONSE_CONTENT_TYPE);
        if (!isValidType) {
            final String message = "CONTENT_TYPE IS '" + entity.getContentType().getValue() + "'";
            throw new IOException(message);
        }
        MyHelperClass RESPONSE_ENCODING = new MyHelperClass();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), RESPONSE_ENCODING));
        final StringBuilder stringResult = new StringBuilder();
        try {
            for (String line =(String)(Object) reader.readLine(); line != null; line =(String)(Object) reader.readLine()) {
                stringResult.append(line);
            }
        } finally {
            reader.close();
        }
        return new DictionaryListParser(stringResult);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class DictionaryListParser {

DictionaryListParser(StringBuilder o0){}
	DictionaryListParser(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}}
