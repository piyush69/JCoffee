import java.io.*;
import java.lang.*;
import java.util.*;



class c2967952 {

    private void showAboutBox() {
        String message = new String("Error: Resource Not Found.");
        java.net.URL url = ClassLoader.getSystemResource("docs/about.html");
        if (url != null) {
            try {
                StringBuffer buf = new StringBuffer();
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                while (reader.ready()) {
                    buf.append(reader.readLine());
                }
                message = buf.toString();
            } catch (IOException ex) {
                message = new String("IO Error.");
            }
        }
        MyHelperClass JOptionPane = new MyHelperClass();
        JOptionPane.showOptionDialog(this, message, "About jBudget", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PLAIN_MESSAGE;
	public MyHelperClass DEFAULT_OPTION;
public MyHelperClass showOptionDialog(c2967952 o0, String o1, String o2, MyHelperClass o3, MyHelperClass o4, Object o5, Object o6, Object o7){ return null; }}
