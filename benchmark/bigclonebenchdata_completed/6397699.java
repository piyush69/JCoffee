import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6397699 {
public MyHelperClass XPathFactory;
	public MyHelperClass XPathConstants;
	public MyHelperClass getDocument(InputStream o0){ return null; }
	public MyHelperClass parse(List<String o0){ return null; }

    public void process(String number)  throws Throwable {
        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(TRAIN_INFO_URL.value());
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair(TRAIN_NUMBER_POST_PARAM_NAME.value(), number));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpclient.execute(httpPost);
            InputStream is = response.getEntity().getContent();
            Document doc = getDocument(is);
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();
            XPathExpression expr = xpath.compile(XPATH_TRAIN_STOPS_INFO.value());
            Object result = expr.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes = (NodeList) result;
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < nodes.getLength(); i++) {
                list.add(nodes.item(i).getNodeValue());
            }
            parse(list);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpClient {

}

class DefaultHttpClient {

}

class HttpPost {

}

class NameValuePair {

}

class BasicNameValuePair {

}

class UrlEncodedFormEntity {

}

class HttpResponse {

}

class Document {

}

class XPathFactory {

}

class XPath {

}

class XPathExpression {

}

class NodeList {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}
