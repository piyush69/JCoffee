
import java.io.UncheckedIOException;


class c14650348 {
public static MyHelperClass Log;
	public static MyHelperClass URLEncoder;
//public MyHelperClass URLEncoder;
//	public MyHelperClass Log;

    public static ArrayList downloadFriendsList(String username) {
        try {
            URL url;
            MyHelperClass WS_URL = new MyHelperClass();
            url = new URL(WS_URL + "/user/" + URLEncoder.encode(username, "UTF-8") + "/friends.xml");
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.connect();
            InputStream is =(InputStream)(Object) conn.getInputStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbFac =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder db =(DocumentBuilder)(Object) dbFac.newDocumentBuilder();
            Document doc =(Document)(Object) db.parse(is);
            NodeList friends =(NodeList)(Object) doc.getElementsByTagName("user");
            ArrayList result = new ArrayList();
            for (int i = 0; i < (int)(Object)friends.getLength(); i++) try {
                result.add(new FriendInfo((Element)(Element)(Object) friends.item(i)));
            } catch (UncheckedIOException e) {
                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, "in downloadFriendsList", e);
                return null;
            }
            return result;
        } catch (Exception e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "in downloadFriendsList", e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, ParseException o2){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class ArrayList {

public MyHelperClass add(FriendInfo o0){ return null; }}

class FriendInfo {

FriendInfo(){}
	FriendInfo(Element o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

}

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

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
