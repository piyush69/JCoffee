


class c3672078 {

    public byte[] loadResource(String name) throws IOException {
        ClassPathResource cpr = new ClassPathResource(name);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(cpr.getInputStream(), baos);
        return(byte[])(Object) baos.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ClassPathResource {

ClassPathResource(String o0){}
	ClassPathResource(){}
	public MyHelperClass getInputStream(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}
