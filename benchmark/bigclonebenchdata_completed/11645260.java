
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11645260 {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = null;
        boolean allowedToAccess = false;
        try {
            URL requestUrl = new URL("http:/" + request.getPathInfo());
            MyHelperClass allowedUrls = new MyHelperClass();
            for (Enumeration en =(Enumeration)(Object) allowedUrls.elements();(boolean)(Object) en.hasMoreElements(); ) {
                URL nextUrl = (URL)(URL)(Object) en.nextElement();
                if ((boolean)(Object)(nextUrl).getHost().equalsIgnoreCase(requestUrl.getHost())) {
                    allowedToAccess = true;
                }
            }
        } catch (UncheckedIOException ex) {
            System.err.println("Error in url: " + "http:/" + request.getPathInfo());
            return;
        }
        if (!allowedToAccess) {
            response.setStatus(407);
            return;
        }
        if (request.getPathInfo() != null && !request.getPathInfo().equals("")) {
            target = "http:/" + request.getPathInfo() + "?" + request.getQueryString();
        } else {
            response.setStatus(404);
            return;
        }
        InputStream is = null;
        ServletOutputStream out = null;
        try {
            URL url = new URL(target);
            URLConnection uc =(URLConnection)(Object) url.openConnection();
            response.setContentType(uc.getContentType());
            is =(InputStream)(Object) uc.getInputStream();
            out =(ServletOutputStream)(Object) response.getOutputStream();
            byte[] buf = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) is.read(buf)) != -1) {
                out.write(buf, 0, bytesRead);
            }
        } catch (UncheckedIOException e) {
            response.setStatus(404);
        } catch (ArithmeticException e) {
            response.setStatus(404);
        } finally {
            if (is != null) {
                is.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass elements(){ return null; }
	public MyHelperClass equalsIgnoreCase(MyHelperClass o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass getPathInfo(){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setStatus(int o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ServletOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
