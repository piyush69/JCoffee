


class c22287078 {
public MyHelperClass Logger;
	public MyHelperClass getGatewayId(){ return null; }

//    @Override
    List HttpGet(URL url) throws IOException {
        List responseList =(List)(Object) new ArrayList();
        Logger.getInstance().logInfo("HTTP GET: " + url, null, getGatewayId());
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setConnectTimeout(20000);
        con.setAllowUserInteraction(false);
        responseList.add(con.getResponseCode() + " " + con.getResponseMessage());
        InputStream inputStream =(InputStream)(Object) con.getErrorStream();
        if (inputStream == null) inputStream =(InputStream)(Object) con.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) responseList.add(inputLine);
        in.close();
        return responseList;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logInfo(String o0, Object o1, MyHelperClass o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class HttpURLConnection {

public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
