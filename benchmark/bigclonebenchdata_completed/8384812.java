


class c8384812 {
public MyHelperClass expect(MyHelperClass o0){ return null; }
public MyHelperClass capture(Capture o0){ return null; }
	public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass pipeline;
public MyHelperClass recorder;
	public MyHelperClass handler;
	public MyHelperClass request;
	public MyHelperClass replay(){ return null; }

    public void testGetRequestWithRefresh() throws Exception {
        MyHelperClass ProxyBase = new MyHelperClass();
        expect(request.getParameter(ProxyBase.REFRESH_PARAM)).andReturn("120").anyTimes();
        Capture requestCapture = new Capture();
        MyHelperClass RESPONSE_BODY = new MyHelperClass();
        expect(pipeline.execute(capture(requestCapture))).andReturn(new HttpResponse(RESPONSE_BODY));
        replay();
        handler.fetch(request, recorder);
        HttpRequest httpRequest =(HttpRequest)(Object) requestCapture.getValue();
        assertEquals("public,max-age=120", recorder.getHeader("Cache-Control"));
        assertEquals(120, httpRequest.getCacheTtl());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass REFRESH_PARAM;
public MyHelperClass anyTimes(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass getParameter(MyHelperClass o0){ return null; }
	public MyHelperClass fetch(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass andReturn(String o0){ return null; }
	public MyHelperClass andReturn(HttpResponse o0){ return null; }}

class Capture {

public MyHelperClass getValue(){ return null; }}

class HttpRequest {

public MyHelperClass getCacheTtl(){ return null; }}

class HttpResponse {

HttpResponse(MyHelperClass o0){}
	HttpResponse(){}}
