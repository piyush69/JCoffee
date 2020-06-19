


class c10437938 {
public MyHelperClass parseDocument(URL o0){ return null; }
public MyHelperClass StringEscapeUtils;
	public MyHelperClass jiraPassword;
	public MyHelperClass jiraUser;
	public MyHelperClass jiraFilterURL;
	public MyHelperClass getSourceURL(){ return null; }
	public MyHelperClass getJiraRootUrl(){ return null; }

    protected Document loadDocument() throws MalformedURLException, DocumentException, IOException {
        MyHelperClass jiraFilterURL = new MyHelperClass();
        if ((boolean)(Object)jiraFilterURL.startsWith("file")) {
            URL url =(URL)(Object) getSourceURL();
            return(Document)(Object) parseDocument(url);
        } else {
            HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
            List formparams =(List)(Object) new ArrayList();
            formparams.add(new BasicNameValuePair("os_username", jiraUser));
            formparams.add(new BasicNameValuePair("os_password", jiraPassword));
            formparams.add(new BasicNameValuePair("os_cookie", "true"));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
            HttpPost post = new HttpPost(getJiraRootUrl() + "/secure/login.jsp");
            post.setEntity(entity);
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(post);
            response.getEntity().consumeContent();
            String url_str =(String)(Object) StringEscapeUtils.unescapeXml(jiraFilterURL);
            HttpGet get = new HttpGet(url_str);
            response =(HttpResponse)(Object) httpClient.execute(get);
            return(Document)(Object) parseDocument((URL)(Object)response.getEntity().getContent());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass unescapeXml(MyHelperClass o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class Document {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}
