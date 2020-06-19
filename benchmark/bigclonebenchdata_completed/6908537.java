


class c6908537 {
public MyHelperClass FILE_LOGIN;
	public MyHelperClass get_pw(){ return null; }
	public MyHelperClass get_email(){ return null; }
public MyHelperClass get_sessid(String o0){ return null; }
	public MyHelperClass set_session(String o0){ return null; }

    public String login() {
        System.out.println("Logging in to LOLA");
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String data = URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode((String)(Object)get_email(), "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("pw", "UTF-8") + "=" + URLEncoder.encode((String)(Object)get_pw(), "UTF-8");
            MyHelperClass URL_LOLA = new MyHelperClass();
            URL url = new URL((int)(Object)URL_LOLA + (int)(Object)FILE_LOGIN);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line, sessid;
            line =(String)(Object) rd.readLine();
            sessid =(String)(Object) get_sessid(line);
            this.set_session(sessid);
            wr.close();
            rd.close();
            return sessid;
        } catch (Exception e) {
            System.out.println("Login Error");
            return "";
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
