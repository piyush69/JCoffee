


class c19520611 {

    private static Pair loadRecruitersConf(URL url) throws ExternalConfigException, SyntaxException, IOException {
        MyHelperClass Assert = new MyHelperClass();
        Assert.notNullArg(url, "resourceName may not be null");
        InputStream is =(InputStream)(Object) url.openStream();
        try {
            MyHelperClass ObjectParser = new MyHelperClass();
            Object value = ObjectParser.parse(is);
            if (!(value instanceof DTObject)) {
                throw new ExternalConfigException("The global value in " + url + " must be a DTObject");
            }
            return new Pair(url, (DTObject) value);
        } finally {
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass notNullArg(URL o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Pair {

Pair(){}
	Pair(URL o0, DTObject o1){}}

class DTObject {

}

class ExternalConfigException extends Exception{
	public ExternalConfigException(String errorMessage) { super(errorMessage); }
}

class SyntaxException extends Exception{
	public SyntaxException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
