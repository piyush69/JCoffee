


class c21840703 {
public MyHelperClass assertTrue(boolean o0){ return null; }

//    @Test
    public void parse() throws Exception {
        URL url = new URL("http://www.oki.com");
        HtmlParser parser = new HtmlParser();
        MyHelperClass FileUtilities = new MyHelperClass();
        byte[] bytes =(byte[])(Object) FileUtilities.getContents(url.openStream(), Integer.MAX_VALUE).toByteArray();
        OutputStream parsed =(OutputStream)(Object) parser.parse(new ByteArrayInputStream(bytes), new ByteArrayOutputStream());
        assertTrue(parsed.toString().indexOf("Oki") > -1);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass getContents(MyHelperClass o0, int o1){ return null; }}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class HtmlParser {

public MyHelperClass parse(ByteArrayInputStream o0, ByteArrayOutputStream o1){ return null; }}

class OutputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class ByteArrayOutputStream {

}
