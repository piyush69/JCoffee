


class c1447440 {

    public static String fetch(String str_url) throws IOException {
        URL url;
        URLConnection connection;
        String jsonText = "";
        url = new URL(str_url);
        connection =(URLConnection)(Object) url.openConnection();
        InputStream is =(InputStream)(Object) connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line =(String)(Object) br.readLine()) != null) {
            jsonText += line;
        }
        return jsonText;
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

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
