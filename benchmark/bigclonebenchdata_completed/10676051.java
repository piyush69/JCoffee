


class c10676051 {
public MyHelperClass urlStr;

    public void sendRequest(String method) {
        try {
            URL url;// = new URL();
            url = new URL(urlStr);
            HttpURLConnection httpURLConnection;// = new HttpURLConnection();
            httpURLConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//            MyHelperClass httpURLConnection = new MyHelperClass();
            httpURLConnection.setRequestMethod(method);
//            MyHelperClass httpURLConnection = new MyHelperClass();
            httpURLConnection.setDoOutput(true);
//            MyHelperClass httpURLConnection = new MyHelperClass();
            httpURLConnection.getOutputStream().flush();
//            MyHelperClass httpURLConnection = new MyHelperClass();
            httpURLConnection.getOutputStream().close();
//            MyHelperClass httpURLConnection = new MyHelperClass();
            System.out.println(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyHelperClass httpURLConnection = new MyHelperClass();
            if (httpURLConnection != null) {
//                MyHelperClass httpURLConnection = new MyHelperClass();
                httpURLConnection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}
