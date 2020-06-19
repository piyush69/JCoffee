


class c14764851 {
public MyHelperClass createConnection(MyHelperClass o0, URI o1){ return null; }
public MyHelperClass putHeaders(HttpRequest o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }
	public MyHelperClass putHeaders(HttpRequest o0, HttpHeader[] o1){ return null; }

    public Download doDownload(HttpHeader[] headers, URI target) throws HttpRequestException {
        MyHelperClass HttpMethods = new MyHelperClass();
        HttpRequest con =(HttpRequest)(Object) createConnection(HttpMethods.METHOD_GET, target);
        MyHelperClass defaultHeaders = new MyHelperClass();
        if (defaultHeaders != null) {
//            MyHelperClass defaultHeaders = new MyHelperClass();
            putHeaders(con, defaultHeaders);
        }
        if (headers != null) {
            putHeaders(con, headers);
        }
        HttpResponse res =(HttpResponse)(Object) execute(con);
        if ((int)(Object)res.getResponseCode() == 200) {
            return new Download(res);
        } else {
            throw new HttpRequestException(res.getResponseCode(), res.getResponseMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass METHOD_GET;
}

class HttpHeader {

}

class URI {

}

class Download {

Download(HttpResponse o0){}
	Download(){}}

class HttpRequestException extends Exception{
	public HttpRequestException(String errorMessage) { super(errorMessage); }
	HttpRequestException(MyHelperClass o0, MyHelperClass o1){}
	HttpRequestException(){}
}

class HttpRequest {

}

class E {

}

class HttpResponse {

public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}
