import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3024977 {
public MyHelperClass inData;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }

//    @Test
    public void testCopy_inputStreamToWriter() throws Throwable, Exception {
        MyHelperClass inData = new MyHelperClass();
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStreamTest(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStreamTest out = new YellOnFlushAndCloseOutputStreamTest(baout, true, true);
        Writer writer = new OutputStreamWriter(baout, "US-ASCII");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, writer);
        out.off();
        writer.flush();
        assertTrue("Not all bytes were read", in.available() == 0);
        assertEquals("Sizes differ", inData.length, baout.size());
        assertTrue("Content differs", Arrays.equals(inData, baout.toByteArray()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class YellOnCloseInputStreamTest {

}

class YellOnFlushAndCloseOutputStreamTest {

}
