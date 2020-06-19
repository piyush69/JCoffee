


class c11513369 {

    private RSSFeed getFeed(String urlToRssFeed) {
        try {
            URL url = new URL(urlToRssFeed);
            MyHelperClass SAXParserFactory = new MyHelperClass();
            SAXParserFactory factory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
            SAXParser parser =(SAXParser)(Object) factory.newSAXParser();
            XMLReader xmlreader =(XMLReader)(Object) parser.getXMLReader();
            RSSHandler theRssHandler = new RSSHandler();
            xmlreader.setContentHandler(theRssHandler);
            InputSource is = new InputSource(url.openStream());
            xmlreader.parse(is);
            return(RSSFeed)(Object) theRssHandler.getFeed();
        } catch (Exception ee) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class RSSFeed {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setContentHandler(RSSHandler o0){ return null; }}

class RSSHandler {

public MyHelperClass getFeed(){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}}
