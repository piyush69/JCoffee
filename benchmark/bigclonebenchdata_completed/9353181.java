import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9353181 {
public MyHelperClass request;

    JSONResponse execute() throws ServerException, RtmApiException, IOException {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        URI uri;
        try {
            uri = new URI((String)(Object)this.request.getUrl());
            HttpPost httppost = new HttpPost(uri);
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            InputStream is =(InputStream)(Object) response.getEntity().getContent();
            try {
                StringBuilder sb = new StringBuilder();
                BufferedReader r = new BufferedReader(new InputStreamReader((InputStream)(Object)new DoneHandlerInputStream(is)));
                for (String line = r.readLine(); line != null; line = r.readLine()) {
                    sb.append(line);
                }
                return new JSONResponse(sb.toString());
            } finally {
                is.close();
            }
        } catch (URISyntaxException e) {
            throw new RtmApiException(e.getMessage());
        } catch (UncheckedIOException e) {
            throw new RtmApiException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class JSONResponse {

JSONResponse(String o0){}
	JSONResponse(){}}

class ServerException extends Exception{
	public ServerException(String errorMessage) { super(errorMessage); }
}

class RtmApiException extends Exception{
	public RtmApiException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(){}
	HttpPost(URI o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class DoneHandlerInputStream {

DoneHandlerInputStream(InputStream o0){}
	DoneHandlerInputStream(){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
