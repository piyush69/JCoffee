


class c21540492 {
public MyHelperClass httpclient;
	public MyHelperClass httpPost;

    public InputStream getStream(Hashtable pValue) throws IOException {
        List nvps =(List)(Object) new ArrayList();
        Enumeration enm =(Enumeration)(Object) pValue.keys();
        String key;
        while ((boolean)(Object)enm.hasMoreElements()) {
            key =(String)(Object) enm.nextElement();
            nvps.add(new BasicNameValuePair(key, pValue.get(key)));
        }
        MyHelperClass HTTP = new MyHelperClass();
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        MyHelperClass httpPost = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpPost);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        return(InputStream)(Object) entity.getContent();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class Hashtable {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0, MyHelperClass o1){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}
