


class c18972693 {

    public static void copy(Context cx, Scriptable thisObj, Object[] args, Function funObj) throws IOException {
        InputStream input = (InputStream)(InputStream)(Object) ((NativeJavaObject) args[0]).unwrap();
        OutputStream output = (OutputStream)(OutputStream)(Object) ((NativeJavaObject) args[1]).unwrap();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(input, output);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class Context {

}

class Scriptable {

}

class Function {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class NativeJavaObject {

public MyHelperClass unwrap(){ return null; }}

class OutputStream {

}
