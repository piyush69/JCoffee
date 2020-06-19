


class c4673960 {
public static MyHelperClass DocumentBuilderFactory;
	public static MyHelperClass URLEncoder;
	public static MyHelperClass encryptGeneral1(String o0){ return null; }
	public static MyHelperClass decryptGeneral1(String o0){ return null; }
//public MyHelperClass DocumentBuilderFactory;
//	public MyHelperClass URLEncoder;
//	public MyHelperClass decryptGeneral1(String o0){ return null; }
//	public MyHelperClass encryptGeneral1(String o0){ return null; }

    public static String recoverPassword(String token) {
        try {
            token =(String)(Object) encryptGeneral1(token);
            String data = URLEncoder.encode("key", "UTF-8") + "=" + URLEncoder.encode(token, "UTF-8");
            URL url = new URL("https://mypasswords-server.appspot.com/recover_password");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder finalResult = new StringBuilder();
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                finalResult.append(line);
            }
            wr.close();
            rd.close();
            DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            Document document =(Document)(Object) db.parse(new InputSource(new StringReader(finalResult.toString())));
            document.normalizeDocument();
            Element root =(Element)(Object) document.getDocumentElement();
            String password =(String)(Object) root.getTextContent();
            password =(String)(Object) decryptGeneral1(password);
            return password;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }
	public MyHelperClass normalizeDocument(){ return null; }}

class InputSource {

InputSource(StringReader o0){}
	InputSource(){}}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class Element {

public MyHelperClass getTextContent(){ return null; }}
