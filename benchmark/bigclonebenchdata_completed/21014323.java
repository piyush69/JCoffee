


class c21014323 {
public static MyHelperClass _Consumer;
	public static MyHelperClass ResponseParser;
	public static MyHelperClass get_IsAuthenticated(){ return null; }
//public MyHelperClass _Consumer;
//	public MyHelperClass ResponseParser;
//	public MyHelperClass get_IsAuthenticated(){ return null; }

    public static Book GetReviewsForBook(String bookId, int page) throws Exception {
        Builder builder = new Builder();
        builder.scheme("http");
        builder.authority("www.goodreads.com");
        builder.path("book/show");
        MyHelperClass _ConsumerKey = new MyHelperClass();
        builder.appendQueryParameter("key", _ConsumerKey);
        builder.appendQueryParameter("page", Integer.toString(page));
        builder.appendQueryParameter("id", bookId);
        builder.appendQueryParameter("format", "xml");
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(builder.build().toString());
        if ((boolean)(Object)get_IsAuthenticated()) {
            _Consumer.sign(getRequest);
        }
        HttpResponse response =(HttpResponse)(Object) httpClient.execute(getRequest);
        Response responseData =(Response)(Object) ResponseParser.parse(response.getEntity().getContent());
        return(Book)(Object) responseData.get_Book();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }
	public MyHelperClass sign(HttpGet o0){ return null; }}

class Book {

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

public MyHelperClass get_Book(){ return null; }}

class Builder {

public MyHelperClass authority(String o0){ return null; }
	public MyHelperClass appendQueryParameter(String o0, String o1){ return null; }
	public MyHelperClass appendQueryParameter(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass scheme(String o0){ return null; }
	public MyHelperClass build(){ return null; }
	public MyHelperClass path(String o0){ return null; }}
