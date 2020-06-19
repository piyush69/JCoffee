


class c8384813 {
public MyHelperClass expect(MyHelperClass o0){ return null; }
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass pipeline;
public MyHelperClass recorder;
	public MyHelperClass RESPONSE_BODY;
	public MyHelperClass request;
	public MyHelperClass rewriter;
	public MyHelperClass HttpResponse;
	public MyHelperClass handler;
	public MyHelperClass extractJsonFromResponse(){ return null; }
	public MyHelperClass replay(){ return null; }
	public MyHelperClass verify(){ return null; }

    public void testExplicitHeaders() throws Exception {
        String headerString = "X-Foo=bar&X-Bar=baz%20foo";
        MyHelperClass REQUEST_URL = new MyHelperClass();
        HttpRequest expected =(HttpRequest)(Object) (new HttpRequest(REQUEST_URL).addHeader("X-Foo", "bar").addHeader("X-Bar", "baz foo"));
        MyHelperClass RESPONSE_BODY = new MyHelperClass();
        expect(pipeline.execute(expected)).andReturn(new HttpResponse(RESPONSE_BODY));
        MyHelperClass MakeRequestHandler = new MyHelperClass();
        expect(request.getParameter(MakeRequestHandler.HEADERS_PARAM)).andReturn(headerString);
        replay();
        handler.fetch(request, recorder);
        verify();
        JSONObject results =(JSONObject)(Object) extractJsonFromResponse();
        assertEquals(HttpResponse.SC_OK, results.getInt("rc"));
        assertEquals(RESPONSE_BODY, results.get("body"));
        assertTrue(rewriter.responseWasRewritten());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass HEADERS_PARAM;
public MyHelperClass fetch(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass responseWasRewritten(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass getParameter(MyHelperClass o0){ return null; }
	public MyHelperClass andReturn(HttpResponse o0){ return null; }
	public MyHelperClass andReturn(String o0){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }}

class HttpRequest {

HttpRequest(){}
	HttpRequest(MyHelperClass o0){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

HttpResponse(){}
	HttpResponse(MyHelperClass o0){}}

class JSONObject {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getInt(String o0){ return null; }}
