import java.io.*;
import java.lang.*;
import java.util.*;



class c12690725 {
public MyHelperClass NULL;

    public void login(String a_username, String a_password) throws GB_SecurityException {
        Exception l_exception = null;
        try {
            MyHelperClass clientFtp = new MyHelperClass();
            if (clientFtp == null) {
//                MyHelperClass clientFtp = new MyHelperClass();
                clientFtp =(MyHelperClass)(Object) new FTPClient();
                MyHelperClass ftp = new MyHelperClass();
                clientFtp.connect("ftp://" + ftp);
            }
//            MyHelperClass clientFtp = new MyHelperClass();
            boolean b =(boolean)(Object) clientFtp.login(a_username, a_password);
            if (b) {
                String username =(String)(Object) NULL; //new String();
                username = a_username;
                String password =(String)(Object) NULL; //new String();
                password = a_password;
                return;
            }
        } catch (Exception ex) {
            l_exception = ex;
        }
        String l_msg = "Cannot login to ftp server with user [{1}], {2}";
        MyHelperClass ftp = new MyHelperClass();
        String[] l_replaces = new String[] { a_username,(String)(Object) ftp };
        MyHelperClass STools = new MyHelperClass();
        l_msg =(String)(Object) STools.replace(l_msg, l_replaces);
        throw new GB_SecurityException(l_msg, l_exception);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass replace(String o0, String[] o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class GB_SecurityException extends Exception{
	public GB_SecurityException(String errorMessage) { super(errorMessage); }
	GB_SecurityException(String o0, Exception o1){}
	GB_SecurityException(){}
}

class FTPClient {

}
