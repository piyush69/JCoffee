import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21979716 {
public MyHelperClass fileChooser;
	public MyHelperClass JOptionPane;

//    @ActionMethod
    public void download() throws Throwable, IOException {
        final JPanel message = new JPanel(new GridBagLayout());
        final GridBagConstraints gbcLabel = new GridBagConstraints();
        final GridBagConstraints gbcField = new GridBagConstraints();
        gbcLabel.weightx =(MyHelperClass)(Object) 0.0;
        gbcField.weightx =(MyHelperClass)(Object) 1.0;
        MyHelperClass GridBagConstraints = new MyHelperClass();
        gbcField.fill = GridBagConstraints.HORIZONTAL;
        gbcField.insets =(MyHelperClass)(Object) new Insets(2, 2, 2, 2);
        final JTextField deviceField, fullnameField, versionField;
        deviceField = new JTextField();
        fullnameField = new JTextField();
        versionField = new JTextField();
//        MyHelperClass GridBagConstraints = new MyHelperClass();
        gbcField.gridwidth = GridBagConstraints.REMAINDER;
        message.add((JTextField)(Object)new JLabel("device"), gbcLabel);
        message.add(deviceField, gbcField);
        message.add((JTextField)(Object)new JLabel("fullname"), gbcLabel);
        message.add(fullnameField, gbcField);
        message.add((JTextField)(Object)new JLabel("version"), gbcLabel);
        message.add(versionField, gbcField);
        MyHelperClass frame = new MyHelperClass();
        final int result =(int)(Object) JOptionPane.showConfirmDialog(frame, message, "Download parameters", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        MyHelperClass JOptionPane = new MyHelperClass();
        if (result != (int)(Object)JOptionPane.OK_OPTION) {
            return;
        }
        final String device =(String)(Object) deviceField.getText();
        final String fullname =(String)(Object) fullnameField.getText();
        final String version =(String)(Object) versionField.getText();
        MyHelperClass testPort = new MyHelperClass();
        final URL url = new URL("http://127.0.0.1:" + testPort + "/databases/" + fullname + "?device=" + device + "&version=" + version);
        final HttpURLConnection con = (HttpURLConnection) url.openConnection();
        MyHelperClass Http11Header = new MyHelperClass();
        con.setRequestProperty((String)(Object)Http11Header.AUTHORIZATION, "Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==");
//        MyHelperClass Http11Header = new MyHelperClass();
        con.setRequestProperty((String)(Object)Http11Header.WWW_AUTHENTICATE, "Basic realm=\"karatasi\"");
        final InputStream in = con.getInputStream();
        try {
//            MyHelperClass frame = new MyHelperClass();
            final int fileResult =(int)(Object) fileChooser.showSaveDialog(frame);
            MyHelperClass JFileChooser = new MyHelperClass();
            if (fileResult != (int)(Object)JFileChooser.APPROVE_OPTION) {
                return;
            }
            MyHelperClass fileChooser = new MyHelperClass();
            final OutputStream out = new FileOutputStream((String)(Object)fileChooser.getSelectedFile());
            try {
                MyHelperClass Util = new MyHelperClass();
                Util.copy(in, out);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_OPTION;
	public MyHelperClass QUESTION_MESSAGE;
	public MyHelperClass OK_CANCEL_OPTION;
	public MyHelperClass AUTHORIZATION;
	public MyHelperClass REMAINDER;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass HORIZONTAL;
	public MyHelperClass WWW_AUTHENTICATE;
public MyHelperClass showSaveDialog(MyHelperClass o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass showConfirmDialog(MyHelperClass o0, JPanel o1, String o2, MyHelperClass o3, MyHelperClass o4){ return null; }}

class ActionMethod {

}

class JPanel {

JPanel(GridBagLayout o0){}
	JPanel(){}
	public MyHelperClass add(JTextField o0, GridBagConstraints o1){ return null; }}

class GridBagLayout {

}

class GridBagConstraints {
public MyHelperClass gridwidth;
	public MyHelperClass fill;
	public MyHelperClass insets;
	public MyHelperClass weightx;
}

class Insets {

Insets(){}
	Insets(int o0, int o1, int o2, int o3){}}

class JTextField {

public MyHelperClass getText(){ return null; }}

class JLabel {

JLabel(String o0){}
	JLabel(){}}
