


class c3233094 {
public MyHelperClass readRemoteInvocationResult(InputStream o0, MyHelperClass o1){ return null; }

//    @Override
    protected RemoteInvocationResult doExecuteRequest(HttpInvokerClientConfiguration config, ByteArrayOutputStream baos) throws IOException, ClassNotFoundException {
        HttpPost postMethod = new HttpPost(config.getServiceUrl());
        postMethod.setEntity(new ByteArrayEntity(baos.toByteArray()));
        MyHelperClass httpClient = new MyHelperClass();
        HttpResponse rsp =(HttpResponse)(Object) httpClient.execute(postMethod);
        StatusLine sl =(StatusLine)(Object) rsp.getStatusLine();
        if ((int)(Object)sl.getStatusCode() >= 300) {
            throw new IOException("Did not receive successful HTTP response: status code = " + sl.getStatusCode() + ", status message = [" + sl.getReasonPhrase() + "]");
        }
        HttpEntity entity =(HttpEntity)(Object) rsp.getEntity();
        InputStream responseBody =(InputStream)(Object) entity.getContent();
        return(RemoteInvocationResult)(Object) readRemoteInvocationResult(responseBody, config.getCodebaseUrl());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpInvokerClientConfiguration {

public MyHelperClass getServiceUrl(){ return null; }
	public MyHelperClass getCodebaseUrl(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class RemoteInvocationResult {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(ByteArrayEntity o0){ return null; }}

class ByteArrayEntity {

ByteArrayEntity(MyHelperClass o0){}
	ByteArrayEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}
