


class c21106860 {

    private boolean tryGet(String url, Hashtable req) throws Exception {
        boolean result = false;
        Enumeration keys =(Enumeration)(Object) req.keys();
        String key;
        String value;
        String data = "";
        while ((boolean)(Object)keys.hasMoreElements()) {
            key =(String)(Object) keys.nextElement();
            value =(String)(Object) req.get(key);
            MyHelperClass URLEncoder = new MyHelperClass();
            data += URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(value, "UTF-8") + "&";
        }
        URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(data);
        wr.flush();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line =(String)(Object) rd.readLine()) != null) {
            if (line != null) result = true;
        }
        wr.close();
        rd.close();
        result = true;
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class Hashtable {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
