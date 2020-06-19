import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9103010 {
public MyHelperClass txtNome;
	public MyHelperClass config;
public MyHelperClass txtPwd;
	public MyHelperClass Msg;
	public MyHelperClass nomeRicetta;
	public MyHelperClass jTree2;
	public MyHelperClass xml;
	public MyHelperClass Utils;
	public MyHelperClass txtUser;
	public MyHelperClass reloadTree(){ return null; }
	public MyHelperClass doDefaultCloseAction(){ return null; }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if ((this.jTree2.getSelectionPath() == null) || !((StyleTreeNode)(Object)this.jTree2.getSelectionPath().getLastPathComponent() instanceof StyleTreeNode)) {
            Msg.showMsg("Devi selezionare lo stile sotto il quale caricare la ricetta!", this);
            return;
        }
        if ((this.txtUser.getText() == null) || ((int)(Object)this.txtUser.getText().length() == 0)) {
            Msg.showMsg("Il nome utente è obbligatorio!", this);
            return;
        }
        if ((this.txtPwd.getPassword() == null) || ((int)(Object)this.txtPwd.getPassword().length == 0)) {
            Msg.showMsg("La password è obbligatoria!", this);
            return;
        }
        this.nomeRicetta = this.txtNome.getText();
        if ((this.nomeRicetta == null) || ((int)(Object)this.nomeRicetta.length() == 0)) {
            Msg.showMsg("Il nome della ricetta è obbligatorio!", this);
            return;
        }
        StyleTreeNode node = null;
        if ((StyleTreeNode)(Object)this.jTree2.getSelectionPath().getLastPathComponent() instanceof StyleTreeNode) {
            node = (StyleTreeNode)(StyleTreeNode)(Object) this.jTree2.getSelectionPath().getLastPathComponent();
        }
        try {
            String data = URLEncoder.encode("nick", "UTF-8") + "=" + URLEncoder.encode((String)(Object)this.txtUser.getText(), "UTF-8");
            data += "&" + URLEncoder.encode("pwd", "UTF-8") + "=" + URLEncoder.encode(new String((String)(Object)this.txtPwd.getPassword()), "UTF-8");
            data += "&" + URLEncoder.encode("id_stile", "UTF-8") + "=" + URLEncoder.encode((String)(Object)node.getIdStile(), "UTF-8");
            data += "&" + URLEncoder.encode("nome_ricetta", "UTF-8") + "=" + URLEncoder.encode((String)(Object)this.nomeRicetta, "UTF-8");
            data += "&" + URLEncoder.encode("xml_ricetta", "UTF-8") + "=" + URLEncoder.encode((String)(Object)this.xml, "UTF-8");
            URL url = new URL("http://" + config.getRemoteServer() + "/upload_ricetta.asp?" + data);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            String str = "";
            while ((line = rd.readLine()) != null) {
                str += line;
            }
            rd.close();
            Msg.showMsg(str, this);
            doDefaultCloseAction();
        } catch (Exception e) {
            Utils.showException(e, "Errore in upload", this);
        }
        reloadTree();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getRemoteServer(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass showMsg(String o0, c9103010 o1){ return null; }
	public MyHelperClass getLastPathComponent(){ return null; }
	public MyHelperClass showException(Exception o0, String o1, c9103010 o2){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getSelectionPath(){ return null; }}

class StyleTreeNode {

public MyHelperClass getIdStile(){ return null; }}
