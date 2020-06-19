


class c2980810 {
public MyHelperClass logRequest(HttpServletRequest o0){ return null; }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url =(String)(Object) request.getParameter("proxyurl");
        URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
        Enumeration params =(Enumeration)(Object) request.getParameterNames();
        boolean first = true;
        while ((boolean)(Object)params.hasMoreElements()) {
            String param = (String)(String)(Object) params.nextElement();
            if (!param.equals("proxyurl")) {
                if (first) {
                    first = false;
                } else {
                    dos.writeBytes("&");
                }
                MyHelperClass URLEncoder = new MyHelperClass();
                dos.writeBytes((String)(Object)URLEncoder.encode(param));
                dos.writeBytes("=");
//                MyHelperClass URLEncoder = new MyHelperClass();
                dos.writeBytes((String)(Object)URLEncoder.encode((String)(Object)request.getParameter(param)));
            }
        }
        dos.close();
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

public MyHelperClass encode(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameterNames(){ return null; }
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
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass writeBytes(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class Reader {

public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, MyHelperClass o1){}}

class Writer {

public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
