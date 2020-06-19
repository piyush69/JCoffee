


class c8209783 {

    List HttpGet(URL url) throws IOException {
        List responseList =(List)(Object) new ArrayList();
        MyHelperClass Logger = new MyHelperClass();
        Logger.getInstance().logInfo("HTTP GET: " + url, null, null);
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

public MyHelperClass logInfo(String o0, Object o1, Object o2){ return null; }
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
