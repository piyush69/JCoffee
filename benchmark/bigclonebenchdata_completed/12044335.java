


class c12044335 {

    JcrFile createBody(Part part) throws IOException, MessagingException {
        JcrFile body = new JcrFile();
        body.setName("part");
        ByteArrayOutputStream pout = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(part.getInputStream(), pout);
        MyHelperClass TYPE = new MyHelperClass();
        body.setDataProvider(new JcrDataProviderImpl(TYPE.BYTES, pout.toByteArray()));
        body.setMimeType(part.getContentType());
        body.setLastModified((Calendar)(Object)java.util.Calendar.getInstance());
        return body;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BYTES;
public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }}

class Part {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class JcrFile {

public MyHelperClass setLastModified(Calendar o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setDataProvider(JcrDataProviderImpl o0){ return null; }
	public MyHelperClass setMimeType(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class JcrDataProviderImpl {

JcrDataProviderImpl(MyHelperClass o0, MyHelperClass o1){}
	JcrDataProviderImpl(){}}

class Calendar {

}
