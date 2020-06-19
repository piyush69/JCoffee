import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11032545 {

//    @Test
    public void testCopyOverSize() throws Throwable, IOException {
        MyHelperClass TEST_DATA = new MyHelperClass();
        final InputStream in = new ByteArrayInputStream(TEST_DATA);
        MyHelperClass TEST_DATA = new MyHelperClass();
        final ByteArrayOutputStream out = new ByteArrayOutputStream(TEST_DATA.length);
        MyHelperClass TEST_DATA = new MyHelperClass();
        final int cpySize = ExtraIOUtils.copy(in, out, TEST_DATA.length + Long.SIZE);
        MyHelperClass TEST_DATA = new MyHelperClass();
        assertEquals("Mismatched copy size", TEST_DATA.length, cpySize);
        final byte[] outArray = out.toByteArray();
        MyHelperClass TEST_DATA = new MyHelperClass();
        assertArrayEquals("Mismatched data", TEST_DATA, outArray);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}
