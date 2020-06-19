import java.io.*;
import java.lang.*;
import java.util.*;



class c17003469 {
public static MyHelperClass asHexString(MyHelperClass o0){ return null; }
//public MyHelperClass asHexString(MyHelperClass o0){ return null; }

    public static String login() throws Exception {
        MyHelperClass sid = new MyHelperClass();
        if (sid == null) {
            MyHelperClass ROLAPClientAux = new MyHelperClass();
            String login =(String)(Object) ROLAPClientAux.loadProperties().getProperty("user");
//            MyHelperClass ROLAPClientAux = new MyHelperClass();
            String password =(String)(Object) ROLAPClientAux.loadProperties().getProperty("password");
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            String password2 =(String)(Object) asHexString(md.digest());
            String query = "/server/login?user=" + login + "&extern_password=" + password + "&password=" + password2;
//            MyHelperClass ROLAPClientAux = new MyHelperClass();
            Vector<String> res =(Vector<String>)(Object) ROLAPClientAux.sendRequest(query);
            String vals[] = res.get(0).split(";");
//            MyHelperClass sid = new MyHelperClass();
            sid =(MyHelperClass)(Object) vals[0];
        }
//        MyHelperClass sid = new MyHelperClass();
        return (String)(Object)sid;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass sendRequest(String o0){ return null; }
	public MyHelperClass loadProperties(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
