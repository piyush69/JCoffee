import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20142708 {

    protected void refreshMods(String modsUrl)  throws Throwable {
        while (true) {
            MyHelperClass mnMods = new MyHelperClass();
            JMenuItem mi =(JMenuItem)(Object) mnMods.getItem((int)(Object)mnMods.getItemCount() - 1);
            if (mi == null) break;
//            MyHelperClass mnMods = new MyHelperClass();
            mnMods.remove((int)(Object)mnMods.getItemCount() - 1);
        }
        try {
            MyHelperClass log = new MyHelperClass();
            log.info("Loading mods from " + modsUrl);
            URL url = new URL(modsUrl);
            URLConnection conn = url.openConnection();
            conn.setUseCaches(false);
            SAXReader reader = new SAXReader();
            Document document =(Document)(Object) reader.read(conn.getInputStream());
            Element root =(Element)(Object) document.getRootElement();
            for (Iterator i =(Iterator)(Object) root.elementIterator("mod"); i.hasNext(); ) {
                final Element mod = (Element) i.next();
                JMenuItem mi = new JMenuItem(mod.element("name").getTextTrim());
                MyHelperClass Application = new MyHelperClass();
                mi.setIcon(Application.icon("applications-other"));
                mi.addActionListener(new ActionListener() {

//                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Application.getInstance().openUrl(mod.element("siteUrl").getTextTrim());
                    }
                });
                MyHelperClass mnMods = new MyHelperClass();
                mnMods.add(mi);
            }
        } catch (Throwable t) {
            t.printStackTrace();
            MyHelperClass log = new MyHelperClass();
            log.warn("Failed to dynamically add mod links");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass icon(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getItem(int o0){ return null; }
	public MyHelperClass remove(int o0){ return null; }
	public MyHelperClass add(JMenuItem o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getTextTrim(){ return null; }
	public MyHelperClass openUrl(MyHelperClass o0){ return null; }
	public MyHelperClass getItemCount(){ return null; }}

class JMenuItem {

JMenuItem(MyHelperClass o0){}
	JMenuItem(){}
	public MyHelperClass setIcon(MyHelperClass o0){ return null; }
	public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass addActionListener( ActionListener o0){ return null; }}

class SAXReader {

public MyHelperClass read(InputStream o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass element(String o0){ return null; }
	public MyHelperClass elementIterator(String o0){ return null; }}

class ActionListener {

}

class ActionEvent {

}
