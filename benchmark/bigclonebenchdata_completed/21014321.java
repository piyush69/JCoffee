


class c21014321 {

    public static Search Search(String searchString) throws Exception {
        Builder builder = new Builder();
        builder.scheme("http");
        builder.authority("www.goodreads.com");
        builder.path("search/search");
        builder.appendQueryParameter("format", "xml");
        MyHelperClass _ConsumerKey = new MyHelperClass();
        builder.appendQueryParameter("key", _ConsumerKey);
        builder.appendQueryParameter("q", searchString);
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet getSearchResponse = new HttpGet(builder.build().toString());
        HttpResponse searchResponse =(HttpResponse)(Object) httpClient.execute(getSearchResponse);
        MyHelperClass ResponseParser = new MyHelperClass();
        Response searchResponseData =(Response)(Object) ResponseParser.parse(searchResponse.getEntity().getContent());
        return(Search)(Object) searchResponseData.get_Search();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class Search {

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

public MyHelperClass get_Search(){ return null; }}

class Builder {

public MyHelperClass authority(String o0){ return null; }
	public MyHelperClass appendQueryParameter(String o0, String o1){ return null; }
	public MyHelperClass appendQueryParameter(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass scheme(String o0){ return null; }
	public MyHelperClass build(){ return null; }
	public MyHelperClass path(String o0){ return null; }}
