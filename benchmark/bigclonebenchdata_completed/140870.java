import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c140870 {
public static MyHelperClass testVar;
	public static MyHelperClass xmlRpcC;
	public static MyHelperClass userdataFile;
	public static MyHelperClass xmlC;
	public static MyHelperClass JOptionPane;
	public static MyHelperClass getUserInfo(){ return null; }
//public MyHelperClass xmlC;
	public MyHelperClass Debug;
//	public MyHelperClass xmlRpcC;
//	public MyHelperClass testVar;
//	public MyHelperClass userdataFile;
//	public MyHelperClass JOptionPane;
//	public MyHelperClass getUserInfo(){ return null; }

    public static boolean changeCredentials()  throws Throwable {
        boolean passed = false;
        boolean credentials = false;
        HashMap info = null;
        MyHelperClass Debug = new MyHelperClass();
        Debug.log("Main.changeCredentials", "show dialog for userinfo");
        info =(HashMap)(Object) getUserInfo();
        if ((Boolean) info.get("submit")) {
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                md5.update(info.get("password").toString().getBytes());
                String passHash = new BigInteger(1, md5.digest()).toString(16);
                Debug.log("Main.changeCredentials", "validate credentials with the database");
                passed =(boolean)(Object) xmlRpcC.checkUser(info.get("username").toString(), passHash);
                Debug.log("Main.changeCredentials", "write the credentials to file");
                xmlC.writeUserdata(userdataFile, info.get("username").toString(), passHash);
                credentials = passed;
                testVar =(MyHelperClass)(Object) true;
            } catch (Exception ex) {
                System.out.println(ex.toString());
                if (ex.getMessage().toLowerCase().contains("unable")) {
                    JOptionPane.showMessageDialog(null, "Database problem occured, please try again later", "Error", JOptionPane.ERROR_MESSAGE);
                    passed = true;
                    testVar =(MyHelperClass)(Object) false;
                } else {
                    passed = Boolean.parseBoolean(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Invallid userdata, try again", "Invallid userdata", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            if (new File((String)(Object)userdataFile).exists()) {
                testVar =(MyHelperClass)(Object) true;
                credentials = true;
            } else {
                testVar =(MyHelperClass)(Object) false;
                JOptionPane.showMessageDialog(null, "No userdata was entered\nNo tests will be executed until you enter them ", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            passed = true;
        }
        while (!passed) {
            Debug.log("Main.changeCredentials", "show dialog for userinfo");
            info =(HashMap)(Object) getUserInfo();
            if ((Boolean) info.get("submit")) {
                try {
                    MessageDigest md5 = MessageDigest.getInstance("MD5");
                    md5.update(info.get("password").toString().getBytes());
                    String passHash = new BigInteger(1, md5.digest()).toString(16);
                    Debug.log("Main.changeCredentials", "validate credentials with the database");
                    passed =(boolean)(Object) xmlRpcC.checkUser(info.get("username").toString(), passHash);
                    Debug.log("Main.changeCredentials", "write credentials to local xml file");
                    xmlC.writeUserdata(userdataFile, info.get("username").toString(), passHash);
                    credentials = passed;
                    testVar =(MyHelperClass)(Object) true;
                } catch (Exception ex) {
                    Debug.log("Main.changeCredentials", "credential validation failed");
                    passed = Boolean.parseBoolean(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Invallid userdata, try again", "Invallid userdata", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (new File((String)(Object)userdataFile).exists()) {
                    testVar =(MyHelperClass)(Object) true;
                    credentials = true;
                } else {
                    testVar =(MyHelperClass)(Object) false;
                    JOptionPane.showMessageDialog(null, "No userdata was entered\nNo tests will be executed untill u enter them ", "Warning", JOptionPane.ERROR_MESSAGE);
                }
                passed = true;
            }
        }
        return credentials;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass checkUser(String o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass writeUserdata(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass log(String o0, String o1){ return null; }}
