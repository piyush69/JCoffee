


class c10634007 {
public static MyHelperClass loadSchema(InputStream o0){ return null; }
	public static MyHelperClass serializeSchema(EXISchema o0){ return null; }
//public MyHelperClass loadSchema(InputStream o0){ return null; }
//	public MyHelperClass serializeSchema(EXISchema o0){ return null; }

    public static EXISchema getEXISchema(String fileName, Class<?> cls, EXISchemaFactoryErrorHandler compilerErrorHandler) throws IOException, ClassNotFoundException, EXISchemaFactoryException {
        EXISchemaFactory schemaCompiler = new EXISchemaFactory();
        schemaCompiler.setCompilerErrorHandler(compilerErrorHandler);
        InputSource inputSource = null;
        if (fileName != null) {
            URL url;
            if ((url =(URL)(Object) cls.getResource(fileName)) != null) {
                inputSource = new InputSource(url.openStream());
                inputSource.setSystemId(url.toString());
            } else throw new RuntimeException("File '" + fileName + "' not found.");
        }
        EXISchema compiled =(EXISchema)(Object) schemaCompiler.compile(inputSource);
        InputStream serialized =(InputStream)(Object) serializeSchema(compiled);
        return(EXISchema)(Object) loadSchema(serialized);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class EXISchemaFactoryErrorHandler {

}

class EXISchema {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class EXISchemaFactoryException extends Exception{
	public EXISchemaFactoryException(String errorMessage) { super(errorMessage); }
}

class EXISchemaFactory {

public MyHelperClass setCompilerErrorHandler(EXISchemaFactoryErrorHandler o0){ return null; }
	public MyHelperClass compile(InputSource o0){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}
