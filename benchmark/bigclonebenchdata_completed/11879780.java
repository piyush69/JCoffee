


class c11879780 {
public MyHelperClass setBaseURLFromModelURL(URL o0){ return null; }
public MyHelperClass popBaseURL(){ return null; }

//    @Override
    public MD2Model loadModel(URL url, String skin) throws IOException, IncorrectFormatException, ParsingErrorException {
        boolean baseURLWasNull =(boolean)(Object) setBaseURLFromModelURL(url);
        MD2Model model = loadModel((URL)(Object)url.openStream(), skin);
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

class MD2Model {

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
