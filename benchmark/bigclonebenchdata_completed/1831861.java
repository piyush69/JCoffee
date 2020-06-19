


class c1831861 {
public MyHelperClass[] apiKey;
//public MyHelperClass apiKey;
	public MyHelperClass formatQuery(String o0){ return null; }

    private Document getXML(String artist) throws Exception {
        Document doc = null;
        MyHelperClass disgogsUrl = new MyHelperClass();
        URL url = new URL("http://" + disgogsUrl + "/artist/" + formatQuery(artist) + "?f=xml&api_key=" + apiKey[0]);
        HttpURLConnection uc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        uc.addRequestProperty("Accept-Encoding", "gzip");
        MyHelperClass StaticObj = new MyHelperClass();
        if ((boolean)(Object)StaticObj.PROXY_ENABLED) {
            Properties systemSettings =(Properties)(Object) System.getProperties();
//            MyHelperClass StaticObj = new MyHelperClass();
            systemSettings.put("http.proxyHost", StaticObj.PROXY_URL);
//            MyHelperClass StaticObj = new MyHelperClass();
            systemSettings.put("http.proxyPort", StaticObj.PROXY_PORT);
            System.setProperties((java.util.Properties)(Object)systemSettings);
            sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
//            MyHelperClass StaticObj = new MyHelperClass();
            String encoded = new String(encoder.encode(new String(StaticObj.PROXY_USERNAME + ":" + StaticObj.PROXY_PASSWORD).getBytes()));
            uc.setRequestProperty("Proxy-Authorization", "Basic " + encoded);
        }
        BufferedReader ir = null;
        try {
            if (uc.getInputStream() != null) {
                InputStream _is =(InputStream)(Object) uc.getInputStream();
                GZIPInputStream _gzipIs = new GZIPInputStream(_is);
                InputStreamReader _isReader = new InputStreamReader(_gzipIs);
                ir = new BufferedReader(_isReader);
                SAXBuilder builder = new SAXBuilder();
                doc =(Document)(Object) builder.build(ir);
            }
        } catch (Exception e) {
//            MyHelperClass StaticObj = new MyHelperClass();
            if ((boolean)(Object)StaticObj.DEBUG) {
                MyHelperClass LogManager = new MyHelperClass();
                LogManager.getInstance().getLogger().error(e);
                e.printStackTrace();
                System.out.println("No Data found!");
            }
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROXY_PORT;
	public MyHelperClass PROXY_URL;
	public MyHelperClass PROXY_ENABLED;
	public MyHelperClass DEBUG;
	public MyHelperClass PROXY_PASSWORD;
	public MyHelperClass PROXY_USERNAME;
public MyHelperClass getLogger(){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Document {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class Properties {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(GZIPInputStream o0){}}

class SAXBuilder {

public MyHelperClass build(BufferedReader o0){ return null; }}
