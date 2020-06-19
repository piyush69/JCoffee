


class c16092702 {
public static MyHelperClass StringUtil;
//public MyHelperClass StringUtil;

    public static boolean doTest(Getter context, Document node) {
        try {
            MyHelperClass Documents = new MyHelperClass();
            URL url = new URL(StringUtil.evaluateEL(Documents.getDocumentValue(node, "url"), context));
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass Assert = new MyHelperClass();
            Assert.isTrue((int)(Object)conn.getResponseCode() < 400);
            conn.disconnect();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isTrue(boolean o0){ return null; }
	public MyHelperClass getDocumentValue(Document o0, String o1){ return null; }
	public MyHelperClass evaluateEL(MyHelperClass o0, Getter o1){ return null; }}

class Getter {

}

class Document {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}
