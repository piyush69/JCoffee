import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1508930 {
public MyHelperClass lastErrorCode;
	public MyHelperClass lastErrorMessage;

    public String httpRequestByPOST(String url, int timeout, List<NameValuePair> params)  throws Throwable {
        String response = "";
        try {
            HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            HttpResponse serverResponse =(HttpResponse)(Object) httpClient.execute(httpPost);
            StatusLine statusLine =(StatusLine)(Object) serverResponse.getStatusLine();
            if ((int)(Object)statusLine.getStatusCode() < 400) {
                InputStream inputStream =(InputStream)(Object) serverResponse.getEntity().getContent();
                InputStreamReader inputReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputReader);
                StringBuffer buffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    buffer.append(line);
                }
                response = buffer.toString();
                inputStream.close();
            } else {
                this.lastErrorCode =(MyHelperClass)(Object) String.valueOf(statusLine.getStatusCode());
                this.lastErrorMessage = statusLine.getReasonPhrase();
                return null;
            }
        } catch (IOException e) {
            this.lastErrorCode =(MyHelperClass)(Object) "-1";
            this.lastErrorMessage =(MyHelperClass)(Object) e.getLocalizedMessage();
            return null;
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class NameValuePair {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class StatusLine {

public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}
