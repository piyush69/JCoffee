
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23273706 {
public MyHelperClass URLEncoder;
	public MyHelperClass key;
	public MyHelperClass username;
	public MyHelperClass FS;

    public String[][] getProjectTreeData() {
        String[][] treeData = null;
        MyHelperClass dms_home = new MyHelperClass();
        String filename =(int)(Object) dms_home + (int)(Object)FS + "temp" + FS + username + "adminprojects.xml";
        MyHelperClass dms_url = new MyHelperClass();
        String urlString = dms_url + "/servlet/com.ufnasoft.dms.server.ServerGetAdminProjects";
        try {
            MyHelperClass username = new MyHelperClass();
            String urldata = urlString + "?username=" + URLEncoder.encode(username, "UTF-8") + "&key=" + URLEncoder.encode(key, "UTF-8") + "&filename=" + URLEncoder.encode(username, "UTF-8") + "adminprojects.xml";
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            factory.setValidating(false);
            DocumentBuilder parser =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            URL u = new URL(urldata);
            DataInputStream is = new DataInputStream(u.openStream());
            FileOutputStream os = new FileOutputStream(filename);
            int iBufSize =(int)(Object) is.available();
            byte inBuf[] = new byte[20000 * 1024];
            int iNumRead;
            while ((iNumRead =(int)(Object) is.read(inBuf, 0, iBufSize)) > 0) os.write(inBuf, 0, iNumRead);
            os.close();
            is.close();
            File f = new File(filename);
            InputStream inputstream =(InputStream)(Object) new FileInputStream(f);
            Document document =(Document)(Object) parser.parse(inputstream);
            NodeList nodelist =(NodeList)(Object) document.getElementsByTagName("proj");
            int num =(int)(Object) nodelist.getLength();
            treeData = new String[num][3];
            for (int i = 0; i < num; i++) {
                MyHelperClass DOMUtil = new MyHelperClass();
                treeData[i][0] = new String((String)(Object)DOMUtil.getSimpleElementText((Element)(Element)(Object) nodelist.item(i), "pid"));
//                MyHelperClass DOMUtil = new MyHelperClass();
                treeData[i][1] = new String((String)(Object)DOMUtil.getSimpleElementText((Element)(Element)(Object) nodelist.item(i), "ppid"));
//                MyHelperClass DOMUtil = new MyHelperClass();
                treeData[i][2] = new String((String)(Object)DOMUtil.getSimpleElementText((Element)(Element)(Object) nodelist.item(i), "p"));
            }
        } catch (UncheckedIOException ex) {
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (NullPointerException e) {
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return treeData;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSimpleElementText(Element o0, String o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass setValidating(boolean o0){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class DataInputStream {

DataInputStream(){}
	DataInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}}

class InputStream {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Element {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
