


class c4599608 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:6557");
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestMethod("HEAD");
            int responseCode =(int)(Object) conn.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String decodedString;
            while ((decodedString =(String)(Object) in.readLine()) != null) {
                System.out.println(decodedString);
            }
            in.close();
            conn.disconnect();
        } catch (Exception ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(TestSSLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class TestSSLConnection {

}
