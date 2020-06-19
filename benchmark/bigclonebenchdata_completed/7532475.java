


class c7532475 {

    private String getLatestVersion(URL url) throws IOException {
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.connect();
        BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(con.getInputStream())));
        String lines = "";
        String line = null;
        while ((line =(String)(Object) br.readLine()) != null) {
            lines += line;
        }
        con.disconnect();
        return lines;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(BufferedInputStream o0){}
	InputStreamReader(){}}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
