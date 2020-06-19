import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c375390 {
public MyHelperClass NULL;
public MyHelperClass replaceComponent(MyHelperClass o0){ return null; }
public MyHelperClass connectionPassword;
	public MyHelperClass connected;
	public MyHelperClass SwingUtilities;
	public MyHelperClass si;
	public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass restore(){ return null; }
	public MyHelperClass saveData(String o0, int o1){ return null; }
	public MyHelperClass showErrorMessage(c375390 o0, String o1){ return null; }

    public void connected(String address, int port)  throws Throwable {
        boolean connected = NULL; //new boolean();
        connected = true;
        try {
            MyHelperClass localConnection = new MyHelperClass();
            if ((boolean)(Object)localConnection) {
                byte key[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
                MyHelperClass si = new MyHelperClass();
                si.setEncryptionKey(key);
            } else {
                saveData(address, port);
                MessageDigest mds = MessageDigest.getInstance("SHA");
                mds.update((byte)(Object)connectionPassword.getBytes("UTF-8"));
                si.setEncryptionKey(mds.digest());
            }
            if (!(Boolean)(Object)si.login(username, password)) {
                si.disconnect();
                connected =(boolean)(Object)(MyHelperClass)(Object) false;
                showErrorMessage(this, "Authentication Failure");
                restore();
                return;
            }
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    MyHelperClass connectionLabel = new MyHelperClass();
                    connectionLabel.setText("");
                    MyHelperClass progressLabel = new MyHelperClass();
                    progressLabel = new JLabel("Loading... Please wait.");
//                    MyHelperClass progressLabel = new MyHelperClass();
                    progressLabel.setOpaque(true);
                    MyHelperClass Color = new MyHelperClass();
                    progressLabel.setBackground(Color.white);
//                    MyHelperClass progressLabel = new MyHelperClass();
                    replaceComponent(progressLabel);
                    MyHelperClass cancelButton = new MyHelperClass();
                    cancelButton.setEnabled(true);
                    MyHelperClass helpButton = new MyHelperClass();
                    MyHelperClass xx = new MyHelperClass();
                    xx.remove(helpButton);
                }
            });
        } catch (Exception e) {
            System.out.println("connected: Exception: " + e + "\r\n");
        }
        ;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass white;
public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass setEncryptionKey(byte[] o0){ return null; }
	public MyHelperClass setOpaque(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass invokeLater(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass remove(MyHelperClass o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass invokeLater(<anonymous Runnable> o0){ return null; }}

class JLabel {

JLabel(String o0){}
	JLabel(){}}
