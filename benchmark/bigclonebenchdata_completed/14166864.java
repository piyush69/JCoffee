import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14166864 {
public MyHelperClass JOptionPane;
public MyHelperClass path;
	public MyHelperClass _model;
	public MyHelperClass getURL(){ return null; }

    private void send(java.awt.event.ActionEvent evt) {
        String url =(String)(Object) this.getURL();
        if (url != null) {
            String tinyurl = "";
            try {
                URLConnection conn = new URL("http://tinyurl.com/api-create.php?url=" + url).openConnection();
                conn.setDoInput(true);
                conn.connect();
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                tinyurl = br.readLine();
            } catch (SocketTimeoutException ste) {
                ste.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            String addresses = (String)(String)(Object) this._model.getElementAt(0);
            for (int i = 1; i < (int)(Object)this._model.getSize(); i++) addresses += "," + (String)(String)(Object) this._model.getElementAt(i);
            SendDialog dialog = new SendDialog("Web Image Browser view", "To view, click the URL below\n\n" + url + "\n\n" + ((tinyurl != null) ? ("or\n\n" + tinyurl) : ""), addresses);
            dialog.setVisible(true);
        } else JOptionPane.showMessageDialog(this, "<html><center>" + "Sorry, but the file in<br>" + "\"" + this.path.getText() + "\"<br>" + "doesn't seem to be a valid " + "WIBShare-able file." + "</center></html>", "WIBShare Error", JOptionPane.ERROR_MESSAGE);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getElementAt(int o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass showMessageDialog(c14166864 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getSize(){ return null; }}

class SendDialog {

SendDialog(String o0, String o1, String o2){}
	SendDialog(){}
	public MyHelperClass setVisible(boolean o0){ return null; }}
