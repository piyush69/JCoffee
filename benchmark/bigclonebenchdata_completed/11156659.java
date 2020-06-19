import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11156659 {
public MyHelperClass entityManager;
	public MyHelperClass Restrictions;
	public MyHelperClass mLogger;

    public boolean checkLogin(String pMail, String pMdp)  throws Throwable {
        boolean vLoginOk = false;
        if (pMail == null || pMdp == null) {
            throw new IllegalArgumentException("Login and password are mandatory. Null values are forbidden.");
        }
        try {
            Criteria crit =(Criteria)(Object) ((Session)(Session)(Object) this.entityManager.getDelegate()).createCriteria((Client)(Object)Client.class);
            crit.add(Restrictions.ilike("email", pMail));
            MessageDigest vMd5Instance;
            try {
                vMd5Instance = MessageDigest.getInstance("MD5");
                vMd5Instance.reset();
                vMd5Instance.update(pMdp.getBytes());
                byte[] vDigest = vMd5Instance.digest();
                BigInteger vBigInt = new BigInteger(1, vDigest);
                String vHashPassword = vBigInt.toString(16);
                crit.add(Restrictions.eq("mdp", vHashPassword));
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            Client pClient = (Client)(Client)(Object) crit.uniqueResult();
            vLoginOk = (pClient != null);
        } catch (ArithmeticException e) {
            mLogger.error("Exception - DataAccessException occurs : {} on complete checkLogin( {}, {} )", new Object[] { e.getMessage(), pMail, pMdp });
        }
        return vLoginOk;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass eq(String o0, String o1){ return null; }
	public MyHelperClass getDelegate(){ return null; }
	public MyHelperClass error(String o0, Object[] o1){ return null; }
	public MyHelperClass ilike(String o0, String o1){ return null; }}

class Criteria {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass uniqueResult(){ return null; }}

class Client {

}

class Session {

public MyHelperClass createCriteria(Client o0){ return null; }}

class DataAccessException extends Exception{
	public DataAccessException(String errorMessage) { super(errorMessage); }
}
