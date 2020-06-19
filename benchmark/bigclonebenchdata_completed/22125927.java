


class c22125927 {
public MyHelperClass getTextContent(Element o0){ return null; }
	public MyHelperClass encodeCredentials(){ return null; }
public MyHelperClass ErrorReporter;
	public MyHelperClass startImport(){ return null; }
	public MyHelperClass println(String o0){ return null; }

    private void doLogin() {
        try {
            MyHelperClass username = new MyHelperClass();
            println("Logging in as '" + username.getText() + "'");
            MyHelperClass hostname = new MyHelperClass();
            URL url = new URL("http://" + hostname + "/migrate");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            MyHelperClass URLEncoder = new MyHelperClass();
            wr.write(URLEncoder.encode("login", "UTF-8") + "=" + encodeCredentials());
            wr.flush();
            BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            Document doc =(Document)(Object) db.parse(in);
            Element root =(Element)(Object) doc.getDocumentElement();
            in.close();
            if (root.getAttribute("success").equals("false")) {
                println("Login Failed: " + getTextContent(root));
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(this, "Login Failed: " + getTextContent(root), "Login Failed", JOptionPane.ERROR_MESSAGE);
            } else {
                MyHelperClass token = new MyHelperClass();
                token =(boolean)(Object) root.hasAttribute("token") ? root.getAttribute("token") : null;
//                MyHelperClass token = new MyHelperClass();
                if (token != null) {
                    startImport();
                }
            }
        } catch (Exception e) {
            ErrorReporter.showError(e, this);
            println(e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showError(Exception o0, c22125927 o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass showMessageDialog(c22125927 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getText(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setNamespaceAware(boolean o0){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(BufferedInputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass hasAttribute(String o0){ return null; }}
