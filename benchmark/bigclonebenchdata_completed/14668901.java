


class c14668901 {

    public List executeGet(HttpTransport transport, String targetUrl) throws HttpResponseException, IOException {
        HttpRequest req =(HttpRequest)(Object) transport.buildGetRequest();
        req.setUrl(targetUrl);
        NotifyFeed feed =(NotifyFeed)(Object) req.execute().parseAs(NotifyFeed.class);
        if (feed.entry == null) {
            MyHelperClass Collections = new MyHelperClass();
            return(List)(Object) Collections.emptyList();
        }
        List results =(List)(Object) new ArrayList();
        for (NotifyEntry e :(NotifyEntry[])(Object) (Object[])(Object)feed.entry) {
            StringBuilder buffer = new StringBuilder();
            if (e.id != null) {
                buffer.append(e.id);
            }
            buffer.append("@");
            if (e.updated != null) {
                buffer.append(e.updated.toStringRfc3339().substring(0, 19) + "Z");
            }
            MyHelperClass Datastore = new MyHelperClass();
            Key key =(Key)(Object) Datastore.createKey(T_new.class, buffer.toString());
            T_new news = new T_new();
            news.setTitle(e.title);
            if (e.content != null) {
                news.setNewText(e.content.substring(0, Math.min((int)(Object)e.content.length(), 500)));
            }
            if (e.status != null && e.content == null) {
                news.setNewText(e.status);
            }
            if (e.updated != null) {
                news.setCreatedAt(new Date(e.updated.value));
            }
            news.setContentUrl(e.getAlternate());
            if (e.author != null) {
                news.setAuthor(e.author.name);
            }
            news.setKey(key);
            results.add(news);
        }
        return results;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass name;
	public MyHelperClass value;
public MyHelperClass toStringRfc3339(){ return null; }
	public MyHelperClass parseAs(Class<NotifyFeed> o0){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass createKey(Class<T_new> o0, String o1){ return null; }
	public MyHelperClass emptyList(){ return null; }}

class HttpTransport {

public MyHelperClass buildGetRequest(){ return null; }}

class List {

public MyHelperClass add(T_new o0){ return null; }}

class T_new {

public MyHelperClass setAuthor(MyHelperClass o0){ return null; }
	public MyHelperClass setCreatedAt(Date o0){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setKey(Key o0){ return null; }
	public MyHelperClass setNewText(MyHelperClass o0){ return null; }
	public MyHelperClass setContentUrl(MyHelperClass o0){ return null; }}

class HttpResponseException extends Exception{
	public HttpResponseException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpRequest {

public MyHelperClass setUrl(String o0){ return null; }
	public MyHelperClass execute(){ return null; }}

class NotifyFeed {
public MyHelperClass entry;
}

class ArrayList {

}

class NotifyEntry {
public MyHelperClass id;
	public MyHelperClass title;
	public MyHelperClass author;
	public MyHelperClass content;
	public MyHelperClass status;
	public MyHelperClass updated;
public MyHelperClass getAlternate(){ return null; }}

class Key {

}

class Date {

Date(MyHelperClass o0){}
	Date(){}}
