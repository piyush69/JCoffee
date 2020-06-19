


class c5091542 {

//    @Override
    public void doHandler(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if ((int)(Object)request.getRequestURI().indexOf(".swf") != -1) {
            String fullUrl = (String)(String)(Object) request.getAttribute("fullUrl");
            MyHelperClass urlTools = new MyHelperClass();
            fullUrl =(String)(Object) urlTools.urlFilter(fullUrl, true);
            response.setCharacterEncoding("gbk");
            response.setContentType("application/x-shockwave-flash");
            PrintWriter out =(PrintWriter)(Object) response.getWriter();
            try {
                URL url = new URL(fullUrl);
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "gbk"));
                MyHelperClass fileEditor = new MyHelperClass();
                fileEditor.pushStream(out, in, null, true);
            } catch (Exception e) {
            }
            out.flush();
        } else if ((int)(Object)request.getRequestURI().indexOf(".xml") != -1) {
            response.setContentType("text/xml");
            PrintWriter out =(PrintWriter)(Object) response.getWriter();
            try {
                MyHelperClass configCenter = new MyHelperClass();
                URL url = new URL("http://" + configCenter.getUcoolOnlineIp() + request.getRequestURI());
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                MyHelperClass fileEditor = new MyHelperClass();
                fileEditor.pushStream(out, in, null, true);
            } catch (Exception e) {
            }
            out.flush();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getUcoolOnlineIp(){ return null; }
	public MyHelperClass urlFilter(String o0, boolean o1){ return null; }
	public MyHelperClass pushStream(PrintWriter o0, BufferedReader o1, Object o2, boolean o3){ return null; }}

class HttpServletRequest {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

public MyHelperClass flush(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
