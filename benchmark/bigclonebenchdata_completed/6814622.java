import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6814622 {
public MyHelperClass NULL;
public MyHelperClass W;
	public MyHelperClass serverNameTF;
	public MyHelperClass emptyCB;
	public MyHelperClass bridgeOutIPTF;
	public MyHelperClass roomFileTF;
	public MyHelperClass rmiregistryCB;
	public MyHelperClass bridgeConfFileTF;
	public MyHelperClass bridgeInIPTF;
	public MyHelperClass clientClassCB;
	public MyHelperClass bridgeCB;
	public MyHelperClass saveConfiguration(){ return null; }
	public MyHelperClass makeDefaultConfiguration(){ return null; }
	public MyHelperClass bbb(String o0){ return null; }
	public MyHelperClass packAndShow(){ return null; }

    protected void loadConfigure()  throws Throwable {
        try {
            String confFile =(String)(Object) NULL; //new String();
            confFile = System.getProperty("user.home");
//            MyHelperClass confFile = new MyHelperClass();
            confFile = confFile + W.sepa + ".elm" + W.sepa + "vesma.conf";
//            MyHelperClass confFile = new MyHelperClass();
            URL url =(URL)(Object) W.getResource((MyHelperClass)(Object)confFile);
            InputStream is = url.openStream();
            MyHelperClass confDoc = new MyHelperClass();
            confDoc = W.loadDocumentFromInputStreamDOM(is);
//            MyHelperClass confDoc = new MyHelperClass();
            Element e =(Element)(Object) confDoc.getDocumentElement();
            MyHelperClass W = new MyHelperClass();
            Element ee =(Element)(Object) W.getChildByTagNameDOM(e, "rmiregistry");
//            MyHelperClass W = new MyHelperClass();
            String s =(String)(Object) W.getAttrDataDOM(ee, "enable");
            rmiregistryCB.setSelected(bbb(s));
            s =(String)(Object) W.getDataDOM(e, "serverName");
            serverNameTF.setText(s);
            ee =(Element)(Object) W.getChildByTagNameDOM(e, "clients");
            Element eee = null;
            ArrayList<String> tmpAl = new ArrayList<String>();
            String defaultClient = null;
            ArrayList al =(ArrayList)(Object) W.getChildrenByTagNameDOM(ee, "client");
            Iterator i = al.iterator();
            while (i.hasNext()) {
                eee = (Element) i.next();
                String clientString =(String)(Object) W.getDataDOM(eee);
                tmpAl.add(clientString);
                String defaultString =(String)(Object) W.getAttrDataDOM(eee, "default");
                if (defaultString.equals("true")) {
                    defaultClient = clientString;
                }
            }
            String ss[] = (String[]) tmpAl.toArray(new String[0]);
            clientClassCB.removeAllItems();
            for (int ii = 0; ii < ss.length; ii++) clientClassCB.addItem(ss[ii]);
            clientClassCB.setSelectedItem(defaultClient);
            ee =(Element)(Object) W.getChildByTagNameDOM(e, "loadVE");
            s =(String)(Object) W.getAttrDataDOM(ee, "enable");
            emptyCB.setSelected((boolean)(Object)(MyHelperClass)(Object)(boolean)(Object)(MyHelperClass)(Object)(boolean)(Object)(MyHelperClass)(Object)(boolean)(Object)(MyHelperClass)(Object)(boolean)(Object)bbb(s) == false);
            s =(String)(Object) W.getAttrDataDOM(ee, "file");
            roomFileTF.setText(s);
            ee =(Element)(Object) W.getChildByTagNameDOM(e, "elmBridge");
            s =(String)(Object) W.getAttrDataDOM(ee, "enable");
            bridgeCB.setSelected(bbb(s));
            s =(String)(Object) W.getAttrDataDOM(ee, "confFile");
            bridgeConfFileTF.setText(s);
            ee =(Element)(Object) W.getChildByTagNameDOM(e, "outIPAddress");
            s =(String)(Object) W.getDataDOM(ee);
            bridgeOutIPTF.setText(s);
            bridgeInIPTF.setText((String)(Object)W.getIPAddress());
        } catch (Exception ee) {
            makeDefaultConfiguration();
            saveConfiguration();
            System.out.println("A default config file was created.");
        }
        packAndShow();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass sepa;
public MyHelperClass getResource(MyHelperClass o0){ return null; }
	public MyHelperClass getDataDOM(Element o0, String o1){ return null; }
	public MyHelperClass getChildByTagNameDOM(Element o0, String o1){ return null; }
	public MyHelperClass getChildrenByTagNameDOM(Element o0, String o1){ return null; }
	public MyHelperClass addItem(String o0){ return null; }
	public MyHelperClass getDataDOM(Element o0){ return null; }
	public MyHelperClass getDocumentElement(){ return null; }
	public MyHelperClass removeAllItems(){ return null; }
	public MyHelperClass setSelected(MyHelperClass o0){ return null; }
	public MyHelperClass getIPAddress(){ return null; }
	public MyHelperClass loadDocumentFromInputStreamDOM(InputStream o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setSelectedItem(String o0){ return null; }
	public MyHelperClass getAttrDataDOM(Element o0, String o1){ return null; }}

class Element {

}
