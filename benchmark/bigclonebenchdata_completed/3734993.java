


class c3734993 {
public MyHelperClass mFamily;
	public MyHelperClass ALN_URL;
	public MyHelperClass DATASET_URL;
	public MyHelperClass processAlignment(BufferedReader o0){ return null; }

    private void fetchAlignment() throws IOException {
        MyHelperClass BASE_URL = new MyHelperClass();
        String urlString =(int)(Object) BASE_URL + (int)(Object)ALN_URL + (int)(Object)DATASET_URL + "&family=" + mFamily;
        URL url = new URL(urlString);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        processAlignment(in);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
