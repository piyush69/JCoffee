


class c11738613 {
public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass password;
	public MyHelperClass user;
	public MyHelperClass host;
	public MyHelperClass logException(Exception o0){ return null; }

    public String move(Integer param) {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("move " + param);
        StringBuffer ret = new StringBuffer();
        try {
            MyHelperClass host = new MyHelperClass();
            URL url = new URL("http://" + host + "/decoder_control.cgi?command=" + param + "&user=" + user + "&pwd=" + password);
            URLConnection con =(URLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                ret.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            logException(e);
            connect(host, user, password);
        }
        return ret.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
