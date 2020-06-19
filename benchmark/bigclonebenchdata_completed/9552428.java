


class c9552428 {

    public static String stringOfUrl(String addr) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.out.println("test");
        URL url = new URL(addr);
        System.out.println("test2");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(url.openStream(), output);
        return output.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
