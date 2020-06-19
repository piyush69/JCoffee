


class c7614574 {
public MyHelperClass getInitParameter(String o0){ return null; }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String zOntoJsonApiUrl =(String)(Object) getInitParameter("zOntoJsonApiServletUrl");
        URL url = new URL(zOntoJsonApiUrl + "?" + req.getQueryString());
        resp.setContentType("text/html");
        InputStreamReader bf = new InputStreamReader(url.openStream());
        BufferedReader bbf = new BufferedReader(bf);
        String response = "";
        String line =(String)(Object) bbf.readLine();
        PrintWriter out =(PrintWriter)(Object) resp.getWriter();
        while (line != null) {
            response += line;
            line =(String)(Object) bbf.readLine();
        }
        out.print(response);
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

public MyHelperClass getQueryString(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class PrintWriter {

public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
