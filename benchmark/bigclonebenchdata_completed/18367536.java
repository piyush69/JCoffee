


class c18367536 {

    public static void main(String[] args) throws HttpException, IOException {
        String headerName = null;
        String t = "http://localhost:8080/access/content/group/81c8542d-3f58-48cf-ac72-9f482df47ebe/sss/QuestionarioSocioEc.pdf";
        URL url = new URL(t);
        HttpURLConnection srvletConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        srvletConnection.setDoOutput(true);
        srvletConnection.setDoInput(true);
        srvletConnection.setRequestMethod("POST");
        srvletConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
        String myCookie = "JSESSIONID=acab62f5-bc6a-4886-9719-e040e8af3fc6.localhost";
        srvletConnection.setRequestProperty("Cookie", myCookie);
        srvletConnection.setInstanceFollowRedirects(false);
        srvletConnection.connect();
        System.out.println(srvletConnection.getContent());
        System.out.println(srvletConnection.getContentType());
        System.out.println(srvletConnection.getContent().toString());
        System.out.println(srvletConnection.getContentLength());
        System.out.println(srvletConnection.getContentEncoding());
        DataOutputStream out2 = new DataOutputStream(srvletConnection.getOutputStream());
        out2.flush();
        out2.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }}

class DataOutputStream {

DataOutputStream(MyHelperClass o0){}
	DataOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
