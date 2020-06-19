


class c8043909 {

    public static void main(String[] args) {
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String data = URLEncoder.encode("page", "UTF-8") + "=" + URLEncoder.encode("admin", "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("nick", "UTF-8") + "=" + URLEncoder.encode("k", "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("key", "UTF-8") + "=" + URLEncoder.encode("asdf", "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("login", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8");
            URL url = new URL("http://localhost:80/test/index.php");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                System.out.println(line);
            }
            wr.close();
            rd.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

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
