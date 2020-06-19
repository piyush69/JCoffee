


class c17974661 {
public MyHelperClass SESSION_PARAM;
	public MyHelperClass url;
	public MyHelperClass CMD_SERVERMODIF;
public MyHelperClass HEADER_VALUE;
	public MyHelperClass HEADER_NAME;
	public MyHelperClass SynchronizationException;
	public MyHelperClass HttpStatus;
	public MyHelperClass FileUtils;
	public MyHelperClass httpGetMethod(String o0){ return null; }

    public boolean requestServerModifications(UUID sessionId, OutputStream out) throws SynchronizationException {
        HttpClient client =(HttpClient)(Object) new SSLHttpClient();
        MyHelperClass CMD_PARAM = new MyHelperClass();
        StringBuilder builder = new StringBuilder((int)(Object)url).append("?" + SESSION_PARAM + "=" + sessionId).append("&" + CMD_PARAM + "=" + CMD_SERVERMODIF);
        HttpGet method =(HttpGet)(Object) httpGetMethod(builder.toString());
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(method);
            Header header =(Header)(Object) response.getFirstHeader(HEADER_NAME);
            if (header != null && HEADER_VALUE.equals(header.getValue())) {
                int code =(int)(Object) response.getStatusLine().getStatusCode();
                if (code == (int)(Object)HttpStatus.SC_OK) {
                    long expectedLength =(long)(Object) response.getEntity().getContentLength();
                    InputStream is =(InputStream)(Object) response.getEntity().getContent();
                    FileUtils.writeInFile(is, out, expectedLength);
                    return true;
                } else {
                    throw new SynchronizationException("Command 'receive' : HTTP error code returned." + code, SynchronizationException.ERROR_RECEIVE);
                }
            } else {
                throw new SynchronizationException("HTTP header is invalid", SynchronizationException.ERROR_RECEIVE);
            }
        } catch (Exception e) {
            throw new SynchronizationException("Command 'receive' -> ", e, SynchronizationException.ERROR_RECEIVE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_RECEIVE;
	public MyHelperClass SC_OK;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass writeInFile(InputStream o0, OutputStream o1, long o2){ return null; }
	public MyHelperClass getContentLength(){ return null; }}

class UUID {

}

class OutputStream {

}

class SynchronizationException extends Exception{
	public SynchronizationException(String errorMessage) { super(errorMessage); }
	SynchronizationException(){}
	SynchronizationException(String o0, MyHelperClass o1){}
	SynchronizationException(String o0, Exception o1, MyHelperClass o2){}
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class SSLHttpClient {

}

class HttpGet {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getFirstHeader(MyHelperClass o0){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class InputStream {

}
