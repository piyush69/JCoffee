import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14566265 {
public MyHelperClass prop;
	public MyHelperClass JOptionPane;
	public MyHelperClass xLanguagePath;
	public MyHelperClass xConfigPath;

    public  void I18N(JApplet applet)  throws Throwable {
        if (prop != null) {
            return;
        }
        String lang = "de";
        try {
            Properties userProperties = new Properties();
            if (applet != null) {
                URL url = new URL((int)(Object)applet.getCodeBase() + (int)(Object)xConfigPath + "ElementDesigner.cfg");
                userProperties.load(url.openStream());
            } else {
                userProperties.load(new FileInputStream(xConfigPath + "ElementDesigner.cfg"));
            }
            if (userProperties.containsKey("language")) {
                lang = userProperties.getProperty("language");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        prop =(MyHelperClass)(Object) new Properties();
        try {
            if (applet != null) {
                URL url = new URL((int)(Object)applet.getCodeBase() + (int)(Object)xLanguagePath + lang + ".ini");
                prop.load(url.openStream());
            } else {
                prop.load(new FileInputStream(xLanguagePath + lang + ".ini"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                if (applet != null) {
                    URL url = new URL((int)(Object)applet.getCodeBase() + (int)(Object)xLanguagePath + "de.ini");
                    prop.load(url.openStream());
                } else {
                    prop.load(new FileInputStream(xLanguagePath + "de.ini"));
                }
            } catch (Exception ex2) {
                JOptionPane.showMessageDialog(null, "Language file languages/de.ini not found.\nPlease run the program from its directory.");
                System.exit(5);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(FileInputStream o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }}

class JApplet {

public MyHelperClass getCodeBase(){ return null; }}
