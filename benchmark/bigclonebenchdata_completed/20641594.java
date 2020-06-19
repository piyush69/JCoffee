


class c20641594 {

    public static InputStream getInputStreamFromUrl(String url) {
        InputStream content = null;
        try {
            HttpGet httpGet = new HttpGet(url);
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpGet);
            content =(InputStream)(Object) response.getEntity().getContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}
