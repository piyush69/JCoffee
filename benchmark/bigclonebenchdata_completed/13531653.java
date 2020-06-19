import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13531653 {
public static MyHelperClass IOUtils;
//public MyHelperClass IOUtils;

    private static String processRequest(String request, HttpMethod method)  throws Throwable {
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        URI uri = null;
        try {
            uri = new URI(request);
            ClientHttpRequest clientHttpRequest =(ClientHttpRequest)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) simpleClientHttpRequestFactory.createRequest(uri, method);
            ClientHttpResponse response =(ClientHttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) clientHttpRequest.execute();
            InputStream bodyInputStream =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getBody();
            String body = IOUtils.toString(bodyInputStream);
            return body;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpMethod {

}

class SimpleClientHttpRequestFactory {

public MyHelperClass createRequest(URI o0, HttpMethod o1){ return null; }}

class ClientHttpRequest {

public MyHelperClass execute(){ return null; }}

class ClientHttpResponse {

public MyHelperClass getBody(){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
