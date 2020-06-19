


class c21014326 {

    public static Author GetBooksByAuthor(String authorId, int page) throws Exception {
        Builder builder = new Builder();
        builder.scheme("http");
        builder.authority("www.goodreads.com");
        builder.path("author/list/" + authorId + ".xml");
        MyHelperClass _ConsumerKey = new MyHelperClass();
        builder.appendQueryParameter("key", _ConsumerKey);
        builder.appendQueryParameter("page", Integer.toString(page));
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet getResponse = new HttpGet(builder.build().toString());
        HttpResponse response =(HttpResponse)(Object) httpClient.execute(getResponse);
        MyHelperClass ResponseParser = new MyHelperClass();
        Response responseData =(Response)(Object) ResponseParser.parse(response.getEntity().getContent());
        return(Author)(Object) responseData.get_Author();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class Author {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Response {

public MyHelperClass get_Author(){ return null; }}

class Builder {

public MyHelperClass authority(String o0){ return null; }
	public MyHelperClass appendQueryParameter(String o0, String o1){ return null; }
	public MyHelperClass appendQueryParameter(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass scheme(String o0){ return null; }
	public MyHelperClass build(){ return null; }
	public MyHelperClass path(String o0){ return null; }}
