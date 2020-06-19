


class c2459317 {
public MyHelperClass assertArrayEquals(String o0, byte[] o1, MyHelperClass o2){ return null; }
	public MyHelperClass assertEquals(String o0, int o1, MyHelperClass o2){ return null; }
public MyHelperClass IOUtils;

//    @Test
    public void testStandardTee() throws Exception {
        final byte[] test = "test".getBytes();
        final InputStream source =(InputStream)(Object) new ByteArrayInputStream(test);
        final ByteArrayOutputStream destination1 = new ByteArrayOutputStream();
        final ByteArrayOutputStream destination2 = new ByteArrayOutputStream();
        final TeeOutputStream tee = new TeeOutputStream(destination1, destination2);
        IOUtils.copy(source, tee);
        tee.close();
        assertArrayEquals("the two arrays are equals", test, destination1.toByteArray());
        assertArrayEquals("the two arrays are equals", test, destination2.toByteArray());
        assertEquals("byte count", test.length, tee.getSize());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, TeeOutputStream o1){ return null; }}

class Test {

}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class TeeOutputStream {

TeeOutputStream(){}
	TeeOutputStream(ByteArrayOutputStream o0, ByteArrayOutputStream o1){}
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass close(){ return null; }}
