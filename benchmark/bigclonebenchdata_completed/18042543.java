


class c18042543 {
public MyHelperClass IOUtils;
	public MyHelperClass mFile;
	public MyHelperClass getInputStream(){ return null; }

    public void writeTo(OutputStream out) throws IOException, MessagingException {
        InputStream in =(InputStream)(Object) getInputStream();
        Base64OutputStream base64Out = new Base64OutputStream(out);
        IOUtils.copy(in, base64Out);
        base64Out.close();
        mFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, Base64OutputStream o1){ return null; }
	public MyHelperClass delete(){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class Base64OutputStream {

Base64OutputStream(OutputStream o0){}
	Base64OutputStream(){}
	public MyHelperClass close(){ return null; }}
