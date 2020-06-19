import java.io.*;
import java.lang.*;
import java.util.*;



class c9718328 {
public MyHelperClass NULL;
public MyHelperClass jre;
	public MyHelperClass name;
	public MyHelperClass email;
	public MyHelperClass questVer;
	public MyHelperClass os;
	public MyHelperClass getAnswers(){ return null; }
public MyHelperClass buttonClicked;
	public MyHelperClass setVisible(boolean o0){ return null; }

    public void actionPerformed(ActionEvent e) {
        if ("register".equals(e.getActionCommand())) {
            String buttonClicked =(String)(Object) NULL; //new String();
            buttonClicked = "register";
            try {
                MyHelperClass URLEncoder = new MyHelperClass();
                String data = URLEncoder.encode("ver", "UTF-8") + "=" + URLEncoder.encode(Double.toString((double)(Object)questVer), "UTF-8");
//                MyHelperClass URLEncoder = new MyHelperClass();
                data += "&" + URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode((String)(Object)name.getText(), "UTF-8");
//                MyHelperClass URLEncoder = new MyHelperClass();
                data += "&" + URLEncoder.encode("os", "UTF-8") + "=" + URLEncoder.encode((String)(Object)os.getText(), "UTF-8");
//                MyHelperClass URLEncoder = new MyHelperClass();
                data += "&" + URLEncoder.encode("jre", "UTF-8") + "=" + URLEncoder.encode((String)(Object)jre.getText(), "UTF-8");
//                MyHelperClass URLEncoder = new MyHelperClass();
                data += "&" + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode((String)(Object)email.getText(), "UTF-8");
//                MyHelperClass URLEncoder = new MyHelperClass();
                data += "&" + URLEncoder.encode("key", "UTF-8") + "=" + URLEncoder.encode("Qr7SchF", "UTF-8");
//                MyHelperClass URLEncoder = new MyHelperClass();
                data += "&" + URLEncoder.encode("answers", "UTF-8") + "=" + URLEncoder.encode(Integer.toString((int)(Object)getAnswers()), "UTF-8");
                URL url = new URL("http://ubcdcreator.sourceforge.net/register.php");
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setDoInput(true);
                conn.setDoOutput(true);
                OutputStreamWriter wr = new OutputStreamWriter((OutputStream)(Object)conn.getOutputStream());
                wr.write(data);
                wr.flush();
                BufferedReader rd = new BufferedReader(new InputStreamReader((InputStream)(Object)conn.getInputStream()));
                String line;
                while ((line = rd.readLine()) != null) {
                }
                rd.close();
                wr.close();
            } catch (Exception ex) {
            }
            setVisible(false);
        } else if ("cancel".equals(e.getActionCommand())) {
            buttonClicked =(MyHelperClass)(Object) "cancel";
            setVisible(false);
        } else if ("never".equals(e.getActionCommand())) {
            buttonClicked =(MyHelperClass)(Object) "never";
            setVisible(false);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getText(){ return null; }}

class ActionEvent {

public MyHelperClass getActionCommand(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
