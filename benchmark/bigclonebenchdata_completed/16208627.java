
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16208627 {
public MyHelperClass HttpServletResponse;
	public MyHelperClass HttpVersion;
	public MyHelperClass IOUtils;
	public MyHelperClass isAllowed(String o0){ return null; }

//    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final String url =(String)(Object) req.getParameter("url");
        if (!(Boolean)(Object)isAllowed(url)) {
            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
            return;
        }
        final HttpClient client = new HttpClient();
        client.getParams().setVersion(HttpVersion.HTTP_1_0);
        final PostMethod method = new PostMethod(url);
        method.getParams().setVersion(HttpVersion.HTTP_1_0);
        method.setFollowRedirects(false);
        final RequestEntity entity =(RequestEntity)(Object) new InputStreamRequestEntity(req.getInputStream());
        method.setRequestEntity(entity);
        try {
            final int statusCode =(int)(Object) client.executeMethod(method);
            if (statusCode != -1) {
                InputStream is = null;
                ServletOutputStream os = null;
                try {
                    is =(InputStream)(Object) method.getResponseBodyAsStream();
                    try {
                        os =(ServletOutputStream)(Object) resp.getOutputStream();
                        IOUtils.copy(is, os);
                    } finally {
                        if (os != null) {
                            try {
                                os.flush();
                            } catch (UncheckedIOException ignored) {
                            }
                        }
                    }
                } catch (UncheckedIOException ioex) {
                    final String message = ioex.getMessage();
                    if (!"chunked stream ended unexpectedly".equals(message)) {
                        throw ioex;
                    }
                } finally {
                    IOUtils.closeQuietly(is);
                }
            }
        } finally {
            method.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_FORBIDDEN;
	public MyHelperClass HTTP_1_0;
public MyHelperClass setVersion(MyHelperClass o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ServletOutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpServletResponse {

public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass executeMethod(PostMethod o0){ return null; }}

class PostMethod {

PostMethod(){}
	PostMethod(String o0){}
	public MyHelperClass setRequestEntity(RequestEntity o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getParams(){ return null; }}

class RequestEntity {

}

class InputStreamRequestEntity {

InputStreamRequestEntity(MyHelperClass o0){}
	InputStreamRequestEntity(){}}

class InputStream {

}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
