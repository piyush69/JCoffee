


class c7166270 {
public MyHelperClass URLEncoder;

    protected String issueCommandToServer(String command, ChangeCapsule changeCapsule) throws IOException {
        MyHelperClass serverURL = new MyHelperClass();
        URLConnection urlConn =(URLConnection)(Object) serverURL.openConnection();
        urlConn.setDoInput(true);
        urlConn.setDoOutput(true);
        urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        OutputStreamWriter wr = new OutputStreamWriter(urlConn.getOutputStream());
        MyHelperClass ApplyChangesServlet = new MyHelperClass();
        String content = ApplyChangesServlet.PARAMETER_COMMAND + "=" + command;
//        MyHelperClass ApplyChangesServlet = new MyHelperClass();
        content += "&" + ApplyChangesServlet.PARAMETER_CAPSULE + "=" + URLEncoder.encode(changeCapsule.toJSON(), "UTF-8");
        wr.write(content);
        wr.flush();
        BufferedReader input = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        StringBuffer response = new StringBuffer();
        String str;
        while (null != ((str =(String)(Object) input.readLine()))) {
            response.append(str);
        }
        wr.close();
        input.close();
        return response.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PARAMETER_CAPSULE;
	public MyHelperClass PARAMETER_COMMAND;
public MyHelperClass openConnection(){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }}

class ChangeCapsule {

public MyHelperClass toJSON(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
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
