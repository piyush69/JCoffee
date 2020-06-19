


class c16061197 {

    public String getContent() throws IOException {
        String result = new String();
        MyHelperClass url = new MyHelperClass();
        if (url == null) return null;
        HttpURLConnection conn;// = new HttpURLConnection();
        conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//        MyHelperClass conn = new MyHelperClass();
        conn.setRequestProperty("User-Agent", "Internet Explorer");
//        MyHelperClass conn = new MyHelperClass();
        conn.setReadTimeout(50000);
//        MyHelperClass conn = new MyHelperClass();
        conn.connect();
        BufferedReader httpReader;// = new BufferedReader();
        httpReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        MyHelperClass httpReader = new MyHelperClass();
        String str =(String)(Object) httpReader.readLine();
        while (str != null) {
            result += str;
//            MyHelperClass httpReader = new MyHelperClass();
            str =(String)(Object) httpReader.readLine();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
