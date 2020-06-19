


class c7356945 {

    public void run() {
        try {
            MyHelperClass LOGGER = new MyHelperClass();
            if ((boolean)(Object)LOGGER.isDebugEnabled()) {
                MyHelperClass checkUrl = new MyHelperClass();
                LOGGER.debug("Checking for updates at " + checkUrl);
            }
            MyHelperClass checkUrl = new MyHelperClass();
            URL url = new URL(checkUrl);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.connect();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuffer content = new StringBuffer();
                String s =(String)(Object) reader.readLine();
                while (s != null) {
                    content.append(s);
                    s =(String)(Object) reader.readLine();
                }
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.info("update-available", content.toString());
//            MyHelperClass LOGGER = new MyHelperClass();
            } else if ((boolean)(Object)LOGGER.isDebugEnabled()) {
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.debug("No update available (Response code " + connection.getResponseCode() + ")");
            }
        } catch (Throwable e) {
            MyHelperClass LOGGER = new MyHelperClass();
            if ((boolean)(Object)LOGGER.isDebugEnabled()) {
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.debug("Update check failed", e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass info(String o0, String o1){ return null; }
	public MyHelperClass debug(String o0, Throwable o1){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
