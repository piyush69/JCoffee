import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10005674 {
public MyHelperClass description_suffix;

    public String post() {
        MyHelperClass content = new MyHelperClass();
        if (content == null || content.equals("")) return "Type something to publish!!";
        OutputStreamWriter wr = null;
        BufferedReader rd = null;
        try {
            MyHelperClass apiKey = new MyHelperClass();
            String data = URLEncoder.encode("api", "UTF-8") + "=" + URLEncoder.encode((String)(Object)apiKey, "UTF-8");
//            MyHelperClass content = new MyHelperClass();
            data += "&" + URLEncoder.encode("content", "UTF-8") + "=" + URLEncoder.encode((String)(Object)content, "UTF-8");
            MyHelperClass descriptionTextArea = new MyHelperClass();
            data += "&" + URLEncoder.encode("description", "UTF-8") + "=" + URLEncoder.encode((String)(Object)(int)(Object)descriptionTextArea.getText() + (int)(Object)description_suffix, "UTF-8");
            MyHelperClass expiryComboBox = new MyHelperClass();
            data += "&" + URLEncoder.encode("expiry", "UTF-8") + "=" + URLEncoder.encode((String)(String)(Object) expiryComboBox.getSelectedItem(), "UTF-8");
            MyHelperClass type = new MyHelperClass();
            data += "&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode((String)(Object)type, "UTF-8");
            MyHelperClass nameTextBox = new MyHelperClass();
            data += "&" + URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode((String)(Object)nameTextBox.getText(), "UTF-8");
            URL url = new URL("http://pastebin.ca/quiet-paste.php");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            line = rd.readLine();
            if (line == null || line.length() < 8 || !line.substring(0, 8).equals("SUCCESS:")) return "Unknown error in publishing the post"; else return "*Publish successful.! The link to your post is.: " + "http://pastebin.ca/" + line.substring(8);
        } catch (IOException ex) {
            return "Unable to connect to http://pastebin.ca/\nPlease check your internet connection";
        } finally {
            try {
                if (wr != null) wr.close();
                if (rd != null) rd.close();
            } catch (IOException ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getText(){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }}
