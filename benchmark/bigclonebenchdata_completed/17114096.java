


class c17114096 {
public MyHelperClass createBasicParameters(Map o0){ return null; }
public MyHelperClass executeHttp(HttpGet o0){ return null; }

    public HttpResponse executeHttpGetRequest(String uri, Map parameters) throws HttpTestClientException {
        HttpGet httpGet = new HttpGet(uri);
        if (parameters != null) {
            httpGet.setParams(createBasicParameters(parameters));
        }
        return(HttpResponse)(Object) executeHttp(httpGet);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Map {

}

class HttpResponse {

}

class HttpTestClientException extends Exception{
	public HttpTestClientException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setParams(MyHelperClass o0){ return null; }}
