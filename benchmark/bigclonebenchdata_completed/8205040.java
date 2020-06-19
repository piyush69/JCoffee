import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8205040 {
public MyHelperClass getTemplateContent(MyHelperClass o0){ return null; }
public MyHelperClass userService;
	public MyHelperClass addAuthentication(HttpPut o0){ return null; }

//    @Override
    public Template updateTemplate(Template template)  throws Throwable {
        template.setContent(getTemplateContent(template.getScreen()));
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add((NameValuePair)(Object)new BasicNameValuePair("name", template.getName()));
        params.add((NameValuePair)(Object)new BasicNameValuePair("content", template.getContent()));
        params.add((NameValuePair)(Object)new BasicNameValuePair("shared", template.isShared() + ""));
        params.add((NameValuePair)(Object)new BasicNameValuePair("keywords", template.getKeywords()));
        try {
            MyHelperClass configuration = new MyHelperClass();
            String saveRestUrl = configuration.getBeehiveRESTRootUrl() + "account/" + userService.getAccount().getOid() + "/template/" + template.getOid();
            HttpPut httpPut = new HttpPut(saveRestUrl);
            addAuthentication(httpPut);
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params, "UTF-8");
            httpPut.setEntity(formEntity);
            HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpPut);
            MyHelperClass HttpServletResponse = new MyHelperClass();
            if (HttpServletResponse.SC_OK == response.getStatusLine().getStatusCode()) {
                MyHelperClass resourceService = new MyHelperClass();
                resourceService.saveTemplateResourcesToBeehive(template);
//            MyHelperClass HttpServletResponse = new MyHelperClass();
            } else if (HttpServletResponse.SC_NOT_FOUND == response.getStatusLine().getStatusCode()) {
                return null;
            } else {
                throw new BeehiveNotAvailableException("Failed to update template:" + template.getName() + ", Status code: " + response.getStatusLine().getStatusCode());
            }
        } catch (Exception e) {
            throw new BeehiveNotAvailableException("Failed to save screen as a template: " + (e.getMessage() == null ? "" : e.getMessage()), e);
        }
        return template;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass SC_NOT_FOUND;
public MyHelperClass getOid(){ return null; }
	public MyHelperClass getBeehiveRESTRootUrl(){ return null; }
	public MyHelperClass getAccount(){ return null; }
	public MyHelperClass saveTemplateResourcesToBeehive(Template o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class Template {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isShared(){ return null; }
	public MyHelperClass getKeywords(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getOid(){ return null; }
	public MyHelperClass setContent(MyHelperClass o0){ return null; }
	public MyHelperClass getScreen(){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, MyHelperClass o1){}
	BasicNameValuePair(String o0, String o1){}}

class HttpPut {

HttpPut(String o0){}
	HttpPut(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpClient {

public MyHelperClass execute(HttpPut o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class BeehiveNotAvailableException extends Exception{
	public BeehiveNotAvailableException(String errorMessage) { super(errorMessage); }
	BeehiveNotAvailableException(String o0, Exception o1){}
	BeehiveNotAvailableException(){}
}
