import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4866624 {
public MyHelperClass NULL;
public MyHelperClass empresaFeta;
	public MyHelperClass log;
	public MyHelperClass credentials;
	public MyHelperClass carregaDadesEmpresa(){ return null; }

    public boolean authenticate()  throws Throwable {
        AltaEmpresaBean empresaFeta =(AltaEmpresaBean)(Object) NULL; //new AltaEmpresaBean();
        if (empresaFeta == null) empresaFeta = new AltaEmpresaBean();
        MyHelperClass credentials = new MyHelperClass();
        log.info("authenticating {0}", credentials.getUsername());
        boolean bo;
        try {
//            MyHelperClass credentials = new MyHelperClass();
            String passwordEncriptat =(String)(Object) credentials.getPassword();
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(passwordEncriptat.getBytes(), 0, passwordEncriptat.length());
            passwordEncriptat = new BigInteger(1, m.digest()).toString(16);
            MyHelperClass entityManager = new MyHelperClass();
            Query q =(Query)(Object) entityManager.createQuery("select usuari from Usuaris usuari where usuari.login=? and usuari.password=?");
//            MyHelperClass credentials = new MyHelperClass();
            q.setParameter(1,(String)(Object) credentials.getUsername());
            q.setParameter(2, passwordEncriptat);
            Usuaris usuari = (Usuaris)(Usuaris)(Object) q.getSingleResult();
            bo = (usuari != null);
            if (bo) {
                if ((boolean)(Object)usuari.isEsAdministrador()) {
                    MyHelperClass identity = new MyHelperClass();
                    identity.addRole("admin");
                } else {
                    carregaDadesEmpresa();
                    log.info("nom de l'empresa: " + empresaFeta.getInstance().getNom());
                }
            }
        } catch (Throwable t) {
            log.error(t);
            bo = false;
        }
        log.info("L'usuari {0} s'ha identificat bé? : {1} ", credentials.getUsername(), bo ? "si" : "no");
        return bo;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addRole(String o0){ return null; }
	public MyHelperClass error(Throwable o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass info(String o0, MyHelperClass o1, b o2){ return null; }
	public MyHelperClass getNom(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass createQuery(String o0){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass info(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class Query {

public MyHelperClass getSingleResult(){ return null; }
	public MyHelperClass setParameter(int o0, String o1){ return null; }}

class Usuaris {

public MyHelperClass isEsAdministrador(){ return null; }}

class AltaEmpresaBean {

public MyHelperClass getInstance(){ return null; }}

class b {

}
