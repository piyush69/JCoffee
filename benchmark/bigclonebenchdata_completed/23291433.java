


class c23291433 {

    public static String sendRequest(String urlstring) {
        URL url;
        String line;
        MyHelperClass Log = new MyHelperClass();
        Log.i("DVBMonitor", "Please wait while receiving data from dvb...");
        try {
            url = new URL(urlstring);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            if ((line =(String)(Object) in.readLine()) != null) {
                return line;
            } else {
                return null;
            }
        } catch (Exception ex) {
//            MyHelperClass Log = new MyHelperClass();
            Log.e("DVBMonitor", ex.toString() + " while sending request to dvb");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
