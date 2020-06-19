


class c8601875 {
public MyHelperClass parseRobots(String o0){ return null; }

    public void init() throws Exception {
        MyHelperClass url = new MyHelperClass();
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        int code =(int)(Object) conn.getResponseCode();
        if (code != 200) throw new IOException("Error fetching robots.txt; respose code is " + code);
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String buff;
        StringBuilder builder = new StringBuilder();
        while ((buff =(String)(Object) reader.readLine()) != null) builder.append(buff);
        parseRobots(builder.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
