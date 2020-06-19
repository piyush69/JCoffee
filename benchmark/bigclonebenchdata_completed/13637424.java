import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13637424 {

        public void actionPerformed(ActionEvent e)  throws Throwable {
            String aboutText = "Slug application.";
            MyHelperClass GateConstants = new MyHelperClass();
            String aboutURL = System.getProperty((String)(Object)GateConstants.ABOUT_URL_JAVA_PROPERTY_NAME);
            boolean canShowInPane = false;
            if (aboutURL != null) {
                try {
                    URL url = new URL(aboutURL);
                    AboutPaneDialog dlg = new AboutPaneDialog(ShellSlacFrame.this, "Slug application about", true);
                    canShowInPane =(boolean)(Object) dlg.setURL(url);
                    if (canShowInPane) {
                        dlg.setSize(300, 200);
                        dlg.setLocationRelativeTo(ShellSlacFrame.this);
                        dlg.setVisible(true);
                    } else {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                        String line = "";
                        StringBuffer content = new StringBuffer();
                        do {
                            content.append(line);
                            line = reader.readLine();
                        } while (line != null);
                        if (content.length() != 0) {
                            aboutText = content.toString();
                        }
                    }
                } catch (Exception ex) {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) {
                        ex.printStackTrace();
                    }
                }
            }
            MyHelperClass JOptionPane = new MyHelperClass();
            if (!canShowInPane) JOptionPane.showMessageDialog(ShellSlacFrame.this, aboutText, "Slug application about", JOptionPane.INFORMATION_MESSAGE);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass ABOUT_URL_JAVA_PROPERTY_NAME;
}

class ActionEvent {

}

class AboutPaneDialog {

public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setURL(URL o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }}

class ShellSlacFrame {

}
