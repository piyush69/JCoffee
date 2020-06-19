


class c6957384 {

    public static String sendGetData(URL url, Hashtable data) throws IOException {
        StringBuilder outStringBuilder = new StringBuilder();
        if (data != null) {
            for (Entry entry :(Entry[])(Object) (Object[])(Object)data.entrySet()) {
                MyHelperClass URLEncoder = new MyHelperClass();
                outStringBuilder.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                outStringBuilder.append("=");
//                MyHelperClass URLEncoder = new MyHelperClass();
                outStringBuilder.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                outStringBuilder.append("&");
            }
        }
        URL innerURL = new URL(url.toString() + "?" + outStringBuilder.toString());
        System.out.println("URL: " + innerURL);
        URLConnection urlConnection =(URLConnection)(Object) innerURL.openConnection();
        urlConnection.connect();
        StringBuilder inStringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        Scanner inputScanner = new Scanner(urlConnection.getInputStream());
        while ((boolean)(Object)inputScanner.hasNext()) {
            inStringBuilder.append(inputScanner.next() + " ");
        }
        inputScanner.close();
        reader.close();
        return inStringBuilder.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Hashtable {

public MyHelperClass entrySet(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Scanner {

Scanner(){}
	Scanner(MyHelperClass o0){}
	public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass hasNext(){ return null; }}
