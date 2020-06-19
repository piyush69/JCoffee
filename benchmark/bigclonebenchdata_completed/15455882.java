import java.io.*;
import java.lang.*;
import java.util.*;



class c15455882 {

    private void doPost(String request) throws IOException {
        MyHelperClass DBBroker = new MyHelperClass();
        URL url = new URL("http://localhost:8080/exist/rest" + DBBroker.ROOT_COLLECTION);
        HttpURLConnection connect = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connect.setRequestMethod("POST");
        connect.setDoOutput(true);
        OutputStream os =(OutputStream)(Object) connect.getOutputStream();
        os.write(request.getBytes("UTF-8"));
        connect.connect();
        BufferedReader is = new BufferedReader(new InputStreamReader((InputStream)(Object)connect.getInputStream()));
        String line;
        while ((line = is.readLine()) != null) System.out.println(line);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ROOT_COLLECTION;
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass connect(){ return null; }}
