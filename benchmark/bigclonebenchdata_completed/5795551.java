


class c5795551 {

    public static void main(String[] args) throws Exception {
        System.setProperty("debug", "debug");
        OAuthConsumer consumer =(OAuthConsumer)(Object) new DefaultOAuthConsumer("YmRF4HDvikvwDxYafsaK", "r)q7L!4X$j$nTS0lXAjC=al9Xf*cLOdyFJsy%2OE");
        consumer.setTokenWithSecret("5722da60fee79ef9efc2d383f871d550", "39142f31ad8a7e6ff7b87f36cc9e8f10");
        URL url = new URL("http://api.t.sohu.com/statuses/update.json");
        HttpURLConnection request = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        request.setDoOutput(true);
        request.setRequestMethod("POST");
        HttpParameters para = new HttpParameters();
        MyHelperClass URLEncoder = new MyHelperClass();
        para.put("status", URLEncoder.encode("中 文", "utf-8").replaceAll("\\+", "%20"));
        consumer.setAdditionalParameters(para);
        consumer.sign(request);
        OutputStream ot =(OutputStream)(Object) request.getOutputStream();
//        MyHelperClass URLEncoder = new MyHelperClass();
        ot.write(("status=" + URLEncoder.encode("1中 文", "utf-8")).replaceAll("\\+", "%20").getBytes());
        ot.flush();
        ot.close();
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

public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class OAuthConsumer {

public MyHelperClass setTokenWithSecret(String o0, String o1){ return null; }
	public MyHelperClass setAdditionalParameters(HttpParameters o0){ return null; }
	public MyHelperClass sign(HttpURLConnection o0){ return null; }}

class DefaultOAuthConsumer {

DefaultOAuthConsumer(String o0, String o1){}
	DefaultOAuthConsumer(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpParameters {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
