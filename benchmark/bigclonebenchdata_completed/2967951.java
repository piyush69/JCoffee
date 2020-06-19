import java.io.*;
import java.lang.*;
import java.util.*;



class c2967951 {

    public void showGetStartedBox() {
        String message = new String("Error: Resource Not Found.");
        java.net.URL url = ClassLoader.getSystemResource("docs/get_started.html");
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
        new HtmlDisplayDialog(this, "Get Started", message);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HtmlDisplayDialog {

HtmlDisplayDialog(){}
	HtmlDisplayDialog(c2967951 o0, String o1, String o2){}}
