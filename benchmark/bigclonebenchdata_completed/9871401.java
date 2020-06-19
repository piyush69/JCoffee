
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9871401 {
public MyHelperClass IOUtils;
public MyHelperClass HttpServletResponse;
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass getDataSource(){ return null; }

    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String pathInfo =(String)(Object) httpServletRequest.getPathInfo();
        MyHelperClass log = new MyHelperClass();
        log.info("PathInfo: " + pathInfo);
        if (pathInfo == null || pathInfo.equals("") || pathInfo.equals("/")) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        String fileName = pathInfo.charAt(0) == '/' ? pathInfo.substring(1) : pathInfo;
//        MyHelperClass log = new MyHelperClass();
        log.info("FileName: " + fileName);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con =(Connection)(Object) getDataSource().getConnection();
            ps =(PreparedStatement)(Object) con.prepareStatement("select file, size from files where name=?");
            ps.setString(1, fileName);
            rs =(ResultSet)(Object) ps.executeQuery();
            if ((boolean)(Object)rs.next()) {
                httpServletResponse.setContentType(getServletContext().getMimeType(fileName));
                httpServletResponse.setContentLength(rs.getInt("size"));
                OutputStream os =(OutputStream)(Object) httpServletResponse.getOutputStream();
                IOUtils.copy(rs.getBinaryStream("file"), os);
                os.flush();
            } else {
                httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
                return;
            }
        } catch (UncheckedIOException e) {
            throw new ServletException((String)(Object)e);
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (UncheckedIOException e) {
            }
            if (ps != null) try {
                ps.close();
            } catch (UncheckedIOException e) {
            }
            if (con != null) try {
                con.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
public MyHelperClass getMimeType(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass getBinaryStream(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
