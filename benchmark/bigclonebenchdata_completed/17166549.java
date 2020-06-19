import java.io.*;
import java.lang.*;
import java.util.*;



class c17166549 {
public static MyHelperClass JOptionPane;
public static MyHelperClass remoteHost;
public static MyHelperClass remoteUser;
//	public MyHelperClass JOptionPane;
	public static MyHelperClass Util;
//	public MyHelperClass remoteHost;
//public MyHelperClass Util;
//	public MyHelperClass remoteUser;

    private static void userAuth(String challenge) throws IOException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("BrokenMD4");
            String passwd = null;
            if (System.getProperty("jarsync.password.gui") != null) {
                JPasswordField pass = new JPasswordField();
                JPanel panel = new JPanel(new GridLayout(2, 1));
                panel.add((JPasswordField)(Object)new JLabel("Password:"));
                panel.add(pass);
                MyHelperClass remoteUser = new MyHelperClass();
                JOptionPane.showMessageDialog(null, panel,(char)(Object) remoteUser + '@' + (int)(Object)remoteHost + "'s Password", JOptionPane.QUESTION_MESSAGE);
                passwd = new String((String)(Object)pass.getPassword());
            } else {
                MyHelperClass remoteUser = new MyHelperClass();
                System.out.print((char)(Object)remoteUser + '@' + (int)(Object)remoteHost + "'s password: ");
                MyHelperClass Util = new MyHelperClass();
                passwd =(String)(Object) Util.readLine(System.in);
                System.out.println();
            }
            md.update(new byte[4]);
            md.update(passwd.getBytes("US-ASCII"));
            md.update(challenge.getBytes("US-ASCII"));
            byte[] response =(byte[])(Object) md.digest();
            MyHelperClass out = new MyHelperClass();
            Util.writeASCII(out, remoteUser + " " + Util.base64(response) + '\n');
//            MyHelperClass out = new MyHelperClass();
            out.flush();
        } catch (UncheckedIOException nsae) {
            throw new IOException("could not create message digest.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass QUESTION_MESSAGE;
public MyHelperClass readLine(InputStream o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeASCII(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(Object o0, JPanel o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass base64(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class JPasswordField {

public MyHelperClass getPassword(){ return null; }}

class JPanel {

JPanel(){}
	JPanel(GridLayout o0){}
	public MyHelperClass add(JPasswordField o0){ return null; }}

class GridLayout {

GridLayout(int o0, int o1){}
	GridLayout(){}}

class JLabel {

JLabel(){}
	JLabel(String o0){}}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
