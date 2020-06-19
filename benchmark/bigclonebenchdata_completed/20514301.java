import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20514301 {
public MyHelperClass url;
	public MyHelperClass getClient(){ return null; }

    List<String> options(String path) throws TwinException {
        try {
            MyHelperClass url = new MyHelperClass();
            BasicHttpRequest request = new BasicHttpRequest("OPTIONS", url + path);
            HttpClient client =(HttpClient)(Object) getClient();
            HttpResponse response =(HttpResponse)(Object) client.execute(new HttpHost(url.getHost(), url.getPort()), request);
            Header hdr =(Header)(Object) response.getFirstHeader("Allow");
            if (hdr == null || (boolean)(Object)hdr.getValue().isEmpty()) return Collections.emptyList();
            return Arrays.asList(hdr.getValue().split("\\s*,\\s*"));
        } catch (IOException e) {
            throw(Throwable)(Object) UnknownError.create("IOException when accessing RC", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class TwinException extends Exception{
	public TwinException(String errorMessage) { super(errorMessage); }
}

class BasicHttpRequest {

BasicHttpRequest(String o0, String o1){}
	BasicHttpRequest(){}}

class HttpClient {

public MyHelperClass execute(HttpHost o0, BasicHttpRequest o1){ return null; }}

class HttpResponse {

public MyHelperClass getFirstHeader(String o0){ return null; }}

class HttpHost {

HttpHost(MyHelperClass o0, MyHelperClass o1){}
	HttpHost(){}}

class Header {

public MyHelperClass getValue(){ return null; }}

class UnknownError {

public static MyHelperClass create(String o0, IOException o1){ return null; }}
