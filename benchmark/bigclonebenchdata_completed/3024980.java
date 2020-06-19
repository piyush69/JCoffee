import java.io.*;
import java.lang.*;
import java.util.*;



class c3024980 {
public MyHelperClass inData;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }

//    @Test
    public void testCopy_inputStreamToWriter_Encoding() throws Exception {
        MyHelperClass inData = new MyHelperClass();
        InputStream in = new ByteArrayInputStream((byte[])(Object)inData);
        in =(InputStream)(Object) new YellOnCloseInputStreamTest(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStreamTest out = new YellOnFlushAndCloseOutputStreamTest(baout, true, true);
        Writer writer = new OutputStreamWriter(baout, "US-ASCII");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        assertTrue("Not all bytes were read", in.available() == 0);
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes, "UTF8").getBytes("US-ASCII");
        assertTrue("Content differs", Arrays.equals((long[])(Object)inData,(long[])(Object) bytes));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, Writer o1, String o2){ return null; }}

class Test {

}

class YellOnCloseInputStreamTest {

YellOnCloseInputStreamTest(){}
	YellOnCloseInputStreamTest(InputStream o0){}}

class YellOnFlushAndCloseOutputStreamTest {

YellOnFlushAndCloseOutputStreamTest(ByteArrayOutputStream o0, boolean o1, boolean o2){}
	YellOnFlushAndCloseOutputStreamTest(){}
	public MyHelperClass off(){ return null; }}
