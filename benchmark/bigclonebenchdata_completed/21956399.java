import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21956399 {

//    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws Throwable, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        String format =(String)(Object) req.getParameter("format");
        MyHelperClass EMF = new MyHelperClass();
        EntityManager em =(EntityManager)(Object) EMF.get().createEntityManager();
        String uname = (req.getParameter("uname") == null) ? "" : req.getParameter("uname");
        String passwd = (req.getParameter("passwd") == null) ? "" : req.getParameter("passwd");
        String name = (req.getParameter("name") == null) ? "" : req.getParameter("name");
        String email = (req.getParameter("email") == null) ? "" : req.getParameter("email");
        if (uname == null || uname.equals("") || uname.length() < 4) {
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.unameTooShort(uname).toXML(em)); else resp.getWriter().print(Error.unameTooShort(uname).toJSON(em));
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.setStatus((int)(Object)HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        MyHelperClass User = new MyHelperClass();
        if (User.fromUserName(em, uname) != null) {
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.userExists(uname).toXML(em)); else resp.getWriter().print(Error.userExists(uname).toJSON(em));
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.setStatus((int)(Object)HttpServletResponse.SC_CONFLICT);
            em.close();
            return;
        }
        if (passwd.equals("") || passwd.length() < 6) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.setStatus((int)(Object)HttpServletResponse.SC_BAD_REQUEST);
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.passwdTooShort(uname).toXML(em)); else resp.getWriter().print(Error.passwdTooShort(uname).toJSON(em));
            em.close();
            return;
        }
        User u = new User();
        u.setUsername(uname);
        u.setPasswd(passwd);
        u.setName(name);
        u.setEmail(email);
        u.setPaid(false);
        StringBuffer apikey = new StringBuffer();
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            String api = System.nanoTime() + "" + System.identityHashCode(this) + "" + uname;
            algorithm.update(api.getBytes());
            byte[] digest = algorithm.digest();
            for (int i = 0; i < digest.length; i++) {
                apikey.append(Integer.toHexString(0xFF & digest[i]));
            }
        } catch (NoSuchAlgorithmException e) {
            resp.setStatus(500);
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.unknownError().toXML(em)); else resp.getWriter().print(Error.unknownError().toJSON(em));
            MyHelperClass log = new MyHelperClass();
            log.severe(e.toString());
            em.close();
            return;
        }
        u.setApiKey(apikey.toString());
        EntityTransaction tx =(EntityTransaction)(Object) em.getTransaction();
        tx.begin();
        try {
            em.persist(u);
            tx.commit();
        } catch (Throwable t) {
            MyHelperClass log = new MyHelperClass();
            log.severe("Error adding user " + uname + " Reason:" + t.getMessage());
            tx.rollback();
            resp.setStatus(500);
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.unknownError().toXML(em)); else resp.getWriter().print(Error.unknownError().toJSON(em));
            return;
        }
        MyHelperClass log = new MyHelperClass();
        log.info("User " + u.getName() + " was created successfully");
        MyHelperClass HttpServletResponse = new MyHelperClass();
        resp.setStatus((int)(Object)HttpServletResponse.SC_CREATED);
        if (format != null && format.equals("xml")) resp.getWriter().print(u.toXML(em)); else resp.getWriter().print(u.toJSON(em));
        em.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_CONFLICT;
	public MyHelperClass SC_CREATED;
	public MyHelperClass SC_BAD_REQUEST;
public MyHelperClass toJSON(EntityManager o0){ return null; }
	public MyHelperClass toXML(EntityManager o0){ return null; }
	public MyHelperClass fromUserName(EntityManager o0, String o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass print(MyHelperClass o0){ return null; }
	public MyHelperClass createEntityManager(){ return null; }
	public MyHelperClass get(){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setStatus(int o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setCharacterEncoding(String o0){ return null; }}

class EntityManager {

public MyHelperClass getTransaction(){ return null; }
	public MyHelperClass persist(User o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Error {

public static MyHelperClass unameTooShort(String o0){ return null; }
	public static MyHelperClass unknownError(){ return null; }
	public static MyHelperClass userExists(String o0){ return null; }
	public static MyHelperClass passwdTooShort(String o0){ return null; }}

class User {

public MyHelperClass setPasswd(String o0){ return null; }
	public MyHelperClass setUsername(String o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass toJSON(EntityManager o0){ return null; }
	public MyHelperClass toXML(EntityManager o0){ return null; }
	public MyHelperClass setPaid(boolean o0){ return null; }
	public MyHelperClass setEmail(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setApiKey(String o0){ return null; }}

class EntityTransaction {

public MyHelperClass begin(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}
