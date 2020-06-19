import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13498122 {
public MyHelperClass connect;
public MyHelperClass close(){ return null; }

    public boolean createUser(String username, String password, String name) throws Throwable, Exception {
        boolean user_created = false;
        try {
            MyHelperClass statement = new MyHelperClass();
            statement = connect.prepareStatement("SELECT COUNT(*) from toepen.users WHERE username = ? LIMIT 1");
//            MyHelperClass statement = new MyHelperClass();
            statement.setString(1, username);
            MyHelperClass resultSet = new MyHelperClass();
            resultSet = statement.executeQuery();
//            MyHelperClass resultSet = new MyHelperClass();
            resultSet.next();
//            MyHelperClass resultSet = new MyHelperClass();
            if ((int)(Object)resultSet.getInt(1) == 0) {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                md5.update(password.getBytes());
                BigInteger hash = new BigInteger(1, md5.digest());
                String password_hash = hash.toString(16);
                long ctime = System.currentTimeMillis() / 1000;
//                MyHelperClass statement = new MyHelperClass();
                statement = connect.prepareStatement("INSERT INTO toepen.users " + "(username, password, name, ctime) " + "VALUES (?, ?, ?, ?)");
//                MyHelperClass statement = new MyHelperClass();
                statement.setString(1, username);
//                MyHelperClass statement = new MyHelperClass();
                statement.setString(2, password_hash);
//                MyHelperClass statement = new MyHelperClass();
                statement.setString(3, name);
//                MyHelperClass statement = new MyHelperClass();
                statement.setLong(4, ctime);
//                MyHelperClass statement = new MyHelperClass();
                if ((int)(Object)statement.executeUpdate() > 0) {
                    user_created = true;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            close();
            return user_created;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass next(){ return null; }}
