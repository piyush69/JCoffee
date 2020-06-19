
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17644206 {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uid =(String)(Object) request.getParameter("id");
        String pwd =(String)(Object) request.getParameter("pwd");
        String email =(String)(Object) request.getParameter("email");
        String sid =(String)(Object) request.getParameter("sid");
        System.out.println(uid);
        System.out.println(pwd);
        System.out.println(email);
        System.out.println(sid);
        DBconn dbc = new DBconn();
        Connection conn;
        PreparedStatement pst;
        Statement st;
        conn =(Connection)(Object) dbc.getConnection();
        MyHelperClass PasswordService = new MyHelperClass();
        PasswordService ps =(PasswordService)(Object) PasswordService.getInstance();
        String hash = "";
        try {
            hash =(String)(Object) ps.encrypt(pwd);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String sql = "insert into HP_ADMINISTRATOR.STAFF_REGISTRATION values (?,?,?,?)";
        try {
            pst =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pst.setString(1, uid);
            pst.setString(2, hash);
            pst.setString(3, email);
            pst.setString(4, sid);
            System.out.println(pst.toString());
            pst.executeUpdate();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            try {
                conn.rollback();
                conn.setAutoCommit(true);
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
        }
        response.sendRedirect("AdminControlStaff.jsp");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass sendRedirect(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DBconn {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Statement {

}

class PasswordService {

public MyHelperClass encrypt(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
