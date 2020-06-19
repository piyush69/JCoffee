


class c7898667 {
public MyHelperClass DocumentBuilderFactory;

    public void LogoutHandler(String username, String token) {
        try {
            URL url = new URL("http://eiffel.itba.edu.ar/hci/service/Security.groovy?method=LogOut&username=" + username + "&authentication_token=" + token);
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            urlc.setDoOutput(false);
            urlc.setAllowUserInteraction(false);
            BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
            String str;
            StringBuffer sb = new StringBuffer();
            while ((str =(String)(Object) br.readLine()) != null) {
                sb.append(str);
                sb.append("\n");
            }
            br.close();
            String response = sb.toString();
            if (response == null) {
                return;
            }
            DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(response));
            Document dom =(Document)(Object) db.parse(is);
            NodeList nl =(NodeList)(Object) dom.getElementsByTagName("response");
            String status =(String)(Object) ((Element)(Element)(Object) nl.item(0)).getAttributes().item(0).getTextContent();
            if (status.toString().equals("fail")) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getTextContent(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class InputSource {

public MyHelperClass setCharacterStream(StringReader o0){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }}

class Element {

public MyHelperClass getAttributes(){ return null; }}
