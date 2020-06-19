


class c5998352 {
public MyHelperClass IOUtils;
	public MyHelperClass assertEquals(String o0, String o1, String o2){ return null; }

//    @Test
    public void testStandardTee() throws Exception {
        final String reference = "test";
        final Reader source =(Reader)(Object) new StringReader(reference);
        final StringWriter destination1 = new StringWriter();
        final StringWriter destination2 = new StringWriter();
        final TeeWriter tee = new TeeWriter(destination1, destination2);
        IOUtils.copy(source, tee);
        tee.close();
        assertEquals("the two string are equals", reference, destination1.toString());
        assertEquals("the two string are equals", reference, destination2.toString());
        assertEquals("byte count",(String)(Object) reference.length(),(String)(Object) tee.getSize());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, TeeWriter o1){ return null; }}

class Test {

}

class Reader {

}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class StringWriter {

}

class TeeWriter {

TeeWriter(){}
	TeeWriter(StringWriter o0, StringWriter o1){}
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass close(){ return null; }}
