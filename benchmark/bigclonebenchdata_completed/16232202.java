import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16232202 {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        if (request.getParameter("edit") != null) {
            try {
                User cu = (User)(User)(Object) request.getSession().getAttribute("currentuser");
                UserDetails ud =(UserDetails)(Object) cu.getUserDetails();
                String returnTo = "editprofile.jsp";
                if (!request.getParameter("password").equals("")) {
                    String password =(String)(Object) request.getParameter("password");
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(new String(password).getBytes());
                    byte[] hash = md.digest();
                    String pass = new BigInteger(1, hash).toString(16);
                    cu.setClientPassword(pass);
                }
                ud.setFirstName(request.getParameter("fname"));
                ud.setLastName(request.getParameter("lname"));
                ud.setEmailAddress(request.getParameter("email"));
                ud.setAddress(request.getParameter("address"));
                ud.setZipcode(request.getParameter("zipcode"));
                ud.setTown(request.getParameter("town"));
                ud.setCountry(request.getParameter("country"));
                ud.setTrackingColor(request.getParameter("input1"));
                String vis =(String)(Object) request.getParameter("visibility");
                if (vis.equals("self")) {
                    cu.setVisibility(0);
                } else if (vis.equals("friends")) {
                    cu.setVisibility(1);
                } else if (vis.equals("all")) {
                    cu.setVisibility(2);
                } else {
                    response.sendRedirect("error.jsp?id=8");
                }
                MyHelperClass em = new MyHelperClass();
                em.getTransaction().begin();
//                MyHelperClass em = new MyHelperClass();
                em.persist(cu);
//                MyHelperClass em = new MyHelperClass();
                em.getTransaction().commit();
                response.sendRedirect(returnTo);
            } catch (Throwable e) {
                e.printStackTrace();
                response.sendRedirect("error.jsp?id=5");
            }
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTransaction(){ return null; }
	public MyHelperClass begin(){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass persist(User o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass sendRedirect(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class User {

public MyHelperClass setClientPassword(String o0){ return null; }
	public MyHelperClass getUserDetails(){ return null; }
	public MyHelperClass setVisibility(int o0){ return null; }}

class UserDetails {

public MyHelperClass setTrackingColor(MyHelperClass o0){ return null; }
	public MyHelperClass setLastName(MyHelperClass o0){ return null; }
	public MyHelperClass setCountry(MyHelperClass o0){ return null; }
	public MyHelperClass setEmailAddress(MyHelperClass o0){ return null; }
	public MyHelperClass setAddress(MyHelperClass o0){ return null; }
	public MyHelperClass setFirstName(MyHelperClass o0){ return null; }
	public MyHelperClass setZipcode(MyHelperClass o0){ return null; }
	public MyHelperClass setTown(MyHelperClass o0){ return null; }}
