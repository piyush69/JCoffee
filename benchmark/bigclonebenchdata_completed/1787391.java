
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1787391 {
public static MyHelperClass writeHeader(Writer o0, String o1, String o2){ return null; }
//public MyHelperClass writeHeader(Writer o0, String o1, String o2){ return null; }

    private static void writeOneAttachment(Context context, Writer writer, OutputStream out, Attachment attachment) throws IOException, MessagingException {
        writeHeader(writer, "Content-Type", attachment.mMimeType + ";\n name=\"" + attachment.mFileName + "\"");
        writeHeader(writer, "Content-Transfer-Encoding", "base64");
        writeHeader(writer, "Content-Disposition", "attachment;" + "\n filename=\"" + attachment.mFileName + "\";" + "\n size=" + Long.toString((long)(Object)attachment.mSize));
        writeHeader(writer, "Content-ID",(String)(Object) attachment.mContentId);
        writer.append("\r\n");
        InputStream inStream = null;
        try {
            MyHelperClass Uri = new MyHelperClass();
            Uri fileUri =(Uri)(Object) Uri.parse(attachment.mContentUri);
            inStream =(InputStream)(Object) context.getContentResolver().openInputStream(fileUri);
            writer.flush();
            Base64OutputStream base64Out = new Base64OutputStream(out);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inStream, base64Out);
            base64Out.close();
        } catch (UncheckedIOException fnfe) {
        } catch (ArithmeticException ioe) {
            throw new MessagingException("Invalid attachment.",(IOException)(Object) ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openInputStream(Uri o0){ return null; }
	public MyHelperClass copy(InputStream o0, Base64OutputStream o1){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class Context {

public MyHelperClass getContentResolver(){ return null; }}

class Writer {

public MyHelperClass append(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class OutputStream {

}

class Attachment {
public MyHelperClass mContentUri;
	public MyHelperClass mFileName;
	public MyHelperClass mMimeType;
	public MyHelperClass mSize;
	public MyHelperClass mContentId;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(){}
	MessagingException(String o0, IOException o1){}
}

class InputStream {

}

class Uri {

}

class Base64OutputStream {

Base64OutputStream(){}
	Base64OutputStream(OutputStream o0){}
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
