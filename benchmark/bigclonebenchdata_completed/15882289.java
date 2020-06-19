import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15882289 {
public MyHelperClass[] messages;
public MyHelperClass dms_url;
	public MyHelperClass key;
	public MyHelperClass FS;
	public MyHelperClass messages;
	public MyHelperClass dms_home;
	public MyHelperClass DOMUtil;
	public MyHelperClass username;
	public MyHelperClass DocumentBuilderFactory;

    public  void GetMessages(String messageType)  throws Throwable {
        String urlString = dms_url + "/servlet/com.ufnasoft.dms.server.ServerGetMessages";
        String rvalue = "";
        String filename = dms_home + (int)(Object)FS + "temp" + FS + username + "messages.xml";
        try {
            String urldata = urlString + "?username=" + URLEncoder.encode((String)(Object)username, "UTF-8") + "&key=" + URLEncoder.encode(key, "UTF-8") + "&messagetype=" + messageType + "&filename=" + URLEncoder.encode(username, "UTF-8") + "messages.xml";
            ;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factory.newDocumentBuilder();
            URL u = new URL(urldata);
            DataInputStream is = new DataInputStream(u.openStream());
            FileOutputStream os = new FileOutputStream(filename);
            int iBufSize = is.available();
            byte inBuf[] = new byte[20000 * 1024];
            int iNumRead;
            while ((iNumRead = is.read(inBuf, 0, iBufSize)) > 0) os.write(inBuf, 0, iNumRead);
            os.close();
            is.close();
            File f = new File(filename);
            InputStream inputstream = new FileInputStream(f);
            Document document = parser.parse(inputstream);
            NodeList nodelist = document.getElementsByTagName("message");
            int num = nodelist.getLength();
            messages =(MyHelperClass)(Object) new String[num][7];
            for (int i = 0; i < num; i++) {
                messages[i][0] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "messageid"));
                messages[i][1] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "subject"));
                messages[i][2] = (new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "firstname"))) + " " + (new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "lastname")));
                messages[i][3] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "messagedatetime"));
                messages[i][4] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "messagefrom"));
                messages[i][5] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "messageto"));
                messages[i][6] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "documentid"));
            }
        } catch (MalformedURLException ex) {
            System.out.println(ex);
        } catch (ParserConfigurationException ex) {
            System.out.println(ex);
        } catch (NullPointerException e) {
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getSimpleElementText(Element o0, String o1){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Element {

}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
