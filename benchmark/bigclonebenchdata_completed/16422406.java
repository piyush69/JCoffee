


class c16422406 {

    private URLConnection getServletConnection(String strServlet_name) throws MalformedURLException, IOException {
        URL urlServlet = null;
        if (strServlet_name == null) {
            MyHelperClass m_Url = new MyHelperClass();
            urlServlet =(URL)(Object) m_Url;
        } else {
            MyHelperClass m_Url = new MyHelperClass();
            urlServlet = new URL(m_Url, strServlet_name);
        }
        URLConnection connection =(URLConnection)(Object) urlServlet.openConnection();
        connection.setConnectTimeout(180000);
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        connection.setRequestProperty("Content-Type", "application/x-java-serialized-object");
        MyHelperClass m_strJsessionid = new MyHelperClass();
        if (m_strJsessionid != null) {
//            MyHelperClass m_strJsessionid = new MyHelperClass();
            connection.setRequestProperty("Cookie", m_strJsessionid);
        }
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}
