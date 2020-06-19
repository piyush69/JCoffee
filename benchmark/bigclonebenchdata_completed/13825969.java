
import java.io.UncheckedIOException;


class c13825969 {
public MyHelperClass Code;
	public MyHelperClass getParameter(HttpServletRequest o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass setResponseHeaders(HttpServletRequest o0, HttpServletResponse o1, HttpResponse o2){ return null; }
	public MyHelperClass buildHttpRequest(HttpServletRequest o0, MyHelperClass o1){ return null; }

//    @Override
    protected void doFetch(HttpServletRequest request, HttpServletResponse response) throws IOException, GadgetException {
        if (request.getHeader("If-Modified-Since") != null) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
            return;
        }
        String host =(String)(Object) request.getHeader("Host");
        MyHelperClass lockedDomainService = new MyHelperClass();
        if (!(Boolean)(Object)lockedDomainService.isSafeForOpenProxy(host)) {
            MyHelperClass URL_PARAM = new MyHelperClass();
            String msg = "Embed request for url " + getParameter(request, URL_PARAM, "") + " made to wrong domain " + host;
            MyHelperClass logger = new MyHelperClass();
            logger.info(msg);
            throw new GadgetException(Code.INVALID_PARAMETER, msg);
        }
        MyHelperClass URL_PARAM = new MyHelperClass();
        HttpRequest rcr =(HttpRequest)(Object) buildHttpRequest(request, URL_PARAM);
        MyHelperClass requestPipeline = new MyHelperClass();
        HttpResponse results =(HttpResponse)(Object) requestPipeline.execute(rcr);
        if ((boolean)(Object)results.isError()) {
            MyHelperClass FALLBACK_URL_PARAM = new MyHelperClass();
            HttpRequest fallbackRcr =(HttpRequest)(Object) buildHttpRequest(request, FALLBACK_URL_PARAM);
            if (fallbackRcr != null) {
//                MyHelperClass requestPipeline = new MyHelperClass();
                results =(HttpResponse)(Object) requestPipeline.execute(fallbackRcr);
            }
        }
        MyHelperClass contentRewriterRegistry = new MyHelperClass();
        if (contentRewriterRegistry != null) {
            try {
//                MyHelperClass contentRewriterRegistry = new MyHelperClass();
                results =(HttpResponse)(Object) contentRewriterRegistry.rewriteHttpResponse(rcr, results);
            } catch (UncheckedIOException e) {
                throw new GadgetException(Code.INTERNAL_SERVER_ERROR,(RewritingException)(Object) e);
            }
        }
        for (Entry entry :(Entry[])(Object) (Object[])(Object)results.getHeaders().entries()) {
            String name =(String)(Object) entry.getKey();
            MyHelperClass DISALLOWED_RESPONSE_HEADERS = new MyHelperClass();
            if (!(Boolean)(Object)DISALLOWED_RESPONSE_HEADERS.contains(name.toLowerCase())) {
                response.addHeader(name, entry.getValue());
            }
        }
        String responseType =(String)(Object) results.getHeader("Content-Type");
        MyHelperClass StringUtils = new MyHelperClass();
        if (!(Boolean)(Object)StringUtils.isEmpty((String)(Object)rcr.getRewriteMimeType())) {
            String requiredType =(String)(Object) rcr.getRewriteMimeType();
//            MyHelperClass StringUtils = new MyHelperClass();
            if (requiredType.endsWith("/*") && !(Boolean)(Object)StringUtils.isEmpty(responseType)) {
                requiredType = requiredType.substring(0, requiredType.length() - 2);
                if (!responseType.toLowerCase().startsWith(requiredType.toLowerCase())) {
                    response.setContentType(requiredType);
                    responseType = requiredType;
                }
            } else {
                response.setContentType(requiredType);
                responseType = requiredType;
            }
        }
        setResponseHeaders(request, response, results);
        MyHelperClass HttpResponse = new MyHelperClass();
        if (results.getHttpStatusCode() != HttpResponse.SC_OK) {
            response.sendError(results.getHttpStatusCode());
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(results.getResponse(), response.getOutputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass INTERNAL_SERVER_ERROR;
	public MyHelperClass SC_NOT_MODIFIED;
	public MyHelperClass INVALID_PARAMETER;
public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }
	public MyHelperClass rewriteHttpResponse(HttpRequest o0, HttpResponse o1){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass isSafeForOpenProxy(String o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GadgetException extends Exception{
	public GadgetException(String errorMessage) { super(errorMessage); }
	GadgetException(){}
	GadgetException(MyHelperClass o0, RewritingException o1){}
	GadgetException(MyHelperClass o0, String o1){}
}

class HttpRequest {

public MyHelperClass getRewriteMimeType(){ return null; }}

class HttpResponse {

public MyHelperClass getHttpStatusCode(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getResponse(){ return null; }
	public MyHelperClass getHeaders(){ return null; }
	public MyHelperClass isError(){ return null; }}

class RewritingException extends Exception{
	public RewritingException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
