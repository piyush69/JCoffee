


class c13163484 {

    String getLatestVersion() {
        try {
            MyHelperClass Constants = new MyHelperClass();
            URL url = new URL(Constants.VERSION_FILE_URL);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setConnectTimeout(15000);
            InputStream in =(InputStream)(Object) connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            return(String)(Object) br.readLine();
        } catch (Exception ex) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERSION_FILE_URL;
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
