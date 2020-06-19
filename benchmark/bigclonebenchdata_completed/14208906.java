


class c14208906 {
public MyHelperClass m_strUrl;

    private void logoutUser(String session) {
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String data = URLEncoder.encode("SESSION", "UTF-8") + "=" + URLEncoder.encode("" + session, "UTF-8");
            MyHelperClass _log = new MyHelperClass();
            if (_log != null) _log.error("Voice: logoutUser = " + m_strUrl + "LogoutUserServlet&" + data);
            MyHelperClass m_strUrl = new MyHelperClass();
            URL url = new URL(m_strUrl + "LogoutUserServlet");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            wr.close();
            rd.close();
        } catch (Exception e) {
            MyHelperClass _log = new MyHelperClass();
            if (_log != null) _log.error("Voice error : " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
