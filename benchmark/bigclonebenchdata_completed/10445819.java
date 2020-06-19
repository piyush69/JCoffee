


class c10445819 {
public MyHelperClass url;

    private Reader getReader() throws IOException {
        MyHelperClass data = new MyHelperClass();
        if (data != null) {
            MyHelperClass url = new MyHelperClass();
            if (url != null) throw new IllegalArgumentException("URL for source data and the data itself must never be specified together.");
            MyHelperClass charset = new MyHelperClass();
            if (charset != null) throw new IllegalArgumentException("Charset has sense only for URL-based data");
//            MyHelperClass data = new MyHelperClass();
            return (Reader)(Object)new StringReader(data);
//        MyHelperClass url = new MyHelperClass();
        } else if (url != null) {
            MyHelperClass url = new MyHelperClass();
            InputStream stream =(InputStream)(Object) url.openStream();
            MyHelperClass charset = new MyHelperClass();
            if (charset == null) return (Reader)(Object)new InputStreamReader(stream); else return (Reader)(Object)new InputStreamReader(stream, charset);
        }
        return null;
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

class StringReader {

StringReader(MyHelperClass o0){}
	StringReader(){}}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0, MyHelperClass o1){}
	InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
