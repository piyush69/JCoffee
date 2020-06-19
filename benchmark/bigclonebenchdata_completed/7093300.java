


class c7093300 {

	public static InputStream getRequest(String path) throws Exception {
		HttpGet httpGet = new HttpGet(path);
  MyHelperClass sClient = new MyHelperClass();
		HttpResponse httpResponse =(HttpResponse)(Object) sClient.execute(httpGet);
  MyHelperClass HttpStatus = new MyHelperClass();
		if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			BufferedHttpEntity bufHttpEntity = new BufferedHttpEntity(httpResponse.getEntity());
			return(InputStream)(Object) bufHttpEntity.getContent();
		} else {
			return null;
		}
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class InputStream {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class BufferedHttpEntity {

BufferedHttpEntity(MyHelperClass o0){}
	BufferedHttpEntity(){}
	public MyHelperClass getContent(){ return null; }}
