
import java.io.UncheckedIOException;


class c9860858 {
public MyHelperClass MessageDigest;
	public MyHelperClass getDbServ(){ return null; }
	public MyHelperClass identification(String o0, String o1){ return null; }
	public MyHelperClass getLogger(){ return null; }

//    @Override
    public boolean register(String username, String password) {
        this.getLogger().info(DbUserServiceImpl.class, ">>>rigister " + username + "<<<");
        try {
            if (this.getDbServ().queryFeelerUser(username) != null) {
                return false;
            }
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            String passwordMd5 = new String((String)(Object)md5.digest());
            this.getDbServ().addFeelerUser(username, passwordMd5);
            return(boolean)(Object) this.identification(username, password);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addFeelerUser(String o0, String o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass info(Class<DbUserServiceImpl> o0, String o1){ return null; }
	public MyHelperClass queryFeelerUser(String o0){ return null; }}

class DbUserServiceImpl {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
