import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c15527254 {
public MyHelperClass executeRequest(GetPageRequest o0){ return null; }
public MyHelperClass getHttpClient(){ return null; }

    protected String parseAction() throws ChangesOnServerException, ConnectionException, RequestCancelledException {
        GetPageRequest request =(GetPageRequest)(Object) getHttpClient().createGetPageRequest();
        request.setUrl("http://www.zippyshare.com/index_old.jsp");
        HttpResponse response =(HttpResponse)(Object) executeRequest(request);
        try {
            Parser p = new Parser(response.getResponseBody());
            String action =(String)(Object) p.parseOne("enctype=\"multipart/form-data\" action=\"(.*)\">");
            return action;
        } catch (UncheckedIOException ex) {
            throw new ChangesOnServerException();
        } catch (ArithmeticException ex) {
            throw new ChangesOnServerException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createGetPageRequest(){ return null; }}

class ChangesOnServerException extends Exception{
	public ChangesOnServerException(String errorMessage) { super(errorMessage); }
	ChangesOnServerException(){}
}

class ConnectionException extends Exception{
	public ConnectionException(String errorMessage) { super(errorMessage); }
}

class RequestCancelledException extends Exception{
	public RequestCancelledException(String errorMessage) { super(errorMessage); }
}

class GetPageRequest {

public MyHelperClass setUrl(String o0){ return null; }}

class HttpResponse {

public MyHelperClass getResponseBody(){ return null; }}

class Parser {

Parser(){}
	Parser(MyHelperClass o0){}
	public MyHelperClass parseOne(String o0){ return null; }}

class ParsingException extends Exception{
	public ParsingException(String errorMessage) { super(errorMessage); }
}
