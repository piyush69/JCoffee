
import java.io.UncheckedIOException;


class c14650349 {
public MyHelperClass mSession;
	public MyHelperClass Log;

    private ArrayList getPlaylist() {
        try {
            MyHelperClass TAG = new MyHelperClass();
            Log.d(TAG, "Getting playlist started");
            MyHelperClass mBaseURL = new MyHelperClass();
            String urlString = "http://" + mBaseURL + "/xspf.php?sk=" + mSession + "&discovery=0&desktop=1.4.1.57486";
            MyHelperClass mAlternateConn = new MyHelperClass();
            if ((boolean)(Object)mAlternateConn) {
                urlString += "&api_key=9d1bbaef3b443eb97973d44181d04e4b";
//                MyHelperClass TAG = new MyHelperClass();
                Log.d(TAG, "Using alternate connection method");
            }
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.connect();
            InputStream is =(InputStream)(Object) conn.getInputStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbFac =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder db =(DocumentBuilder)(Object) dbFac.newDocumentBuilder();
            Document doc =(Document)(Object) db.parse(is);
            Element root =(Element)(Object) doc.getDocumentElement();
            NodeList titleNs =(NodeList)(Object) root.getElementsByTagName("title");
            String stationName = "<unknown station>";
            if ((int)(Object)titleNs.getLength() > 0) {
                Element titleElement = (Element)(Element)(Object) titleNs.item(0);
                String res = "";
                for (int i = 0; i < (int)(Object)titleElement.getChildNodes().getLength(); i++) {
                    Node item =(Node)(Object) titleElement.getChildNodes().item(i);
                    MyHelperClass Node = new MyHelperClass();
                    if (item.getNodeType() == Node.TEXT_NODE) res += item.getNodeValue();
                }
                MyHelperClass URLDecoder = new MyHelperClass();
                stationName =(String)(Object) URLDecoder.decode(res, "UTF-8");
            }
            NodeList tracks =(NodeList)(Object) doc.getElementsByTagName("track");
            ArrayList result = new ArrayList();
            for (int i = 0; i < (int)(Object)tracks.getLength(); i++) try {
                result.add(new XSPFTrackInfo(stationName, (Element)(Element)(Object) tracks.item(i)));
            } catch (UncheckedIOException e) {
//                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, "in getPlaylist", e);
                return null;
            }
//            MyHelperClass TAG = new MyHelperClass();
            Log.d(TAG, "Getting playlist successful");
            return result;
        } catch (Exception e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "in getPlaylist", e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TEXT_NODE;
public MyHelperClass newInstance(){ return null; }
	public MyHelperClass decode(String o0, String o1){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, ParseException o2){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class ArrayList {

public MyHelperClass add(XSPFTrackInfo o0){ return null; }}

class XSPFTrackInfo {

XSPFTrackInfo(String o0, Element o1){}
	XSPFTrackInfo(){}}

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

public MyHelperClass getDocumentElement(){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class Element {

public MyHelperClass getChildNodes(){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getNodeType(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
