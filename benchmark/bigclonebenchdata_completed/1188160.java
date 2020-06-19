


class c1188160 {

    public static String urlContentToString(URL url, String encoding) throws IOException {
        String out = "";
        MyHelperClass Constants = new MyHelperClass();
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), Constants.ENCODING));
        String line;
        while ((line =(String)(Object) in.readLine()) != null) {
            out += line;
        }
        in.close();
        return out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCODING;
}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}}
