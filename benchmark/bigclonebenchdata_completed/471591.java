


class c471591 {
public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPassword(){ return null; }

    private String getFanFouMessage(int pageNo) throws IOException {
        URL url = new URL("http://api.fanfou.com/statuses/user_timeline.json?page=" + pageNo);
        HttpURLConnection request = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        request.setDoOutput(true);
        request.setRequestMethod("GET");
        MyHelperClass Base64 = new MyHelperClass();
        String basicAuth =(String)(Object) Base64.encode((getUsername() + ":" + getPassword()).getBytes());
        request.addRequestProperty("Authorization", "Basic " + basicAuth);
        System.out.println("Sending request...");
        request.connect();
        System.out.println("Response: " + request.getResponseCode() + " " + request.getResponseMessage());
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String b = null;
        StringBuffer sb = new StringBuffer();
        while ((b =(String)(Object) reader.readLine()) != null) {
            sb.append(b);
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
