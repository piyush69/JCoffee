


class c11689375 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestPath =(String)(Object) req.getRequestURI();
        String cdecUrl = "http://cdec.water.ca.gov" + requestPath + "?" + req.getQueryString();
        System.out.println("CDEC URL: " + cdecUrl);
        URL url = new URL(cdecUrl);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer buffer = new StringBuffer();
        String line = null;
        int ncolumnInner = 0;
        while ((line =(String)(Object) reader.readLine()) != null) {
            if (line.contains("<div class=\"column_inner\"")) {
                ncolumnInner++;
            }
            if (ncolumnInner == 2) {
                if (line.contains("</div>")) {
                    break;
                }
                if (line.contains("href")) {
                    line = line.replaceAll("href", "  target=\"external_page\" href");
                }
                if (line.contains("http://cdec.water.ca.gov:80")) {
                    line = line.replaceAll("http://cdec.water.ca.gov:80/", "/");
                }
                if (line.contains("href=")) {
                    line = line.replaceAll("(href=\"|href=)", "$1http://cdec.water.ca.gov");
                }
                buffer.append(line);
            } else {
                continue;
            }
        }
        resp.getWriter().write(buffer.toString());
        resp.getWriter().flush();
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getQueryString(){ return null; }}

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
