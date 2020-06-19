import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5380644 {

    private static void getPatronInfo(HttpClient client) throws Throwable, Exception {
        HttpGet httpget = new HttpGet("http://libsys.arlingtonva.us/patroninfo~S1/1079675/items");
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        if (entity != null) {
            MyHelperClass EntityUtils = new MyHelperClass();
            System.out.println(EntityUtils.toString(entity));
        }
        MyHelperClass EntityUtils = new MyHelperClass();
        EntityUtils.consume(entity);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass consume(HttpEntity o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
