
import java.io.UncheckedIOException;


class c3341258 {
public MyHelperClass MessageFormat;

    private RssEvent getLastEvent() throws DocumentException, IOException {
        MyHelperClass url = new MyHelperClass();
        Document document =(Document)(Object) (new SAXReader().read(url.openStream()));
        Element item =(Element)(Object) document.getRootElement().element("channel").element("item");
        Date date = new Date();
        String dateStr =(String)(Object) item.element("pubDate").getStringValue();
        try {
            MyHelperClass dateFormat = new MyHelperClass();
            date =(Date)(Object) dateFormat.parse(dateStr);
        } catch (UncheckedIOException e) {
            MyHelperClass FORMAT = new MyHelperClass();
            String message =(String)(Object) MessageFormat.format("Unable to parse string \"{0}\" with pattern \"{1}\".", dateStr, FORMAT);
            MyHelperClass logger = new MyHelperClass();
            logger.warn(message,(ParseException)(Object) e);
        }
        RssEvent event = new RssEvent(this, item.element("title").getStringValue(), item.element("link").getStringValue(), item.element("description").getStringValue(), item.element("author").getStringValue(), date);
        return event;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(String o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass warn(String o0, ParseException o1){ return null; }
	public MyHelperClass element(String o0){ return null; }
	public MyHelperClass getStringValue(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass parse(String o0){ return null; }}

class RssEvent {

RssEvent(){}
	RssEvent(c3341258 o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, Date o5){}}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass element(String o0){ return null; }}

class Date {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class SAXReader {

public MyHelperClass read(MyHelperClass o0){ return null; }}
