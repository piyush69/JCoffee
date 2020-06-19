


class c7103223 {
public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }

    public void testPost() throws Exception {
        MyHelperClass baseUri = new MyHelperClass();
        HttpPost request = new HttpPost(baseUri + "/echo");
        request.setEntity(new StringEntity("test"));
        MyHelperClass client = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) client.execute(request);
        assertEquals((String)(Object)200, response.getStatusLine().getStatusCode());
        MyHelperClass TestUtil = new MyHelperClass();
        assertEquals("test", TestUtil.getResponseAsString(response));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getResponseAsString(HttpResponse o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
