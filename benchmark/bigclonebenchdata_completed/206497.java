


class c206497 {

    public static void main(String[] args) {
        RSSReader rssreader = new RSSReader();
        try {
            MyHelperClass XmlPullParserFactory = new MyHelperClass();
            XmlPullParserFactory factory =(XmlPullParserFactory)(Object) XmlPullParserFactory.newInstance();
            XmlPullParser parser =(XmlPullParser)(Object) factory.newPullParser();
            String url = args[0];
            InputStreamReader stream = new InputStreamReader(new URL(url).openStream());
            parser.setInput(stream);
            XmlSerializer writer =(XmlSerializer)(Object) factory.newSerializer();
            writer.setOutput(new OutputStreamWriter((PrintStream)(Object)System.out));
            rssreader.convertRSSToHtml(parser, writer);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class RSSReader {

public MyHelperClass convertRSSToHtml(XmlPullParser o0, XmlSerializer o1){ return null; }}

class XmlPullParserFactory {

public MyHelperClass newSerializer(){ return null; }
	public MyHelperClass newPullParser(){ return null; }}

class XmlPullParser {

public MyHelperClass setInput(InputStreamReader o0){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class XmlSerializer {

public MyHelperClass setOutput(OutputStreamWriter o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(PrintStream o0){}
	OutputStreamWriter(){}}

class PrintStream {

}
