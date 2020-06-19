
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19100233 {
public MyHelperClass getServletContext(){ return null; }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out =(PrintWriter)(Object) res.getWriter();
        String requestNumber =(String)(Object) req.getParameter("reqno");
        int parseNumber = Integer.parseInt(requestNumber);
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            MyHelperClass DriverManager = new MyHelperClass();
            con =(Connection)(Object) DriverManager.getConnection("jdbc:derby:/DerbyDB/AssetDB");
            con.setAutoCommit(false);
            String inet =(String)(Object) req.getRemoteAddr();
            Statement stmt =(Statement)(Object) con.createStatement();
            String sql = "UPDATE REQUEST_DETAILS SET viewed = '1', checked_by = '" + inet + "' WHERE QUERY = ?";
            PreparedStatement pst =(PreparedStatement)(Object) con.prepareStatement(sql);
            pst.setInt(1, parseNumber);
            pst.executeUpdate();
            con.commit();
            String nextJSP = "/queryRemoved.jsp";
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(req, res);
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (UncheckedIOException ignored) {
            }
            out.println("Failed");
        } finally {
            try {
                if (con != null) con.close();
            } catch (UncheckedIOException ignored) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRequestDispatcher(String o0){ return null; }
	public MyHelperClass getConnection(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getRemoteAddr(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

public MyHelperClass println(String o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class RequestDispatcher {

public MyHelperClass forward(HttpServletRequest o0, HttpServletResponse o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
