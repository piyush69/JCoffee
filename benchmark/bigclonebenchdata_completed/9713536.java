


class c9713536 {
public MyHelperClass getModifiedContent(MyHelperClass o0){ return null; }

        @SuppressWarnings("unchecked")
        private void doService(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
            final String url = request.getRequestURL().toString();
            if (url.endsWith("/favicon.ico")) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return;
            }
            if (url.contains("/delay")) {
                MyHelperClass StringUtils = new MyHelperClass();
                final String delay =(String)(Object) StringUtils.substringBetween(url, "/delay", "/");
                final int ms = Integer.parseInt(delay);
                MyHelperClass LOG = new MyHelperClass();
                if ((boolean)(Object)LOG.isDebugEnabled()) {
//                    MyHelperClass LOG = new MyHelperClass();
                    LOG.debug("Sleeping for " + ms + " before to deliver " + url);
                }
                Thread.sleep(ms);
            }
            final URL requestedUrl = new URL(url);
            final WebRequest webRequest = new WebRequest(requestedUrl);
            MyHelperClass HttpMethod = new MyHelperClass();
            webRequest.setHttpMethod(HttpMethod.valueOf(request.getMethod()));
            for (final Enumeration en =(Enumeration)(Object) request.getHeaderNames();(boolean)(Object) en.hasMoreElements(); ) {
                final String headerName =(String)(Object) en.nextElement();
                final String headerValue =(String)(Object) request.getHeader(headerName);
                webRequest.setAdditionalHeader(headerName, headerValue);
            }
            final List requestParameters =(List)(Object) new ArrayList();
            for (final Enumeration paramNames =(Enumeration)(Object) request.getParameterNames();(boolean)(Object) paramNames.hasMoreElements(); ) {
                final String name =(String)(Object) paramNames.nextElement();
                final String[] values =(String[])(Object) request.getParameterValues(name);
                for (final String value : values) {
                    requestParameters.add(new NameValuePair(name, value));
                }
            }
            if ("PUT".equals(request.getMethod()) &&(int)(Object) request.getContentLength() > 0) {
                final byte[] buffer = new byte[(int)(Object)request.getContentLength()];
                request.getInputStream().readLine(buffer, 0, buffer.length);
                webRequest.setRequestBody(new String(buffer));
            } else {
                webRequest.setRequestParameters(requestParameters);
            }
            MyHelperClass MockConnection_ = new MyHelperClass();
            final WebResponse resp =(WebResponse)(Object) MockConnection_.getResponse(webRequest);
            response.setStatus(resp.getStatusCode());
            for (final NameValuePair responseHeader :(NameValuePair[])(Object) (Object[])(Object)resp.getResponseHeaders()) {
                response.addHeader(responseHeader.getName(), responseHeader.getValue());
            }
            MyHelperClass WriteContentAsBytes_ = new MyHelperClass();
            if ((boolean)(Object)WriteContentAsBytes_) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(resp.getContentAsStream(), response.getOutputStream());
            } else {
                final String newContent =(String)(Object) getModifiedContent(resp.getContentAsString());
                final String contentCharset =(String)(Object) resp.getContentCharset();
                response.setCharacterEncoding(contentCharset);
                response.getWriter().print(newContent);
            }
            response.flushBuffer();
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass readLine(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass valueOf(MyHelperClass o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getResponse(WebRequest o0){ return null; }
	public MyHelperClass substringBetween(String o0, String o1, String o2){ return null; }}

class HttpServletRequest {

public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getParameterNames(){ return null; }
	public MyHelperClass getRequestURL(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getParameterValues(String o0){ return null; }
	public MyHelperClass getHeaderNames(){ return null; }}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass addHeader(MyHelperClass o0, MyHelperClass o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}}

class WebRequest {

WebRequest(){}
	WebRequest(URL o0){}
	public MyHelperClass setRequestBody(String o0){ return null; }
	public MyHelperClass setRequestParameters(List o0){ return null; }
	public MyHelperClass setAdditionalHeader(String o0, String o1){ return null; }
	public MyHelperClass setHttpMethod(MyHelperClass o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class List {

public MyHelperClass add(NameValuePair o0){ return null; }}

class NameValuePair {

NameValuePair(String o0, String o1){}
	NameValuePair(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class ArrayList {

}

class WebResponse {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContentCharset(){ return null; }
	public MyHelperClass getContentAsStream(){ return null; }
	public MyHelperClass getContentAsString(){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }}
