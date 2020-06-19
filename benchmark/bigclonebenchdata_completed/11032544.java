import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11032544 {
public MyHelperClass ArrayUtils;
	public MyHelperClass TEST_DATA;
	public MyHelperClass assertArrayEquals(String o0, byte[] o1, byte[] o2){ return null; }
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

//    @Test
    public void testExactCopySize() throws Throwable, IOException {
        MyHelperClass TEST_DATA = new MyHelperClass();
        final int size = Byte.SIZE + RANDOMIZER.nextInt(TEST_DATA.length - Long.SIZE);
        MyHelperClass TEST_DATA = new MyHelperClass();
        final InputStream in = new ByteArrayInputStream(TEST_DATA);
        final ByteArrayOutputStream out = new ByteArrayOutputStream(size);
        MyHelperClass ExtraIOUtils = new MyHelperClass();
        final int cpySize = ExtraIOUtils.copy(in, out, size);
        assertEquals("Mismatched copy size", size, cpySize);
        final byte[] subArray = ArrayUtils.subarray(TEST_DATA, 0, size), outArray = out.toByteArray();
        assertArrayEquals("Mismatched data", subArray, outArray);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}
