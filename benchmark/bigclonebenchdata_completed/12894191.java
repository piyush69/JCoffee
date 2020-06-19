


class c12894191 {

//    @Override
    public void doHandler(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String directURL = request.getRequestURL().toString();
        response.setCharacterEncoding("gbk");
        PrintWriter out =(PrintWriter)(Object) response.getWriter();
        try {
            MyHelperClass urlTools = new MyHelperClass();
            directURL =(String)(Object) urlTools.urlFilter(directURL, true);
            URL url = new URL(directURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "gbk"));
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                out.println(line);
            }
            in.close();
        } catch (Exception e) {
            out.println("file not find");
        }
        out.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass urlFilter(String o0, boolean o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
