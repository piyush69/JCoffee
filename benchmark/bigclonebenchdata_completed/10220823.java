import java.io.*;
import java.lang.*;
import java.util.*;



class c10220823 {

//    @Test
    public void testCopy() throws IOException {
        final byte[] input = { 0x00, 0x01, 0x7F, 0x03, 0x40 };
        final byte[] verification = input.clone();
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertNotSame("Expecting verification to be a new array.", input, verification);
        final ByteArrayInputStream in = new ByteArrayInputStream(input);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, out);
        final byte[] output = out.toByteArray();
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertTrue("Expecting input to be unchanged.", Arrays.equals(verification, input));
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertTrue("Expecting output to be like input.", Arrays.equals(verification, output));
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertNotSame("Expecting output to be a new array.", input, output);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertNotSame("Expecting output to be a new array.", verification, output);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertNotSame(String o0, byte[] o1, byte[] o2){ return null; }
	public MyHelperClass copy(ByteArrayInputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }}

class Test {

}
