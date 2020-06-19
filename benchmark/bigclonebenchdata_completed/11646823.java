


class c11646823 {
public MyHelperClass logException(Exception o0){ return null; }

    public String getContentAsString(String url) {
        StringBuffer sb = new StringBuffer("");
        try {
            URL urlmy = new URL(url);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) urlmy.openConnection();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            HttpURLConnection.setFollowRedirects(true);
            con.setInstanceFollowRedirects(false);
            con.connect();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String s = "";
            while ((s =(String)(Object) br.readLine()) != null) {
                sb.append(s + "\r\n");
            }
            con.disconnect();
        } catch (Exception ex) {
            this.logException(ex);
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setFollowRedirects(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
