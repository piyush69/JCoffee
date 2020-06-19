import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8939074 {
public MyHelperClass[] rawTableData;
	public MyHelperClass[] imageNames;
public MyHelperClass imageNames;
	public MyHelperClass dms_url;
	public MyHelperClass key;
	public MyHelperClass FS;
	public MyHelperClass dms_home;
	public MyHelperClass DOMUtil;
	public MyHelperClass rawTableData;
	public MyHelperClass username;
	public MyHelperClass selectedProjectId;
	public MyHelperClass DocumentBuilderFactory;

    public  void RawTableData(int selectedId)  throws Throwable {
        selectedProjectId =(MyHelperClass)(Object) selectedId;
        String urlString = dms_url + "/servlet/com.ufnasoft.dms.server.ServerGetProjectDocuments";
        String rvalue = "";
        String filename = dms_home + (int)(Object)FS + "temp" + FS + username + "documents.xml";
        try {
            String urldata = urlString + "?username=" + URLEncoder.encode((String)(Object)username, "UTF-8") + "&key=" + URLEncoder.encode(key, "UTF-8") + "&projectid=" + selectedProjectId + "&filename=" + URLEncoder.encode(username, "UTF-8") + "documents.xml";
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
            NodeList nodelist = document.getElementsByTagName("doc");
            int num = nodelist.getLength();
            rawTableData =(MyHelperClass)(Object) new String[num][11];
            imageNames =(MyHelperClass)(Object) new String[num];
            for (int i = 0; i < num; i++) {
                rawTableData[i][0] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "did"));
                rawTableData[i][1] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "t"));
                rawTableData[i][2] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "f"));
                rawTableData[i][3] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "d"));
                rawTableData[i][4] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "l"));
                String firstname = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "fn"));
                String lastname = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "ln"));
                rawTableData[i][5] = firstname + " " + lastname;
                rawTableData[i][6] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "dln"));
                rawTableData[i][7] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "rsid"));
                rawTableData[i][8] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "img"));
                imageNames[i] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "img"));
                rawTableData[i][9] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "ucin"));
                rawTableData[i][10] = new String(DOMUtil.getSimpleElementText((Element) nodelist.item(i), "dtid"));
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
