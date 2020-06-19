


class c3175529 {

    private static String connect(String apiURL, boolean secure) throws IOException {
        String baseUrl;
        if (secure) baseUrl = "https://todoist.com/API/"; else baseUrl = "http://todoist.com/API/";
        URL url = new URL(baseUrl + apiURL);
        URLConnection c =(URLConnection)(Object) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
        StringBuilder toReturn = new StringBuilder("");
        String toAppend;
        while ((toAppend =(String)(Object) in.readLine()) != null) toReturn.append(toAppend);
        return toReturn.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
