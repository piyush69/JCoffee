


class c10642765 {

    protected Reader getText() throws IOException {
        MyHelperClass url = new MyHelperClass();
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String readLine;
        do {
            readLine =(String)(Object) br.readLine();
        } while (readLine != null && readLine.indexOf("</table><br clear=all>") < 0);
        return (Reader)(Object)br;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class Reader {

}

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
