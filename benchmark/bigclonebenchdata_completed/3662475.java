


class c3662475 {

    public static String getHtml(DefaultHttpClient httpclient, String url, String encode) throws IOException {
        InputStream input = null;
        HttpGet get = new HttpGet(url);
        HttpResponse res =(HttpResponse)(Object) httpclient.execute(get);
        StatusLine status =(StatusLine)(Object) res.getStatusLine();
        MyHelperClass STATUSCODE_200 = new MyHelperClass();
        if (status.getStatusCode() != STATUSCODE_200) {
            throw new RuntimeException("50001");
        }
        if (res.getEntity() == null) {
            return "";
        }
        input =(InputStream)(Object) res.getEntity().getContent();
        InputStreamReader reader = new InputStreamReader(input, encode);
        BufferedReader bufReader = new BufferedReader(reader);
        String tmp = null, html = "";
        while ((tmp =(String)(Object) bufReader.readLine()) != null) {
            html += tmp;
        }
        if (input != null) {
            input.close();
        }
        return html;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
