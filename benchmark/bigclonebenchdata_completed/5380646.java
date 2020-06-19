import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5380646 {

    private static String getToken(HttpClient client) throws Throwable, Exception {
        String token = null;
        HttpGet httpget = new HttpGet("https://libsys.arlingtonva.us/iii/cas/login?service=http&scope=1");
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        if (entity != null) {
            entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new BufferedHttpEntity(entity);
        }
        if (entity != null) {
            MyHelperClass EntityUtils = new MyHelperClass();
            String resp = EntityUtils.toString(entity);
//            MyHelperClass EntityUtils = new MyHelperClass();
            EntityUtils.consume(entity);
            MyHelperClass Pattern = new MyHelperClass();
            Pattern pattern =(Pattern)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Pattern.compile("<input .*name=\"lt\".*value=\"(.*)\".*/>");
            Matcher matcher =(Matcher)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) pattern.matcher(resp);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)matcher.find()) {
                token =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) matcher.group(1);
            }
        }
        return token;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
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

class BufferedHttpEntity {

BufferedHttpEntity(HttpEntity o0){}
	BufferedHttpEntity(){}}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
