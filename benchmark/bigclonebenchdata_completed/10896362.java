import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10896362 {
public MyHelperClass executeRequest(HttpEntityEnclosingRequestBase o0){ return null; }

    private HttpResponse executePutPost(HttpEntityEnclosingRequestBase request, String content)  throws Throwable {
        try {
            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isTraceEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.trace("Content: {}", content);
            }
            StringEntity e = new StringEntity(content, "UTF-8");
            e.setContentType("application/json");
            request.setEntity(e);
            return(HttpResponse)(Object) executeRequest(request);
        } catch (Exception e) {
            MyHelperClass Exceptions = new MyHelperClass();
            throw(Throwable)(Object) Exceptions.propagate(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass propagate(Exception o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass trace(String o0, String o1){ return null; }}

class HttpEntityEnclosingRequestBase {

public MyHelperClass setEntity(StringEntity o0){ return null; }}

class HttpResponse {

}

class StringEntity {

StringEntity(){}
	StringEntity(String o0, String o1){}
	public MyHelperClass setContentType(String o0){ return null; }}
