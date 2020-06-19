


class c3430784 {

    public static Body decodeBody(InputStream in, String contentTransferEncoding) throws IOException {
        if (contentTransferEncoding != null) {
            MyHelperClass MimeUtility = new MyHelperClass();
            contentTransferEncoding =(String)(Object) MimeUtility.getHeaderParameter(contentTransferEncoding, null);
            if ("quoted-printable".equalsIgnoreCase(contentTransferEncoding)) {
                in =(InputStream)(Object) new QuotedPrintableInputStream(in);
            } else if ("base64".equalsIgnoreCase(contentTransferEncoding)) {
                in =(InputStream)(Object) new Base64InputStream(in);
            }
        }
        BinaryTempFileBody tempBody = new BinaryTempFileBody();
        OutputStream out =(OutputStream)(Object) tempBody.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, out);
        out.close();
        return (Body)(Object)tempBody;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHeaderParameter(String o0, Object o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class Body {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class QuotedPrintableInputStream {

QuotedPrintableInputStream(InputStream o0){}
	QuotedPrintableInputStream(){}}

class Base64InputStream {

Base64InputStream(InputStream o0){}
	Base64InputStream(){}}

class BinaryTempFileBody {

public MyHelperClass getOutputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}
