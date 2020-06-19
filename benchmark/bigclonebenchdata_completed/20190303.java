


class c20190303 {
public MyHelperClass assertEquals(String o0, int o1, MyHelperClass o2){ return null; }

//    @Test
    public void test01_ok_failed_500_no_logo() throws Exception {
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            MyHelperClass xlsURL = new MyHelperClass();
            HttpPost post = new HttpPost(xlsURL);
            HttpResponse response =(HttpResponse)(Object) client.execute(post);
            assertEquals("failed code for ", 500, response.getStatusLine().getStatusCode());
        } finally {
            client.getConnectionManager().shutdown();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass shutdown(){ return null; }}

class Test {

}

class DefaultHttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(){}
	HttpPost(MyHelperClass o0){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
