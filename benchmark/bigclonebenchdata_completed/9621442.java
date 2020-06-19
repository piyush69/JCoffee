


class c9621442 {

    private String fetchContent() throws IOException {
        MyHelperClass url = new MyHelperClass();
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer buf = new StringBuffer();
        String str;
        while ((str =(String)(Object) reader.readLine()) != null) {
            buf.append(str);
        }
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
