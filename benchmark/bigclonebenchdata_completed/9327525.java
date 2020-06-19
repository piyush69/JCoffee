


class c9327525 {
public MyHelperClass assertEquals(String o0, int o1, MyHelperClass o2){ return null; }
public MyHelperClass assertNotNull(HttpEntity o0){ return null; }

//    @Test
    public void test02_ok() throws Exception {
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            MyHelperClass chartURL = new MyHelperClass();
            HttpPost post = new HttpPost(chartURL);
            List nameValuePairs =(List)(Object) new ArrayList(1);
            nameValuePairs.add(new BasicNameValuePair("ws", "getDomainEvolution"));
            nameValuePairs.add(new BasicNameValuePair("chartTitle", "test"));
            nameValuePairs.add(new BasicNameValuePair("type", "chart"));
            nameValuePairs.add(new BasicNameValuePair("firstDate", "20111124"));
            nameValuePairs.add(new BasicNameValuePair("lastDate", "20111125"));
            nameValuePairs.add(new BasicNameValuePair("wsParams", "type,counting,protocol,unit,proxy,domain,timeScale,period"));
            nameValuePairs.add(new BasicNameValuePair("wsParamsValues", "chart,volume,all,hits,all,google.com,day,360"));
            nameValuePairs.add(new BasicNameValuePair("serieTitle", "serie"));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response =(HttpResponse)(Object) client.execute(post);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            assertNotNull(entity);
            InputStream instream =(InputStream)(Object) entity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
            System.out.println(reader.readLine());
            instream.close();
            assertEquals("error :" + response.getStatusLine(), 200, response.getStatusLine().getStatusCode());
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
	HttpPost(MyHelperClass o0){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

ArrayList(){}
	ArrayList(int o0){}}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, String o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}
