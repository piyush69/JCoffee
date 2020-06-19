


class c12913232 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullUrl = req.getRequestURL().toString();
        MyHelperClass ip = new MyHelperClass();
        if (fullUrl.indexOf((int)(Object)ip) != -1) {
//            MyHelperClass ip = new MyHelperClass();
            fullUrl = fullUrl.replaceAll((String)(Object)ip, "a.tbcdn.cn");
        }
        URL url = new URL(fullUrl);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        PrintWriter out =(PrintWriter)(Object) resp.getWriter();
        String line;
        while ((line =(String)(Object) in.readLine()) != null) {
            out.println(line);
        }
        in.close();
        out.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }}

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

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class PrintWriter {

public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}
