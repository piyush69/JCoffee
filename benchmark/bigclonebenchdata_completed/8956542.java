


class c8956542 {
public static MyHelperClass buildCookieString(List o0){ return null; }
	public static MyHelperClass setCookies(List o0, HttpURLConnection o1){ return null; }
//public MyHelperClass buildCookieString(List o0){ return null; }
//	public MyHelperClass setCookies(List o0, HttpURLConnection o1){ return null; }

    public static InputStream retrievePricesHTML(String username, String password) throws IOException, SAXException {
        List cookies =(List)(Object) new ArrayList();
        URL url = new URL("http://motormouth.com.au/default_fl.aspx");
        HttpURLConnection loginConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        MyHelperClass HTMLParser = new MyHelperClass();
        String viewStateValue =(String)(Object) HTMLParser.parseHTMLInputTagValue(new InputStreamReader(loginConnection.getInputStream()), "__VIEWSTATE");
        setCookies(cookies, loginConnection);
        HttpURLConnection postCredsConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        postCredsConnection.setDoOutput(true);
        postCredsConnection.setRequestMethod("POST");
        postCredsConnection.setInstanceFollowRedirects(false);
        postCredsConnection.setRequestProperty("Cookie", buildCookieString(cookies));
        OutputStreamWriter postCredsWriter = new OutputStreamWriter(postCredsConnection.getOutputStream());
        MyHelperClass URLEncoder = new MyHelperClass();
        postCredsWriter.append("__VIEWSTATE=").append(URLEncoder.encode(viewStateValue, "UTF-8")).append('&');
//        MyHelperClass URLEncoder = new MyHelperClass();
        postCredsWriter.append("Login_Module1%3Ausername=").append(URLEncoder.encode(username, "UTF-8")).append('&');
//        MyHelperClass URLEncoder = new MyHelperClass();
        postCredsWriter.append("Login_Module1%3Apassword=").append(URLEncoder.encode(password, "UTF-8")).append('&');
        postCredsWriter.append("Login_Module1%3AButtonLogin.x=0").append('&');
        postCredsWriter.append("Login_Module1%3AButtonLogin.y=0");
        postCredsWriter.flush();
        postCredsWriter.close();
        int postResponseCode =(int)(Object) postCredsConnection.getResponseCode();
        if (postResponseCode == 302) {
            setCookies(cookies, postCredsConnection);
            URL dataUrl = new URL(url,(String)(Object) postCredsConnection.getHeaderField("Location"));
            HttpURLConnection dataConnection = (HttpURLConnection)(HttpURLConnection)(Object) dataUrl.openConnection();
            dataConnection.setRequestProperty("Cookie", buildCookieString(cookies));
            InputStream dataInputStream =(InputStream)(Object) dataConnection.getInputStream();
            return dataInputStream;
        } else if (postResponseCode == 200) {
            URL dataUrl = new URL(url, "/secure/mymotormouth.aspx");
            HttpURLConnection dataConnection = (HttpURLConnection)(HttpURLConnection)(Object) dataUrl.openConnection();
            dataConnection.setRequestProperty("Cookie", buildCookieString(cookies));
            InputStream dataInputStream =(InputStream)(Object) dataConnection.getInputStream();
            return dataInputStream;
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass append(MyHelperClass o0){ return null; }
	public MyHelperClass append(char o0){ return null; }
	public MyHelperClass parseHTMLInputTagValue(InputStreamReader o0, String o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class List {

}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	URL(URL o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
