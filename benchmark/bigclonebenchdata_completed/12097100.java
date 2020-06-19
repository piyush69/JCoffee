import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12097100 {
public MyHelperClass URIUtils;

    public void getStation(String prefecture, String line)  throws Throwable {
        HttpClient httpclient = null;
        try {
            httpclient =(HttpClient)(Object) new DefaultHttpClient();
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("method", "getStations"));
            qparams.add(new BasicNameValuePair("prefecture", prefecture));
            qparams.add(new BasicNameValuePair("line", line));
            MyHelperClass URLEncodedUtils = new MyHelperClass();
            URI uri = URIUtils.createURI("http", "express.heartrails.com", -1, "/api/xml", URLEncodedUtils.format(qparams, "UTF-8"), null);
            HttpGet httpget = new HttpGet(uri);
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            InputStream instream = entity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(instream, "UTF-8"));
            StringBuffer buf = new StringBuffer();
            String str;
            while ((str = reader.readLine()) != null) {
                buf.append(str);
                buf.append("\n");
            }
            reader.close();
            MyHelperClass stationRes = new MyHelperClass();
            stationRes = new StationResponse(buf.toString());
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        } catch (ClientProtocolException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (SAXException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } finally {
            MyHelperClass mSearchStation = new MyHelperClass();
            mSearchStation.setEnabled(true);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(List<NameValuePair o0, String o1){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class StationResponse {

}
