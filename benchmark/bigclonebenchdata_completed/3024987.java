import java.io.*;
import java.lang.*;
import java.util.*;



class c3024987 {
public MyHelperClass assertTrue(String o0, boolean o1){ return null; }

//    @Test
    public void testCopy_readerToOutputStream_Encoding() throws Exception {
        MyHelperClass inData = new MyHelperClass();
        InputStream in = new ByteArrayInputStream((byte[])(Object)inData);
        in =(InputStream)(Object) new YellOnCloseInputStreamTest(in);
        Reader reader = new InputStreamReader(in, "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out =(OutputStream)(Object) new YellOnFlushAndCloseOutputStreamTest(baout, false, true);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(reader, out, "UTF16");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes, "UTF16").getBytes("US-ASCII");
//        MyHelperClass inData = new MyHelperClass();
        assertTrue("Content differs", Arrays.equals((long[])(Object)inData,(long[])(Object) bytes));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, OutputStream o1, String o2){ return null; }}

class Test {

}

class YellOnCloseInputStreamTest {

YellOnCloseInputStreamTest(){}
	YellOnCloseInputStreamTest(InputStream o0){}}

class YellOnFlushAndCloseOutputStreamTest {

YellOnFlushAndCloseOutputStreamTest(ByteArrayOutputStream o0, boolean o1, boolean o2){}
	YellOnFlushAndCloseOutputStreamTest(){}}
