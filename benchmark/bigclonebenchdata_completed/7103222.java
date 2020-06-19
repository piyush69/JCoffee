


class c7103222 {
public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }

    public void testGet() throws Exception {
        MyHelperClass baseUri = new MyHelperClass();
        HttpGet request = new HttpGet(baseUri + "/test");
        MyHelperClass client = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) client.execute(request);
        assertEquals((String)(Object)200, response.getStatusLine().getStatusCode());
        MyHelperClass TestUtil = new MyHelperClass();
        assertEquals("test", TestUtil.getResponseAsString(response));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getResponseAsString(HttpResponse o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
