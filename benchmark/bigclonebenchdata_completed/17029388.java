
import java.io.UncheckedIOException;


class c17029388 {
public static MyHelperClass getConfigResource(MyHelperClass o0){ return null; }
//public MyHelperClass getConfigResource(MyHelperClass o0){ return null; }

    public static InputStream getConfigIs(String path, String name) throws ProgrammerException, DesignerException, UserException {
        InputStream is = null;
        try {
            URL url =(URL)(Object) getConfigResource(new MonadUri(path).append(name));
            if (url != null) {
                is =(InputStream)(Object) url.openStream();
            }
        } catch (UncheckedIOException e) {
            throw new ProgrammerException((String)(Object)e);
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class ProgrammerException extends Exception{
	public ProgrammerException(String errorMessage) { super(errorMessage); }
}

class DesignerException extends Exception{
	public DesignerException(String errorMessage) { super(errorMessage); }
}

class UserException extends Exception{
	public UserException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class MonadUri {

MonadUri(String o0){}
	MonadUri(){}
	public MyHelperClass append(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
