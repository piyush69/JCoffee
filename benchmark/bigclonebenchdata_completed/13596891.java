
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13596891 {
public MyHelperClass WebApplicationContextUtils;
	public MyHelperClass getServletConfig(){ return null; }

    protected void doTransfer(HttpServletRequest request, HttpServletResponse response, String method) throws ServletException, IOException {
        ServletContext servletContext =(ServletContext)(Object) this.getServletConfig().getServletContext();
        WebApplicationContext wac =(WebApplicationContext)(Object) WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        String szUrl =(String)(Object) request.getParameter("url");
        System.out.println(szUrl);
        URL url;
        InputStream is = null;
        ServletOutputStream sout = null;
        try {
            url = new URL(szUrl);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            Enumeration hNames =(Enumeration)(Object) request.getHeaderNames();
            while ((boolean)(Object)hNames.hasMoreElements()) {
                String txt = hNames.nextElement().toString();
                con.setRequestProperty(txt,(String)(Object) request.getHeader(txt));
            }
            con.setRequestProperty("host",(String)(Object) url.getHost());
            con.setRequestProperty("refer", szUrl);
            con.setRequestMethod(method);
            con.setDoOutput(true);
            con.setDoInput(true);
            InputStreamReader inBody = new InputStreamReader(request.getInputStream());
            char bufCh[] = new char[1024];
            int r;
            OutputStreamWriter outReq = new OutputStreamWriter(con.getOutputStream());
            while ((r =(int)(Object) inBody.read(bufCh)) != -1) {
                System.out.println(bufCh);
                outReq.write(bufCh, 0, r);
            }
            outReq.flush();
            outReq.close();
            inBody.close();
            System.out.println(con.getResponseCode());
            System.out.println(con.getResponseMessage());
            if (con.getResponseCode() == con.HTTP_OK) {
                response.setContentType(con.getContentType());
                response.addHeader("Content-Encoding", con.getContentEncoding());
                sout =(ServletOutputStream)(Object) response.getOutputStream();
                is =(InputStream)(Object) con.getInputStream();
                byte buff[] = new byte[1024];
                while ((r =(int)(Object) is.read(buff)) != -1) {
                    sout.write(buff, 0, r);
                    System.out.print(buff);
                }
                sout.flush();
                is.close();
                sout.close();
            } else {
                response.sendError(con.getResponseCode(), con.getResponseMessage());
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRequiredWebApplicationContext(ServletContext o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }}

class HttpServletRequest {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getHeaderNames(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass addHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass sendError(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletContext {

}

class WebApplicationContext {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ServletOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class HttpURLConnection {
public MyHelperClass HTTP_OK;
public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
