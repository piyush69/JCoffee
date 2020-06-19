


class c11562173 {
public MyHelperClass assertEquals(byte o0, byte o1){ return null; }
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    private void checkInputStream(InputStream in, byte[] cmp, boolean all) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, stream);
        byte[] out =(byte[])(Object) stream.toByteArray();
        if (all) assertEquals(cmp.length, out.length);
        for (int i = 0; i < cmp.length; i++) assertEquals(cmp[i], out[i]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}
