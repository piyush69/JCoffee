import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9782242 {

    private void createUser(AddEditUserForm addform, HttpServletRequest request, ActionMapping mapping) throws Exception {
        MessageDigest md = (MessageDigest) MessageDigest.getInstance("MD5").clone();
        md.update((byte)(Object)addform.getPassword().getBytes("UTF-8"));
        byte[] pd = md.digest();
        StringBuffer app = new StringBuffer();
        for (int i = 0; i < pd.length; i++) {
            String s2 = Integer.toHexString(pd[i] & 0xFF);
            app.append((s2.length() == 1) ? "0" + s2 : s2);
        }
        MyHelperClass HibernateUtil = new MyHelperClass();
        Session hbsession =(Session)(Object) HibernateUtil.currentSession();
        try {
            Transaction tx =(Transaction)(Object) hbsession.beginTransaction();
            NvUsers user = new NvUsers();
            user.setLogin(addform.getLogin());
            user.setPassword(app.toString());
            hbsession.save(user);
            hbsession.flush();
            if (!(Boolean)(Object)hbsession.connection().getAutoCommit()) {
                tx.commit();
            }
        } finally {
//            MyHelperClass HibernateUtil = new MyHelperClass();
            HibernateUtil.closeSession();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeSession(){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass currentSession(){ return null; }}

class AddEditUserForm {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getLogin(){ return null; }}

class HttpServletRequest {

}

class ActionMapping {

}

class Session {

public MyHelperClass beginTransaction(){ return null; }
	public MyHelperClass connection(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass save(NvUsers o0){ return null; }}

class Transaction {

public MyHelperClass commit(){ return null; }}

class NvUsers {

public MyHelperClass setLogin(MyHelperClass o0){ return null; }
	public MyHelperClass setPassword(String o0){ return null; }}
