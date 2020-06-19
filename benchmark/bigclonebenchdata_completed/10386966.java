


class c10386966 {

    private ByteBuffer getByteBuffer(String resource) throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream in =(InputStream)(Object) classLoader.getResourceAsStream(resource);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, out);
        MyHelperClass ByteBuffer = new MyHelperClass();
        return(ByteBuffer)(Object) ByteBuffer.wrap(out.toByteArray());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass wrap(MyHelperClass o0){ return null; }}

class ByteBuffer {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}
