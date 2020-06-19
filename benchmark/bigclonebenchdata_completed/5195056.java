


class c5195056 {
public MyHelperClass IOUtils;
	public MyHelperClass getStream(){ return null; }

    public String getData() throws ValueFormatException, RepositoryException, IOException {
        InputStream is =(InputStream)(Object) getStream();
        StringWriter sw = new StringWriter();
        IOUtils.copy(is, sw, "UTF-8");
        IOUtils.closeQuietly(is);
        return sw.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class ValueFormatException extends Exception{
	public ValueFormatException(String errorMessage) { super(errorMessage); }
}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class StringWriter {

}
