import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13281981 {
public MyHelperClass NewGenMain;
	public MyHelperClass AdministrationXMLGenerator;
public MyHelperClass uniformtitlepanel;
	public MyHelperClass showErrorMessage(String o0){ return null; }
	public MyHelperClass showInformationMessage(String o0){ return null; }

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {
        Vector vret =(Vector)(Object) this.uniformtitlepanel.getEnteredValuesKeys();
        String[] patlib =(String[])(Object) NewGenMain.getAppletInstance().getPatronLibraryIds();
        String xmlreq =(String)(Object) AdministrationXMLGenerator.getInstance().saveUniformTitleSH("2", vret, patlib);
        System.out.println(xmlreq);
        try {
            java.net.URL url = new java.net.URL(ResourceBundle.getBundle("Administration").getString("ServerURL") + ResourceBundle.getBundle("Administration").getString("ServletSubPath") + "UniformTitleSubjectHeadingServlet");
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

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass saveUniformTitleSH(String o0, Vector o1, String[] o2){ return null; }
	public MyHelperClass getEnteredValuesKeys(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getPatronLibraryIds(){ return null; }
	public MyHelperClass getAppletInstance(){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getChild(String o0){ return null; }}
