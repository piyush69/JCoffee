import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8938878 {
public MyHelperClass presentineditor;
	public MyHelperClass dlm1;
	public MyHelperClass glosf;
	public MyHelperClass dlm2;
	public MyHelperClass hashtable;
	public MyHelperClass tftag;
	public MyHelperClass CataloguingXMLGenerator;

    public void setInitialValues(String Tag, Vector subfields)  throws Throwable {
        this.tftag.setText(Tag);
        presentineditor =(MyHelperClass)(Object) new ArrayList();
        this.glosf =(MyHelperClass)(Object) subfields;
        for (int i = 0; i < subfields.size(); i++) {
            this.dlm2.addElement(subfields.elementAt(i).toString().trim());
            presentineditor.add(subfields.elementAt(i).toString().trim());
        }
        String xmlreq =(String)(Object) CataloguingXMLGenerator.getInstance().getSubFieldsRepeat("5", Tag);
        try {
            java.net.URL url = new java.net.URL(ResourceBundle.getBundle("Administration").getString("ServerURL") + ResourceBundle.getBundle("Administration").getString("ServletSubPath") + "MarcDictionaryServlet");
            java.net.URLConnection urlconn = (java.net.URLConnection) url.openConnection();
            urlconn.setDoOutput(true);
            java.io.OutputStream dos = urlconn.getOutputStream();
            dos.write(xmlreq.getBytes());
            java.io.InputStream ios = urlconn.getInputStream();
            SAXBuilder saxb = new SAXBuilder();
            Document retdoc =(Document)(Object) saxb.build(ios);
            Element retroot =(Element)(Object) retdoc.getRootElement();
            hashtable =(MyHelperClass)(Object) new Hashtable();
            List list =(List)(Object) retroot.getChildren();
            System.out.println("Point of execution came here " + list.size());
            for (int i = 0; i < list.size(); i++) {
                List chilist =(List)(Object) ((Element) list.get(i)).getChildren();
                hashtable.put(((Element) chilist.get(0)).getText().trim(), ((Element) chilist.get(1)).getText().trim());
            }
            System.out.println(hashtable);
            Enumeration keys =(Enumeration)(Object) hashtable.keys();
            while (keys.hasMoreElements()) this.dlm1.addElement(keys.nextElement());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass addElement(Object o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass keys(){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getSubFieldsRepeat(String o0, String o1){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getChildren(){ return null; }
	public MyHelperClass getText(){ return null; }}
