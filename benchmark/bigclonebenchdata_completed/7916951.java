


class c7916951 {
public MyHelperClass URLEncoder;

//    @Override
    public List search(String term) {
        List results = null;
        try {
            MyHelperClass GoogleWebSearch = new MyHelperClass();
            URL url = new URL((int)(Object)GoogleWebSearch.GOOGLE_URL + (int)(Object)URLEncoder.encode(term, GoogleWebSearch.CHARSET));
//            MyHelperClass GoogleWebSearch = new MyHelperClass();
            Reader reader =(Reader)(Object) new InputStreamReader(url.openStream(), GoogleWebSearch.CHARSET);
            GoogleResponse jsonResults =(GoogleResponse)(Object) (new Gson().fromJson(reader, GoogleResponse.class));
            results =(List)(Object) jsonResults.getResponseData().getResults();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List googleResults =(List)(Object) new ArrayList();
        if (results != null) {
            googleResults.addAll(results);
        }
        return googleResults;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CHARSET;
	public MyHelperClass GOOGLE_URL;
public MyHelperClass getResults(){ return null; }
	public MyHelperClass encode(String o0, MyHelperClass o1){ return null; }}

class List {

public MyHelperClass addAll(List o0){ return null; }}

class WebSearchResult {

}

class GoogleResult {

}

class URL {

URL(){}
	URL(int o0){}
	public MyHelperClass openStream(){ return null; }}

class Reader {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, MyHelperClass o1){}}

class GoogleResponse {

public MyHelperClass getResponseData(){ return null; }}

class Gson {

public MyHelperClass fromJson(Reader o0, Class<GoogleResponse> o1){ return null; }}

class ArrayList {

}
