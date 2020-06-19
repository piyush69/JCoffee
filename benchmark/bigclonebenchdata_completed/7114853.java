import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7114853 {
public MyHelperClass mRepository;
	public MyHelperClass mStream;
	public MyHelperClass Hex;
	public MyHelperClass mChallenge;
	public MyHelperClass isQuit(String o0){ return null; }
	public MyHelperClass isCommand(String o0, String o1){ return null; }

    private MailBox authenticate() throws Throwable, Exception {
        MyHelperClass mChallenge = new MyHelperClass();
        String line = "POP3 Server Ready" + ((mChallenge == null) ? "" : (" " + mChallenge));
        MailBox mailbox = null;
        MyHelperClass mStream = new MyHelperClass();
        mStream.writeOk(line);
        while (mailbox == null) {
//            MyHelperClass mStream = new MyHelperClass();
            line =(String)(Object) mStream.readLine();
            if ((boolean)(Object)isQuit(line)) break;
            String body;
            if ((body =(String)(Object) isCommand(line, "USER")) != null) {
                String user = body;
                MailBox mb =(MailBox)(Object) mRepository.getMailBox(user);
                if (mb == null) mStream.writeErr("No mailbox for: " + line); else {
                    mStream.writeOk();
                    String pswd, line2 =(String)(Object) mStream.readLine();
                    if ((boolean)(Object)isQuit(line2)) break;
                    if ((pswd =(String)(Object) isCommand(line2, "PASS")) == null) mStream.writeErr("Expected PASS but got {" + line2 + "}"); else {
                        String realPswd =(String)(Object) mb.getPassword();
                        if ((realPswd != null) ? pswd.equals(realPswd) : mb.checkPassword(pswd)) {
                            mailbox = mb;
                            mStream.writeOk();
                        } else mStream.writeErr("Bad password for " + user);
                    }
                }
            } else if ((body =(String)(Object) isCommand(line, "APOP")) != null) {
                if (mChallenge == null) mStream.writeErr("APOP Not Supported"); else {
                    int space = body.indexOf(' ');
                    if (space < 0) mStream.writeErr("Bad APOP command {" + line + "}"); else {
                        String user = body.substring(0, space);
                        String hash = body.substring(space + 1);
                        MailBox mb =(MailBox)(Object) mRepository.getMailBox(user);
                        if (mb == null) mStream.writeErr("No mailbox for: " + line); else if (mb.getPassword() == null) mStream.writeErr("User(" + user + ") cannot login using APOP"); else {
                            String secret =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) mChallenge + (int)(Object)mb.getPassword();
                            MessageDigest md5 = MessageDigest.getInstance("MD5");
                            md5.update(secret.getBytes("UTF-8"));
                            byte[] digest = md5.digest();
                            String digestStr = new String((String)(Object)Hex.encodeHex(digest));
                            if (hash.equalsIgnoreCase(digestStr)) {
                                mailbox = mb;
                                mStream.writeOk();
                            } else mStream.writeErr("Bad password for " + user);
                        }
                    }
                }
            } else mStream.writeErr("Authentication required (got '" + line + "')");
        }
        return mailbox;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeErr(String o0){ return null; }
	public MyHelperClass writeOk(){ return null; }
	public MyHelperClass writeOk(String o0){ return null; }
	public MyHelperClass encodeHex(byte[] o0){ return null; }
	public MyHelperClass getMailBox(String o0){ return null; }
	public MyHelperClass readLine(){ return null; }}

class MailBox {

public MyHelperClass checkPassword(String o0){ return null; }
	public MyHelperClass getPassword(){ return null; }}
