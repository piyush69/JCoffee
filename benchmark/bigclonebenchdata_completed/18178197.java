import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18178197 {
public MyHelperClass directoryURLField;
	public MyHelperClass RDS_RESOURCE;
	public MyHelperClass PROTOTYPE_TYPE;
	public MyHelperClass directoryPrincipalField;
	public MyHelperClass directoryCredentialsField;
	public MyHelperClass prototypeURLField;

    private void publish()  throws Throwable {
        MyHelperClass uploadPrototypeBox = new MyHelperClass();
        if ((boolean)(Object)uploadPrototypeBox.isSelected()) {
            try {
                MyHelperClass prototypeURLField = new MyHelperClass();
                URL url = new URL((String)(Object)prototypeURLField.getText());
//                MyHelperClass prototypeURLField = new MyHelperClass();
                prototypeURLField.recordText();
                PrintStream ps;
                HttpURLConnection huc = null;
                if (url.getProtocol().equals("file")) {
                    ps = new PrintStream(new FileOutputStream(url.getFile()));
                } else {
                    URLConnection urlc = url.openConnection();
                    urlc.setDoOutput(true);
                    if (urlc instanceof HttpURLConnection) {
                        huc = ((HttpURLConnection) urlc);
                        huc.setRequestMethod("PUT");
                    }
                    ps = new PrintStream(urlc.getOutputStream());
                }
                MyHelperClass target = new MyHelperClass();
                target.writePrototype(ps);
                if (huc != null) {
                    huc.getResponseCode();
                }
            } catch (Exception e) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(this, e, "Error Uploading Prototype", JOptionPane.ERROR_MESSAGE);
            }
        }
        MyHelperClass postMetadataBox = new MyHelperClass();
        if ((boolean)(Object)postMetadataBox.isSelected()) {
            try {
                Hashtable env = new Hashtable();
                MyHelperClass Context = new MyHelperClass();
                env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//                MyHelperClass Context = new MyHelperClass();
                env.put(Context.PROVIDER_URL, directoryURLField.getText());
//                MyHelperClass Context = new MyHelperClass();
                env.put(Context.SECURITY_PRINCIPAL, directoryPrincipalField.getText());
//                MyHelperClass Context = new MyHelperClass();
                env.put(Context.SECURITY_CREDENTIALS, directoryCredentialsField.getText());
                InitialDirContext dirContext = new InitialDirContext(env);
                MyHelperClass Preferences = new MyHelperClass();
                Preferences prefs =(Preferences)(Object) Preferences.userNodeForPackage(getClass());
                MyHelperClass directoryURLField = new MyHelperClass();
                prefs.put("directoryURL",(String)(Object) directoryURLField.getText());
                MyHelperClass directoryPrincipalField = new MyHelperClass();
                prefs.put("directoryPrincipal",(String)(Object) directoryPrincipalField.getText());
                MyHelperClass directoryCredentialsField = new MyHelperClass();
                prefs.put("directoryCredentials",(String)(Object) directoryCredentialsField.getText());
                BasicAttributes attr = new BasicAttributes();
                MyHelperClass OBJECT_CLASS = new MyHelperClass();
                attr.put((String)(Object)OBJECT_CLASS,(String)(Object) RDS_RESOURCE);
                MyHelperClass CONTENT_TYPE = new MyHelperClass();
                attr.put((String)(Object)CONTENT_TYPE,(String)(Object) PROTOTYPE_TYPE);
//                MyHelperClass uploadPrototypeBox = new MyHelperClass();
                if ((boolean)(Object)uploadPrototypeBox.isSelected()) {
                    MyHelperClass IMPLEMENTATION_URL = new MyHelperClass();
                    attr.put((String)(Object)IMPLEMENTATION_URL,(String)(Object) prototypeURLField.getText());
                }
                MyHelperClass attributesTable = new MyHelperClass();
                DefaultTableModel dtm = (DefaultTableModel)(DefaultTableModel)(Object) attributesTable.getModel();
                Preferences attrPrefs =(Preferences)(Object) prefs.node("attributes");
                for (int i = 0; i < (int)(Object)dtm.getRowCount(); i++) {
                    attr.put((String)(String)(Object) dtm.getValueAt(i, 0), (String)(String)(Object) dtm.getValueAt(i, 1));
                    attrPrefs.put((String)(String)(Object) dtm.getValueAt(i, 0), (String)(String)(Object) dtm.getValueAt(i, 1));
                }
                NameParser np =(NameParser)(Object) dirContext.getNameParser("");
                MyHelperClass prototypeNameField = new MyHelperClass();
                Enumeration comps = (Enumeration)(Object)new ResourceName(prototypeNameField.getText()).getAll();
//                MyHelperClass prototypeNameField = new MyHelperClass();
                prototypeNameField.recordText();
                Name resourcedn =(Name)(Object) np.parse("");
                while (comps.hasMoreElements()) {
                    MyHelperClass RC = new MyHelperClass();
                    resourcedn.add(RC + "=" + (String) comps.nextElement());
                    try {
                        dirContext.createSubcontext(resourcedn);
                    } catch (ArithmeticException nabe) {
                    }
                }
                MyHelperClass DirContext = new MyHelperClass();
                dirContext.modifyAttributes(resourcedn, DirContext.REPLACE_ATTRIBUTE, attr);
            } catch (Exception e) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(this, e, "Error Posting Metadata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass REPLACE_ATTRIBUTE;
	public MyHelperClass SECURITY_PRINCIPAL;
	public MyHelperClass INITIAL_CONTEXT_FACTORY;
	public MyHelperClass PROVIDER_URL;
	public MyHelperClass SECURITY_CREDENTIALS;
	public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getModel(){ return null; }
	public MyHelperClass isSelected(){ return null; }
	public MyHelperClass recordText(){ return null; }
	public MyHelperClass showMessageDialog(c18178197 o0, Exception o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass writePrototype(PrintStream o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass userNodeForPackage(Class o0){ return null; }}

class InitialDirContext {

InitialDirContext(Hashtable o0){}
	InitialDirContext(){}
	public MyHelperClass getNameParser(String o0){ return null; }
	public MyHelperClass createSubcontext(Name o0){ return null; }
	public MyHelperClass modifyAttributes(Name o0, MyHelperClass o1, BasicAttributes o2){ return null; }}

class Preferences {

public MyHelperClass node(String o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class BasicAttributes {

public MyHelperClass put(String o0, String o1){ return null; }}

class DefaultTableModel {

public MyHelperClass getRowCount(){ return null; }
	public MyHelperClass getValueAt(int o0, int o1){ return null; }}

class NameParser {

public MyHelperClass parse(String o0){ return null; }}

class ResourceName {

ResourceName(MyHelperClass o0){}
	ResourceName(){}
	public MyHelperClass getAll(){ return null; }}

class Name {

public MyHelperClass add(String o0){ return null; }}

class NameAlreadyBoundException extends Exception{
	public NameAlreadyBoundException(String errorMessage) { super(errorMessage); }
}
