import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13498121 {
public MyHelperClass connect;
public MyHelperClass close(){ return null; }

    public boolean validateLogin(String username, String password)  throws Throwable {
        boolean user_exists = false;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            BigInteger hash = new BigInteger(1, md5.digest());
            String password_hash = hash.toString(16);
            MyHelperClass statement = new MyHelperClass();
            statement = connect.prepareStatement("SELECT id from toepen.users WHERE username = ? AND password = ?");
//            MyHelperClass statement = new MyHelperClass();
            statement.setString(1, username);
//            MyHelperClass statement = new MyHelperClass();
            statement.setString(2, password_hash);
            MyHelperClass resultSet = new MyHelperClass();
            resultSet = statement.executeQuery();
//            MyHelperClass resultSet = new MyHelperClass();
            while ((boolean)(Object)resultSet.next()) {
                user_exists = true;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            close();
            return user_exists;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass next(){ return null; }}
