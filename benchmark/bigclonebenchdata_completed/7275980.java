


class c7275980 {

    public static void main(String[] args) throws IOException {
        MyHelperClass Utils = new MyHelperClass();
        PostParameter a1 = new PostParameter("v",(String)(Object) Utils.encode("1.0"));
        MyHelperClass RenRenConstant = new MyHelperClass();
        PostParameter a2 = new PostParameter("api_key",(String)(Object) Utils.encode((String)(Object)RenRenConstant.apiKey));
//        MyHelperClass Utils = new MyHelperClass();
        PostParameter a3 = new PostParameter("method",(String)(Object) Utils.encode("notifications.send"));
        PostParameter a4 = new PostParameter("call_id", System.nanoTime());
//        MyHelperClass Utils = new MyHelperClass();
        PostParameter a5 = new PostParameter("session_key",(String)(Object) Utils.encode("5.22af9ee9ad842c7eb52004ece6e96b10.86400.1298646000-350727914"));
//        MyHelperClass Utils = new MyHelperClass();
        PostParameter a6 = new PostParameter("to_ids",(String)(Object) Utils.encode("350727914"));
        PostParameter a7 = new PostParameter("notification", "又到了要睡觉的时间了。");
//        MyHelperClass Utils = new MyHelperClass();
        PostParameter a8 = new PostParameter("format",(String)(Object) Utils.encode("JSON"));
//        MyHelperClass RenRenConstant = new MyHelperClass();
        RenRenPostParameters ps = new RenRenPostParameters(Utils.encode((String)(Object)RenRenConstant.secret));
        ps.addParameter(a1);
        ps.addParameter(a2);
        ps.addParameter(a3);
        ps.addParameter(a4);
        ps.addParameter(a5);
        ps.addParameter(a6);
        ps.addParameter(a7);
        ps.addParameter(a8);
//        MyHelperClass RenRenConstant = new MyHelperClass();
        System.out.println(RenRenConstant.apiUrl + "?" + ps.generateUrl());
//        MyHelperClass RenRenConstant = new MyHelperClass();
        URL url = new URL(RenRenConstant.apiUrl + "?" + ps.generateUrl());
        HttpURLConnection request = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        request.setDoOutput(true);
        request.setRequestMethod("POST");
        System.out.println("Sending request...");
        request.connect();
        System.out.println("Response: " + request.getResponseCode() + " " + request.getResponseMessage());
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String b = null;
        while ((b =(String)(Object) reader.readLine()) != null) {
            System.out.println(b);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass apiKey;
	public MyHelperClass apiUrl;
	public MyHelperClass secret;
public MyHelperClass encode(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PostParameter {

PostParameter(String o0, String o1){}
	PostParameter(){}
	PostParameter(String o0, long o1){}}

class RenRenPostParameters {

RenRenPostParameters(MyHelperClass o0){}
	RenRenPostParameters(){}
	public MyHelperClass generateUrl(){ return null; }
	public MyHelperClass addParameter(PostParameter o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

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
