import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17761371 {
public MyHelperClass JOptionPane;
public MyHelperClass hide(){ return null; }

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {
        MyHelperClass name = new MyHelperClass();
        if ((int)(Object)name.getText().length() < 3) {
            MyHelperClass comment = new MyHelperClass();
            JOptionPane.showMessageDialog(comment, "Too short name (at least 3)");
            return;
        }
        MyHelperClass comment = new MyHelperClass();
        if ((int)(Object)comment.getText().length() < 10) {
//            MyHelperClass comment = new MyHelperClass();
            JOptionPane.showMessageDialog(comment, "Too short comment (at least 10)");
            return;
        }
        Thread t = new Thread(new Runnable() {

            public void run() {
                try {
                    String data = URLEncoder.encode("send_id", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8");
                    MyHelperClass name = new MyHelperClass();
                    data += "&" + URLEncoder.encode("author", "UTF-8") + "=" + URLEncoder.encode((String)(Object)name.getText(), "UTF-8");
                    data += "&" + URLEncoder.encode("location", "UTF-8") + "=" + URLEncoder.encode(System.getProperty("user.language"), "UTF-8");
                    MyHelperClass email = new MyHelperClass();
                    data += "&" + URLEncoder.encode("contact", "UTF-8") + "=" + URLEncoder.encode((String)(Object)email.getText(), "UTF-8");
                    MyHelperClass comment = new MyHelperClass();
                    data += "&" + URLEncoder.encode("content", "UTF-8") + "=" + URLEncoder.encode((String)(Object)comment.getText(), "UTF-8");
                    MyHelperClass rate = new MyHelperClass();
                    data += "&" + URLEncoder.encode("rate", "UTF-8") + "=" + URLEncoder.encode(rate.getSelectedItem().toString(), "UTF-8");
                    System.out.println(data);
                    URL url = new URL("http://javablock.sourceforge.net/book/index.php");
                    URLConnection conn = url.openConnection();
                    conn.setDoOutput(true);
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                    wr.write(data);
                    wr.flush();
                    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String address = rd.readLine();
                    JPanel panel = new JPanel();
                    panel.add(new JLabel("Comment added"));
                    panel.add(new JTextArea("visit: http://javablock.sourceforge.net/"));
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, new JLabel("Comment sended correctly!"));
                    wr.close();
                    rd.close();
                    hide();
                } catch (IOException ex) {
                    MyHelperClass Level = new MyHelperClass();
                    MyHelperClass Logger = new MyHelperClass();
                    Logger.getLogger(guestBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass showMessageDialog(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, JLabel o1){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class JPanel {

public MyHelperClass add(JTextArea o0){ return null; }
	public MyHelperClass add(JLabel o0){ return null; }}

class JLabel {

JLabel(String o0){}
	JLabel(){}}

class JTextArea {

JTextArea(String o0){}
	JTextArea(){}}

class guestBook {

}
