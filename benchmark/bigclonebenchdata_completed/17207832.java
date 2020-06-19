


class c17207832 {
public MyHelperClass expect(MyHelperClass o0){ return null; }
public MyHelperClass req;
	public MyHelperClass ctx;
	public MyHelperClass mockBackend;
	public MyHelperClass impl;
	public MyHelperClass assertSame(MyHelperClass o0, HttpResponse o1){ return null; }
	public MyHelperClass replay(MyHelperClass o0){ return null; }
	public MyHelperClass verify(MyHelperClass o0){ return null; }

//    @Test
    public void returnsEnclosedResponseOnUnsuccessfulException() throws Exception {
        MyHelperClass resp = new MyHelperClass();
        Exception e = new UnsuccessfulResponseException((String)(Object)resp);
        MyHelperClass host = new MyHelperClass();
        expect(mockBackend.execute(host, req, ctx)).andThrow(e);
        MyHelperClass mockBackend = new MyHelperClass();
        replay(mockBackend);
//        MyHelperClass host = new MyHelperClass();
        HttpResponse result =(HttpResponse)(Object) impl.execute(host, req, ctx);
//        MyHelperClass mockBackend = new MyHelperClass();
        verify(mockBackend);
//        MyHelperClass resp = new MyHelperClass();
        assertSame(resp, result);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass andThrow(Exception o0){ return null; }}

class Test {

}

class UnsuccessfulResponseException extends Exception{
	public UnsuccessfulResponseException(String errorMessage) { super(errorMessage); }
}

class HttpResponse {

}
