


class c9907405 {
public MyHelperClass Log;
	public MyHelperClass setContentView(TextView o0){ return null; }

//    @Override
    public void onCreate(Bundle icicle) {
        this.onCreate(icicle);
        TextView tv = new TextView(this);
        try {
            URL url = new URL("");
            MyHelperClass SAXParserFactory = new MyHelperClass();
            SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
            SAXParser sp =(SAXParser)(Object) spf.newSAXParser();
            XMLReader xr =(XMLReader)(Object) sp.getXMLReader();
            ExampleHandler myExampleHandler = new ExampleHandler();
            xr.setContentHandler(myExampleHandler);
            xr.parse(new InputSource(url.openStream()));
            ParsedExampleDataSet parsedExampleDataSet =(ParsedExampleDataSet)(Object) myExampleHandler.getParsedData();
            tv.setText(parsedExampleDataSet.toString());
        } catch (Exception e) {
            tv.setText("Error: " + e.getMessage());
            MyHelperClass MY_DEBUG_TAG = new MyHelperClass();
            Log.e(MY_DEBUG_TAG, "WeatherQueryError", e);
        }
        this.setContentView(tv);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, Exception o2){ return null; }}

class Bundle {

}

class TextView {

TextView(){}
	TextView(c9907405 o0){}
	public MyHelperClass setText(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(ExampleHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class ExampleHandler {

public MyHelperClass getParsedData(){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}}

class ParsedExampleDataSet {

}
