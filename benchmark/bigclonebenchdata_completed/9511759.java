


class c9511759 {
public MyHelperClass getErrorPage(Exception o0){ return null; }
	public MyHelperClass getResult(String o0){ return null; }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        try {
            String content = "";
            URL url = new URL(request.getParameter("url"));
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                content += line + "\n";
            }
            in.close();
            String result =(String)(Object) getResult(content);
            response.setContentType("text/plain");
            PrintWriter out =(PrintWriter)(Object) response.getWriter();
            out.println(result);
        } catch (Exception e) {
            response.setContentType("text/html");
            PrintWriter out =(PrintWriter)(Object) response.getWriter();
            out.println(getErrorPage(e));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class PrintWriter {

public MyHelperClass println(MyHelperClass o0){ return null; }
	public MyHelperClass println(String o0){ return null; }}
