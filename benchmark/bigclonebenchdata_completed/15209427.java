import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15209427 {
public MyHelperClass AdministrationXMLGenerator;
public MyHelperClass NewGenMain;
public MyHelperClass tfGeneralSubDivision;
	public MyHelperClass showWarningMessage(String o0){ return null; }
	public MyHelperClass showInformationMessage(String o0){ return null; }
	public MyHelperClass showErrorMessage(String o0){ return null; }

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.tfGeneralSubDivision.getText().trim().equals("")) {
            this.showWarningMessage("Enter general sub division");
        } else {
            String[] patlib =(String[])(Object) NewGenMain.getAppletInstance().getPatronLibraryIds();
            String xmlreq =(String)(Object) AdministrationXMLGenerator.getInstance().saveGeneralSubDivision("1", this.tfGeneralSubDivision.getText(), patlib);
            System.out.println(xmlreq);
            try {
                java.net.URL url = new java.net.URL(ResourceBundle.getBundle("Administration").getString("ServerURL") + ResourceBundle.getBundle("Administration").getString("ServletSubPath") + "SubDivisionServlet");
                java.net.URLConnection urlconn = (java.net.URLConnection) url.openConnection();
                urlconn.setDoOutput(true);
                java.io.OutputStream dos = urlconn.getOutputStream();
                dos.write(xmlreq.getBytes());
                java.io.InputStream ios = urlconn.getInputStream();
                SAXBuilder saxb = new SAXBuilder();
                Document retdoc =(Document)(Object) saxb.build(ios);
                Element rootelement =(Element)(Object) retdoc.getRootElement();
                if (rootelement.getChild("Error") == null) {
                    this.showInformationMessage(ResourceBundle.getBundle("Administration").getString("DataSavedInDatabase"));
                } else {
                    this.showErrorMessage(ResourceBundle.getBundle("Administration").getString("ErrorPleaseContactTheVendor"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getPatronLibraryIds(){ return null; }
	public MyHelperClass saveGeneralSubDivision(String o0, MyHelperClass o1, String[] o2){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass getAppletInstance(){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getChild(String o0){ return null; }}
