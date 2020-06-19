


class c14456152 {
public MyHelperClass logInfo(String o0){ return null; }

    List HttpGet(URL url) throws IOException {
        List responseList =(List)(Object) new ArrayList();
        logInfo("HTTP GET: " + url);
        URLConnection con =(URLConnection)(Object) url.openConnection();
        con.setAllowUserInteraction(false);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) responseList.add(inputLine);
        in.close();
        return responseList;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
