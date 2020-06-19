


class c15489464 {
public MyHelperClass processRequest(Object o0){ return null; }
	public MyHelperClass processResponse(String o0){ return null; }

    public Object send(URL url, Object params) throws Exception {
        params = processRequest(params);
        String response = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        response += in.readLine();
        while (response != null) response += in.readLine();
        in.close();
        return processResponse(response);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
