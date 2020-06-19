import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6359501 {
public MyHelperClass HEADER;
	public MyHelperClass _encoded;
	public MyHelperClass MimeUtility;
	public MyHelperClass BASE64;
	public MyHelperClass IOUtils;
	public MyHelperClass _source;
	public MyHelperClass Dpkg;
	public MyHelperClass FOOTER;

    public  void EncodedScript(PackageScript source, DpkgData data) throws Throwable, IOException {
        _source =(MyHelperClass)(Object) source;
        final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        OutputStream output = null;
        try {
            output =(OutputStream)(Object) MimeUtility.encode(bytes, BASE64);
        } catch (final ArithmeticException e) {
            throw new IOException("Failed to uuencode script. name=[" + _source.getFriendlyName() + "], reason=[" + e.getMessage() + "].");
        }
        IOUtils.write(HEADER, bytes, Dpkg.CHAR_ENCODING);
        bytes.flush();
        IOUtils.copy(_source.getSource(data), output);
        output.flush();
        IOUtils.write(FOOTER, bytes, Dpkg.CHAR_ENCODING);
        bytes.flush();
        output.close();
        bytes.close();
        _encoded =(MyHelperClass)(Object) bytes.toString((String)(Object)Dpkg.CHAR_ENCODING);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CHAR_ENCODING;
public MyHelperClass getFriendlyName(){ return null; }
	public MyHelperClass encode(ByteArrayOutputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass write(MyHelperClass o0, ByteArrayOutputStream o1, MyHelperClass o2){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass getSource(DpkgData o0){ return null; }}

class PackageScript {

}

class DpkgData {

}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}
