


class c7682331 {

//    @Test
    public void testReadWrite() throws Exception {
        final String reference = "testString";
        final Reader reader =(Reader)(Object) new StringReader(reference);
        final StringWriter osString = new StringWriter();
        final Reader teeStream =(Reader)(Object) new TeeReaderWriter(reader, osString);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(teeStream, new NullWriter());
        teeStream.close();
        osString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, NullWriter o1){ return null; }}

class Reader {

public MyHelperClass close(){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class StringWriter {

}

class TeeReaderWriter {

TeeReaderWriter(){}
	TeeReaderWriter(Reader o0, StringWriter o1){}}

class NullWriter {

}
