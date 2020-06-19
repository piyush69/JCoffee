import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10095726 {

//    @Override
    public void addApplication(Application app)  throws Throwable {
        MyHelperClass logger = new MyHelperClass();
        logger.info("Adding a new application " + app.getName() + " by " + app.getOrganisation() + " (" + app.getEmail() + ") ");
        app.setRegtime(new Timestamp(new Date().getTime()));
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(((int)(Object)app.getName() + (int)(Object)app.getEmail() + (int)(Object)app.getRegtime()).getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            app.setAppid(sb.toString());
        } catch (NoSuchAlgorithmException ex) {
            MyHelperClass Level = new MyHelperClass();
            java.util.logging.Logger.getLogger(ApplicationDAOImpl.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
        }
        System.out.println(app.toString());
        SqlParameterSource parameters =(SqlParameterSource)(Object) new BeanPropertySqlParameterSource(app);
        MyHelperClass insertApplication = new MyHelperClass();
        Number appUid =(Number)(Object) insertApplication.executeAndReturnKey(parameters);
        app.setId(appUid.longValue());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass executeAndReturnKey(SqlParameterSource o0){ return null; }}

class Application {

public MyHelperClass getRegtime(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass setRegtime(Timestamp o0){ return null; }
	public MyHelperClass getOrganisation(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setId(long o0){ return null; }
	public MyHelperClass setAppid(String o0){ return null; }}

class Timestamp {

Timestamp(long o0){}
	Timestamp(){}}

class SqlParameterSource {

}

class BeanPropertySqlParameterSource {

BeanPropertySqlParameterSource(Application o0){}
	BeanPropertySqlParameterSource(){}}

class ApplicationDAOImpl {

}

class Level {

}
