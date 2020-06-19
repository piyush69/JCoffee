


class c17974663 {
public MyHelperClass URLEncoder;
	public MyHelperClass LOGIN_PARAM;
	public MyHelperClass PASSWD_PARAM;
	public MyHelperClass CMD_SEARCH;
	public MyHelperClass url;
	public MyHelperClass CMD_PARAM;
public MyHelperClass HEADER_VALUE;
	public MyHelperClass HEADER_NAME;
	public MyHelperClass SynchronizationException;
	public MyHelperClass HttpStatus;
	public MyHelperClass FileUtils;
	public MyHelperClass httpGetMethod(String o0){ return null; }

    public boolean searchEntity(String login, String password, String searcheId, OutputStream os) throws SynchronizationException {
        HttpClient client =(HttpClient)(Object) new SSLHttpClient();
        try {
            MyHelperClass SEARCH_PARAM = new MyHelperClass();
            StringBuilder builder = new StringBuilder((int)(Object)url).append("?" + CMD_PARAM + "=" + CMD_SEARCH).append("&" + LOGIN_PARAM + "=" + URLEncoder.encode(login, "UTF-8")).append("&" + PASSWD_PARAM + "=" + URLEncoder.encode(password, "UTF-8")).append("&" + SEARCH_PARAM + "=" + searcheId);
            HttpGet method =(HttpGet)(Object) httpGetMethod(builder.toString());
            HttpResponse response =(HttpResponse)(Object) client.execute(method);
            Header header =(Header)(Object) response.getFirstHeader(HEADER_NAME);
            if (header != null && HEADER_VALUE.equals(HEADER_VALUE)) {
                int code =(int)(Object) response.getStatusLine().getStatusCode();
                if (code == (int)(Object)HttpStatus.SC_OK) {
                    long expectedLength =(long)(Object) response.getEntity().getContentLength();
                    InputStream is =(InputStream)(Object) response.getEntity().getContent();
                    FileUtils.writeInFile(is, os, expectedLength);
                    return true;
                } else {
                    throw new SynchronizationException("Command 'search' : HTTP error code returned." + code, SynchronizationException.ERROR_SEARCH);
                }
            } else {
                throw new SynchronizationException("HTTP header is invalid", SynchronizationException.ERROR_SEARCH);
            }
        } catch (Exception e) {
            throw new SynchronizationException("Command 'search' -> ", e, SynchronizationException.ERROR_SEARCH);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass ERROR_SEARCH;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass writeInFile(InputStream o0, OutputStream o1, long o2){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

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

}

class InputStream {

}
