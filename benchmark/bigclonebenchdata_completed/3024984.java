import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3024984 {

//    @Test
    public void testCopy_readerToOutputStream() throws Throwable, Exception {
        MyHelperClass inData = new MyHelperClass();
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStreamTest(in);
        Reader reader = new InputStreamReader(in, "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStreamTest(baout, false, true);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(reader, out);
        MyHelperClass inData = new MyHelperClass();
        assertEquals("Sizes differ", inData.length, baout.size());
        MyHelperClass inData = new MyHelperClass();
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
