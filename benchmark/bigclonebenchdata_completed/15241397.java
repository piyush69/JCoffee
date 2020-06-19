


class c15241397 {

//    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyHelperClass URLDecoder = new MyHelperClass();
        String rewrittenQueryString =(String)(Object) URLDecoder.decode(request.getRequestURI(), "UTF-8").replaceFirst("^.*?\\/(id:.*)\\/.*?$", "$1");
        MyHelperClass logger = new MyHelperClass();
        logger.debug("rewrittenQueryString: " + rewrittenQueryString);
        MyHelperClass fedoraUrl = new MyHelperClass();
        URL rewrittenUrl = new URL(fedoraUrl + rewrittenQueryString);
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("rewrittenUrl: " + rewrittenUrl.getProtocol() + "://" + rewrittenUrl.getHost() + ":" + rewrittenUrl.getPort() + rewrittenUrl.getFile());
        HttpURLConnection httpURLConnection = (HttpURLConnection)(HttpURLConnection)(Object) rewrittenUrl.openConnection();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        HttpURLConnection.setFollowRedirects(false);
        httpURLConnection.connect();
        response.setStatus(httpURLConnection.getResponseCode());
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("[status=" + httpURLConnection.getResponseCode() + "]");
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("[headers]");
        for (Entry header :(Entry[])(Object) (Object[])(Object)httpURLConnection.getHeaderFields().entrySet()) {
            if (header.getKey() != null) {
                for (String value :(String[])(Object) (Object[])(Object)header.getValue()) {
                    if (value != null) {
//                        MyHelperClass logger = new MyHelperClass();
                        logger.debug(header.getKey() + ": " + value);
                        if (!header.getKey().equals("Server") && !header.getKey().equals("Transfer-Encoding")) {
                            response.addHeader(header.getKey(), value);
                        }
                    }
                }
            }
        }
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("[/headers]");
        InputStream inputStream =(InputStream)(Object) httpURLConnection.getInputStream();
        OutputStream outputStream =(OutputStream)(Object) response.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, outputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceFirst(String o0, String o1){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass decode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(MyHelperClass o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class HttpURLConnection {

public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class List {

}

class InputStream {

}

class OutputStream {

}
