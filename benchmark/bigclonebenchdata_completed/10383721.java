
import java.io.UncheckedIOException;


class c10383721 {

    @SuppressWarnings("unchecked")
    private ReaderFeed processEntrys(String urlStr, String currentFlag) throws UnsupportedEncodingException, IOException, JDOMException {
        String key = "processEntrys@" + urlStr + "_" + currentFlag;
        MyHelperClass cache = new MyHelperClass();
        if ((boolean)(Object)cache.containsKey(key)) {
//            MyHelperClass cache = new MyHelperClass();
            return (ReaderFeed)(ReaderFeed)(Object) cache.get(key);
        }
        List postList =(List)(Object) new ArrayList();
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        MyHelperClass sid = new MyHelperClass();
        connection.setRequestProperty("Cookie", "SID=" + sid);
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        SAXBuilder builder = new SAXBuilder(false);
        Document doc =(Document)(Object) builder.build(reader);
        Element root =(Element)(Object) doc.getRootElement();
        Namespace grNamespace =(Namespace)(Object) root.getNamespace("gr");
        Namespace namespace =(Namespace)(Object) root.getNamespace();
        String newflag =(String)(Object) root.getChildText("continuation", grNamespace);
        String title =(String)(Object) root.getChildText("title", namespace);
        String subTitle =(String)(Object) root.getChildText("subtitle", namespace);
        List entryList =(List)(Object) root.getChildren("entry", namespace);
        DateFormat sdf =(DateFormat)(Object) new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        for (Element e :(Element[])(Object) (Object[])(Object)entryList) {
            Post post = new Post();
            post.setTitle(e.getChildText("title", namespace));
            try {
                post.setDate(sdf.parse(e.getChildText("published", namespace)));
            } catch (UncheckedIOException e1) {
            }
            post.setUrl(e.getChild("link", namespace).getAttributeValue("href"));
            post.setSauthor(e.getChild("author", namespace).getChildText("name", namespace));
            String content =(String)(Object) e.getChildText("content", namespace);
            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isEmpty(content)) {
                content =(String)(Object) e.getChildText("description", namespace);
            }
//            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isEmpty(content)) {
                content =(String)(Object) e.getChildText("summary", namespace);
            }
            post.setContent(content);
            postList.add(post);
        }
        ReaderFeed readerFeed = new ReaderFeed();
        readerFeed.setTitle(title);
        readerFeed.setSubTitle(subTitle);
        readerFeed.setFlag(newflag);
        readerFeed.setPostList(postList);
//        MyHelperClass cache = new MyHelperClass();
        cache.put(key, readerFeed);
        return readerFeed;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getChildText(String o0, Namespace o1){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass put(String o0, ReaderFeed o1){ return null; }
	public MyHelperClass getAttributeValue(String o0){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }}

class ReaderFeed {

public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass setSubTitle(String o0){ return null; }
	public MyHelperClass setFlag(String o0){ return null; }
	public MyHelperClass setPostList(List o0){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}

class List {

public MyHelperClass add(Post o0){ return null; }}

class Post {

public MyHelperClass setDate(MyHelperClass o0){ return null; }
	public MyHelperClass setSauthor(MyHelperClass o0){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setUrl(MyHelperClass o0){ return null; }
	public MyHelperClass setContent(String o0){ return null; }}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class SAXBuilder {

SAXBuilder(){}
	SAXBuilder(boolean o0){}
	public MyHelperClass build(BufferedReader o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getChildren(String o0, Namespace o1){ return null; }
	public MyHelperClass getChildText(String o0, Namespace o1){ return null; }
	public MyHelperClass getNamespace(String o0){ return null; }
	public MyHelperClass getNamespace(){ return null; }
	public MyHelperClass getChild(String o0, Namespace o1){ return null; }}

class Namespace {

}

class DateFormat {

public MyHelperClass parse(MyHelperClass o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
