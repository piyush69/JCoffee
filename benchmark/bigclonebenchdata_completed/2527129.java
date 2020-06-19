import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2527129 {
public MyHelperClass JOptionPane;
public MyHelperClass support;
	public MyHelperClass Level;
	public MyHelperClass Logger;
	public MyHelperClass isDirty(){ return null; }

    private void loadExample(String resourceFile) {
        try {
            URL url = EditorContextMenu.class.getResource(resourceFile);
            if ((boolean)(Object)this.isDirty()) {
                if (this.support.saveAs() == JOptionPane.CANCEL_OPTION) {
                    return;
                }
            }
            this.support.loadInputStream(url.openStream());
        } catch (IOException ex) {
            Logger.getLogger(EditorContextMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass CANCEL_OPTION;
public MyHelperClass loadInputStream(InputStream o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass saveAs(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class EditorContextMenu {

}
