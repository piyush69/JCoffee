


class c3024973 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertEquals(String o0, long o1, MyHelperClass o2){ return null; }

//    @Test
    public void testCopy_inputStreamToOutputStream_IO84() throws Exception {
        long size = (long) Integer.MAX_VALUE + (long) 1;
        InputStream in =(InputStream)(Object) new NullInputStreamTest(size);
        OutputStream out = new OutputStream() {

//            @Override
            public void write(int b) throws IOException {
            }

//            @Override
            public void write(byte[] b) throws IOException {
            }

//            @Override
            public void write(byte[] b, int off, int len) throws IOException {
            }
        };
        MyHelperClass IOUtils = new MyHelperClass();
        assertEquals(-1, IOUtils.copy(in, out));
        in.close();
//        MyHelperClass IOUtils = new MyHelperClass();
        assertEquals("copyLarge()", size, IOUtils.copyLarge(in, out));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }}

class Test {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class NullInputStreamTest {

NullInputStreamTest(){}
	NullInputStreamTest(long o0){}}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
