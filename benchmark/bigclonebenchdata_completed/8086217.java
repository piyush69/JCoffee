


class c8086217 {

    public void write(OutputStream out, String className, InputStream classDefStream) throws IOException {
        ByteArrayOutputStream a = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(classDefStream, a);
        a.close();
        DataOutputStream da = new DataOutputStream(out);
        da.writeUTF(className);
        MyHelperClass base64 = new MyHelperClass();
        da.writeUTF(new String((String)(Object)base64.cipher(a.toByteArray())));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass cipher(MyHelperClass o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class OutputStream {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class DataOutputStream {

DataOutputStream(OutputStream o0){}
	DataOutputStream(){}
	public MyHelperClass writeUTF(String o0){ return null; }}
