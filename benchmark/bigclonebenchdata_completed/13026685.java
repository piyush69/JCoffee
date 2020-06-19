import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13026685 {
public MyHelperClass[] searchDocs;
	public MyHelperClass[] searchDocsToolTip;
	public MyHelperClass[] searchDocImageName;
public MyHelperClass searchDocs;
	public MyHelperClass searchDocImageName;
	public MyHelperClass searchDocsToolTip;
	public MyHelperClass dms_url;
	public MyHelperClass key;
	public MyHelperClass FS;
	public MyHelperClass dms_home;
	public MyHelperClass DOMUtil;
	public MyHelperClass username;
	public MyHelperClass DocumentBuilderFactory;

    public  void DoSearch(String searchType, String searchString)  throws Throwable {
        String urlString = dms_url + "/servlet/com.ufnasoft.dms.server.ServerDoSearch";
        String rvalue = "";
        String filename = dms_home + (int)(Object)FS + "temp" + FS + username + "search.xml";
        try {
            String urldata = urlString + "?username=" + URLEncoder.encode((String)(Object)username, "UTF-8") + "&key=" + key + "&search=" + URLEncoder.encode(searchString, "UTF-8") + "&searchtype=" + URLEncoder.encode(searchType, "UTF-8") + "&filename=" + URLEncoder.encode(username, "UTF-8") + "search.xml";
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
            NodeList nodelist = document.getElementsByTagName("entry");
            int num = nodelist.getLength();
            searchDocs =(MyHelperClass)(Object) new String[num][3];
            searchDocImageName =(MyHelperClass)(Object) new String[num];
            searchDocsToolTip =(MyHelperClass)(Object) new String[num];
            for (int i = 0; i < num; i++) {
                searchDocs[i][0] = DOMUtil.getSimpleElementText((Element) nodelist.item(i), "filename");
                searchDocs[i][1] = DOMUtil.getSimpleElementText((Element) nodelist.item(i), "project");
                searchDocs[i][2] = DOMUtil.getSimpleElementText((Element) nodelist.item(i), "documentid");
                searchDocImageName[i] = DOMUtil.getSimpleElementText((Element) nodelist.item(i), "imagename");
                searchDocsToolTip[i] = DOMUtil.getSimpleElementText((Element) nodelist.item(i), "description");
            }
        } catch (MalformedURLException ex) {
            System.out.println(ex);
        } catch (ParserConfigurationException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(rvalue);
        if (rvalue.equalsIgnoreCase("yes")) {
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
