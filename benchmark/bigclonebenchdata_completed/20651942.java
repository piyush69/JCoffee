import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20651942 {

    public synchronized void receive(MessageEvent e)  throws Throwable {
        switch(e.message.getType()) {
            MyHelperClass MessageTypes = new MyHelperClass();
            case MessageTypes.QUIT:
                MyHelperClass activeSessions = new MyHelperClass();
                activeSessions--;
                break;
            MyHelperClass MessageTypes = new MyHelperClass();
            case MessageTypes.SHUTDOWN_SERVER:
                MyHelperClass activeSessions = new MyHelperClass();
                activeSessions--;
                if (password.trim().equals("")) {
                    System.err.println("No default password set. Shutdown not allowed.");
                    break;
                }
                if (e.message.get("pwhash") == null) {
                    System.err.println("Shutdown message without password received. Shutdown not allowed.");
                    break;
                }
                try {
                    java.security.MessageDigest hash = java.security.MessageDigest.getInstance("SHA-1");
                    hash.update(password.getBytes("UTF-8"));
                    if (!java.security.MessageDigest.isEqual(hash.digest(), (byte[]) e.message.get("pwhash"))) {
                        System.err.println("Wrong shutdown password. Shutdown not allowed.");
                        break;
                    } else {
                        System.out.println("Valid shutdown password received.");
                    }
                } catch (java.security.NoSuchAlgorithmException ex) {
                    System.err.println("Password hash algorithm SHA-1 not supported by runtime.");
                    break;
                } catch (UnsupportedEncodingException ex) {
                    System.err.println("Password character encoding not supported.");
                    break;
                } catch (Exception ex) {
                    System.err.println("Unhandled exception occured. Shutdown aborted. Details:");
                    ex.printStackTrace(System.err);
                    break;
                }
                MyHelperClass activeSessions = new MyHelperClass();
                if (activeSessions == 0) tStop(); else System.err.println("there are other active sessions - shutdown failed");
                break;
            default:
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageEvent {

}
