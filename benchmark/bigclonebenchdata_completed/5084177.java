import java.io.*;
import java.lang.*;
import java.util.*;



class c5084177 {
public MyHelperClass connection;
	public MyHelperClass error;
	public MyHelperClass MessageDigest;
	public MyHelperClass DriverManager;
	public MyHelperClass dbStatement;
	public MyHelperClass notice;
	public MyHelperClass dbResultSet;
	public MyHelperClass getServletConfig(){ return null; }
	public MyHelperClass getServletContext(){ return null; }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config =(ServletConfig)(Object) getServletConfig();
        ServletContext context =(ServletContext)(Object) config.getServletContext();
        try {
            String driver =(String)(Object) context.getInitParameter("driver");
            Class.forName(driver);
            String dbURL =(String)(Object) context.getInitParameter("db");
            String username =(String)(Object) context.getInitParameter("username");
            String password = "";
            connection = DriverManager.getConnection(dbURL, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Database driver not found.");
        } catch (UncheckedIOException e) {
            System.out.println("Error opening the db connection: " + e.getMessage());
        }
        String action = "";
        HttpSession session =(HttpSession)(Object) request.getSession();
        session.setMaxInactiveInterval(300);
        if (request.getParameter("action") != null) {
            action =(String)(Object) request.getParameter("action");
        } else {
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
            return;
        }
        if (action.equals("login")) {
            String username =(String)(Object) request.getParameter("username");
            String password =(String)(Object) request.getParameter("password");
            MessageDigest md = null;
            try {
                md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException e) {
                error =(MyHelperClass)(Object) "There was an error encrypting password.";
                session.setAttribute("error", error);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/error.jsp");
                dispatcher.forward(request, response);
                return;
            }
            try {
                md.update(password.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                error =(MyHelperClass)(Object) "There was an error encrypting password.";
                session.setAttribute("error", error);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/error.jsp");
                dispatcher.forward(request, response);
                return;
            }
            String encrypted_password =(String)(Object) (new BASE64Encoder()).encode(md.digest());
            try {
                String sql = "SELECT * FROM person WHERE email LIKE '" + username + "' AND password='" + encrypted_password + "'";
                dbStatement = connection.createStatement();
                dbResultSet = dbStatement.executeQuery(sql);
                if ((boolean)(Object)dbResultSet.next()) {
                    Person person = new Person(dbResultSet.getString("fname"), dbResultSet.getString("lname"), dbResultSet.getString("address1"), dbResultSet.getString("address2"), dbResultSet.getString("city"), dbResultSet.getString("state"), dbResultSet.getString("zip"), dbResultSet.getString("email"), dbResultSet.getString("password"), dbResultSet.getInt("is_admin"));
                    String member_type =(String)(Object) dbResultSet.getString("member_type");
                    String person_id = Integer.toString((int)(Object)dbResultSet.getInt("id"));
                    session.setAttribute("person", person);
                    session.setAttribute("member_type", member_type);
                    session.setAttribute("person_id", person_id);
                } else {
                    notice =(MyHelperClass)(Object) "Your username and/or password is incorrect.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            } catch (UncheckedIOException e) {
                error =(MyHelperClass)(Object) "There was an error trying to login. (SQL Statement)";
                session.setAttribute("error", error);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/error.jsp");
                dispatcher.forward(request, response);
                return;
            }
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        } else {
            notice =(MyHelperClass)(Object) "Unable to log you in.  Please try again.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass getRequestDispatcher(String o0){ return null; }
	public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletConfig {

public MyHelperClass getServletContext(){ return null; }}

class ServletContext {

public MyHelperClass getInitParameter(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class HttpSession {

public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setAttribute(String o0, Person o1){ return null; }
	public MyHelperClass setMaxInactiveInterval(int o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class RequestDispatcher {

public MyHelperClass forward(HttpServletRequest o0, HttpServletResponse o1){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class Person {

Person(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, MyHelperClass o5, MyHelperClass o6, MyHelperClass o7, MyHelperClass o8, MyHelperClass o9){}
	Person(){}}
