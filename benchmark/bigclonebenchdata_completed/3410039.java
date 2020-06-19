import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3410039 {
public MyHelperClass NewGenMain;
public MyHelperClass chronoid_libid;
	public MyHelperClass dtmSearch;

    public void fillTableValues()  throws Throwable {
        java.util.ArrayList cpool =(ArrayList)(Object) NewGenMain.getAppletInstance().getCataloguingPool();
        MyHelperClass AdministrationXMLGenerator = new MyHelperClass();
        String xmlreq =(String)(Object) AdministrationXMLGenerator.getInstance().getPoolChronologicalSubDivision("4", cpool);
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
            java.util.List onelist =(List)(Object) rootelement.getChildren();
            for (int i = 0; i < onelist.size(); i++) {
                Element rec = (Element) onelist.get(i);
                Object[] r = new Object[7];
                String[] chronolib = new String[2];
                chronolib[0] =(String)(Object) rec.getChild("ChronologicalSubDivisionId").getText();
                chronolib[1] =(String)(Object) rec.getChild("LibraryId").getText();
                this.chronoid_libid.add(chronolib);
                r[0] = rec.getChild("ChronologicalSubDivision").getText();
                this.dtmSearch.addRow(r);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass addRow(Object[] o0){ return null; }
	public MyHelperClass getCataloguingPool(){ return null; }
	public MyHelperClass add(String[] o0){ return null; }
	public MyHelperClass getAppletInstance(){ return null; }
	public MyHelperClass getPoolChronologicalSubDivision(String o0, ArrayList o1){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getChildren(){ return null; }
	public MyHelperClass getChild(String o0){ return null; }}
