import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11507466 {
public MyHelperClass username;
	public MyHelperClass voteId;
	public MyHelperClass title;
	public MyHelperClass choices;
	public MyHelperClass question;

    public void PollSetMessage(String username, String question, String title, String[] choices)  throws Throwable {
        this.username =(MyHelperClass)(Object) username;
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        String id = username + String.valueOf(System.nanoTime());
        m.update(id.getBytes(), 0, id.length());
        voteId = (MyHelperClass)(Object)new BigInteger(1, m.digest()).toString(16);
        this.question =(MyHelperClass)(Object) question;
        this.title =(MyHelperClass)(Object) title;
        this.choices =(MyHelperClass)(Object) choices;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
