


class c13680335 {

    private String fetchCompareContent() throws IOException {
        MyHelperClass compareTo = new MyHelperClass();
        URL url = new URL(compareTo);
        StringWriter sw = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(url.openStream(), sw);
        return sw.getBuffer().toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, StringWriter o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class StringWriter {

public MyHelperClass getBuffer(){ return null; }}
