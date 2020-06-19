


class c6764531 {

    public static Document send(final String urlAddress) {
        Document responseMessage = null;
        try {
            URL url = new URL(urlAddress);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setAllowUserInteraction(false);
            int response =(int)(Object) connection.getResponseCode();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (response == (int)(Object)HttpURLConnection.HTTP_OK) {
                String contentType =(String)(Object) connection.getContentType();
                if (contentType != null && contentType.startsWith("text/html")) {
                    InputStream inputStream =(InputStream)(Object) connection.getInputStream();
                    MyHelperClass XmlUtils = new MyHelperClass();
                    responseMessage =(Document)(Object) XmlUtils.fromStream(inputStream);
                } else {
                    MyHelperClass XmlUtils = new MyHelperClass();
                    responseMessage =(Document)(Object) XmlUtils.newDocument();
//                    MyHelperClass XmlUtils = new MyHelperClass();
                    Element responseElement =(Element)(Object) XmlUtils.createElement(responseMessage, "rsp");
//                    MyHelperClass XmlUtils = new MyHelperClass();
                    Element messageElement =(Element)(Object) XmlUtils.createElement(responseElement, "message");
                    messageElement.setTextContent(String.valueOf(connection.getResponseCode()));
//                    MyHelperClass XmlUtils = new MyHelperClass();
                    Element commentElement =(Element)(Object) XmlUtils.createElement(responseElement, "comment");
                    commentElement.setTextContent(contentType);
                }
            } else {
                MyHelperClass XmlUtils = new MyHelperClass();
                responseMessage =(Document)(Object) XmlUtils.newDocument();
//                MyHelperClass XmlUtils = new MyHelperClass();
                Element responseElement =(Element)(Object) XmlUtils.createElement(responseMessage, "rsp");
//                MyHelperClass XmlUtils = new MyHelperClass();
                Element messageElement =(Element)(Object) XmlUtils.createElement(responseElement, "message");
                messageElement.setTextContent(String.valueOf(connection.getResponseCode()));
//                MyHelperClass XmlUtils = new MyHelperClass();
                Element commentElement =(Element)(Object) XmlUtils.createElement(responseElement, "comment");
                commentElement.setTextContent((String)(Object)connection.getResponseMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass newDocument(){ return null; }
	public MyHelperClass createElement(Element o0, String o1){ return null; }
	public MyHelperClass createElement(Document o0, String o1){ return null; }
	public MyHelperClass fromStream(InputStream o0){ return null; }}

class Document {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class InputStream {

}

class Element {

public MyHelperClass setTextContent(String o0){ return null; }}
