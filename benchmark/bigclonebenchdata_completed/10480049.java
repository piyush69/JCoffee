import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10480049 {

    public static SearchItem register(String... args)  throws Throwable {
        SearchItem _return = new SearchItem();
        String line = null;
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            MyHelperClass URL_REGISTER = new MyHelperClass();
            HttpPost httpPost = new HttpPost(URL_REGISTER);
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(6);
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("format", "xml"));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("firtname", args[0]));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("lastname", args[1]));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("email", args[2]));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("phone", args[3]));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("password", args[4]));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("confirmpassword", args[5]));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(httpPost);
            MyHelperClass EntityUtils = new MyHelperClass();
            line = EntityUtils.toString(response.getEntity());
            MyHelperClass XMLfunctions = new MyHelperClass();
            Document document =(Document)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.XMLfromString(line);
            NodeList nodes =(NodeList)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) document.getElementsByTagName("response");
            Element e = (Element)(Element)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) nodes.item(0);
//            MyHelperClass XMLfunctions = new MyHelperClass();
            _return.set(0,(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "success"));
            if ("false".endsWith((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)_return.get(0))) {
//                MyHelperClass XMLfunctions = new MyHelperClass();
                _return.set(1,(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "error"));
            } else {
//                MyHelperClass XMLfunctions = new MyHelperClass();
                _return.set(1,(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "message"));
            }
            return _return;
        } catch (Exception e) {
            line = "<results status=\"error\"><msg>Can't connect to server</msg></results>";
            line = null;
            _return.set(0, "false");
            _return.set(1, "");
        }
        return _return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(Element o0, String o1){ return null; }
	public MyHelperClass XMLfromString(String o0){ return null; }}

class SearchItem {

public MyHelperClass set(int o0, String o1){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }}

class Element {

}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
