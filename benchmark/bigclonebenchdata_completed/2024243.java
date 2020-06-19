


class c2024243 {
public MyHelperClass HTTP_BIND_PORT;
	public MyHelperClass URLEncodedUtils;
	public MyHelperClass URIUtils;
	public MyHelperClass NAME_SIPAPP;
	public MyHelperClass Assert;
	public MyHelperClass SEPARATOR;
	public MyHelperClass servletClass;

//    @Test
    public void requestWebapp() throws Exception {
        final HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        final String echoValue = "ShrinkWrap>Tomcat Integration";
        final List params =(List)(Object) new ArrayList();
        MyHelperClass PATH_ECHO_SERVLET = new MyHelperClass();
        params.add(new BasicNameValuePair("to", PATH_ECHO_SERVLET));
        params.add(new BasicNameValuePair("echo", echoValue));
        MyHelperClass BIND_HOST = new MyHelperClass();
        final URI uri =(URI)(Object) URIUtils.createURI("http", BIND_HOST, HTTP_BIND_PORT,(int)(Object) NAME_SIPAPP + (int)(Object)SEPARATOR + (int)(Object)servletClass.getSimpleName(), URLEncodedUtils.format(params, "UTF-8"), null);
        final HttpGet request = new HttpGet(uri);
        MyHelperClass log = new MyHelperClass();
        log.info("Executing request to: " + request.getURI());
        final HttpResponse response =(HttpResponse)(Object) client.execute(request);
        System.out.println(response.getStatusLine());
        final HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        if (entity == null) {
            MyHelperClass Assert = new MyHelperClass();
            Assert.fail("Request returned no entity");
        }
        final BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
        final String line =(String)(Object) reader.readLine();
        MyHelperClass NAME_SIPAPP = new MyHelperClass();
        Assert.assertEquals("Unexpected response from Servlet", echoValue + NAME_SIPAPP, line);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(List o0, String o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass createURI(String o0, MyHelperClass o1, MyHelperClass o2, int o3, MyHelperClass o4, Object o5){ return null; }
	public MyHelperClass assertEquals(String o0, String o1, String o2){ return null; }
	public MyHelperClass getSimpleName(){ return null; }}

class Test {

}

class HttpClient {

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

class URI {

}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}
	public MyHelperClass getURI(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
