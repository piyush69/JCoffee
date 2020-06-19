


class c3024981 {
public MyHelperClass fail(){ return null; }

//    @Test
    public void testCopy_inputStreamToWriter_Encoding_nullIn() throws Exception {
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out =(OutputStream)(Object) new YellOnFlushAndCloseOutputStreamTest(baout, true, true);
        Writer writer =(Writer)(Object) new OutputStreamWriter(baout, "US-ASCII");
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy((InputStream) null, writer, "UTF8");
            fail();
        } catch (NullPointerException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, Writer o1, String o2){ return null; }}

class Test {

}

class ByteArrayOutputStream {

}

class OutputStream {

}

class YellOnFlushAndCloseOutputStreamTest {

YellOnFlushAndCloseOutputStreamTest(ByteArrayOutputStream o0, boolean o1, boolean o2){}
	YellOnFlushAndCloseOutputStreamTest(){}}

class Writer {

}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(ByteArrayOutputStream o0, String o1){}}

class InputStream {

}
