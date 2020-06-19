import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7393510 {
public MyHelperClass password;
public MyHelperClass getWsseHeaderValue(){ return null; }

    public URLConnection getConnection() throws IOException {
        MyHelperClass url = new MyHelperClass();
        URLConnection con =(URLConnection)(Object) url.openConnection();
        con.setConnectTimeout(30 * 1000);
        MyHelperClass username = new MyHelperClass();
        if (username == null || "".equals(username) || password == null || "".equals(password)) return con;
        MyHelperClass wsseMode = new MyHelperClass();
        if ((boolean)(Object)wsseMode) {
            con.setRequestProperty("X-WSSE",(String)(Object) getWsseHeaderValue());
            return con;
        }
        Authenticator.setDefault(new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                PasswordAuthentication auth = null;
                MyHelperClass username = new MyHelperClass();
                MyHelperClass password = new MyHelperClass();
                if (username != null && password != null) {
//                    MyHelperClass username = new MyHelperClass();
//                    MyHelperClass password = new MyHelperClass();
                    auth = new PasswordAuthentication((String)(Object)username,(char[])(Object) password.toCharArray());
                }
                return auth;
            }
        });
        return con;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toCharArray(){ return null; }}
