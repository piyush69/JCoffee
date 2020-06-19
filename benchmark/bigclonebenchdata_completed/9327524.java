


class c9327524 {
public MyHelperClass assertEquals(String o0, int o1, MyHelperClass o2){ return null; }

//    @Test
    public void test01_ok_failed_500() throws Exception {
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            MyHelperClass chartURL = new MyHelperClass();
            HttpPost post = new HttpPost(chartURL);
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
