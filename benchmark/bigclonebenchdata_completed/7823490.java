


class c7823490 {

    protected String getRequestContent(String urlText) throws Exception {
        URL url = new URL(urlText);
        HttpURLConnection urlcon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        String line = null;
        try {
            urlcon.setUseCaches(false);
            urlcon.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            line =(String)(Object) reader.readLine();
            reader.close();
        } finally {
            urlcon.disconnect();
        }
        return line;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
