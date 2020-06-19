import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9860859 {
public MyHelperClass localUUIDList;
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getDbServ(){ return null; }

//    @Override
    public boolean identification(String username, String password) {
        this.getLogger().info(DbUserServiceImpl.class, ">>>identification " + username + "<<<");
        try {
            IFeelerUser user =(IFeelerUser)(Object) this.getDbServ().queryFeelerUser(username);
            if (user == null) {
                return false;
            }
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            if (user.getPassword().equals(new String(md5.digest()))) {
                if (!(Boolean)(Object)this.localUUIDList.contains(user.getUuid())) {
                    this.localUUIDList.add(user.getUuid());
                }
                return true;
            } else {
                return false;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass queryFeelerUser(String o0){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass info(Class<DbUserServiceImpl> o0, String o1){ return null; }}

class DbUserServiceImpl {

}

class IFeelerUser {

public MyHelperClass getUuid(){ return null; }
	public MyHelperClass getPassword(){ return null; }}
