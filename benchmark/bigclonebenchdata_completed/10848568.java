


class c10848568 {

    private static void main(String mp3Path) throws IOException {
        String convPath = "http://android.adinterest.biz/wav2mp3.php?k=";
        String uri = convPath + mp3Path;
        URL rssurl = new URL(uri);
        InputStream is =(InputStream)(Object) rssurl.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String buf = "";
        while ((buf =(String)(Object) br.readLine()) != null) {
        }
        is.close();
        br.close();
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

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
