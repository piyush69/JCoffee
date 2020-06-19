import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20514304 {
public MyHelperClass url;
	public MyHelperClass JSON;
	public MyHelperClass deserializeException(Map<String o0, Object o1){ return null; }
	public MyHelperClass getClient(){ return null; }

//    @SuppressWarnings("unchecked")
    private Map<String, Object> _request(String method, String path, Map<String, Object> body, JSONRecognizer... recognizers) throws Throwable, IOException, TwinException {
        MyHelperClass url = new MyHelperClass();
        String uri = url + path;
        HttpRequest request;
        if (body == null) {
            BasicHttpRequest r = new BasicHttpRequest(method, uri);
            request = r;
        } else {
            BasicHttpEntityEnclosingRequest r = new BasicHttpEntityEnclosingRequest(method, uri);
            StringEntity entity;
            try {
                MyHelperClass JSON = new MyHelperClass();
                entity = new StringEntity(JSON.encode(body), "utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            entity.setContentType("application/json; charset=utf-8");
            r.setEntity(entity);
            request = r;
        }
        HttpClient client = getClient();
        try {
            HttpResponse response = client.execute(new HttpHost(url.getHost(), url.getPort()), request);
            HttpEntity entity = response.getEntity();
            if (entity == null) return null;
            String contentType = entity.getContentType().getValue();
            boolean isJson = (contentType != null) && ("application/json".equals(contentType) || contentType.startsWith("application/json;"));
            String result = null;
            InputStream in = entity.getContent();
            try {
                Reader r = new InputStreamReader(in, "UTF-8");
                StringBuilder sb = new StringBuilder();
                char[] buf = new char[256];
                int read;
                while ((read = r.read(buf, 0, buf.length)) >= 0) sb.append(buf, 0, read);
                r.close();
                result = sb.toString();
            } finally {
                try {
                    in.close();
                } catch (Exception e) {
                }
            }
            int code = response.getStatusLine().getStatusCode();
            if (code >= 400) {
                if (isJson) {
                    try {
                        throw deserializeException((Map<String, Object>) JSON.decode(result));
                    } catch (IllegalArgumentException e) {
                        throw UnknownError.create("Couldn't parse error response: \n" + result, e);
                    }
                }
                if (code == 404) throw UnknownCommand.create("Got server response " + code + " for request " + uri); else throw UnknownError.create("Got server response " + code + " for request " + uri + "\nBody is " + result);
            }
            if (!isJson) throw UnknownError.create("Got wrong content type " + contentType + " for request " + uri + "\nBody is " + result);
            try {
                return (Map<String, Object>) JSON.decode(result, recognizers);
            } catch (Exception e) {
                throw UnknownError.create("Malformed JSON result for request " + uri + ": \nBody is " + result, e);
            }
        } catch (ClientProtocolException e) {
            throw new IOException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JSONRecognizer {

}

class TwinException extends Exception{
	public TwinException(String errorMessage) { super(errorMessage); }
}

class HttpRequest {

}

class BasicHttpRequest {

}

class BasicHttpEntityEnclosingRequest {

}

class StringEntity {

}

class HttpClient {

}

class HttpResponse {

}

class HttpHost {

}

class HttpEntity {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
