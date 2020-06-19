import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8330518 {
public MyHelperClass model;
public MyHelperClass NULL;
	public MyHelperClass startSplitPanel(Attributes o0){ return null; }
	public MyHelperClass startLabel(Attributes o0){ return null; }
	public MyHelperClass startGroupbox(Attributes o0){ return null; }
	public MyHelperClass startMenuitem(Attributes o0){ return null; }
	public MyHelperClass startMenu(Attributes o0){ return null; }
	public MyHelperClass startHeader(Attributes o0){ return null; }
	public MyHelperClass startTable(Attributes o0){ return null; }
	public MyHelperClass startOption(Attributes o0){ return null; }
	public MyHelperClass startImage(Attributes o0){ return null; }
	public MyHelperClass startTabcontrol(Attributes o0){ return null; }
	public MyHelperClass startWindow(Attributes o0){ return null; }
	public MyHelperClass startTreeview(Attributes o0){ return null; }
	public MyHelperClass startTreeitem(Attributes o0){ return null; }
	public MyHelperClass startTextArea(Attributes o0){ return null; }
	public MyHelperClass startDesktopPane(Attributes o0){ return null; }
	public MyHelperClass startButton(Attributes o0){ return null; }
	public MyHelperClass startList(Attributes o0){ return null; }
	public MyHelperClass startRadioButton(Attributes o0){ return null; }
	public MyHelperClass startCheckbox(Attributes o0){ return null; }
	public MyHelperClass startToolbar(Attributes o0){ return null; }
	public MyHelperClass startToolbarbutton(Attributes o0){ return null; }
	public MyHelperClass startPanel(Attributes o0){ return null; }
	public MyHelperClass startStatusbar(Attributes o0){ return null; }
	public MyHelperClass startSingleLineEdit(Attributes o0){ return null; }
	public MyHelperClass startChoice(Attributes o0){ return null; }

    public void startElement(String uri, String tag, String qName, org.xml.sax.Attributes attributes) throws Throwable, SAXException {
        Attributes prop = new Attributes(attributes);
        try {
            MyHelperClass menu = new MyHelperClass();
            if (tag.equals("window")) startWindow(prop); else if (tag.equals("splitpanel")) startSplitPanel(prop); else if (tag.equals("desktoppane")) startDesktopPane(prop); else if (tag.equals("tabcontrol")) startTabcontrol(prop); else if (tag.equals("panel")) startPanel(prop); else if (tag.equals("statusbar")) startStatusbar(prop); else if (tag.equals("toolbar")) startToolbar(prop); else if (tag.equals("toolbarbutton")) startToolbarbutton(prop); else if (tag.equals("menu")) startMenu(prop); else if (tag.equals("menuitem")) startMenuitem(prop); else if (tag.equals("separator")) menu.addSeparator(); else if (tag.equals("choice")) startChoice(prop); else if (tag.equals("list")) startList(prop); else if (tag.equals("option")) startOption(prop); else if (tag.equals("label")) startLabel(prop); else if (tag.equals("button")) startButton(prop); else if (tag.equals("groupbox")) startGroupbox(prop); else if (tag.equals("radiobutton")) startRadioButton(prop); else if (tag.equals("checkbox")) startCheckbox(prop); else if (tag.equals("image")) startImage(prop); else if (tag.equals("textarea")) startTextArea(prop); else if (tag.equals("singlelineedit")) startSingleLineEdit(prop); else if (tag.equals("treeview")) startTreeview(prop); else if (tag.equals("treeitem")) startTreeitem(prop); else if (tag.equals("table")) startTable(prop); else if (tag.equals("header")) startHeader(prop); else if (tag.equals("row")) {
                MyHelperClass rowNumber = new MyHelperClass();
                rowNumber++;
                int columnNumber =(int)(Object) NULL; //new int();
                columnNumber = 0;
                MyHelperClass model = new MyHelperClass();
                model.addRow();
            } else if (tag.equals("column")) {
                MyHelperClass columnNumber = new MyHelperClass();
                columnNumber++;
                if (prop == null) {
                    System.err.println("table.column without properties");
                    return;
                }
                String value =(String)(Object) prop.getValue("value", "");
                MyHelperClass rowNumber = new MyHelperClass();
                model.setValueAt(value,(int)(Object) rowNumber - 1,(int)(Object) columnNumber - 1);
            } else if (tag.equals("rmbmenuitem")) {
                if (prop == null) {
                    System.err.println("datawindow.menuitem without properties");
                    return;
                }
                String action =(String)(Object) prop.getValue("action", "");
                String label =(String)(Object) prop.getValue("label", "");
                JMenuItem mi = new JMenuItem(label);
                mi.setActionCommand(action);
                MyHelperClass win = new MyHelperClass();
                mi.addActionListener(win);
                MyHelperClass rmbmenu = new MyHelperClass();
                rmbmenu.add(mi);
            } else if (tag.equals("rmbseparator")) {
                MyHelperClass rmbmenu = new MyHelperClass();
                rmbmenu.addSeparator();
            } else if (tag.equals("script")) {
                MyHelperClass win = new MyHelperClass();
                win.beginScript();
                String url =(String)(Object) prop.getValue("src");
                if (url.length() > 0) {
                    try {
                        BufferedReader r = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
                        String buffer;
                        while (true) {
                            buffer = r.readLine();
                            if (buffer == null) break;
//                            MyHelperClass win = new MyHelperClass();
                            win.script +=(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) buffer + "\n";
                        }
                        r.close();
//                        MyHelperClass win = new MyHelperClass();
                        win.endScript();
                    } catch (IOException ioe) {
                        System.err.println("[IOError] " + ioe.getMessage());
                        System.exit(0);
                    }
                }
            } else System.err.println("[win] unparsed tag: " + tag);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int rowNumber;
	public int columnNumber;
	public MyHelperClass script;
public MyHelperClass add(JMenuItem o0){ return null; }
	public MyHelperClass beginScript(){ return null; }
	public MyHelperClass endScript(){ return null; }
	public MyHelperClass addRow(){ return null; }
	public MyHelperClass addSeparator(){ return null; }
	public MyHelperClass setValueAt(String o0, int o1, int o2){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class JMenuItem {

JMenuItem(String o0){}
	JMenuItem(){}
	public MyHelperClass addActionListener(MyHelperClass o0){ return null; }
	public MyHelperClass setActionCommand(String o0){ return null; }}

class Attributes {

Attributes(org.xml.sax.Attributes o0){}
	Attributes(){}
	public MyHelperClass getValue(String o0, String o1){ return null; }
	public MyHelperClass getValue(String o0){ return null; }}
