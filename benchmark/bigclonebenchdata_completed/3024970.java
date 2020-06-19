import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3024970 {
public MyHelperClass inData;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }

//    @Test
    public void testCopy_inputStreamToOutputStream() throws Throwable, Exception {
        MyHelperClass inData = new MyHelperClass();
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStreamTest(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStreamTest(baout, false, true);
        MyHelperClass IOUtils = new MyHelperClass();
        int count = IOUtils.copy(in, out);
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
