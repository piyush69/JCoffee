import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10480051 {
public MyHelperClass URL_RECORD_CONTACT;
	public MyHelperClass URL_RECORD_COMPANY;

    public static RecordResponse loadRecord(RecordRequest recordRequest)  throws Throwable {
        RecordResponse recordResponse = new RecordResponse();
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)recordRequest.isContact() ? URL_RECORD_CONTACT : URL_RECORD_COMPANY);
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(6);
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("format", "xml"));
            nameValuePairs.add(new BasicNameValuePair("token",(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) recordRequest.getToken()));
            nameValuePairs.add(new BasicNameValuePair("id",(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) recordRequest.getId()));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(httpPost);
            MyHelperClass EntityUtils = new MyHelperClass();
            String line = EntityUtils.toString(response.getEntity());
            MyHelperClass XMLfunctions = new MyHelperClass();
            Document document =(Document)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLfunctions.XMLfromString(line);
            NodeList nodes =(NodeList)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) document.getElementsByTagName("response");
            Element e = (Element)(Element)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) nodes.item(0);
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Name__Last__First_ = XMLfunctions.getValue(e,(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) recordRequest.isContact() ? "Name__Last__First_" : "Name");
            String phone = "";
//            MyHelperClass XMLfunctions = new MyHelperClass();
            if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)recordRequest.isContact()) phone = XMLfunctions.getValue(e, "Phone");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Email1 = XMLfunctions.getValue(e,(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) recordRequest.isContact() ? "Personal_Email" : "Email");
//            MyHelperClass XMLfunctions = new MyHelperClass();
            String Home_Fax = XMLfunctions.getValue(e,(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) recordRequest.isContact() ? "Home_Fax" : "Fax1");
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
            recordResponse.setName(Name__Last__First_);
            recordResponse.setPhone(phone);
            recordResponse.setEmail(Email1);
            recordResponse.setHomeFax(Home_Fax);
            recordResponse.setAddress1(Address1);
            recordResponse.setAddress2(Address2);
            recordResponse.setCity(City);
            recordResponse.setState(State);
            recordResponse.setZip(Zip);
            recordResponse.setProfile(Profile);
            recordResponse.setCountry(Country);
            recordResponse.setSuccess(success);
            recordResponse.setError(error);
        } catch (Exception e) {
        }
        return recordResponse;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(Element o0, String o1){ return null; }
	public MyHelperClass XMLfromString(String o0){ return null; }}

class RecordRequest {

public MyHelperClass isContact(){ return null; }
	public MyHelperClass getToken(){ return null; }
	public MyHelperClass getId(){ return null; }}

class RecordResponse {

public MyHelperClass setSuccess(String o0){ return null; }
	public MyHelperClass setCity(String o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setState(String o0){ return null; }
	public MyHelperClass setHomeFax(String o0){ return null; }
	public MyHelperClass setAddress2(String o0){ return null; }
	public MyHelperClass setEmail(String o0){ return null; }
	public MyHelperClass setZip(String o0){ return null; }
	public MyHelperClass setProfile(String o0){ return null; }
	public MyHelperClass setError(String o0){ return null; }
	public MyHelperClass setCountry(String o0){ return null; }
	public MyHelperClass setAddress1(String o0){ return null; }
	public MyHelperClass setPhone(String o0){ return null; }}

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
