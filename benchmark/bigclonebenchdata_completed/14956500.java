
import java.io.UncheckedIOException;


class c14956500 {

//    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        MyHelperClass EMF = new MyHelperClass();
        EntityManager em =(EntityManager)(Object) EMF.get().createEntityManager();
        String url = req.getRequestURL().toString();
        String key =(String)(Object) req.getParameter("key");
        String format =(String)(Object) req.getParameter("format");
        MyHelperClass Keys = new MyHelperClass();
        if (key == null || !key.equals(Keys.APPREGKEY)) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.notAuthorised("").toXML(em)); else resp.getWriter().print(Error.notAuthorised("").toJSON(em));
            em.close();
            return;
        }
        String appname =(String)(Object) req.getParameter("name");
        if (appname == null || appname.equals("")) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.noAppId(null).toXML(em)); else resp.getWriter().print(Error.noAppId(null).toJSON(em));
            em.close();
            return;
        }
        StringBuffer appkey = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            algorithm.reset();
            String api = System.nanoTime() + "" + System.identityHashCode(this) + "" + appname;
            algorithm.update(api.getBytes());
            byte[] digest =(byte[])(Object) algorithm.digest();
            for (int i = 0; i < digest.length; i++) {
                appkey.append(Integer.toHexString(0xFF & digest[i]));
            }
        } catch (UncheckedIOException e) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.unknownError().toXML(em)); else resp.getWriter().print(Error.unknownError().toJSON(em));
            MyHelperClass log = new MyHelperClass();
            log.severe(e.toString());
            em.close();
            return;
        }
        ClientApp app = new ClientApp();
        app.setName(appname);
        app.setKey(appkey.toString());
        app.setNumreceipts(0L);
        EntityTransaction tx =(EntityTransaction)(Object) em.getTransaction();
        tx.begin();
        try {
            em.persist(app);
            tx.commit();
        } catch (Throwable t) {
            MyHelperClass log = new MyHelperClass();
            log.severe("Error persisting application " + app.getName() + ": " + t.getMessage());
            tx.rollback();
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            if (format != null && format.equals("xml")) resp.getWriter().print(Error.unknownError().toXML(em)); else resp.getWriter().print(Error.unknownError().toJSON(em));
            em.close();
            return;
        }
        MyHelperClass HttpServletResponse = new MyHelperClass();
        resp.setStatus(HttpServletResponse.SC_CREATED);
        if (format != null && format.equals("xml")) resp.getWriter().print(app.toXML(em)); else resp.getWriter().print(app.toJSON(em));
        em.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_CREATED;
	public MyHelperClass SC_INTERNAL_SERVER_ERROR;
	public MyHelperClass SC_UNAUTHORIZED;
	public MyHelperClass APPREGKEY;
	public MyHelperClass SC_BAD_REQUEST;
public MyHelperClass toXML(EntityManager o0){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass print(MyHelperClass o0){ return null; }
	public MyHelperClass toJSON(EntityManager o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass createEntityManager(){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getRequestURL(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class EntityManager {

public MyHelperClass persist(ClientApp o0){ return null; }
	public MyHelperClass getTransaction(){ return null; }
	public MyHelperClass close(){ return null; }}

class Error {

public static MyHelperClass noAppId(Object o0){ return null; }
	public static MyHelperClass notAuthorised(String o0){ return null; }
	public static MyHelperClass unknownError(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class ClientApp {

public MyHelperClass toXML(EntityManager o0){ return null; }
	public MyHelperClass setKey(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setNumreceipts(long o0){ return null; }
	public MyHelperClass toJSON(EntityManager o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }}

class EntityTransaction {

public MyHelperClass begin(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}
