import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4530695 {

    private String doExecute(AbortableHttpRequest method) throws Throwable {
        MyHelperClass CLIENT = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) CLIENT.newInstance();
        HttpResponse rsp =(HttpResponse)(Object) client.execute((HttpUriRequest)(HttpUriRequest)(Object) method);
        HttpEntity entity =(HttpEntity)(Object) rsp.getEntity();
        if (entity == null) throw(Throwable)(Object) new RequestError("No entity in method");
        InputStream in = null;
        try {
            in =(InputStream)(Object) entity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder inStr = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                inStr.append(line).append("\r\n");
            }
            entity.consumeContent();
            return inStr.toString();
        } catch (IOException ex) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("IO exception: " + ex.getMessage());
            throw ex;
        } catch (RuntimeException ex) {
            method.abort();
            throw ex;
        } finally {
            if (in != null) in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class AbortableHttpRequest {

public MyHelperClass abort(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpUriRequest o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpUriRequest {

}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class RequestError {

RequestError(String o0){}
	RequestError(){}}
