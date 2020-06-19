
import java.io.UncheckedIOException;


class c16582557 {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyHelperClass session = new MyHelperClass();
        session = request.getSession(true);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out =(PrintWriter)(Object) response.getWriter();
        try {
            String searchTerm = new String();
            if (request.getParameter("searchdb") != null) {
                searchTerm =(String)(Object) request.getParameter("searchdb");
                out.write("<ul>");
                MyHelperClass conn = new MyHelperClass();
                PreparedStatement sqlGetLikeBaseString =(PreparedStatement)(Object) conn.prepareStatement("SELECT * FROM ENTRIES WHERE XTM_SESSION_ID = ? AND XTM_TEXT LIKE ?");
//                MyHelperClass session = new MyHelperClass();
                sqlGetLikeBaseString.setString(1,(String)(Object) session.getId());
                sqlGetLikeBaseString.setString(2, new String("%" + searchTerm + "%"));
                ResultSet res =(ResultSet)(Object) sqlGetLikeBaseString.executeQuery();
                while ((boolean)(Object)res.next()) {
                    out.write("<li>");
                    out.write((String)(Object)res.getString("XTM_TEXT"));
                    out.write("</li>");
                }
                out.write("</ul>");
                res.close();
            }
            if (request.getParameter("searchwiki") != null) {
                searchTerm =(String)(Object) request.getParameter("searchwiki");
                out.write("<ul>");
                try {
                    MyHelperClass URLEncoder = new MyHelperClass();
                    searchTerm =(String)(Object) URLEncoder.encode(searchTerm, "UTF-8");
                    URL url = new URL("http://www.wikipedia.de/suggest.php?lang=de&search=" + searchTerm);
                    URLConnection con =(URLConnection)(Object) url.openConnection();
                    BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
                    String line;
                    while ((line =(String)(Object) rd.readLine()) != null) {
                        out.write("<li>");
                        String[] split = line.split("\t");
                        out.write(split[0]);
                        out.write("</li>");
                    }
                    rd.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                out.write("</ul>");
            } else {
                return;
            }
        } catch (UncheckedIOException e) {
            out.println("Caught SQLException:" + e.getMessage());
        }
        ;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getId(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getSession(boolean o0){ return null; }}

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

class PrintWriter {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class URL {

URL(String o0){}
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

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
