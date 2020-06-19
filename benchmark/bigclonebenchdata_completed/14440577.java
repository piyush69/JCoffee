


class c14440577 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cacheName =(String)(Object) req.getParameter("cacheName");
        if (cacheName == null || cacheName.equals("")) {
            resp.getWriter().println("parameter cacheName required");
            return;
        } else {
            StringBuffer urlStr = new StringBuffer();
            MyHelperClass BASE_URL = new MyHelperClass();
            urlStr.append(BASE_URL);
            urlStr.append("?");
            urlStr.append("cacheName=");
            urlStr.append("rpcwc.bo.cache.");
            urlStr.append(cacheName);
            URL url = new URL(urlStr.toString());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            StringBuffer output = new StringBuffer();
            while ((line =(String)(Object) reader.readLine()) != null) {
                output.append(line);
                output.append(System.getProperty("line.separator"));
            }
            reader.close();
            resp.getWriter().println(output.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass println(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

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
