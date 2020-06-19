


class c2980809 {
public MyHelperClass logRequest(HttpServletRequest o0){ return null; }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url =(String)(Object) request.getParameter("proxyurl");
        URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
        Reader in =(Reader)(Object) new InputStreamReader(conn.getInputStream(), response.getCharacterEncoding());
        response.setContentType(conn.getContentType());
        response.setContentLength(conn.getContentLength());
        Writer out =(Writer)(Object) response.getWriter();
        char[] buf = new char[256];
        int len;
        while ((len =(int)(Object) in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        String log =(String)(Object) request.getParameter("logging");
        if (log != null && log.toLowerCase().equals("true")) logRequest(request);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass getCharacterEncoding(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Reader {

public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, MyHelperClass o1){}}

class Writer {

public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
