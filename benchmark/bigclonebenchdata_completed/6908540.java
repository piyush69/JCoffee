


class c6908540 {
public MyHelperClass FILE_CREATE_LIST;
	public MyHelperClass get_session(){ return null; }

    public void create_list() {
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String data = URLEncoder.encode("PHPSESSID", "UTF-8") + "=" + URLEncoder.encode((String)(Object)this.get_session(), "UTF-8");
            MyHelperClass URL_LOLA = new MyHelperClass();
            URL url = new URL((int)(Object)URL_LOLA + (int)(Object)FILE_CREATE_LIST);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            line =(String)(Object) rd.readLine();
            wr.close();
            rd.close();
            System.out.println("Gene list saved in LOLA");
        } catch (Exception e) {
            System.out.println("error in createList()");
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(int o0){}
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
