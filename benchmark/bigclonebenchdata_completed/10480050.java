import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10480050 {
public static MyHelperClass URL_RECORD_CONTACT;
	public static MyHelperClass URL_RECORD_COMPANY;
//public MyHelperClass URL_RECORD_CONTACT;
//	public MyHelperClass URL_RECORD_COMPANY;

    public static SearchItem loadRecord(String id, boolean isContact)  throws Throwable {
        String line = null;
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(isContact ? URL_RECORD_CONTACT : URL_RECORD_COMPANY);
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(6);
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("format", "xml"));
            MyHelperClass Common = new MyHelperClass();
            nameValuePairs.add(new BasicNameValuePair("token",(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Common.token));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("id", id));
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
            String Name__Last__First_ =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, isContact ? "Name__Last__First_" : "Name");
            String phone = "";
//            MyHelperClass XMLfunctions = new MyHelperClass();
            if (!isContact) phone =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "Phone");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Email1 =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, isContact ? "Personal_Email" : "Email");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Home_Fax =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, isContact ? "Home_Fax" : "Fax1");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Address1 =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "Address1");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Address2 =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "Address2");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String City =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "City");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String State =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "State");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Zip =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "Zip");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Country =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "Country");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Profile =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "Profile");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String success =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "success");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String error =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.getValue(e, "error");
            SearchItem item = new SearchItem();
            item.set(1, Name__Last__First_);
            item.set(2, phone);
            item.set(3, phone);
            item.set(4, Email1);
            item.set(5, Home_Fax);
            item.set(6, Address1);
            item.set(7, Address2);
            item.set(8, City);
            item.set(9, State);
            item.set(10, Zip);
            item.set(11, Profile);
            item.set(12, Country);
            item.set(13, success);
            item.set(14, error);
            return item;
        } catch (Exception e) {
            line = "<results status=\"error\"><msg>Can't connect to server</msg></results>";
            line = null;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass token;
public MyHelperClass getValue(Element o0, String o1){ return null; }
	public MyHelperClass XMLfromString(String o0){ return null; }}

class SearchItem {

public MyHelperClass set(int o0, String o1){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

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
