


class c8688865 {
public MyHelperClass sendMessage(String o0, String o1){ return null; }

    private void translate(String sender, String message) {
        StringTokenizer st = new StringTokenizer(message, " ");
        message = message.replaceFirst((String)(Object)st.nextToken(), "");
        String typeCode =(String)(Object) st.nextToken();
        message = message.replaceFirst(typeCode, "");
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String data =(String)(Object) URLEncoder.encode(message, "UTF-8");
            URL url = new URL("http://babelfish.altavista.com/babelfish/tr?doit=done&urltext=" + data + "&lp=" + typeCode);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                if (line.contains("input type=hidden name=\"q\"")) {
                    String[] tokens = line.split("\"");
                    sendMessage(sender, tokens[3]);
                }
            }
            wr.close();
            rd.close();
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

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
