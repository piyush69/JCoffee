


class c3024993 {
public MyHelperClass fail(){ return null; }

//    @Test
    public void testCopy_readerToWriter_nullOut() throws Exception {
        MyHelperClass inData = new MyHelperClass();
        InputStream in =(InputStream)(Object) new ByteArrayInputStream(inData);
        in =(InputStream)(Object) new YellOnCloseInputStreamTest(in);
        Reader reader =(Reader)(Object) new InputStreamReader(in, "US-ASCII");
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(reader, (Writer) null);
            fail();
        } catch (NullPointerException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, Writer o1){ return null; }}

class Test {

}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(MyHelperClass o0){}}

class YellOnCloseInputStreamTest {

YellOnCloseInputStreamTest(){}
	YellOnCloseInputStreamTest(InputStream o0){}}

class Reader {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class Writer {

}
