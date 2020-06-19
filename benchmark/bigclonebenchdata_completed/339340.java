


class c339340 {

    ClassFile getClassFile(String name) throws IOException, ConstantPoolException {
        URL url =(URL)(Object) getClass().getResource(name);
        InputStream in =(InputStream)(Object) url.openStream();
        try {
            MyHelperClass ClassFile = new MyHelperClass();
            return(ClassFile)(Object) ClassFile.read(in);
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(InputStream o0){ return null; }}

class ClassFile {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ConstantPoolException extends Exception{
	public ConstantPoolException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
