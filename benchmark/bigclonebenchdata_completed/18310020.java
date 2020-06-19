


class c18310020 {

    public static String postToAddress(Map params, String address) throws Exception {
        String data = "";
        String separator = "";
        for (String key :(String[])(Object) (Object[])(Object)params.keySet()) {
            MyHelperClass URLEncoder = new MyHelperClass();
            data += separator + URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode((String)(Object)params.get(key), "UTF-8");
            separator = "&";
        }
        System.out.println("sending: " + data);
        URL url = new URL(address);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(data);
        wr.flush();
        StringBuilder sb = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line =(String)(Object) rd.readLine()) != null) {
            sb.append(line + System.getProperty("line.separator"));
        }
        wr.close();
        rd.close();
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

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
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
