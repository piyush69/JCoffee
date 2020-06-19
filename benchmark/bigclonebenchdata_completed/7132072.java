
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7132072 {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =(HttpSession)(Object) request.getSession(false);
        if (session == null) {
            MyHelperClass log = new MyHelperClass();
            log.warn("HttpProxyServlet: no session");
            response.setStatus(404);
            return;
        }
        User user = (User)(User)(Object) session.getAttribute("user");
        if (user == null) {
            MyHelperClass log = new MyHelperClass();
            log.warn("HttpProxyServlet: user not logged in");
            response.setStatus(404);
            return;
        }
        String target = null;
        if (request.getPathInfo() != null && !request.getPathInfo().equals("")) {
            target = "http:/" + request.getPathInfo() + "?" + request.getQueryString();
            MyHelperClass log = new MyHelperClass();
            log.info("HttpProxyServlet: target=" + target);
        } else {
            MyHelperClass log = new MyHelperClass();
            log.warn("HttpProxyServlet: missing pathInfo");
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
            MyHelperClass log = new MyHelperClass();
            log.warn("HttpProxyServlet: malformed URL");
            response.setStatus(404);
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("HttpProxyServlet: I/O exception");
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

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getSession(boolean o0){ return null; }}

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

class HttpSession {

public MyHelperClass getAttribute(String o0){ return null; }}

class User {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ServletOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
