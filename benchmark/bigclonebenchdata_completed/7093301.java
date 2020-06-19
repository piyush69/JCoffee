


class c7093301 {

	public static InputStream executePost(String path, Map params) throws Exception {
		HttpPost httpPost = new HttpPost(path);
		List postParams =(List)(Object) new ArrayList();
		for (Entry param :(Entry[])(Object) (Object[])(Object)params.entrySet()) {
			postParams.add(new BasicNameValuePair(param.getKey(), param.getValue()));
		}
		HttpEntity entity =(HttpEntity)(Object) new UrlEncodedFormEntity(postParams, "UTF-8");
		httpPost.setEntity(entity);

  MyHelperClass sClient = new MyHelperClass();
		HttpResponse httpResponse =(HttpResponse)(Object) sClient.execute(httpPost);
  MyHelperClass HttpStatus = new MyHelperClass();
		if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			return(InputStream)(Object) httpResponse.getEntity().getContent();
		} else {
			return null;
		}
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class Map {

public MyHelperClass entrySet(){ return null; }}

class InputStream {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(HttpEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(MyHelperClass o0, MyHelperClass o1){}
	BasicNameValuePair(){}}

class HttpEntity {

}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
