


class c21843124 {
public MyHelperClass log;

    protected String connectPost(String urlString, String parameter) {
        String response = null;
        try {
            URL url = new URL(urlString);
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            MyHelperClass log = new MyHelperClass();
            log.fine(connection.getURL().toString());
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            out.write(parameter.getBytes());
            out.flush();
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            response =(String)(Object) in.readLine();
            in.close();
//            MyHelperClass log = new MyHelperClass();
            log.finest(response);
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, urlString, e);
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass finest(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
