


class c5186187 {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyHelperClass CONTENT_TYPE = new MyHelperClass();
        response.setContentType(CONTENT_TYPE);
        URL url;
        URLConnection urlConn;
        DataOutputStream cgiInput;
        url = new URL("http://localhost:8080/ListeOnLine/Target");
        urlConn =(URLConnection)(Object) url.openConnection();
        urlConn.setDoInput(true);
        urlConn.setDoOutput(true);
        urlConn.setUseCaches(false);
        urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        cgiInput = new DataOutputStream(urlConn.getOutputStream());
        MyHelperClass URLEncoder = new MyHelperClass();
        String content = "param1=" + URLEncoder.encode("first parameter") + "&param2=" + URLEncoder.encode("the second one...");
        cgiInput.writeBytes(content);
        cgiInput.flush();
        cgiInput.close();
        BufferedReader cgiOutput = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        PrintWriter servletOutput =(PrintWriter)(Object) response.getWriter();
        servletOutput.print("<html><body><h1>This is the Source Servlet</h1><p />");
        String line = null;
        while (null != (line =(String)(Object) cgiOutput.readLine())) {
            servletOutput.println(line);
        }
        cgiOutput.close();
        servletOutput.print("</body></html>");
        servletOutput.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class PrintWriter {

public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }}
