
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5683576 {
public MyHelperClass parseResults(JsonParser o0){ return null; }
public MyHelperClass URIUtils;

    public String shorten(String url) {
        List qparams =(List)(Object) new ArrayList();
        qparams.add(new BasicNameValuePair("version", "2.0.1"));
        qparams.add(new BasicNameValuePair("longUrl", url));
        MyHelperClass login = new MyHelperClass();
        if (login != null) {
//            MyHelperClass login = new MyHelperClass();
            qparams.add(new BasicNameValuePair("login", login));
            MyHelperClass apiKey = new MyHelperClass();
            qparams.add(new BasicNameValuePair("apiKey", apiKey));
            qparams.add(new BasicNameValuePair("history", "1"));
        }
        try {
            BasicHttpParams params = new BasicHttpParams();
            DefaultHttpClient httpclient = new DefaultHttpClient(params);
            MyHelperClass URLEncodedUtils = new MyHelperClass();
            URI uri =(URI)(Object) URIUtils.createURI("http", "api.j.mp", -1, "/shorten", URLEncodedUtils.format(qparams, "UTF-8"), null);
            HttpGet httpget = new HttpGet(uri);
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("HttpGet.uri={}",(JmpShortenResponse)(Object) httpget.getURI());
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity != null) {
                InputStream instream =(InputStream)(Object) entity.getContent();
                JsonFactory f = new JsonFactory();
                JsonParser jp =(JsonParser)(Object) f.createJsonParser(instream);
                JmpShortenResponse responseObj = new JmpShortenResponse();
                for (; ; ) {
                    JsonToken token =(JsonToken)(Object) jp.nextToken();
                    String fieldname =(String)(Object) jp.getCurrentName();
//                    MyHelperClass logger = new MyHelperClass();
                    if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Token={}, currentName={}", token, fieldname);
                    MyHelperClass JsonToken = new MyHelperClass();
                    if (token == (JsonToken)(Object)JsonToken.START_OBJECT) {
                        continue;
                    }
//                    MyHelperClass JsonToken = new MyHelperClass();
                    if (token == (JsonToken)(Object)JsonToken.END_OBJECT) {
                        break;
                    }
                    if ("errorCode".equals(fieldname)) {
                        token =(JsonToken)(Object) jp.nextToken();
                        responseObj.setErrorCode(jp.getIntValue());
                    } else if ("errorMessage".equals(fieldname)) {
                        token =(JsonToken)(Object) jp.nextToken();
                        responseObj.setErrorMessage(jp.getText());
                    } else if ("statusCode".equals(fieldname)) {
                        token =(JsonToken)(Object) jp.nextToken();
                        responseObj.setStatusCode(jp.getText());
                    } else if ("results".equals(fieldname)) {
                        Map results =(Map)(Object) parseResults(jp);
                        responseObj.setResults(results);
                    } else {
                        throw new IllegalStateException("Unrecognized field '" + fieldname + "'!");
                    }
                }
                Map results =(Map)(Object) responseObj.getResults();
                if (results == null) {
                    return null;
                }
                ShortenedUrl shortened =(ShortenedUrl)(Object) results.get(url);
                if (shortened == null) {
                    return null;
                }
//                MyHelperClass logger = new MyHelperClass();
                if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("JmpShortenResponse: {}", responseObj);
                if ("OK".equals(responseObj.getStatusCode())) {
                    return(String)(Object) shortened.getShortUrl();
                }
//                MyHelperClass logger = new MyHelperClass();
                if ((boolean)(Object)logger.isWarnEnabled()) logger.warn("JmpShortenResponse: {}", responseObj);
            }
        } catch (UncheckedIOException ex) {
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isWarnEnabled()) logger.warn("Exception!",(IOException)(Object) ex);
        } catch (ArithmeticException ex) {
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isWarnEnabled()) logger.warn("Exception!",(IOException)(Object) ex);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass END_OBJECT;
	public MyHelperClass START_OBJECT;
public MyHelperClass debug(String o0, JsonToken o1, String o2){ return null; }
	public MyHelperClass format(List o0, String o1){ return null; }
	public MyHelperClass isWarnEnabled(){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0, JmpShortenResponse o1){ return null; }
	public MyHelperClass createURI(String o0, String o1, int o2, String o3, MyHelperClass o4, Object o5){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass warn(String o0, URISyntaxException o1){ return null; }
	public MyHelperClass warn(String o0, JmpShortenResponse o1){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(){}
	DefaultHttpClient(BasicHttpParams o0){}
	public MyHelperClass execute(HttpGet o0){ return null; }}

class URI {

}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}
	public MyHelperClass getURI(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class JsonFactory {

public MyHelperClass createJsonParser(InputStream o0){ return null; }}

class JsonParser {

public MyHelperClass getText(){ return null; }
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass getIntValue(){ return null; }
	public MyHelperClass getCurrentName(){ return null; }}

class JmpShortenResponse {

public MyHelperClass setErrorCode(MyHelperClass o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass setErrorMessage(MyHelperClass o0){ return null; }
	public MyHelperClass getResults(){ return null; }
	public MyHelperClass setResults(Map o0){ return null; }
	public MyHelperClass setStatusCode(MyHelperClass o0){ return null; }}

class JsonToken {

}

class Map {

public MyHelperClass get(String o0){ return null; }}

class ShortenedUrl {

public MyHelperClass getShortUrl(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}
