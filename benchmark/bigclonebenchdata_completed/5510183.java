


class c5510183 {

    public static String getMyGlobalIP() {
        try {
            MyHelperClass IPSERVER = new MyHelperClass();
            URL url = new URL(IPSERVER);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String ip =(String)(Object) in.readLine();
            in.close();
            con.disconnect();
            return ip;
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
