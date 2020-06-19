


class c6453377 {
public MyHelperClass setBaseURLFromModelURL(URL o0){ return null; }
public MyHelperClass popBaseURL(){ return null; }

//    @Override
    public TDSModel loadModel(URL url, String skin) throws IOException, IncorrectFormatException, ParsingErrorException {
        boolean baseURLWasNull =(boolean)(Object) setBaseURLFromModelURL(url);
        TDSModel model = loadModel((URL)(Object)url.openStream(), skin);
        if (baseURLWasNull) {
            popBaseURL();
        }
        return (model);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class TDSModel {

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
