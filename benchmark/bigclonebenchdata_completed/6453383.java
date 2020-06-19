


class c6453383 {
public MyHelperClass setBaseURLFromModelURL(URL o0){ return null; }
public MyHelperClass popBaseURL(){ return null; }

//    @Override
    public TDSScene loadScene(URL url) throws IOException, IncorrectFormatException, ParsingErrorException {
        boolean baseURLWasNull =(boolean)(Object) setBaseURLFromModelURL(url);
        TDSScene scene = loadScene((URL)(Object)url.openStream());
        if (baseURLWasNull) {
            popBaseURL();
        }
        return (scene);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class TDSScene {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IncorrectFormatException extends Exception{
	public IncorrectFormatException(String errorMessage) { super(errorMessage); }
}

class ParsingErrorException extends Exception{
	public ParsingErrorException(String errorMessage) { super(errorMessage); }
}
