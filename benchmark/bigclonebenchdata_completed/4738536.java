


class c4738536 {
public MyHelperClass ApiResponse;

//    @Override
    protected Void doInBackground(String... urls) {
        MyHelperClass Log = new MyHelperClass();
        Log.d("ParseTask", "Getting URL " + urls[0]);
        try {
            MyHelperClass SAXParserFactory = new MyHelperClass();
            XMLReader reader =(XMLReader)(Object) SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            MyHelperClass mParser = new MyHelperClass();
            reader.setContentHandler(mParser);
            reader.parse(new InputSource(new URL(urls[0]).openStream()));
        } catch (Exception e) {
            MyHelperClass mCallback = new MyHelperClass();
            if (mCallback != null) mCallback.OnFailure(new ApiResponseObject(ApiResponse.RESPONSE_CRITICAL_FAILURE, e.getLocalizedMessage()));
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RESPONSE_CRITICAL_FAILURE;
public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass OnFailure(ApiResponseObject o0){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }
	public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(MyHelperClass o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class ApiResponseObject {

ApiResponseObject(){}
	ApiResponseObject(MyHelperClass o0, String o1){}}
