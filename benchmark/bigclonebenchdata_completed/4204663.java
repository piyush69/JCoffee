


class c4204663 {
public MyHelperClass assertArrayEquals(String o0, byte[] o1, MyHelperClass o2){ return null; }

//    @Test
    public void testReadWrite() throws Exception {
        final byte[] testBytes = "testString".getBytes();
        final InputStream istream =(InputStream)(Object) new ByteArrayInputStream(testBytes);
        final ByteArrayOutputStream destination = new ByteArrayOutputStream();
        final InputStream teeStream =(InputStream)(Object) new TeeInputStreamOutputStream(istream, destination);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(teeStream, new NullOutputStream());
        teeStream.close();
        assertArrayEquals("array are equals", testBytes, destination.toByteArray());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, NullOutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class TeeInputStreamOutputStream {

TeeInputStreamOutputStream(){}
	TeeInputStreamOutputStream(InputStream o0, ByteArrayOutputStream o1){}}

class NullOutputStream {

}
