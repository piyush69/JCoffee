


class c12734324 {

    public static String post(String url, Map params, String line_delimiter) {
        String response = "";
        try {
            URL _url = new URL(url);
            URLConnection conn =(URLConnection)(Object) _url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            String postdata = "";
            int mapsize =(int)(Object) params.size();
            Iterator keyValue =(Iterator)(Object) params.entrySet().iterator();
            for (int i = 0; i < mapsize; i++) {
                Entry entry = (Entry)(Entry)(Object) keyValue.next();
                String key = (String)(String)(Object) entry.getKey();
                String value = (String)(String)(Object) entry.getValue();
                if (i > 0) postdata += "&";
                MyHelperClass URLEncoder = new MyHelperClass();
                postdata += URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(value, "UTF-8");
            }
            wr.write(postdata);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) response += line + line_delimiter;
            wr.close();
            rd.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class Map {

public MyHelperClass size(){ return null; }
	public MyHelperClass entrySet(){ return null; }}

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

class Iterator {

public MyHelperClass next(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
